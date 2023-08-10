package com.javarush.task.task31.task3110;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class FileProperties {
    String name;
    long size;
    long compressedSize;
    int compressionMethod;

    public long getCompressionRatio() {
        return 100 - ((compressedSize * 100) / size);
    }

    @Override
    public String toString() {
        return size > 0 ?
                String.format("%s %d Kb (%d Kb) сжатие: %d%%", name, size / 1024, compressedSize / 1024, getCompressionRatio()) :
                name;
    }
}
