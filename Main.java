package homework2;
public class Main {
    public static void main(String[] args) {       
        Course course1 = new Course(1, "Yazılım Geliştirici Yetiştirme Kmapı", "Engin Demiroğ", "C# + Angular");
        Course course2 = new Course(2, "Yazılım Geliştirici Yetiştirme Kmapı 2", "Engin Demiroğ", "Java + React");
        Course course3 = new Course(3, "Programlamaya Giriş için Temel Kurs", "Engin Demiroğ", 
                "Python, Java, C# gibi tüm programlama dilleri için temel programlama mantığı.");       
        Course[] courses={course1,course2,course3};        
        for(Course course : courses) {
            System.out.println(course.name);
        }       
        Category category1=new Category(1,"Programlama");       
        Category[] category={category1};        
        CourseManager courseManager=new CourseManager();
        courseManager.signUpTheCourse(course1);
        courseManager.signUpTheCourse(course2);
        courseManager.signUpTheCourse(course3);        
    }   
}
