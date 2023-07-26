# The Guardian API Java Client

Java client library for the Guardian APIs. See documentation [here](https://open-platform.theguardian.com/documentation/).
All available API modules are supported - Content, Tags, Sections, Editions, and Single Item.

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