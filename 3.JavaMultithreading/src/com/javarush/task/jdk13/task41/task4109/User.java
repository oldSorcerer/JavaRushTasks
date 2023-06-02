package com.javarush.task.jdk13.task41.task4109;

public class User extends AbstractEntity {

    public String socialKey;
    public String secretKey;
    public String displayName;
    public String pictureUrl;
    public String sessionId;
    public String referenceKey;
    public int level;
    public int lesson;
    public int darkMatter;
    public int rating;
    public String email;
    public String country;
    public String city;
    public String statusMessage;

    public User() {
    }

    public User(User user) {
        super(user);
        this.socialKey = user.socialKey;
        this.secretKey = user.secretKey;
        this.displayName = user.displayName;
        this.pictureUrl = user.pictureUrl;
        this.sessionId = user.sessionId;
        this.referenceKey = user.referenceKey;
        this.level = user.level;
        this.lesson = user.lesson;
        this.darkMatter = user.darkMatter;
        this.rating = user.rating;
        this.email = user.email;
        this.country = user.country;
        this.city = user.city;
        this.statusMessage = user.statusMessage;
    }

    @Override
    public AbstractEntity clone() {
        return new User(this);
    }
}
