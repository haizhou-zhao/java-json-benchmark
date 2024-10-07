package com.github.fabienrenaud.jjb.data;


import com.github.fabienrenaud.jjb.data.gen.IcebergTableMetadataGenerator;
import com.github.fabienrenaud.jjb.provider.IcebergTableMetadataProvider;
import org.apache.iceberg.TableMetadata;
import org.apache.iceberg.TableMetadataParser;
import org.apache.iceberg.inmemory.InMemoryFileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class IcebergTableMetadataSource extends JsonSource<TableMetadata> {

    private static final IcebergTableMetadataProvider icebergTableMetadataProvider = new IcebergTableMetadataProvider();
    private static final IcebergTableMetadataGenerator icebergTableMetadataGenerator = new IcebergTableMetadataGenerator();
    private static final String path = "test.metadata.json";
    private static final InMemoryFileIO fileIO = new InMemoryFileIO();
    static {
        try {
            fileIO.addFile(path, Files.readAllBytes(Path.of(path)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public IcebergTableMetadataSource(int quantity, int individualSize) {
        super(quantity, individualSize, icebergTableMetadataProvider, icebergTableMetadataGenerator, null, null);
    }

    @Override
    TableMetadata[] newPojoArray(int quantity) {
        return new TableMetadata[quantity];
    }

    @Override
    public Class<TableMetadata> pojoType() {
        return TableMetadata.class;
    }

    @Override
    protected void populateFields(int quantity, int individualSize) {
        try {
            TableMetadata obj = TableMetadataParser.read(fileIO, path);
            for (int i = 0; i < quantity; i++) {
                dataGenerator.populate(obj, individualSize);
                jsonAsObject[i] = obj;

                String json = TableMetadataParser.toJson(obj);
                jsonAsString[i] = json;
                jsonAsBytes[i] = json.getBytes();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }
    }
}
