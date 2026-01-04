package oop.constructorsAndObjectValidState.execise01;

public class Student {

    private final String id;
    private final String name;
    private final int age;

    public Student(String id,String name, int age){
        if (id == null || id.isBlank()){
            throw new IllegalArgumentException("ID Cant be empty");
        }
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Name Cant be empty");
        }
        if (age<5 || age>100){
            throw new IllegalArgumentException("Age Range is 5 - 100");
        }

        this.id = id;
        this.name = name;
        this.age = age;


    }

    public Student(String id,String name){
        this(id,name,18);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



}
