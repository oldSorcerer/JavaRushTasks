package com.javarush.task.sql.task12.task1205;

/* 
Сохранить аудио файл в БД
*/

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Properties;

public class Solution {
    public static void main(String[] args) {
        saveAudioFile();
    }

    public static void saveAudioFile() {
        Audio audio = new Audio();
        audio.setId(1L);
        audio.setFileName("Sound1");
        audio.setAudioFile(getAudioBuffer());
        audio.setFileProperties(Map.of("key1", "sound media1"));

        try (Session session = getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(audio);
            session.getTransaction().commit();
        }
    }

    public static SessionFactory getSessionFactory() {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        properties.put(Environment.URL, "jdbc:mysql://localhost:3306/test");
        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        properties.put(Environment.USER, "root");
        properties.put(Environment.PASS, "root");
        properties.put(Environment.HBM2DDL_AUTO, "update");

        return new Configuration()
                .setProperties(properties)
                .addAnnotatedClass(Audio.class)
                .buildSessionFactory();
    }

    public static byte[] getAudioBuffer() {
        byte[] audioBuffer;
        try {
            audioBuffer = Files.readAllBytes(Paths.get("sound.wav"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return audioBuffer;
    }
}
