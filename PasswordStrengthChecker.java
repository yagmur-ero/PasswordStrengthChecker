import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


            int attempts = 3;
            while (attempts > 0) {
                System.out.printf("%nEnter the password: ");
                String password = input.nextLine();
                if (passwordcheck(password)) {
                    System.out.println("Password Accepted!");
                    passwordStrength(password);
                    break;
                }else{
                    attempts--;
                    System.out.printf("Password Not Accepted!%n Remaining attempts: %d%n ",attempts);
            }
        }
    }
    public static boolean passwordcheck(String password) {
        boolean Uppercase = false;
        boolean Lowercase = false;
        boolean number = false;
        boolean special = false;
        boolean length = password.length() >= 8;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) Uppercase = true;
            else if (Character.isLowerCase(c)) Lowercase = true;
            else if (Character.isDigit(c)) number = true;
            else if (!Character.isLetterOrDigit(c)) special = true;
        }
        if(!Uppercase) System.out.println("Your password should have at least one Uppercase Letter.");
        if(!Lowercase) System.out.println("Your password should have at least one Lowercase Letter.");
        if(!number) System.out.println("Your password should have at least one number.");
        if(!length) System.out.println("Your password should have at least 8 characters.");
        if(!special) System.out.println("Your password should have at least 1 special character.");
        return Uppercase&&Lowercase&&number&&special&&length;
    }

    public static void passwordStrength (String password) {

        int strength=0;
        for (char c:password.toCharArray()){
            if (Character.isDigit(c)) strength++;
            else if(!Character.isLetterOrDigit(c)) strength++;
        }

        if(password.length() >=8) strength++;
        if(password.matches(".*[A-Z]")) strength++;
        if(password.matches(".*[a-z]")) strength++;



        if(strength>=5){
            System.out.println("Your password is strength enough!");
        }else if(strength==3){
            System.out.println("Your password is of average strength!");
        }else{
            System.out.println("Your password is not strength!");
        }

    }
}

