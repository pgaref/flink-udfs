# flink-udfs

## Building Flink UDF Artifact

`mvn clean package`

## Inspect jar contens

`jar -tf target/flink_udfs-1.0-SNAPSHOT.jar`

Valid output: 
```
...
org/example/RetrieveGeoHash.class
org/example/SumScalarFunction.class
org/example/ConcatScalarFunction.class
```


