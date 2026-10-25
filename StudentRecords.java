import java.io.*;
import java.util.*;

class StudentRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter fw = new FileWriter("students.txt");
            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter student ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter student name: ");
                String name = sc.nextLine();
                System.out.print("Enter marks: ");
                int marks = sc.nextInt();
                sc.nextLine();
                fw.write(id + "," + name + "," + marks + "\n");
            }
            fw.close();

            System.out.println("\nStudent Records:");
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            String line;
            String topStudent = "";
            int highest = -1;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String data[] = line.split(",");
                int marks = Integer.parseInt(data[2]);
                if (marks > highest) {
                    highest = marks;
                    topStudent = data[1];
                }
            }
            br.close();

            System.out.println("Highest Marks: " + topStudent + " - " + highest);

            FileWriter append = new FileWriter("students.txt", true);
            append.write("6,NewStudent,85\n");
            append.close();

            System.out.println("New student record appended successfully.");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
        sc.close();
    }
}