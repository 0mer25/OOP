import java.util.InputMismatchException;
import java.util.Scanner;

public class LabExerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Bir tam sayı giriniz: ");
            int x = scanner.nextInt();
            System.out.println(x);
        } catch (InputMismatchException e) {
            System.out.println("Hata: Geçerli bir tam sayı girmediniz.");
        }

        scanner.close();
    }
}