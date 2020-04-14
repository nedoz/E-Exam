package com.example.exam.Chapter;

public class Chapter {
    private  int id;
    private  String name;
    private  int subject_id;

    public Chapter() {
    }

    public Chapter(int id, String name, int subject_id) {
        this.id = id;
        this.name = name;
        this.subject_id = subject_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }
}
