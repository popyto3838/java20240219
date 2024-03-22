package ch17.sec11;

public class Student {
    private String name;
    private int Score;

    public Student(String name, int score) {
        this.name = name;
        Score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return Score;
    }
}
