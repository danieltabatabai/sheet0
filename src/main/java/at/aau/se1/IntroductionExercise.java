package at.aau.se1;
import java.util.Scanner;

public class IntroductionExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Eingabe: ");
        String input = scanner.nextLine();

        // Umwandlung des Strings in ein Integer-Array
        int[] binary = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            binary[i] = Character.getNumericValue(input.charAt(i));
        }


        int decimal = binary2decimal(binary);


        System.out.println("Die Dezimalzahl ist: " + decimal);
    }


    public static int binary2decimal(int[] binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length; i++) {
            decimal += binary[i] * Math.pow(2, binary.length - 1 - i);
        }
        return decimal;
    }
}
