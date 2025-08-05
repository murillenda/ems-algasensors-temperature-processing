package com.algaworks.algasensors.temperature.processing;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.UUID;

public class UUIDv7Utils {

    private UUIDv7Utils() {}

    public static OffsetDateTime extractOffsetDateTime(UUID uuid) {
        if (uuid == null) {
            return null;
        }

        // Removendo o bit da versão
        long timestamp = uuid.getMostSignificantBits() >>> 16;

        return OffsetDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault());
    }

}
