package JavaBook;

public class StaticTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("John", 100000);
        staff[1] = new Employee("Anna", 140000);
        staff[2] = new Employee("Ivan", 70000 );
        for (Employee e : staff){
            e.setId();
            System.out.println("name - " + e.getName() + ", id - " + e.getId() + ", salary - " + e.getSalary());
        }
     }
}
