# Docker build invoked from root project dir
FROM ubi9/openjdk-17-runtime
USER root

COPY . /java-json-benchmark
WORKDIR /java-json-benchmark

CMD exec java -server -Xms16g -Xmx16g --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -jar build/libs/app.jar deser --datatype iceberg_table_metadata --libs jackson
