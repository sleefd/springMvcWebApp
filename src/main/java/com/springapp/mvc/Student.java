package com.springapp.mvc;

/**
 * Created by _ashao2321919 on 14-1-5.
 */
public class Student {

    private int score;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (score != student.score) return false;
        if (!name.equals(student.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = score;
        result = 31 * result + name.hashCode();
        return result;
    }

    private String name;

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public Student(String name, int score) {
        this.name = name;

        this.score = score;
    }
}
