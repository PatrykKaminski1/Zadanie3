import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String nazwaPliku = "pojemnosc.txt";
        PrintWriter zapis = new PrintWriter(nazwaPliku);
        for (int i = 0; i< 5; i++) {
            zapis.println(scanner.nextLine());
        }
        zapis.close();

        File plik = new File(nazwaPliku);
        scanner= new Scanner(plik);

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

    }


}
