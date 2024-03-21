import java.util.Scanner;

public class StringConcatenate {

    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // first string prompt
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // second string prompt
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // concatenation
        String concatenated1 = firstString + secondString;
        String concatenated2 = secondString + firstString;

        boolean isAlternating = isAlternating(concatenated1) || isAlternating(concatenated2);

        if (isAlternating) {
            System.out.println("The concatenated strings form an alternating sequence.");
        } else {
            System.out.println("The concatenated strings do not form an alternating sequence.");
        }

        scanner.close();
    }

    // my methods
    public static boolean isAlternating(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == charArray[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

//Program by Takudzwa Rodgers Kamamba 66220
