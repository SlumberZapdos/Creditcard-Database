{
    public static void main(String[] args) {
        //this file is where the UI is printed
        //separate file due to how large the UI is on code and on basic code aesthetic


    }
    static void home(){
        //homepage
        System.out.print(
                """
                        |=============================|
                        |₱            Kay-C          ₱|
                        |=============================|
                        |                             |
                        |                             |
                        |    How can we help you?     |
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
    static void enterName(){
        //registration form on name

        System.out.print(
                """
                        |=============================|
                        |₱            Kay-C          ₱|
                        |=============================|
                        |                             |
                        |       Welcome to Kay-C      |
                        |                             |
                        |    Enter your name:         |
                        |    [1]: Next                |
                        |    [2]: Cancel              |
                        |    [0]: Exit                |
                        |                             |
                        |=============================|
                        |=========] BSCS-1A [=========|
                        |=============================|
                        """);
    }
    static void enterNum(){
        //registration form on CC num

        System.out.print(
                """
                        |=============================|
                        |₱            Kay-C          ₱|
                        |=============================|
                        |                             |
                        |       Welcome to Kay-C      |
                        |                             |
                        |    Enter your Credit Card   |
                        |          number:            |
                        |    [1]: Next                |
                        |    [2]: Cancel              |
                        |    [0]: Exit                |
                        |                             |
                        |=============================|
                        |=========] BSCS-1A [=========|
                        |=============================|
                        """);
    }
    static void validate(){
        //validation on user info

        System.out.print(
                """
                        |=============================|
                        |₱            Kay-C          ₱|
                        |=============================|
                        |                             |
                        |       Welcome to Kay-C      |
                        |            [Name],          |
                        |   Are these correct?        |
                        |     Name: [Name]            |
                        |     CC Type: [Type]         |
                        |                             |
                        |    [1]: Confirm             |
                        |    [2]: Cancel              |
                        |    [0]: Exit                |
                        |                             |
                        |=============================|
                        |=========] BSCS-1A [=========|
                        |=============================|
                        """);
    }

    static void password() {
        //registration form on entering password

        System.out.print(
                """
                        |=============================|
                        |₱            Kay-C          ₱|
                        |=============================|
                        |                             |
                        |                             |
                        |       Welcome to Kay-C      |
                        |                             |
                        |      Enter your password    |
                        |    [1]: Confirm             |
                        |    [2]: Cancel              |
                        |    [0]: Exit                |
                        |                             |
                        |=============================|
                        |=========] BSCS-1A [=========|
                        |=============================|
                        """);
    }
    static void welcome() {
        //welcome screen
        // front end where it should confirm that the array was really altered

        System.out.print(
                """
                        |=============================|
                        |₱            Kay-C          ₱|
                        |=============================|
                        |                             |
                        |                             |
                        |       Welcome to Kay-C      |
                        |           [Name]!           |
                        |                             |
                        |                             |
                        |    [0]: Exit                |
                        |                             |
                        |=============================|
                        |=========] BSCS-1A [=========|
                        |=============================|
                        """);
    }
    static void logName() {
        //login screen for entering name

        System.out.print(
                """
                        |=============================|
                        |₱            Kay-C          ₱|
                        |=============================|
                        |                             |
                        |       Welcome back to       |
                        |             Kay-C           |
                        |      Please enter your      |
                        |            Name             |
                        |                             |
                        |    [1]: Back                |
                        |    [0]: Exit                |
                        |                             |
                        |=============================|
                        |=========] BSCS-1A [=========|
                        |=============================|
                        """);
    }
    static void logPass() {
        //login screen for entering name

        System.out.print(
                """
                        |=============================|
                        |₱            Kay-C          ₱|
                        |=============================|
                        |                             |
                        |       Welcome back to       |
                        |            Kay-C            |
                        |      Please enter your      |
                        |          Password           |
                        |                             |
                        |    [1]: Back                |
                        |    [0]: Exit                |
                        |                             |
                        |=============================|
                        |=========] BSCS-1A [=========|
                        |=============================|
                        """);
    }
    static void logError() {
        //login screen for entering name

        System.out.print(
                """
                        |=============================|
                        |₱            Kay-C          ₱|
                        |=============================|
                        |                             |
                        |  Invalid Name / Password    |
                        |          Try again          |
                        |                             |
                        |    [1]: Back                |
                        |    [0]: Exit                |
                        |                             |
                        |=============================|
                        |=========] BSCS-1A [=========|
                        |=============================|
                        """);
    }
    static void profile() {
        //profile of user

        System.out.print(
                """
                        |=============================|
                        |₱            Kay-C          ₱|
                        |=============================|
                        |                             |
                        |     Welcome back, [name]    |
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
                        """);
    }
    static void help() {
        //help on homepage

        System.out.print(
                """
                        |=============================|
                        |₱            Kay-C          ₱|
                        |=============================|
                        |                             |
                        |      Welcome to Kay-C!      |
                        |   this is an app to make    |
                        |   using your credit card    |
                        |          with ease          |
                        |                             |
                        |    [1]: Back                |
                        |    [0]: Exit                |
                        |                             |
                        |=============================|
                        |=========] BSCS-1A [=========|
                        |=============================|
                        """);
    }
    static void clear(){
        //clear screen
        System.out.print("\u000C");
    }
}
