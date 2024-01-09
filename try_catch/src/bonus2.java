
import java.util.Scanner;

public class bonus2 {

    private static final String validUsername = "Coded";
    private static final String validPassword = "Coded123";

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        boolean validLogin = false;
        int attemptMax = 5;

        for (int attempt = 1; attempt <= attemptMax; attempt++) {

            try {
                System.out.print("Enter your user name: ");
                String username = scanner.nextLine();

                System.out.print("Enter your password: ");
                String password = scanner.nextLine();

                if (authenticationUser(username, password)) {
                    System.out.println(" scessfully loged in   ");
                    validLogin = true;

                } else {
                    throw new Exception("INVALID");
                }

            } catch (Exception e) {

                System.out.println("Error ... " + e.getMessage());

            }

            finally {

                scanner.close();
            }

        }
    }

    private static boolean authenticationUser(String username, String password) {
        return username.equals(username) && password.equals(password);
    }

}
