
# Maven

## Run Spring Boot
`mvn spring-boot:run`
`java -jar target/myapplication-0.0.1-SNAPSHOT.jar`

## Skip Tests
`-DskipTests`
`-Dmaven.test.skip=true`

## Proxy

`.m2/settings.xml`

```xml
<settings>
  <proxies>
   <proxy>
      <id>example-proxy</id>
      <active>true</active>
      <protocol>http</protocol>
      <host>proxy.example.com</host>
      <port>8080</port>
      <username>proxyuser</username>
      <password>somepassword</password>
      <nonProxyHosts>www.google.com|*.example.com</nonProxyHosts>
    </proxy>
  </proxies>
</settings>
```
