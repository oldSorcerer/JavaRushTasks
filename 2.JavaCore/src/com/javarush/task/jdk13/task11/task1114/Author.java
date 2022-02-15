package com.javarush.task.jdk13.task11.task1114;

public class Author {
    private final String name;
    private final Article article;

    public Author(String name, String title, String text) {
        this.name = name;
        this.article = new Article(title, text, this);
    }

    public String getName() {
        return name;
    }

    public Article getArticle() {
        return article;
    }
}
