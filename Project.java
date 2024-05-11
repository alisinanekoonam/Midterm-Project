package UniversityProject;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {

        System.out.print("Enter n: ");
        int n = new Scanner(System.in).nextInt();
        int[][] matrix = new int[n][n];
        java.util.Random r = new java.util.Random();

        // Populate matrix with random integers
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = r.nextInt(1,6); // Generates random integers from 0 to 5
            }
        }

        // Print the generated matrix
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("Enter the String: ");
        String str = new Scanner(System.in).nextLine();

        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println();

        // Populate matrix2 with the string "amir"
        String[][] matrix2 = new String[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    if (matrix[i][j] == 1) {
                        matrix2[i][j] = reverseString(str);
                    }
                    else if (i == n-1 && j == n-1) {
                        continue;
                    }
                    else if (matrix[i][j] == 2) {
                        matrix2[i][j] = duplicateString(str);
                    }
                    else if (matrix[i][j] == 3) {
                        matrix2[i][j] = dupli(str);
                    }
                    else if (matrix[i][j] == 4) {
                        matrix2[i][j] = shiftStringRight(str);
                    }
                    else if (matrix[i][j] == 5){
                        matrix2[i][j] = shiftStringWithAlphabet(str);
                    }
                }
                else if (i == 0) {
                    if (matrix[i][j] == 1) {
                        matrix2[i][j] = reverseString(matrix2[0][j-1]);
                    }
                    else if (matrix[i][j] == 2) {
                        matrix2[i][j] = duplicateString(matrix2[0][j-1]);
                    }
                    else if (matrix[i][j] == 3) {
                        matrix2[i][j] = dupli(matrix2[0][j-1]);
                    }
                    else if (matrix[i][j] == 4) {
                        matrix2[i][j] = shiftStringRight(matrix2[0][j-1]);
                    }
                    else if (matrix[i][j] == 5){
                        matrix2[i][j] = shiftStringWithAlphabet(matrix2[0][j-1]);
                    }
                }
                else if (j == 0) {
                    if (matrix[i][j] == 1) {
                        matrix2[i][j] = reverseString(matrix2[i-1][0]);
                    }
                    else if (matrix[i][j] == 2) {
                        matrix2[i][j] = duplicateString(matrix2[i-1][0]);
                    }
                    else if (matrix[i][j] == 3) {
                        matrix2[i][j] = dupli(matrix2[i-1][0]);
                    }
                    else if (matrix[i][j] == 4) {
                        matrix2[i][j] = shiftStringRight(matrix2[i-1][0]);

                    }
                    else if (matrix[i][j] == 5){
                        matrix2[i][j] = shiftStringWithAlphabet(matrix2[i-1][0]);
                    }
                }
                else if(i == n-1) {
                    if (j == n-1){
                        continue;
                    }
                    else {
                        matrix2[i][j] = "*";
                    }
                }
                else if(j == n-1 && i > 1){
                    if (matrix[i][j] == 1) {
                        matrix2[i][j] = mergeStrings(matrix2[i][j-1], matrix2[i-1][j]);
                    }
                    else if (matrix[i][j] == 2) {
                        matrix2[i][j] = String1PlusReversedString2(matrix2[i][j-1], matrix2[i-1][j]);
                    }
                    else if (matrix[i][j] == 3) {
                        matrix2[i][j] = WieredMergeStrings(matrix2[i][j-1], matrix2[i-1][j]);
                    }
                    else if (matrix[i][j] == 4) {
                        matrix2[i][j] = EvenStrings(matrix2[i][j-1], matrix2[i-1][j]);
                    }
                    else if (matrix[i][j] == 5) {
                        matrix2[i][j] = CaesarShift(matrix2[i][j-1], matrix2[i-1][j]);
                    }
                }
                else {
                    if (matrix[i][j] == 1) {
                        matrix2[i][j] = reverseString(matrix2[i-1][j]);
                    }
                    else if (matrix[i][j] == 2) {
                        matrix2[i][j] = duplicateString(matrix2[i-1][j]);
                    }
                    else if (matrix[i][j] == 3) {
                        matrix2[i][j] = dupli(matrix2[i-1][j]);
                    }
                    else if (matrix[i][j] == 4) {
                        matrix2[i][j] = shiftStringRight(matrix2[i-1][j]);

                    }
                    else if (matrix[i][j] == 5){
                        matrix2[i][j] = shiftStringWithAlphabet(matrix2[i-1][j]);
                    }
                }
            }
        }

        // Print matrix2
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix2[i][j] + "    ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        System.out.println();
        System.out.println();

        // Populate matrix3 with the string "amir"
        String[][] matrix3 = new String[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    if (matrix[i][j] == 1) {
                        matrix3[i][j] = reverseString(str);
                    }
                    else if (matrix[i][j] == 2) {
                        matrix3[i][j] = duplicateString(str);
                    }
                    else if (matrix[i][j] == 3) {
                        matrix3[i][j] = dupli(str);
                    }
                    else if (matrix[i][j] == 4) {
                        matrix3[i][j] = shiftStringRight(str);
                    }
                    else if (matrix[i][j] == 5){
                        matrix3[i][j] = shiftStringWithAlphabet(str);
                    }
                }
                else if (i == 0) {
                    if (matrix[i][j] == 1) {
                        matrix3[i][j] = reverseString(matrix3[0][j-1]);
                    }
                    else if (matrix[i][j] == 2) {
                        matrix3[i][j] = duplicateString(matrix3[0][j-1]);
                    }
                    else if (matrix[i][j] == 3) {
                        matrix3[i][j] = dupli(matrix3[0][j-1]);
                    }
                    else if (matrix[i][j] == 4) {
                        matrix3[i][j] = shiftStringRight(matrix3[0][j-1]);
                    }
                    else if (matrix[i][j] == 5){
                        matrix3[i][j] = shiftStringWithAlphabet(matrix3[0][j-1]);
                    }
                }
                else if (j == 0) {
                    if (matrix[i][j] == 1) {
                        matrix3[i][j] = reverseString(matrix3[i-1][0]);
                    }
                    else if (matrix[i][j] == 2) {
                        matrix3[i][j] = duplicateString(matrix3[i-1][0]);
                    }
                    else if (matrix[i][j] == 3) {
                        matrix3[i][j] = dupli(matrix3[i-1][0]);
                    }
                    else if (matrix[i][j] == 4) {
                        matrix3[i][j] = shiftStringRight(matrix3[i-1][0]);

                    }
                    else if (matrix[i][j] == 5){
                        matrix3[i][j] = shiftStringWithAlphabet(matrix3[i-1][0]);
                    }
                }
                else if(j == n-1) {

                    if (i == n -1) {
                        continue;
                    }
                    else {
                        matrix3[i][j] = "*";
                    }
                }
                else if (j > 1 && i == n -1) {
                    if (matrix[i][j] == 1) {
                        matrix3[i][j] = mergeStrings(matrix3[i][j-1], matrix3[i-1][j]);
                    }
                    else if (matrix[i][j] == 2) {
                        matrix3[i][j] = String1PlusReversedString2(matrix3[i][j-1], matrix3[i-1][j]);
                    }
                    else if (matrix[i][j] == 3) {
                        matrix3[i][j] = WieredMergeStrings(matrix3[i][j-1], matrix3[i-1][j]);
                    }
                    else if (matrix[i][j] == 4) {
                        matrix3[i][j] = EvenStrings(matrix3[i][j-1], matrix3[i-1][j]);
                    }
                    else if (matrix[i][j] == 5) {
                        matrix3[i][j] = CaesarShift(matrix3[i][j-1], matrix3[i-1][j]);
                    }
                }
                else {
                    if (matrix[i][j] == 1) {
                        matrix3[i][j] = reverseString(matrix3[i][j-1]);
                    }
                    else if (matrix[i][j] == 2) {
                        matrix3[i][j] = duplicateString(matrix3[i][j-1]);
                    }
                    else if (matrix[i][j] == 3) {
                        matrix3[i][j] = dupli(matrix3[i][j-1]);
                    }
                    else if (matrix[i][j] == 4) {
                        matrix3[i][j] = shiftStringRight(matrix3[i][j-1]);

                    }
                    else if (matrix[i][j] == 5){
                        matrix3[i][j] = shiftStringWithAlphabet(matrix3[i][j-1]);
                    }
                }
            }
        }

        // Print matrix3
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix3[i][j] + "          ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        System.out.println();
        System.out.println();

        while(matrix2[n-1][n-1] == null && matrix3[n-1][n-1] == null) {
            if (matrix[n-1][n-1] == 1) {
                matrix2[n-1][n-1] = matrix3[n-1][n-1] = mergeStrings(matrix2[n-2][n-1], matrix3[n-1][n-2]);
            }
            else if (matrix[n-1][n-1] == 2) {
                matrix2[n-1][n-1] = matrix3[n-1][n-1] = String1PlusReversedString2(matrix2[n-2][n-1], matrix3[n-1][n-2]);
            }
            else if (matrix[n-1][n-1] == 3) {
                matrix2[n-1][n-1] = matrix3[n-1][n-1] = WieredMergeStrings(matrix2[n-2][n-1], matrix3[n-1][n-2]);
            }
            else if (matrix[n-1][n-1] == 4) {
                matrix2[n-1][n-1] = matrix3[n-1][n-1] = EvenStrings(matrix2[n-2][n-1], matrix3[n-1][n-2]);
            }
            else if (matrix[n-1][n-1] == 5) {
                matrix2[n-1][n-1] = matrix3[n-1][n-1] = CaesarShift(matrix2[n-2][n-1], matrix3[n-1][n-2]);
            }
        }



        System.out.println("The Final Output: ");
        System.out.println(matrix2[n-1][n-1]);
    }

    // Black Functions

    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static String duplicateString(String str) {
        String duplicated = "";
        for (int i = 0; i < str.length(); i++) {
            duplicated += str.charAt(i);
            duplicated += str.charAt(i);
        }
        return duplicated;
    }

    public static String dupli(String str){
        return str + str;
    }

    public static String shiftStringRight(String str) {
        char[] chars = str.toCharArray();

        char lastChar = chars[chars.length - 1];

        for (int i = chars.length - 1; i > 0; i--) {
            chars[i] = chars[i - 1];
        }
        chars[0] = lastChar;

        return new String(chars);
    }

    public static String shiftStringWithAlphabet(String input) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] chars = input.toCharArray();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            int index = alphabet.indexOf(currentChar);
            char shiftedChar = alphabet.charAt(25 - index);
            result.append(shiftedChar);
        }
        return result.toString();
    }

    // White Functions
    public static String mergeStrings(String str1, String str2) {
        String merged = "";
        int i = 0;
        int j = 0;

        while (i < str1.length() || j < str2.length()) {
            if (i < str1.length()) {
                merged += str1.charAt(i);
                i++;
            }
            if (j < str2.length()) {
                merged += str2.charAt(j);
                j++;
            }
        }

        return merged;
    }

    public static String String1PlusReversedString2(String str1, String str2) {
        String reversed2 = "";
        for (int i = str2.length() - 1; i >= 0; i--) {
            reversed2 += str2.charAt(i);
        }
        return str1 + reversed2;
    }

    public static String WieredMergeStrings(String str1, String str2) {
        String merged = "";
        int i = 0;
        int j = str2.length() - 1;

        while (i < str1.length() || j >= 0) {
            if (i < str1.length()) {
                merged += str1.charAt(i);
                i++;
            }
            if (j >= 0) {
                merged += str2.charAt(j);
                j--;
            }
        }

        return merged;
    }

    public static String EvenStrings(String str1, String str2) {
        if(str1.length()%2 == 0) {
            return str1;
        }
        else {
            return str2;
        }
    }

    public static String CaesarShift(String firstName, String secondName) {
        StringBuilder result = new StringBuilder();
        int length = Math.max(firstName.length(), secondName.length());

        for (int i = 0; i < length; i++) {
            int firstIndex = i % firstName.length();
            int secondIndex = i % secondName.length();

            // Get numerical value of characters (A=0, B=1, ..., Z=25)
            int firstChar = firstName.charAt(firstIndex) - 'A';
            int secondChar = secondName.charAt(secondIndex) - 'A';

            // Calculate shifted character
            int shiftedChar = (firstChar + secondChar) % 26;

            // Convert back to uppercase character
            char shiftedUppercase = (char) (shiftedChar + 'A');

            // Append to result
            result.append(shiftedUppercase);
        }

        String x1 = result.toString();
        String x2 = x1.toLowerCase();
        return x2;
    }

}
