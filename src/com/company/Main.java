package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String path = "";
        String replaceFrom = "en";
        String replaceTo = "eng";
        replaceFileName(path, replaceFrom, replaceTo);
    }

    private static void replaceFileName(String path, String replaceFrom, String replaceTo) {
        File thisFolder = new File(path);
        File[] filesArray = thisFolder.listFiles();

        for (File file : filesArray) {
            if (file.getName().contains(replaceFrom)) {
                String oldName = file.getName();
                file.renameTo(new File(thisFolder, oldName.replace(replaceFrom, replaceTo)));
            }
        }
    }
}
