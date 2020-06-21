FROM openjdk:8-jdk-alpine
# 指定作者信息
MAINTAINER daishuai
# 数据卷信息
VOLUME /tmp
# 添加jar包到镜像中，Copy Add 指令采用的是相对路径，也是将Dcokerfile建立在根路径的原因
# COPY ./target/*.jar demo.jar
# 启动jar
RUN sh -c 'touch demo.jar'
ADD springboot-demo-*.jar demo.jar
ENV JAVA_OPTS=""
#暴露容器端口
EXPOSE 8989
#ENTRYPOINT 为容器启动后执行的命令
ENTRYPOINT ["java", "-jar", "demo.jar"]
