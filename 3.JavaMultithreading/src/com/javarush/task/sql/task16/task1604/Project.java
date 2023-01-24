package com.javarush.task.sql.task16.task1604;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
//    @org.hibernate.annotations.Type(type = "org.hibernate.type.TextType")
    private String description;

    @Column(name = "content")
//    @org.hibernate.annotations.Type(type = "org.hibernate.type.TextType")
    private String content;

    @Column(name = "task_key")
    private String taskKey;

    @Column(name = "icon_url")
    private String iconUrl;

    @Column(name = "cover_url")
    private String coverUrl;

    @Column(name = "picture_url")
    private String pictureUrl;

    @Column(name = "app_cover_url")
    private String appCoverUrl;

    @Column(name = "video_url")
    private String videoUrl;

    @Column(name = "preferred_user_level")
    private Integer preferredUserLevel;

    @Column(name = "tasks_total")
    private Integer tasksTotal;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "updated_time")
    private Date updatedTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTaskKey() {
        return taskKey;
    }

    public void setTaskKey(String taskKey) {
        this.taskKey = taskKey;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getAppCoverUrl() {
        return appCoverUrl;
    }

    public void setAppCoverUrl(String appCoverUrl) {
        this.appCoverUrl = appCoverUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Integer getPreferredUserLevel() {
        return preferredUserLevel;
    }

    public void setPreferredUserLevel(Integer preferredUserLevel) {
        this.preferredUserLevel = preferredUserLevel;
    }

    public Integer getTasksTotal() {
        return tasksTotal;
    }

    public void setTasksTotal(Integer tasksTotal) {
        this.tasksTotal = tasksTotal;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}