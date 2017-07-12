import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double length = 0.0;
        double width = 0.0;
        double area = 0.0;
        double perim = 0.0;
        char choice = '-';

        //Input
        Scanner scan = new Scanner(System.in);
        do {


            System.out.println("Welcome to Grand Circus' Room Detail Generator! ");

            System.out.println("Continue? (y/n) ");


            choice = scan.next().charAt(0);
            scan.nextLine();

            if ((choice == 'n'))
            {
                break;
            }
            else if ((choice != 'n') &&(choice != 'y'))
            {
                break;
            }
            else


            System.out.println("Enter lenght of a room: ");

            length = scan.nextDouble();
            scan.nextLine();

            System.out.println("Enter width of a room: ");

            width = scan.nextDouble();
            scan.nextLine();
            //Processing

            area = width * length;
            perim = 2 * (length + width);

            //Output

            System.out.println("The Area of the room is: " + area);

            System.out.println("The perimeter of the room is: " + perim);
        }
            while (choice == 'y');













    }
}
