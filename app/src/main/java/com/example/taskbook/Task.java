package com.example.taskbook;

import android.app.Notification;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private String name;
    private String description;
    private Subject subject;
    private Importance importance;
    private final List<Notification> notificationList = new ArrayList<>();
    public Task(String name, String description, Subject subject, Importance importance, List<Notification> notificationList) {
        this.name = name;
        this.description = description;
        this.subject = subject;
        this.importance = importance;
        this.notificationList.addAll(notificationList);
    }
    public Task(String name, String description, Subject subject, Importance importance){
        this.name = name;
        this.description = description;
        this.subject = subject;
        this.importance = importance;
    }
    public String getName(){
        return name;
    }
    public Subject getSubject(){
        return subject;
    }
    public void deleteNotification(Notification notification){
        notificationList.remove(notification);
    }
    public void sortNotifications(){}

}
