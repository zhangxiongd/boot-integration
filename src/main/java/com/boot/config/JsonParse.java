package com.boot.config;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * @author zhangxiong
 * @date 2017/8/7.
 */
public class JsonParse {
    public static class Serializer extends JsonSerializer {

        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers)
                throws IOException, JsonProcessingException {
        }
    }

    public static class Deserializer extends JsonDeserializer {
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            return null;
        }
    }
}
