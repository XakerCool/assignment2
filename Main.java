import com.railway.Passenger;

import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String userOption = "";
        User user = new User();
        while (!userOption.equals("0"))
        {
            System.out.println("Choose option: 1) Get train info; 2) Get passenger; 3) Sell ticket; 4) Update ticket; 0) Exit; \nYour option: ");
            userOption = scanner.nextLine();
            switch (userOption)
            {
                case "1":
                    System.out.println("#############");
                    user.getTrainInfo();
                    break;
                case "2":
                    System.out.println("#############");
                    Passenger passenger = user.getPassenger();
                    System.out.println(passenger.toString());
                    break;
                case "3":
                    System.out.println("#############");
                    user.sellTicket();
                    break;
                case "4":
                    System.out.println("#############");
                    user.updateTicket();
                    break;
                case "0":
                    System.out.println("#############");
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("#############");
                    System.out.println("You inputted incorrect option!");
                    break;
            }
        }
    }
}