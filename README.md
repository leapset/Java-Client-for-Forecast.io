## Java Client for Forecast.io API
The Forecast-IO Java Client provides a simple API for [v2 Forecast API][] service.

## Get it!
### Maven
Functionality of this package is contained in Java package `com.leapset.forecast-io-java-client`, and can be used using following Maven dependency:

```xml
<repository>
    <id>leapset.snapshot.repository</id>
    <name>Archiva Managed Leapset SNAPSHOT Repository</name>
    <url>http://repo.leapset.com/archiva/repository/internal/</url>
</repository>
```

```xml
<dependency>
  <groupId>com.leapset</groupId>
  <artifactId>forecast-io-java-client</artifactId>
  <version>1.0.0</version>
</dependency>
```
## Use it!
Set the Forecast IO access token as constructor argument.
```
<bean id="forecastWeatherService"
          class="com.leapset.forecastio.service.impl.ForecastWeatherServiceImpl">
    <constructor-arg value="${forecast.accessToken}"/>
</bean>
```
## Building from Source
The Forecast-IO Client uses a [maven][]-based build system.

### Prerequisites
[Git][] and laterJDK7 build

Be sure that your `JAVA_HOME` environment variable points to the `jdk1.7.*` folder
extracted from the JDK download.

### Check out sources
`git clone https://github.com/leapset/Java-Client-for-Forecast.io.git`

## License
Project is licensed under the [MIT License][].

##Release Notes
1.0.0     - Initial release.

[v2 Forecast API]: https://developer.forecast.io/docs/v2
[maven]: http://maven.apache.org/
[Git]: http://git-scm.com/
[MIT License]: http://opensource.org/licenses/MIT