FROM apache/skywalking-base:8.6.0-es6
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} js.jar

ENV SW_AGENT_COLLECTOR_BACKEND_SERVICES="172.16.223.186:11800" \
    SW_AGENT_NAME="order-service"

CMD java -javaagent:/skywalking/agent/skywalking-agent.jar \
         -jar js.jar
