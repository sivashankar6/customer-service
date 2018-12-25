FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/customer-service-0.0.1-SNAPSHOT.jar customer-service.jar
RUN sh -c 'touch /customer-service.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/customer-service.jar"]
EXPOSE 8084
