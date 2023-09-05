package com.javarush.task.jdk13.task38.task3804;

@Entity(name = "SocialUser", value = 12)
public class SocialUser extends User {

    private final String socialId;

    public SocialUser(int id, String displayName, String email, String socialId) {
        super(id, displayName, email);
        this.socialId = socialId;
    }
}
