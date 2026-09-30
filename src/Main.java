import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

void main () {

    userLogin();

}

//Metoder

//Bruger login
static void userLogin () {
    Scanner scanner = new Scanner(System.in);
    int loginAttempts = 3;

    String[] usernames = {"admin", "user1", "user2"};
    String[] passwords = {"admin", "pass1", "pass2"};

    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

    System.out.println("========================================");
    System.out.println("       VELKOMMEN TIL SYSTEMET           ");
    System.out.println("========================================");

    while(loginAttempts > 0) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("\n[Status] Klokken er: " + currentDateTime.format(timeFormatter));
        System.out.println("➤ Indtast brugernavn: ");
        String usernameEnter = scanner.next();

        if (!validateUser(usernameEnter, usernames)) {
            System.out.println("❌ Forkert brugernavn! Prøv igen.");
            System.out.println("----------------------------------------");
            continue;
        }

        System.out.println("✔ Brugernavn godkendt.");
        System.out.println("----------------------------------------");

        while (loginAttempts > 0)  {
            System.out.println("➤ Indtast password: ");
            String passwordEnter = scanner.next();
            loginAttempts--;

            if (validatePassword(usernameEnter, passwordEnter, usernames, passwords)) {
                System.out.println("\n========================================");
                System.out.println("🔓 LOGIN SUCCESFULD!");
                System.out.println("========================================");
                System.out.println("  Brugernavn:  " + usernameEnter);
                System.out.println("  Password:    " + "*".repeat(passwordEnter.length()) + " (" + passwordEnter + ")");
                System.out.println("  Logget ind:  " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy 'kl.' HH:mm")));
                System.out.println("========================================\n");
                return;

            } else {
                System.out.println("❌ Forkert password.");

                if (loginAttempts > 0) {
                    System.out.println("⚠ Du har " + loginAttempts + " forsøg tilbage.");
                    System.out.println("----------------------------------------");
                } else {
                    System.out.println("\n========================================");
                    System.out.println("🔒 KONTO LÅST!");
                    System.out.println("========================================");
                    System.out.println("Du har brugt 3 forsøg. Adgang nægtet.");
                    System.out.println("========================================\n");
                }
            }
        }
    }
    scanner.close();
}

//Validering af brugernavn
static boolean validateUser(String username, String[] usernames) {
    for (String s : usernames) {

        if (s.equals(username)) {
            return true;
        }
    }
    return false;
}

//Validering af adgangskode
static boolean validatePassword(String username, String password, String[] usernames, String[] passwords) {
    for (int i = 0; i < usernames.length; i++) {

        if (usernames[i].equals(username) && passwords[i].equals(password)) {
            return true;
        }
    }
    return false;
}