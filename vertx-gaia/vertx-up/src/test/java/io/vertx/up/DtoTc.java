package io.vertx.up;

import io.vertx.core.json.JsonObject;
import io.vertx.up.tool.io.IO;
import org.junit.Test;

public class DtoTc {
    @Test
    public void testDto() {
        final JsonObject dto = IO.getJObject("test/dto.json");
        for (final String o : dto.fieldNames()) {
            System.out.println("private String " + o + ";\n");
            if (o.endsWith("MingXi")) {
                System.out.println(" -------- ");
                final JsonObject item = dto.getJsonArray(o).getJsonObject(0);
                for (final String field : item.fieldNames()) {
                    System.out.println("private String " + field + ";\n");
                }
            }
        }
    }
}
