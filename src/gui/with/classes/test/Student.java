
package gui.with.classes.test;

import java.io.Serializable;

public class Student implements Serializable{
     private String roll_no;
    private String name;
    private String Class;
    
    private int subjects;
    private String gender;
    private String dateofjoining;
    public static int studentcount=0;

    
    public Student(String roll_no, String name,String Class,int subjects,String date,String gender){
        
        this.roll_no=roll_no;
        this.name=name;
        this.Class=Class;
        studentcount =+1;
        this.subjects=subjects;
        studentcount +=1;
        dateofjoining=date;
        this.gender=gender;

    }

   


   
    public void setclass(String Class){
        this.Class=Class;
    }
    
    public String getclass(){
        return Class;
    }

    public String getDateofjoining() {
        return dateofjoining;
    }

    public void setDateofjoining(String dateofjoining) {
        this.dateofjoining = dateofjoining;
    }
    
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    


    
    

    
  
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public static int getStudentcount() {
        return studentcount;
    }
    
    
    
    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }

    public String getRoll_no() {
        return roll_no;
    }

    
    
    
    

    public int getSubjects() {
        return subjects;
    }

    public void setSubjects(int subjects) {
        this.subjects = subjects;
    }

    
    @Override
    public String toString() {
        return "Student name :"+name+
                "\nRoll No"+ roll_no;
    }
}
    

