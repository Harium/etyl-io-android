package com.harium.etyl.util;

import android.content.res.AssetManager;
import android.os.Environment;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class PathHelper {

    public static AssetManager assetManager;

    public static InputStream loadAsset(String path) throws IOException {
        return assetManager.open(path);
    }

    public static String[] listAssets(String path) throws IOException {
        return assetManager.list(path);
    }

    public static String currentDirectory() {
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            return Environment.getExternalStorageDirectory().getAbsolutePath();
        } else {
            return Environment.getDataDirectory().getAbsolutePath();
        }
    }

    public static String filename(String path) {
        int index = path.lastIndexOf(File.separator);
        return path.substring(index);
    }

    public static String getExtension(String path) {
        String extension = "";
        int i = path.lastIndexOf('.');
        if (i >= 0) {
            extension = path.substring(i + 1);
        }
        return extension;
    }
}
