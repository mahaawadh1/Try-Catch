
import java.util.Scanner;

public class App {

    private static final String validUsername = "Coded";
    private static final String validPassword = "Coded123";

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your user name: ");
            String username = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            if (authenticationUser(username, password)) {
                System.out.println(" scessfully loged in   ");

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

    private static boolean authenticationUser(String username, String password) {
        return username.equals(username) && password.equals(password);
    }

}
