import java.util.Scanner;
public class creditWise {
    /* This file requires the files:
     *  >>> frontFork1.java
     *  */

    /**

     *  /$$$$$$                            /$$ /$$   /$$     /$$      /$$ /$$
     *  /$$__  $$                          | $$|__/  | $$    | $$  /$ | $$|__/
     * | $$  \__/  /$$$$$$   /$$$$$$   /$$$$$$$ /$$ /$$$$$$  | $$ /$$$| $$ /$$  /$$$$$$$  /$$$$$$
     * | $$       /$$__  $$ /$$__  $$ /$$__  $$| $$|_  $$_/  | $$/$$ $$ $$| $$ /$$_____/ /$$__  $$
     * | $$      | $$  \__/| $$$$$$$$| $$  | $$| $$  | $$    | $$$$_  $$$$| $$|  $$$$$$ | $$$$$$$$
     * | $$    $$| $$      | $$_____/| $$  | $$| $$  | $$ /$$| $$$/ \  $$$| $$ \____  $$| $$_____/
     * |  $$$$$$/| $$      |  $$$$$$$|  $$$$$$$| $$  |  $$$$/| $$/   \  $$| $$ /$$$$$$$/|  $$$$$$$
     *  \______/ |__/       \_______/ \_______/|__/   \___/  |__/     \__/|__/|_______/  \_______/


     * This is CreditWise, a program used to accompany credit cards to earn and spend rewards given by the bank
     *  Currently CreditWise only accepts VISA, Master card, and American Express credit card numbers.
     *  Ph credit cards are sometimes issued by these banks, like processes the transaction on those cards which includes them into these cards

     **/

    /* Here are some sample card numbers to try out Kay-C:
     * >>> 5555555555554444 - Mastercard credit card
     * >>> 4111111111111111 - VISA
     * >>> 371111111111114  - American Express
     * Those are some test numbers of those cards supported by CreditWise*/

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        boolean exitProgram = false;
        String[][] credentials = {
                {"VISA", "4111111111111111", "password","1000", },
                {null, null, null, null}, // rows available for other users
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
        };
        int numUsers = 0, points = 100;

        while(!exitProgram){
            //homepage
            frontFork1.home();
            String choice = input.nextLine();

            switch (choice){
                case "1":
                    register(input, credentials, numUsers);
                    numUsers++;
                    break;
                case "2":
                    String[] loginDetails = login(points, credentials);
                    break;
                case "3":
                    frontFork1.help();
                    break;
                case "0":
                    exitProgram = true;
                    break;
                default:
                    frontFork1.invalid();
            }
        }

    System.out.println("Thank you for using CreditWise!");

    }
    static void register(Scanner input, String[][] credentials, int numUsers) {
        String[] userInfo = new String[3];
        boolean credentialsConfirmed = false;

        // Logic in registration part
        while (!credentialsConfirmed) {
            // Name
            frontFork1.enterName();
            String name = input.nextLine();
            userInfo[0] = name;

            // Credit card number
            frontFork1.enterNum();
            String ccNum = input.nextLine();
            userInfo[1] = ccNum;

            // Validate credit card
            String ccType = typeCheck(Long.parseLong(ccNum));
            if (ccType.equals("INVALID")) {
                frontFork1.invalidCard();
                continue;
            }

            // Password
            frontFork1.password();
            String pass = input.nextLine();
            userInfo[2] = pass;

            // Confirm credentials
            frontFork1.validate(name, ccType);
            String ans = input.nextLine();
            if (ans.equals("1")) {
                credentialsConfirmed = true;
            }
        }

        // Add new user credentials to the next available row in credentials
        credentials[numUsers][0] = userInfo[0];
        credentials[numUsers][1] = userInfo[1];
        credentials[numUsers][2] = userInfo[2];
        numUsers++;
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

    static String[] login( int points, String[][] credentials) {
        Scanner input = new Scanner(System.in);
        String[] loginDetails = new String[3];

        frontFork1.logName();
        String name = input.nextLine();
        loginDetails[0] = name;

        frontFork1.logpassword();
        String pass = input.nextLine();
        loginDetails[1] = pass;

        boolean found = false;
        for(int i = 0; i < credentials.length; i++){
            if(credentials[i][0] != null && credentials[i][2] != null && loginDetails[0].equals(credentials[i][0]) && loginDetails[1].equals(credentials[i][2])){
                found = true;
                break;
            }
        }
        if (found){ //profile method???
            profile(name, points);
        } else {
            frontFork1.logError();
            String res = input.nextLine();
            loginDetails[2] = res;
        }

        return loginDetails;
    }
    static void profile (String name, int points){
        //profile method
        Scanner input = new Scanner(System.in);
        boolean exitProgram = false;

        while(!exitProgram){
            //profile page
            frontFork1.profile(name);
            String choice = input.nextLine();

            switch (choice){
                case "1":
                    //check points

                    break;
                case "2":
                    //point redemption

                    break;
                case "3":
                    //freebies

                    break;

                case "4":
                    //rewards

                case "0":
                    exitProgram = true;
                    break;
                default:
                    frontFork1.invalid();
            }
        }

    }

    static void rewards(){
        //information on how points work and how to redeem them
    }

    static void redeem(){
        //redeem nonsense prizes
    }

    static void rewardCenter(){
        //show both redemption page and rewards center in one page
    }

    static void freebies() {
        //freebies check certain points to claim one
    }
}

