# spring-cloud-sleuth-order

一、zipkin 下载

https://search.maven.org/remote_content?g=io.zipkin&a=zipkin-server&v=LATEST&c=exec

运行 zipkin

java -jar zipkin-server-2.23.16-exec.jar

二、Spring Cloud Sleuth 整合 zipkin



```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-zipkin</artifactId>
</dependency>
```



```yaml
spring:
  zipkin:
    base-url: http://127.0.0.1:9411
  sleuth:
    sampler:
      # 采样率 范围 0~1 ，1表示全部采集
      probability: 1
```

三、zipkin 监控

http://127.0.0.1:9411/zipkin

