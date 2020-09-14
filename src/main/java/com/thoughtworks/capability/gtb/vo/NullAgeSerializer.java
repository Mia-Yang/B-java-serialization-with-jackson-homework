package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.omg.CORBA.OBJ_ADAPTER;

import java.io.IOException;

public class NullAgeSerializer extends StdSerializer<Object> {
    protected NullAgeSerializer() {
        super(Object.class);
    }

    @Override
    public void serialize(Object obj, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeNumber(0);
    }

}
