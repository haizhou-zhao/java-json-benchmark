package com.github.fabienrenaud.jjb.data.gen;

import org.apache.iceberg.TableMetadata;

import java.util.ArrayList;

public class IcebergTableMetadataGenerator implements DataGenerator<TableMetadata> {

    @Override
    public int populate(TableMetadata obj, int size) {
        return 0;
    }
}
