package com.javarush.task.task31.task3107;

public class NullFileData implements FileData {

    private final Exception exception;

    public NullFileData(Exception exception) {
        this.exception = exception;
    }

    public Exception getException() {
        return exception;
    }

    @Override
    public boolean isHidden() {
        return false;
    }

    @Override
    public boolean isExecutable() {
        return false;
    }

    @Override
    public boolean isDirectory() {
        return false;
    }

    @Override
    public boolean isWritable() {
        return false;
    }
}
