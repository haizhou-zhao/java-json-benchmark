package com.github.fabienrenaud.jjb.data;

import com.github.fabienrenaud.jjb.Cli;
import com.github.fabienrenaud.jjb.Config;
import com.github.fabienrenaud.jjb.support.BenchSupport;

public final class JsonSourceFactory {

    private JsonSourceFactory() {
    }

    public static JsonSource<?> create() {
        Cli.AbstractCommand cmd = Config.load();
        return create(cmd.dataType, cmd.numberOfPayloads, cmd.sizeOfEachPayloadInKb * 1000);
    }

    public static JsonSource<?> create(String dataType, int quantity, int size) {
        BenchSupport bs = BenchSupport.valueOf(dataType.toUpperCase());
        switch (bs) {
            case USERS:
                return new UsersSource(quantity, size);
            case CLIENTS:
                return new ClientsSource(quantity, size);
            case ICEBERG_TABLE_METADATA:
                return new IcebergTableMetadataSource(quantity, size);
            default:
                throw new RuntimeException();
        }
    }
}
