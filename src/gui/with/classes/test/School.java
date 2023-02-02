
package gui.with.classes.test;
import java.util.ArrayList;
import java.util.*;


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
    
    public void addTeacherArray(ArrayList<Teacher> array){
        this.teachers.addAll(array);
    }
    public void addstudentarray(ArrayList<Student> array){
        this.students.addAll(array);
    }
}
