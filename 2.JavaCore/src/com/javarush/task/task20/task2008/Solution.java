package com.javarush.task.task20.task2008;

import java.io.*;

/* 
Как сериализовать Singleton?
*/

public class Solution implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton instance = Singleton.getInstance();

        ByteArrayOutputStream byteArrayOutputStream = serializeSingletonInstance(instance);

        Singleton singleton = deserializeSingletonInstance(byteArrayOutputStream);
        Singleton singleton1 = deserializeSingletonInstance(byteArrayOutputStream);

        System.out.println("Проверка ourInstance : " + singleton.getInstance());
        System.out.println("Проверка ourInstance : " + singleton1.getInstance());
        System.out.println("=========================================================");
        System.out.println("Проверка singleton : " + singleton);
        System.out.println("Проверка singleton1 : " + singleton1);
    }

    public static ByteArrayOutputStream serializeSingletonInstance(Singleton instance) throws IOException {
        try(ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream)){
            oos.writeObject(instance);
            return byteArrayOutputStream;
        }
    }

    public static Singleton deserializeSingletonInstance(ByteArrayOutputStream byteArrayOutputStream) throws IOException, ClassNotFoundException {
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
             ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream)) {
            return (Singleton) ois.readObject();
        }
    }

    public static class Singleton implements Serializable {
        private static Singleton ourInstance;

        public static Singleton getInstance() {
            if (ourInstance == null) {
                ourInstance = new Singleton();
            }
            return ourInstance;
        }

        private Singleton() {
        }

        @Serial
        private Object readResolve() {
            return ourInstance;
        }
    }
}
