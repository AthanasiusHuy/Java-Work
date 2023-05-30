import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentlist = new ArrayList<Student>();
        Student student = new Student(null, null, 0, null);
        boolean check = true;
        while (check == true) {
            System.out.println("Enter code: ");
            String code = scanner.nextLine();
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            System.out.println("Enter sex: ");
            String sex = scanner.nextLine();
            System.out.println("Enter age: ");
            int age = scanner.nextInt();

            student.setCode(code);
            student.setName(name);
            student.setAge(age);
            student.setSex(sex);
            System.out.println("\n");
            student.Print();

            System.out.println("Start ? (y/n)");
            scanner.nextLine();
            String result = scanner.nextLine();
            if (result.equalsIgnoreCase("y")) {
                check = true;
            } else if (result.equalsIgnoreCase("n")) {
                check = false;
            }
        }
        System.out.println("END");

    }
    
}