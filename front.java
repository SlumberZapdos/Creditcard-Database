public static void main(String[] args){
        //this file is where the UI is printed
        //separate file and given the CCS treatment for ease on debugging

    }
    public static void home(){
        //homepage
        System.out.print(
                """
                        |=============================|
                        |₱        CreditWise         ₱|
                        |=============================|
                        |                             |
                        |  How can we help you today? |
                        |                             |
                        |    [1]: Register            |
                        |    [2]: Login               |
                        |    [3]: Help                |
                        |    [0]: Exit                |
                        |                             |
                        |=============================|
                        |=========] BSCS-1A [=========|
                        |=============================|
                        """);
    }
    public static void enterName() {
        System.out.print(
                """
                        |=============================|
                        |₱        CreditWise         ₱|
                        |=============================|
                        |                             |
                        |    Welcome to CreditWise    |
                        |                             |
                        |    Enter your name:         |
                        |                             |
                        |                             |
                        |                             |
                        |                             |
                        |=============================|
                        |=========] BSCS-1A [=========|
                        |=============================|
                        """);
    }
    public static void password() {
        System.out.print(
                """
                        |=============================|
                        |₱        CreditWise         ₱|
                        |=============================|
                        |                             |
                        |                             |
                        |    Welcome to CreditWise    |
                        |                             |
                        |    Enter your password:     |
                        |                             |
                        |                             |
                        |                             |
                        |                             |
                        |=============================|
                        |=========] BSCS-1A [=========|
                        |=============================|
                        """);
    }

    public static void enterNum() {
        System.out.print(
                """
                        |=============================|
                        |₱        CreditWise         ₱|
                        |=============================|
                        |                             |
                        |    Welcome to CreditWise    |
                        |                             |
                        |    Enter your Credit Card   |
                        |          number:            |
                        |                             |
                        |    We only could support    |
                        |     Master card, VISA,      |
                        |      & American Express     |
                        |                             |
                        |=============================|
                        |=========] BSCS-1A [=========|
                        |=============================|
                        """);
    }

    public static void invalidCard() {
        System.out.print(
                """
                        |=============================|
                        |₱        CreditWise         ₱|
                        |=============================|
                        |                             |
                        |     Invalid Credit Card     |
                        |           Number            |
                        |                             |
                        |                             |
                        |                             |
                        |                             |
                        |                             |
                        |=============================|
                        |=========] BSCS-1A [=========|
                        |=============================|
                        """);
    }

    public static void validate(String name, String ccType) {
        System.out.printf(
                """
       
                        |=============================|
                        |₱        CreditWise         ₱|
                        |=============================|
                        |                             |
                        |    Welcome to CreditWise    |
                        |   Are these correct?        |
                        |     Name: [%s]
                        |     CC Type: [%s]
                        |                             |
                        |    [1]: Confirm             |
                        |    [0]: Exit                |
                        |                             |
                        |=============================|
                        |=========] BSCS-1A [=========|
                        |=============================|
                        """, name, ccType);
}
    public static void logName() {
        System.out.print(
                """
                        |=============================|
                        |₱        CreditWise         ₱|
                        |=============================|
                        |                             |
                        |  Welcome back to CreditWise |
                        |                             |
                        |       Enter your name:      |
                        |                             |
                        |                             |
                        |                             |
                        |                             |
                        |=============================|
                        |=========] BSCS-1A [=========|
                        |=============================|
                        """);
    }

    public static void logpassword() {
        System.out.print(
                """
                        |=============================|
                        |₱        CreditWise         ₱|
                        |=============================|
                        |                             |
                        |                             |
                        |  Welcome back to CreditWise |
                        |                             |
                        |      Enter your password:   |
                        |                             |
                        |                             |
                        |                             |
                        |                             |
                        |=============================|
                        |=========] BSCS-1A [=========|
                        |=============================|
                        """);
    }
    public static void logError() {
        System.out.print(
                """
                        |=============================|
                        |₱        CreditWise         ₱|
                        |=============================|
                        |                             |
                        |  Invalid Name / Password    |
                        |          Try again          |
                        |                             |
                        |                             |
                        |                             |
                        |    [0]: Exit                |
                        |                             |
                        |=============================|
                        |=========] BSCS-1A [=========|
                        |=============================|
                        """);
    }

    static void profile(String name) {
        //profile of user

        System.out.printf(
                """
                        |=============================|
                        |₱        CreditWise         ₱|
                        |=============================|
                        |                             |
                        |        Welcome back,        |
                                  [%s]
                        |       how can we help?      |
                        |                             |
                        |    [1]: Check points        |
                        |    [2]: Points redemption   |
                        |    [3]: Payment check       |
                        |    [4]: Rewards             |
                        |    [0]: Exit                |
                        |                             |
                        |=============================|
                        |=========] BSCS-1A [=========|
                        |=============================|
                        """, name);
    }

    static void checkPoints(String name, int points) {
        //profile of user

        System.out.printf(
                """
                        |=============================|
                        |₱        CreditWise         ₱|
                        |=============================|
                        |                             |
                        |        Welcome back,        |
                                  [%s]
                        |       your points are       |
                        |                             |
                                       %d
                        |                             |
                        |    [4]: Rewards             |
                        |    [0]: Exit                |
                        |                             |
                        |=============================|
                        |=========] BSCS-1A [=========|
                        |=============================|
                        """, name, points);
    }
public static void help(){
System.out.print(
                    """
                        |=============================|
                        |₱        CreditWise         ₱|
                        |=============================|
                        |                             |
                        |   Welcome to CreditWise!    |
                        |   this is an app to make    |
                        |   using your credit card    |
                        |          with ease          |
                        |                             |
                        |                             |
                        |    [0]: Exit                |
                        |                             |
                        |=============================|
                        |=========] BSCS-1A [=========|
                        |=============================|
                        """);
    }
    public static void invalid() {
        System.out.print(
                """
                        |=============================|
                        |₱        CreditWise         ₱|
                        |=============================|
                        |                             |
                        |        Invalid Input        |
                        |                             |
                        |                             |
                        |                             |
                        |                             |
                        |                             |
                        |                             |
                        |=============================|
                        |=========] BSCS-1A [=========|
                        |=============================|
                        """);
    }
}
