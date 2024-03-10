import java.util.Scanner;

public class MoneySaving {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        boolean checkAgain = true;

        while (checkAgain) {
            System.out.print("Enter The Current Date (1-31): ");
            int day = scr.nextInt();
            int amount;

            switch (day) {
                case 1:
                    amount = 1;
                    break;
                case 2:
                    amount = 3;
                    break;
                case 3:
                    amount = 6;
                    break;
                case 4:
                    amount = 10;
                    break;
                case 5:
                    amount = 15;
                    break;
                case 6:
                    amount = 21;
                    break;
                case 7:
                    amount = 28;
                    break;
                case 8:
                    amount = 36;
                    break;
                case 9:
                    amount = 45;
                    break;
                case 10:
                    amount = 55;
                    break;
                case 11:
                    amount = 66;
                    break;
                case 12:
                    amount = 78;
                    break;
                case 13:
                    amount = 91;
                    break;
                case 14:
                    amount = 105;
                    break;
                case 15:
                    amount = 120;
                    break;
                case 16:
                    amount = 136;
                    break;
                case 17:
                    amount = 153;
                    break;
                case 18:
                    amount = 171;
                    break;
                case 19:
                    amount = 190;
                    break;
                case 20:
                    amount = 210;
                    break;
                case 21:
                    amount = 231;
                    break;
                case 22:
                    amount = 253;
                    break;
                case 23:
                    amount = 276;
                    break;
                case 24:
                    amount = 300;
                    break;
                case 25:
                    amount = 325;
                    break;
                case 26:
                    amount = 351;
                    break;
                case 27:
                    amount = 378;
                    break;
                case 28:
                    amount = 406;
                    break;
                case 29:
                    amount = 435;
                    break;
                case 30:
                    amount = 465;
                    break;
                case 31:
                    amount = 496;
                    break;
                default:
                    amount = 0;
                    break;
            }
            System.out.println("The Amount You Have to Store Today is: " + day);
            System.out.println(" And The Total Amount You have Stored Is : " + amount);
            System.out.print("Do you want to check again? (yes/no): ");
            String again = scr.next();
            if (!again.equalsIgnoreCase("yes")) {
                checkAgain = false;
            }
        }
    }
}
