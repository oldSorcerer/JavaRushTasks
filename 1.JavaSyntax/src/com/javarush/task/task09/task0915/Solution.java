package com.javarush.task.task09.task0915;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/* 
Перехват выборочных исключений
*/

public class Solution {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {
        try {
            processExceptions();
        } catch (FileSystemException q){
            BEAN.log(q);
        }
    }

    public static void processExceptions() throws FileSystemException{
        try {
            BEAN.methodThrowExceptions();
        } catch (CharConversionException q){
            BEAN.log(q);
        }
        catch (FileSystemException q){
            BEAN.log(q);
            throw q;
        }
        catch (IOException q){
            BEAN.log(q);
        }
    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0)
                throw new CharConversionException();
            if (i == 1)
                throw new FileSystemException("");
            if (i == 2)
                throw new IOException();
        }
    }
}
/*Перехват выборочных исключений
1. Разберись, какие исключения бросает метод BEAN.methodThrowExceptions.
2. Метод processExceptions должен вызывать метод BEAN.methodThrowExceptions и обрабатывать исключения:
2.1. если возникло исключение FileSystemException, то логировать его (вызвать метод BEAN.log) и пробросить дальше
2.2. если возникло исключение CharConversionException или любое другое IOException, то только логировать его (вызвать метод BEAN.log)
3. Добавь в объявление метода processExceptions класс исключения, которое ты пробрасываешь в п.2.1.
4. В методе main обработай оставшееся исключение — логируй его. Используй try..catch

Подсказка:
Если ты захватил исключение MyException, которое не хотел захватывать, его можно пробросить дальше кодом вида:
catch (MyException e) {
 throw e;
}


Требования:
1. Метод processExceptions должен вызывать метод BEAN.methodThrowExceptions.
2. Метод processExceptions должен логировать исключение FileSystemException (вызвать метод BEAN.log), а затем пробросить его дальше.
3. Метод processExceptions должен только логировать (вызвать метод BEAN.log) исключение CharConversionException.
4. Метод processExceptions должен только логировать любое исключение IOException.
5. Добавь в объявление метода processExceptions класс исключения FileSystemException.
6. Метод main должен использовать try..catch.
7. Метод main должен логировать исключения, которые кидает метод processExceptions.*/