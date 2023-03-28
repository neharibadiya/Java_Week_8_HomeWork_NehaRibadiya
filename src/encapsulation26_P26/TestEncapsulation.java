package encapsulation26_P26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        // setting values of the variables
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollno(32);

        // Displaying values of the variables
        System.out.println("Prime's name: "+ obj.getName());
        System.out.println("Prime's age : "+ obj.getAge());
        System.out.println("Prime's rollno : "+obj.getRollNo());
        // Direct access of rollNo is not possible due to encapsulation
        // System.out.println("Prime's rollNo : " + obj.geekName);

    }
}
