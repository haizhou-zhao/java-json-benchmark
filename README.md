This is forked from https://github.com/fabienrenaud/java-json-benchmark to leverage the tool for the perf test of
de/ser Iceberg Table metadata.

Quick Start:

1. Place the target Iceberg Table metadata file with file name "test.metadata.json" in the root directory of the project
2. Build project (which uses gradle), make sure there's a build directory appearing with the build artifact at `build/libs/app.jar`
3. To test deserialization: `java -server -Xms16g -Xmx16g --add-opens=java.base/java.time=ALL-UNNAMED
--add-modules=jdk.incubator.vector -jar build/libs/app.jar deser --datatype iceberg_table_metadata --libs jackson`

Note: A [Dockerfile](Dockerfile) is provided in case the test is to be run in a containerized environment.

For other usages, please refer to the original project @ https://github.com/fabienrenaud/java-json-benchmark
