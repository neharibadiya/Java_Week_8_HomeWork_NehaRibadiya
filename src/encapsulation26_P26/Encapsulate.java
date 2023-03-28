package encapsulation26_P26;

public class Encapsulate {
    // private variables declared these can only be accessed by public methods of class
    private String name;
    private int rollno;
    private int age;
    // get method for name to access private variable name
    public String getName(){
        return name;
    }
    // set method for name to access private variablename
    public void setName(String name){
        this.name = name;
    }
    // get method for roll to access private variable rollNo
    public int getRollNo(){
        return rollno;
    }
    // set method for roll to access private variable rollNo
    public void setRollno(int rollno){
        this.rollno = rollno;
    }
    // get method for age to access private variable age
    public int getAge(){
        return age;
    }
    // set method for age to access private variable age
    public void setAge(int age){
        this.age = age;
    }

}
