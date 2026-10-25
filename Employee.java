class Employee {
    int id;
    String name;
    double basicSalary;

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Final Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {

    FullTimeEmployee(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
    }
    double calculateSalary() {
        return basicSalary + (basicSalary * 0.20);
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class Main {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(101, "Ravi", 30000);
        Employee e2 = new PartTimeEmployee(102, "Priya", 80, 200);

        System.out.println("Full-Time Employee");
        e1.display();

        System.out.println();

        System.out.println("Part-Time Employee");
        e2.display();
    }
}