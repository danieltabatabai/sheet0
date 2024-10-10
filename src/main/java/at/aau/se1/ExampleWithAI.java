package at.aau.se1;
import java.util.Scanner;

public class ExampleWithAI {
    // Methode zur Umwandlung eines Binärarrays in eine Dezimalzahl
    public static int binary2decimal(int[] binaryArray) {
        int decimalNumber = 0;
        int length = binaryArray.length;

        // Iteriere durch das Array
        for (int i = 0; i < length; i++) {
            // Aktuelles Bit: binaryArray[length - 1 - i]
            // Der Wert wird mit 2^i multipliziert und zur Dezimalzahl addiert
            decimalNumber += binaryArray[length - 1 - i] * Math.pow(2, i);
        }

        return decimalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Anzahl der Bits
        System.out.print("Geben Sie die Anzahl der Bits ein: ");
        int n = scanner.nextInt();

        // Erstellen eines Arrays zur Aufnahme der Binärzahl
        int[] binaryArray = new int[n];

        // Eingabe der Binärzahlen vom Benutzer
        System.out.println("Geben Sie die Binärzahl Bit für Bit ein (nur 0 oder 1):");

        for (int i = 0; i < n; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Bit " + (i + 1) + ": ");

                // Überprüfen, ob die Eingabe eine Zahl ist
                if (scanner.hasNextInt()) {
                    int input = scanner.nextInt();

                    // Überprüfen, ob die Eingabe 0 oder 1 ist
                    if (input == 0 || input == 1) {
                        binaryArray[i] = input;
                        validInput = true;  // Eingabe ist gültig
                    } else {
                        System.out.println("Ungültige Eingabe! Bitte geben Sie nur 0 oder 1 ein.");
                    }
                } else {
                    // Wenn keine Zahl eingegeben wurde
                    System.out.println("Ungültige Eingabe! Bitte geben Sie eine Zahl (0 oder 1) ein.");
                    scanner.next(); // Ungültige Eingabe überspringen
                }
            }
        }

        // Umwandlung in Dezimal und Ausgabe
        int decimalOutput = binary2decimal(binaryArray);
        System.out.println("Die entsprechende Dezimalzahl ist: " + decimalOutput);

        scanner.close();
    }
}
