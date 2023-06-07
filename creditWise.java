import java.util.Scanner;

public class creditWise {
    /*
     * This file requires the files:
     *  >>> FrontFork1.java
     */

    /**
     * /$$$$$$                            /$$ /$$   /$$     /$$      /$$ /$$
     * /$$__  $$                          | $$|__/  | $$    | $$  /$ | $$|__/
     * | $$  \__/  /$$$$$$   /$$$$$$   /$$$$$$$ /$$ /$$$$$$  | $$ /$$$| $$ /$$  /$$$$$$$  /$$$$$$
     * | $$       /$$__  $$ /$$__  $$ /$$__  $$| $$|_  $$_/  | $$/$$ $$ $$| $$ /$$_____/ /$$__  $$
     * | $$      | $$  \__/| $$$$$$$$| $$  | $$| $$  | $$    | $$$$_  $$$$| $$|  $$$$$$ | $$$$$$$$
     * | $$    $$| $$      | $$_____/| $$  | $$| $$  | $$ /$$| $$$/ \  $$$| $$ \____  $$| $$_____/
     * |  $$$$$$/| $$      |  $$$$$$$|  $$$$$$$| $$  |  $$$$/| $$/   \  $$| $$ /$$$$$$$/|  $$$$$$$
     * \______/ |__/       \_______/ \_______/|__/   \___/  |__/     \__/|__/|_______/  \_______/

     * This is CreditWise, a program used to accompany credit cards to earn and spend rewards given by the bank
     *  Currently, CreditWise only accepts VISA, Mastercard, and American Express credit card numbers.
     *  Ph credit cards are sometimes issued by these banks, like processes the transaction on those cards which includes them into these cards
     **/

    /*
     * Here are some sample card numbers to try out Kay-C:
     * >>> 5555555555554444 - Mastercard credit card
     * >>> 4111111111111111 - VISA
     * >>> 371111111111114  - American Express
     * Those are some test numbers of those cards supported by CreditWise
     */

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean exitProgram = false;
    String[][] credentials = {
                {"VISA", "4111111111111111", "password", "1000",},
                {null, null, null, "1000"}, // rows available for other users
                {null, null, null, "1000"},
                {null, null, null, "1000"},
                {null, null, null, "1000"},
                {null, null, null, "1000"},
                {null, null, null, "1000"},
                {null, null, null, "1000"},
                {null, null, null, "1000"},
                {null, null, null, "1000"},
    };
    int numUsers = 0;
    int points = CredentialsConverter.convertToInt(credentials[0][3]);

