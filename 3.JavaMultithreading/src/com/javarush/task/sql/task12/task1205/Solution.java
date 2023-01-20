package com.javarush.task.sql.task12.task1205;

/* 
Сохранить аудио файл в БД
*/

public class Solution {
    public static void main(String[] args) {
        saveAudioFile();
    }

    public static void saveAudioFile() {
        //напишите тут ваш код

    }

//    public static SessionFactory getSessionFactory() {
//        Properties properties = new Properties();
//        properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
//        properties.put(Environment.URL, "jdbc:mysql://localhost:3306/test");
//        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
//        properties.put(Environment.USER, "root");
//        properties.put(Environment.PASS, "root");
//        properties.put(Environment.HBM2DDL_AUTO, "update");
//
//        return new Configuration()
//                .setProperties(properties)
//                .addAnnotatedClass(Audio.class)
//                .buildSessionFactory();
//    }

//    public static byte[] getAudioBuffer() {
//        byte[] audioBuffer;
//        try {
//            audioBuffer = Files.readAllBytes(Paths.get("sound.wav"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return audioBuffer;
//    }
}
