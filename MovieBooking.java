import java.util.Scanner;
class MovieBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Avengers");
        System.out.println("2. Titanic");
        System.out.println("3. Athadu");
        System.out.println("Choose Movie:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Avengers Selected");
                break;
            case 2:
                System.out.println("Titanic Selected");
                break;
            case 3:
                System.out.println("Athadu Selected");
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        System.out.println("Enter No. of Tickets:");
        int tickets = sc.nextInt();
        if (tickets > 0) {
            System.out.println("1 - Gold - Rs.150/-");
            System.out.println("2 - Diamond - Rs.250/-");
            System.out.println("3 - Platinum - Rs.350/-");
            System.out.println("Choose Seat Type:");
            int seat = sc.nextInt();
            if (seat == 1) {
                System.out.println("Seat: Gold");
                System.out.println("Total: Rs." + (tickets * 150));
            } else if (seat == 2) {
                System.out.println("Seat: Diamond");
                System.out.println("Total: Rs." + (tickets * 250));
            } else if (seat == 3) {
                System.out.println("Seat: Platinum");
                System.out.println("Total: Rs." + (tickets * 350));
            } else {
                System.out.println("Invalid Seat Choice");
            }
        } else {
            System.out.println("Invalid number of tickets");
        }
        sc.close();
    }
}

