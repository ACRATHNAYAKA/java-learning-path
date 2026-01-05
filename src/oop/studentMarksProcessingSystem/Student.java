package oop.studentMarksProcessingSystem;

public class Student {
    private final String id;
    private final String name;

    public Student(String id, String name){
        if (id==null || id.isBlank()){
            throw new IllegalArgumentException("Name Cant be Empty");
        }
        if (name==null || name.isBlank()){
            throw new IllegalArgumentException("ID cant be Empty");
        }

        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
