package the.guardian.api.client;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import the.guardian.api.entity.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GuardianApiTest {
    private static final String VALID_API_KEY = "test";
    private static final String INVALID_API_KEY = "abc";

    private GuardianApi guardianApi;

    @BeforeEach
    void setUp() {
        guardianApi = new GuardianApi(VALID_API_KEY);
    }

    @Test
    void testValidApiKey() {
        // No exception should be thrown for a valid API key
        GuardianApi api = null;
        try {
            api = new GuardianApi(VALID_API_KEY);
        } catch (IllegalArgumentException ignored) {

        }

        assertNotNull(api);
    }

    @Test
    void testInvalidApiKeyThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new GuardianApi(INVALID_API_KEY));
    }

    @Test
    void testContentMethodReturnsInstanceOfContent() {
        Content content = guardianApi.content();
        assertNotNull(content);
    }

    @Test
    void testTagsMethodReturnsInstanceOfTags() {
        Tags tags = guardianApi.tags();
        assertNotNull(tags);
    }

    @Test
    void testSectionsMethodReturnsInstanceOfSections() {
        Sections sections = guardianApi.sections();
        assertNotNull(sections);
    }

    @Test
    void testEditionsMethodReturnsInstanceOfEditions() {
        Editions editions = guardianApi.editions();
        assertNotNull(editions);
    }

    @Test
    void testSingleItemMethodReturnsInstanceOfSingleItem() {
        SingleItem singleItem = guardianApi.singleItem();
        assertNotNull(singleItem);
    }
}
