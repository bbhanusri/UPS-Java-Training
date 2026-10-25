import java.util.*;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class EmployeeRecord {
    static ArrayList<Employee> list = new ArrayList<>();
    static HashMap<Integer, Employee> map = new HashMap<>();
    static HashSet<Integer> ids = new HashSet<>();
    static Scanner sc = new Scanner(System.in);

    static void add() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        if (ids.contains(id)) {
            System.out.println("ID already exists");
            return;
        }
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Department: ");
        String department = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        Employee e = new Employee(id, name, department, salary);
        list.add(e);
        map.put(id, e);
        ids.add(id);
        System.out.println("Employee added successfully");
    }

    static void search() {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();
        Employee e = map.get(id);
        if (e != null) {
            e.display();
        } else {
            System.out.println("Employee not found");
        }
    }

    static void update() {
        System.out.println("Update method to be completed");
    }

    static void delete() {
        System.out.println("Delete method to be completed");
    }

    static void display() {
        System.out.println("Display method to be completed");
    }

    static void save() {
        System.out.println("Save method to be completed");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Display Employees");
            System.out.println("6. Save and Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    display();
                    break;
                case 6:
                    save();
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}