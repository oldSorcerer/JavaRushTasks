package com.javarush.task.sql.task12.task1201;

import jakarta.persistence.*;

/* 
Создаём Entity из класса
*/

@Entity
@Table(name = "library_table")
public class Library {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private PublicationStatus status;

    @Column(name = "publication_name")
    private String publicationName;

    @Column(name = "isdn")
    private String isdn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