    try {
        while (!exitProgram) {
            Front.home();
            String choice = input.nextLine();

            switch (choice) {
                case "1" -> {
                    register(input, credentials, numUsers);
                    numUsers++;
                }
                case "2" -> {
                    String[] loginDetails = login(points, credentials);
                }
                case "3" -> Front.help();
                case "0" -> exitProgram = true;
                default -> {
                    Front.invalid();
                    String confirmation = input.nextLine();
                }
            }
        }
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage() + "please contact one of our staff");
    }
    //exit message
    System.out.println("Thank you for using CreditWise!");
}

    static void register(Scanner input, String[][] credentials, int numUsers) {
        String[] userInfo = new String[4];
        boolean credentialsConfirmed = false;

        // Logic in registration part
        while (!credentialsConfirmed) {
            // Name
            Front.enterName();
            String name = input.nextLine();
            userInfo[0] = name;

            // Credit card number
            Front.enterNum();
            String ccNum = input.nextLine();
            userInfo[1] = ccNum;

            // Validate credit card
            String ccType = typeCheck(Long.parseLong(ccNum));
            if (ccType.equals("INVALID")) {
                Front.invalidCard();
                continue;
            }

            // Password
            Front.password();
            String pass = input.nextLine();
            userInfo[2] = pass;

            // Confirm credentials
            Front.validate(name, ccType);
            String ans = input.nextLine();
            if (ans.equals("1")) {
                credentialsConfirmed = true;
            }
        }

        // Add new user credentials to the next available row in credentials
        credentials[numUsers][0] = userInfo[0];
        credentials[numUsers][1] = userInfo[1];
        credentials[numUsers][2] = userInfo[2];
        credentials[numUsers][3] = userInfo[3];
    }

    static String typeCheck(long ccNum) {
        // CC validator
        int digit1 = 0, digit2 = 0, numDigits = 0, sumOfDoubleOdds = 0, sumOfEvens = 0;
        while (ccNum > 0) {
            digit2 = digit1;
            digit1 = (int) (ccNum % 10);

            if (numDigits % 2 == 0) {
                sumOfEvens += digit1;
            } else {
                int multiple = 2 * digit1;
                sumOfDoubleOdds += (multiple / 10) + (multiple % 10);
            }

            ccNum /= 10;
            numDigits++;
        }

        boolean isValid = (sumOfEvens + sumOfDoubleOdds) % 10 == 0;
        int firstTwoDigits = digit1 * 10 + digit2;

        // if credit card num gets validated, this checks which card type it is
        if (digit1 == 4 && numDigits >= 13 && numDigits <= 16 && isValid) {
            return "VISA";
        } else if (firstTwoDigits >= 51 && firstTwoDigits <= 55 && numDigits == 16 && isValid) {
            return "MASTERCARD";
        } else if ((firstTwoDigits == 34 || firstTwoDigits == 37) && numDigits == 15 && isValid) {
            return "AMERICAN EXPRESS";
        } else {
            return "INVALID";
        }
    }

    static String[] login(int points, String[][] credentials) {
        Scanner input = new Scanner(System.in);
        String[] loginDetails = new String[3];

        Front.logName();
        String name = input.nextLine();
        loginDetails[0] = name;

        Front.logpassword();
        String pass = input.nextLine();
        loginDetails[1] = pass;

        boolean found = false;
        for (int i = 0; i < credentials.length; i++) {
            if (credentials[i][0] != null && credentials[i][2] != null && loginDetails[0].equals(credentials[i][0]) && loginDetails[1].equals(credentials[i][2])) {
                found = true;
                break;
            }
        }
        if (found) {
            //go to profile page
            profile(name, points, credentials);
        } else {
            Front.logError();
            String res = input.nextLine();
            loginDetails[2] = res;
        }

        return loginDetails;
    }

    static void profile(String name, int points, String[][] credentials) {
        Scanner input = new Scanner(System.in);
        boolean exitProgram = false;

        while (!exitProgram) {
            Front.profile(name);
            String choice1 = input.nextLine();

            switch (choice1) {
                case "1" -> checkPoints(name, points);
                case "2" -> points = redeem(name, points);  // Update the points value
                case "3" -> freebies(points, credentials);
                case "4" -> rewardsCenter();
                case "0" -> exitProgram = true;
                default -> {
                    Front.invalid();
                    String confirmation = input.nextLine();
                }
            }
        }
    }

    static void checkPoints(String name, int points) {
        Scanner input = new Scanner(System.in);
        Front.checkPoints(name, points);
        String choice2 = input.nextLine();
        Front.profile(name);
    }

    public static int redeem(String name, int points) {
        Scanner input = new Scanner(System.in);
        Front.redemption(name, points);
        int choice3 = input.nextInt();
        Front.redemptionConfirm();
        int choice4 = input.nextInt();
        if (choice4 == 1 || choice4 == 2) {
            if (points < 50) {
                Front.insufficientPoints();
                String conf = input.nextLine();
            } else {
                points -= 50;
                Front.redemptionSuccess();
                String conf = input.nextLine();
            }
        } else {
            System.out.println(" ");
        }
        return points;
    }

    public static int freebies(int points, String[][] credentials) {
        //claim at least 1 free reward/s
        Scanner input = new Scanner(System.in);
        Front.freebies();
        int choice5 = input.nextInt();
        Front.redemptionConfirm();
        int choice6 = input.nextInt();
        if (choice6 == 1) {
            // Convert "1000" to an int using CredentialsConverter class
            int num = CredentialsConverter.convertToInt(credentials[0][2]);
            if (points < 50) {
                Front.claimInvalid();
                String confirm = input.nextLine();
            }
            else {
                points -= 50;
                Front.claimSuccess();
                String confirm = input.nextLine();
            }
        } else if (choice6 == 2) {
            if (points >= 50) {
                points =- 50;
                Front.claimSuccess();
            } else {
                Front.claimInvalid();
            }
            String confirm = input.nextLine();
        } else {
            System.out.println(" ");
        }
        return points;
    }

    static void rewardsCenter() {
        //shows how to redeem points
        Scanner input = new Scanner(System.in);
        Front.rewardCenter();
        String rcok = input.nextLine();
        switch (rcok) {
            case "1" -> {
                Front.rewardsCenterpoints();
                String confirm = input.nextLine();
            }
            case "2" -> {
                Front.rewardsCenterPB();
                String confirm = input.nextLine();
            }
            case "3" -> {
                Front.reward();
                String confirm = input.nextLine();
            }
            default -> System.out.println(" ");
        }
    }

    public static class CredentialsConverter {
        //converts String score on the array to int to perform operations to it
        public static int convertToInt(String str) {
            return Integer.parseInt(str);
        }
    }

}
