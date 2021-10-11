package com.demo.log4j2.appender;

import org.apache.avro.Schema;
import org.apache.avro.reflect.ReflectData;

public class ReflectionExamples {

    public static void main(String[] args) {

        // here we use reflection to determine the schema
        Schema schema = ReflectData.get().getSchema(LogEventOrg.class);
        System.out.println("schema = " + schema.toString(true));

    }
}
