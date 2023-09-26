package scannerExercise;

import java.util.Scanner;

public class Main {

    public static final int MAX_NUMBER_OF_TRIES = 2;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        main.login(0, scanner);

    }

    private void login(int numberOfTries, Scanner scanner) {
        //        name = "ugdytviet";

        String username = scanner.nextLine();


        String password = scanner.nextLine();

        if (username.equals("root") && password.equals("root")) {

            System.out.println("welcome");
        } else {
            System.out.println("the password is incorrect. please try again");

            if (numberOfTries == MAX_NUMBER_OF_TRIES) {
                System.out.println("maximum login attempts exceeded");
                return;
            }
            login(++numberOfTries, scanner);
        }
    }
}
