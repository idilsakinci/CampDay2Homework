package homework2;

public class Course {
    public Course() { 
        System.out.println("Çalıştım!");
    }
    public Course(int id, String name, String instructor, String detail) {
        this(); 
        this.id=id; 
        this.name=name;
        this.instructor=instructor;      
        this.detail=detail;
    }
    int id;
    String name;
    String instructor;
    String detail;
}
