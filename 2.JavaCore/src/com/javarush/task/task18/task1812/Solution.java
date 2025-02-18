package com.javarush.task.task18.task1812;

import com.javarush.task.task19.task1902.AdapterFileOutputStream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Solution {
    public static void main(String[] args) throws IOException {
        AmigoOutputStream amigoOutputStream = new AmigoOutputStreamImpl();

        QuestionFileOutputStream stream = new QuestionFileOutputStream(amigoOutputStream);

        stream.close();

    }

    private static class AmigoOutputStreamImpl  implements AmigoOutputStream {

        private final OutputStream stream = new ByteArrayOutputStream();

        @Override
        public void flush() throws IOException {
            stream.flush();
        }

        @Override
        public void write(int b) throws IOException {
            stream.write(b);
        }

        @Override
        public void write(byte[] b) throws IOException {
            stream.write(b);
        }

        @Override
        public void write(byte[] b, int off, int len) throws IOException {
            stream.write(b,off, len);
        }

        @Override
        public void close() throws IOException {
            stream.close();
        }
    }
}
