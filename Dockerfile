FROM java:8
EXPOSE 8080
ENV TIME_ZONE Asia/Shanghai
#RUN apk add --no-cache tzdata && echo "${TIME_ZONE}" > /etc/timezone && ln -sf /usr/share/zoneinfo/${TIME_ZONE} /etc/localtime
ADD target/zh-1.0.0-SNAPSHOT.jar /opt/zh-1.0.0-SNAPSHOT.jar
ENTRYPOINT [  "java", "-jar", "/opt/zh-1.0.0-SNAPSHOT.jar","--spring.profiles.active=pro"]
