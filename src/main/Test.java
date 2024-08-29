package main;
import model.Student;
import model.Teacher;

public class Test {
    public static void main(String[] args){
        Student student1 = new Student(01,"Vu","01/01/0001",20,"PRO192",60,180);
        Teacher teacher1 = new Teacher(02,"Anh","Engineer",27);
        System.out.println(student1.toString());
//        setter va getter cua student1:
        student1.setId(02);
        System.out.println("id moi: "+student1.getId());
        student1.setNameStudent("Le");
        System.out.println("nameStudent moi: "+student1.getNameStudent());
        student1.setDob("04/04/0404");
        System.out.println("dob moi: "+student1.getDob());
        student1.setAge(21);
        System.out.println("age moi: "+student1.getAge());
        student1.setClassStudent("PRO999");
        System.out.println("classStudent moi: "+student1.getClassStudent());
        student1.setWeight(70);
        System.out.println("weight moi: "+student1.getWeight());
        student1.setHeight(190);
        System.out.println("height moi: "+student1.getHeight());

        System.out.printf("\n\n");
        System.out.println(teacher1.toString());
//        setter va getter cua teacher1:
        teacher1.setId(03);
        System.out.println("id moi: "+teacher1.getId());
        teacher1.setNameTeacher("Dinh");
        System.out.println("nameTeacher moi: "+teacher1.getNameTeacher());
        teacher1.setMajor("Computer");
        System.out.println("major moi: "+teacher1.getMajor());
        teacher1.setAge(30);
        System.out.println("age moi: "+teacher1.getAge());
        System.out.printf("\n");
        System.out.println("Test calculateBMI:");
        System.out.println("BMI cua student: "+ChucNang.calculateBMIOfStudent(student1.getHeight(),student1.getWeight()));
        System.out.printf("\n");
        System.out.println("Test 2 method overload:");
        System.out.println(student1.printValue(student1.getAge()));
        System.out.println(student1.printValue(student1.getAge(),student1.getNameStudent()));


    }
}
