package com.example.inova_task.data.models;

import java.util.ArrayList;
import java.util.Date;

public class Post {
    private Person owner;
    private Date date;
    private String title;
    private String description;
    private String note;
    private ArrayList<Person> likers;
    private ArrayList<Comment> comments;
}
