package com.harium.etyl.util.io;

import java.io.File;

public class IOHelper {
    public static final String FILE_PREFIX = "file:///";
    public static final String STREAM_PREFIX = "stream:///";
    public static final String ENCODING_UTF_8 = "UTF-8";

    /**
     * Stub method
     * @param path
     * @return
     */
    public static File getFile(String path) {
        return new File(path);
    }
}
