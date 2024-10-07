package org.apache.iceberg.rest;

import com.fasterxml.jackson.databind.ObjectMapper;

public class IcebergJsonSerdeProvider {
  public static final ObjectMapper OBJECT_MAPPER = RESTObjectMapper.mapper();
}
