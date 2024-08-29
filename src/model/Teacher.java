package model;

public class Teacher {
    private int id;
    private String nameTeacher;
    private String major;
    private int age;

    public Teacher(int id, String nameTeacher, String major, int age) {
        this.id = id;
        this.nameTeacher = nameTeacher;
        this.major = major;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", nameTeacher='" + nameTeacher + '\'' +
                ", major='" + major + '\'' +
                ", age=" + age +
                '}';
    }
}
