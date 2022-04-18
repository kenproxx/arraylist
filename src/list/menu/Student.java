package list.menu;

public class Student {
    private String maSinhVien;
    private String name;
    private double score;
    private int age;

    public Student(String maSinhVien, String name, double score, int age) {
        this.maSinhVien = maSinhVien;
        this.name = name;
        this.score = score;
        this.age = age;
    }

    public Student() {
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", age=" + age +
                '}';
    }
}
