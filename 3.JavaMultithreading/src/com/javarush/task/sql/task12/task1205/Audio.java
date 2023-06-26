package com.javarush.task.sql.task12.task1205;

/* 
Сохранить аудио файл в БД
*/

import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import java.util.Map;

@Entity
@Table(name = "audio_table", schema = "test")
@TypeDef(name = "json", typeClass = JsonType.class)
public class Audio {

    @Id
    private Long id;

    @Column(name = "file_name")
    private String fileName;

    @Lob
    @Column(name = "audio_file", columnDefinition = "BLOB")
    private byte[] audioFile;

    @Type(type ="json")
    @Column(name = "file_meta")
    private Map<String, String> fileProperties;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getAudioFile() {
        return audioFile;
    }

    public void setAudioFile(byte[] audioFile) {
        this.audioFile = audioFile;
    }

    public Map<String, String> getFileProperties() {
        return fileProperties;
    }

    public void setFileProperties(Map<String, String> fileProperties) {
        this.fileProperties = fileProperties;
    }
}
