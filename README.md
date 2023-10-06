# The Guardian API Java Client

Java client library for the Guardian APIs. See documentation [here](https://open-platform.theguardian.com/documentation/).
All available API modules are supported - Content, Tags, Sections, Editions, and Single Item.

### Installation
It is installable with any of the jvm package managers such as Gradle, Maven, sbt e.t.c.

Example gradle command:

```java
implementation 'io.github.niyiomotoso:the-guardian-api-java-client:1.1.0'
```

### Get API key

Sign up for an API key [here](https://open-platform.theguardian.com/access)

### Making Requests

The primary `Client\GuardianApi` class is a factory class that creates objects for each of the API modules, allowing you to make requests to any of them with your desired request parameters. You have to first create an object for it, then access your desired API module via the object. See the code snippets below:

```java
 GuardianApi guardianApi = this.guardianApi = new GuardianApi(THE_GUARDIAN_API_KEY);
```

**For Content:**

```java
ContentResponse response = this.guardianApi.content().setQuery("12 years a slave").setTag("film/film,tone/reviews").setFromDate("2023-03-20").setShowTags("contributor").setShowFields("starRating,headline,thumbnail,short-url").setOrderBy("relevance").fetch();
```

**For Tags:**

```java
TagsResponse response = this.guardianApi.tags().setQuery("apple").setSection("technology").setShowReferences("all").fetch();
```

**For Sections:**

```java
SectonsResponse response = tthis.guardianApi.sections().setQuery("business").fetch();
```

**For Editions:**

```java
EditionsResponse response = this.guardianApi.editions().setQuery("uk").fetch();
```

**For Single Item:**

```java
SingleItemResponse response = this.guardianApi.singleItem().setId("/sport/2022/oct/07/cricket-jos-buttler-primed-for-england-comeback-while-phil-salt-stays-focused").setShowStoryPackage(true).setShowEditorsPicks(true).setShowMostViewed(true).setShowRelated(true).fetch();
```

### Community support
You can reach out to us on the Google Group here https://groups.google.com/g/guardian-api-talk for support 
