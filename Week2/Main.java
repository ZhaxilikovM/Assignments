package Week2;

public class Main{
    public static void main(String[] args) {
        Person person = new Person("Joe", "81 Battle Lane", "111-111-1111",
                "joe@schmoe.com");
        Student student = new Student("Chloe", "54 Sense Rd.", "222-222-2222",
                "chloe@dude.com", Student.FRESHMAN);
        Employee employee = new Employee("Ase", "101 Foe St.", "333-333-3333",
                "ase@prego.com", "Rm 251", 50000.0);
        Faculty faculty = new Faculty("Morgan", "64 Arrow Park", "444-444-4444",
                "morgan@dancer.com", "Rm 890", 60000.0, "9AM-5PM", "professor");
        Staff staff = new Staff("Reggie", "78 Conclave Rd.", "555-555-5555",
                "reggie@dondon.com", "Rm 720", 55000.0, "Chief");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
