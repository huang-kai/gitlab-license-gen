package com.baixing;

import java.io.Closeable;
import java.io.IOException;

public class IOUtil {
    public static void closeIgnoreError(Closeable... closeables) {
        for (Closeable c : closeables) {
            if (c != null) {
                try {
                    c.close();
                } catch (IOException ex) {
                    // ignore error
                }
            }
        }
    }
}
