package com.example.exam.Level;

public class Level {
    private  int id;
    private  String name;
    private  int faculity_id;

    public Level() {
    }

    public Level(int id, String name, int faculity_id) {
        this.id = id;
        this.name = name;
        this.faculity_id = faculity_id;
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

    public int getFaculity_id() {
        return faculity_id;
    }

    public void setFaculity_id(int faculity_id) {
        this.faculity_id = faculity_id;
    }
}
