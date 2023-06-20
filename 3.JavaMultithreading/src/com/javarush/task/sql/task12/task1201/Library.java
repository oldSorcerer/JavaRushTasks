package com.javarush.task.sql.task12.task1201;

import jakarta.persistence.*;

/* 
Создаём Entity из класса
*/

@Entity
@Table(name = "library_table")
public class Library {
    @Id
    private long id;
//    @Enumerated(value = "")
    @Column
    PublicationStatus status;
    @Column
    String publicationName;
    @Column
    String isdn;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PublicationStatus getStatus() {
        return status;
    }

    public void setStatus(PublicationStatus status) {
        this.status = status;
    }

    public String getPublicationName() {
        return publicationName;
    }

    public void setPublicationName(String publicationName) {
        this.publicationName = publicationName;
    }

    public String getIsdn() {
        return isdn;
    }

    public void setIsdn(String isdn) {
        this.isdn = isdn;
    }
}
