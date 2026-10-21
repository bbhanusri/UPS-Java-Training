class Student {
    int rollNo;
    String name;
    int marks[];

    Student(int rollNo, String name, int marks[]) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    int calculateTotal() {
        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        return total;
    }

    double calculateAverage() {
        return calculateTotal() / 5.0;
    }
    char calculateGrade() {
        double avg = calculateAverage();

        if (avg >= 90)
            return 'A';
        else if (avg >= 75)
            return 'B';
        else if (avg >= 60)
            return 'C';
        else if (avg >= 40)
            return 'D';
        else
            return 'F';
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Total: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + calculateGrade());
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Arun",
                new int[]{80, 85, 90, 85, 85});

        Student s2 = new Student(2, "Priya",
                new int[]{95, 92, 98, 90, 95});

        Student s3 = new Student(3, "Ravi",
                new int[]{70, 75, 80, 65, 70});

        Student students[] = {s1, s2, s3};

        Student topper = students[0];
        for (int i = 0; i < students.length; i++) {
            students[i].display();

            if (students[i].calculateTotal()
                    > topper.calculateTotal()) {
                topper = students[i];
            }
        }

        System.out.println("Topper: " + topper.name);
    }
}