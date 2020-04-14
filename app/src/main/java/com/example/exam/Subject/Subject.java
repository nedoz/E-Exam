package com.example.exam.Subject;

public class Subject {
    private  int id;
    private  String name;
    private  int department_id;
    private  int professor_id;
    private  int level_id;

    public Subject() {
    }

    public Subject(int id, String name, int department_id, int professor_id, int level_id) {
        this.id = id;
        this.name = name;
        this.department_id = department_id;
        this.professor_id = professor_id;
        this.level_id = level_id;
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

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public int getProfessor_id() {
        return professor_id;
    }

    public void setProfessor_id(int professor_id) {
        this.professor_id = professor_id;
    }

    public int getLevel_id() {
        return level_id;
    }

    public void setLevel_id(int level_id) {
        this.level_id = level_id;
    }
}
