package com.example.exam.Question;

public class Question {
    private  int id;
    private  String name;
    private  String type;
    private  String option1;
    private  String option2;
    private  String option3;
    private  String option4;
    private  String question_difficulity;
    private  int answer;

    public Question() {
    }

    public Question(int id, String name, String type, String option1, String option2, String option3, String option4, String question_difficulity, int answer) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.question_difficulity = question_difficulity;
        this.answer = answer;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getQuestion_difficulity() {
        return question_difficulity;
    }

    public void setQuestion_difficulity(String question_difficulity) {
        this.question_difficulity = question_difficulity;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
