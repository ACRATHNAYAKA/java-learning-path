package oop.constructorsAndObjectValidState.execise01;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Student001","Chamara Rathnayaka",20);
        Student student2 = new Student("Student001","Janith Kumara");

        System.out.println("----Student 01------");
        System.out.println("ID : "+student1.getId());
        System.out.println("Name : "+student1.getName());
        System.out.println("Age : "+student1.getAge());
        System.out.println();

        System.out.println("----Student 02------");
        System.out.println("ID : "+student2.getId());
        System.out.println("Name : "+student2.getName());
        System.out.println("Age : "+student2.getAge());
        System.out.println();

        Student student3 = new Student("Student003","Kamidu Nimal",110);

        System.out.println("----Student 03------");
        System.out.println("ID : "+student3.getId());
        System.out.println("Name : "+student3.getName());
        System.out.println("Age : "+student3.getAge());
    }
}
