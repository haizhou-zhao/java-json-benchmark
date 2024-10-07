package com.github.fabienrenaud.jjb.provider;

import com.dslplatform.json.DslJson;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.owlike.genson.Genson;
import com.squareup.moshi.JsonAdapter;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import io.avaje.jsonb.JsonType;
import io.quarkus.qson.generator.QsonMapper;
import jakarta.json.bind.Jsonb;
import jakarta.json.stream.JsonGeneratorFactory;
import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import org.apache.iceberg.TableMetadata;
import org.apache.johnzon.mapper.Mapper;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.ProtoMessage;

import static org.apache.iceberg.rest.IcebergJsonSerdeProvider.OBJECT_MAPPER;

public class IcebergTableMetadataProvider implements JsonProvider<TableMetadata> {
    @Override
    public Gson gson() {
        throw new UnsupportedOperationException("Benchmarking Iceberg table metadata de/ser on GSON not supported");
    }

    @Override
    public ObjectMapper jackson() {
        return OBJECT_MAPPER;
    }

    @Override
    public ObjectMapper jacksonAfterburner() {
        throw new UnsupportedOperationException("Benchmarking Iceberg table metadata de/ser on JACKSON_AFTERBURNER not supported");
    }

    @Override
    public ObjectMapper jacksonBlackbird() {
        throw new UnsupportedOperationException("Benchmarking Iceberg table metadata de/ser on JACKSON_BLACKBIRD not supported");
    }

    @Override
    public JsonFactory jacksonFactory() {
        throw new UnsupportedOperationException("Benchmarking Iceberg table metadata de/ser on Jackson Factory not supported");
    }

    @Override
    public JsonGeneratorFactory jakartajsonFactory() {
        throw new UnsupportedOperationException("Benchmarking Iceberg table metadata de/ser on Jarkata JSON not supported");
    }

    @Override
    public Genson genson() {
        throw new UnsupportedOperationException("Benchmarking Iceberg table metadata de/ser on GENSON not supported");
    }

    @Override
    public Jsonb yasson() {
        throw new UnsupportedOperationException("Benchmarking Iceberg table metadata de/ser on YASSON not supported");
    }

    @Override
    public JSONDeserializer<TableMetadata> flexjsonDeser() {
        throw new UnsupportedOperationException("Benchmarking Iceberg table metadata de/ser on FLEXJSON not supported");
    }

    @Override
    public JSONSerializer flexjsonSer() {
        throw new UnsupportedOperationException("Benchmarking Iceberg table metadata de/ser on FLEXJSON not supported");
    }

    @Override
    public org.boon.json.ObjectMapper boon() {
        throw new UnsupportedOperationException("Benchmarking Iceberg table metadata de/ser on BOON not supported");
    }

    @Override
    public Mapper johnzon() {
        throw new UnsupportedOperationException("Benchmarking Iceberg table metadata de/ser on JOHNZON not supported");
    }

    @Override
    public DslJson<Object> dsljson() {
        throw new UnsupportedOperationException("Benchmarking Iceberg table metadata de/ser on DSLJSON not supported");
    }

    @Override
    public DslJson<Object> dsljson_reflection() {
        throw new UnsupportedOperationException("Benchmarking Iceberg table metadata de/ser on DSLJSON_REFLECTION not supported");
    }

    @Override
    public JsonParser joddDeser() {
        throw new UnsupportedOperationException("Benchmarking Iceberg table metadata de/ser on JODD not supported");
    }

    @Override
    public JsonSerializer joddSer() {
        throw new UnsupportedOperationException("Benchmarking Iceberg table metadata de/ser on JODD not supported");
    }

    @Override
    public JsonAdapter<TableMetadata> moshi() {
        throw new UnsupportedOperationException("Benchmarking Iceberg table metadata de/ser on MOSHI not supported");
    }

    @Override
    public JsonType<TableMetadata> avajeJsonb_jackson() {
        throw new UnsupportedOperationException("Benchmarking Iceberg table metadata de/ser on AVAJEJSONB_JACKSON not supported");
    }

    @Override
    public JsonType<TableMetadata> avajeJsonb_default() {
        throw new UnsupportedOperationException("Benchmarking Iceberg table metadata de/ser on AVAJEJSONB not supported");
    }

    @Override
    public QsonMapper qson() {
        throw new UnsupportedOperationException("Benchmarking Iceberg table metadata de/ser on QSON not supported");
    }

    @Override
    public ProtoMessage<?> quickbufPojo() {
        throw new UnsupportedOperationException("Benchmarking Iceberg table metadata de/ser on QUICKBUF_JSON not supported");
    }

    @Override
    public JsonSink quickbufSink() {
        throw new UnsupportedOperationException("Benchmarking Iceberg table metadata de/ser on QUICKBUF_JSON not supported");
    }
}
