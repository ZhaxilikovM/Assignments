package Week2;

public class Student extends Person {

    public static final int FRESHMAN = 0;
    public static final int SOPHOMORE = 1;
    public static final int JUNIOR = 2;
    public static final int SENIOR = 3;

    private int classStatus;

    // constructors
    public Student(String name, String address, String phoneNumber,
                   String emailAddress, int classStatus) {
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus;
    }

    public int getClassStatus() {
        return classStatus;
    }


    @Override
    public String toString() {
        return "class: Student\nname: " + getName();
    }
}