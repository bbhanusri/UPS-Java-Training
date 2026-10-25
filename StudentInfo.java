import java.util.ArrayList;
import java.util.Comparator;

class StudentInfo {
    int rollNo;
    String name;
    int marks;

    StudentInfo(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return rollNo + " " + name + " " + marks;
    }
}

class ArrayListTask5 {
    public static void main(String[] args) {

        ArrayList<StudentInfo> list = new ArrayList<>();

        list.add(new StudentInfo(1, "Ravi", 85));
        list.add(new StudentInfo(2, "Priya", 92));
        list.add(new StudentInfo(3, "Aman", 68));
        list.add(new StudentInfo(4, "Sneha", 78));
        list.add(new StudentInfo(5, "Rahul", 60));

        System.out.println("Students scoring above 75:");

        for (StudentInfo s : list) {
            if (s.marks > 75) {
                System.out.println(s);
            }
        }

        int searchRoll = 3;

        for (StudentInfo s : list) {
            if (s.rollNo == searchRoll) {
                System.out.println("Student found: " + s);
            }
        }

        int updateRoll = 3;

        for (StudentInfo s : list) {
            if (s.rollNo == updateRoll) {
                s.marks = 80;
                System.out.println("Updated student: " + s);
            }
        }

        int removeRoll = 5;

        list.removeIf(s -> s.rollNo == removeRoll);

        System.out.println("After removing student:");

        for (StudentInfo s : list) {
            System.out.println(s);
        }

        list.sort(Comparator.comparingInt(s -> s.marks));

        System.out.println("Students sorted by marks:");

        for (StudentInfo s : list) {
            System.out.println(s);
        }
    }
}