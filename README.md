# TJOURNAL JAVA API SDK

Java library for TJ, VC and DTF API interaction. Uses API version 1.6.

## 1. Prerequisites

* [Java JDK](https://www.oracle.com/technetwork/java/javaee/downloads/jdk8-downloads-2133151.html) 1.8+
* [Maven](https://maven.apache.org/download.cgi) 3.3+

## 2. Latest release

Library is in active development for now. If you want to start
using it immediately run `mvn clean install` and add the dependency:

```xml
<dependency>
  <groupId>ru.cmtt.api</groupId>
  <artifactId>sdk</artifactId>
  <version>LATEST_VERSION</version>
</dependency>
```

Or with grade:

```groovy
dependencies {
  compile 'ru.cmtt.api:sdk:LATEST_VERSION'
}
```

## 3. Prepare for using

Go to your profile settings in TJ, VC, or DTF account. Scroll down to 
the bottom of the page and click dev tools link. Copy api token from there.
You will need the copied token to create api client later.

## 4. Initialization

Create you client using following code:

```java

// creates TJ client
TJApiClient client = new TJApiClient("token from the previous step here");

// DTF client
DTFApiClient client = new DTFApiClient("token");

// VC client
VCApiClient client = new VCApiClient("token");

```

## 5. API requests

You can find full list of API [here](https://cmtt-ru.github.io/osnova-api/redoc.html)

Here is a quick example of how you can do an api call:

```java
TJApiClient client = new TJApiClient("token");

// Gets entry (content/article/post) with id 93120 from TJ
Entry entry = client.entries().get().by("93120").execute();

Assert.assertEquals("93120", entry.getId());
Assert.assertEquals("Женя Кузьмин", entry.getAuthor().getName())
```