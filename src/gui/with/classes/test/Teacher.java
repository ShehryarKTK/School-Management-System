
package gui.with.classes.test;


public class Teacher {
    private String id;
    private String name;
    private String subject;
    private String dateofjoining;
    private String gender;
    private double salary;
    
    

  
    
    public Teacher(String id, String name,String date,String gender,String subject,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.gender=gender;
        dateofjoining=date;
        this.subject=subject;
    }

    
    
    public void setId(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }
   public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
    
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }


    
    
    public void setSalary(double salary){
        this.salary=salary;
    }
     
     
    public double getSalary(){
        return  salary;
    }
    

    public void setSubject(String subject) {
        this.subject = subject;
    }

    
    
    
    public String getSubject() {
        return subject;
    }

    public String getDateofjoining() {
        return dateofjoining;
    }

    public void setDateofjoining(String dateofjoining) {
        this.dateofjoining = dateofjoining;
    }
    
    

   


    @Override
    public String toString() {
        return "\nName of the Teacher: " + name
                +"\n Subject:"+subject;
    }
}
    

