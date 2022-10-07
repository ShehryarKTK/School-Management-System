
package gui.with.classes.test;
import java.util.ArrayList;


public class School {
    public   ArrayList<Teacher> teachers;
    public   ArrayList<Student> students;
   
    
    public School() {
        teachers =new ArrayList(); 
        students = new ArrayList();
        
    }

    
    public  ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    
    public  void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    
    public  ArrayList<Student> getStudents() {
        return students;
    }

    
    public  void addStudent(Student student) {
        students.add(student);
    }

    
}
