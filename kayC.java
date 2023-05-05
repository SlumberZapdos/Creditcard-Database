//break into different packages

import java.util.Scanner;

public class kayC {

    /* This file requires the files:
     *  >>> front.java
     *  >>> register.java
     *  */

    /**

     * This is Kay-C, a program used to accompany credit cards to earn and spend rewards given by the bank
     *  Currently Kay-C only accepts VISA, Master card, and American Express credit card numbers.

     **/

    /* Here are some sample card numbers to try out Kay-C:
    * >>> 5555555555554444 - Mastercard credit card
    * >>> 4111111111111111 - VISA
    * >>> 371111111111114  - American Express
    * */
    public static void main(String[] args){
        // store credentials
        // revise public stativ void content - break data into packages
        
        // break 1
        String[][] credentials = {
                {}, //usernames
                {}, //passwords
                {}, //credit card number
                {}, //credit card type
                {}  //points
        };

        Scanner input = new Scanner(System.in);
        Scanner response = new Scanner(System.in);

        try{
            while (true){
                front.clear(); //clear cmd

                front.home(); //homepage
                String reply = input.nextLine();
                if (reply.equals("1")){
                    //register
                    front.clear(); //clear cmd

                    System.out.println("Welcome!");
                }
                else if (reply.equals("2")){
                    //login
                    front.clear(); //clear cmd

                    System.out.println("Login successful!");
                }
                else if (reply.equals("3")){
                    //help
                    front.clear(); //clear cmd
                    System.out.println("Help!");
                }
                else if (reply.equals("0")) {
                    //exit
                    System.out.println("Thanks for using Kay-C!");
                    break;
                }
                else{
                    System.out.println("Invalid input!");
                }

            }
        }
        catch (Exception e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    //break2 - convert into different package
    static String typeCheck(long ccNum){

        // This is the old CCChecker.java file integrated to main for easier debugging

        int digit1 = 0, digit2 = 0, numDigits = 0, sumOfDoubleOdds = 0, sumOfEvens = 0;

        //CC validator
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

        // if ccnum gets validated, this checks which card type it is
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

    
        //break 3 - convert into different package
    static void register (){
        Scanner input = new Scanner(System.in);
        //logic on registration part

        //name
        front.enterName();
        String name = input.nextLine();

        //number
        front.enterNum();
        String ccNum = input.nextLine();

        //password
        front.password();
        String pass = input.nextLine();

        //welcome
        front.welcome();
        String res = input.nextLine();
    }
    
    
        //break 4 - convert into different package
    static  void login (){
        Scanner input = new Scanner(System.in);
        //logic in the login part

        front.logName(); //check name if match
        String name = input.nextLine();

        front.logPass(); //check pass if match
        String pass = input.nextLine();

        front.logError();//if login failed
        String res = input.nextLine();
    }
    static void profile(){
        Scanner input = new Scanner(System.in);
        //incomplete part yet

        front.profile();
        String res = input.nextLine();
    }
}
