package the.guardian.api.entity;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import the.guardian.api.http.AbstractResponse;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Base class for all available guardian API entities
 */

public abstract class ApiEntity {
    protected String query = "";

    protected String baseUrl = "";

    protected String format = "";
    
    public String getBaseUrl() {
        return this.baseUrl;
    }

    public void setBaseUrl(String data) {
        this.baseUrl = data;
    }

    
    public String getFormat() {
        return this.format;
    }

    public void setFormat(String data) {
        this.format = data;
    }

    
    public ApiEntity appendToBaseUrl(String attributeName,  String attributeValue) throws UnsupportedEncodingException {
        if (!attributeValue.equals("")) {
            String encodedValue = URLEncoder.encode(attributeValue, "UTF-8");
            String url = "&" + attributeName + "=" + encodedValue;
            String var10001 = this.baseUrl;
            this.baseUrl = var10001 + url;
        }

        return this;
    }

    public abstract void buildUrl() throws UnsupportedEncodingException;

    
    public abstract AbstractResponse fetch() throws UnsupportedEncodingException, UnirestException;

    public ApiEntity(String _baseUrl) {
        super();
        this.format = "json";
        this.baseUrl = _baseUrl;
    }

    static {
        Unirest.setObjectMapper(new ObjectMapper() {
            private final com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper
                    = new com.fasterxml.jackson.databind.ObjectMapper();

            public <T> T readValue(String value, Class<T> valueType) {
                try {
                    return jacksonObjectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES).readValue(value, valueType);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            public String writeValue(Object value) {
                try {
                    return jacksonObjectMapper.writeValueAsString(value);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
