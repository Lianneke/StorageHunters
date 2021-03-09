import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Opslagruimte> opslagruimtes = new ArrayList<>();
        opslagruimtes.add(new Opslagruimte("A1", 20, 10.50));
        opslagruimtes.add(new Opslagruimte("B1", 50, 13.20));
        opslagruimtes.add(new Opslagruimte("B2", 40, 12.95));

        Klant klant1 = new Klant("Klaas Torenstra");
        Klant klant2 = new Klant("Dick Trom");

        List<Klant> klanten = new ArrayList<>();
        klanten.add(klant1);
        klanten.add(klant2);

        for (int i = 0; i < klanten.size(); i++) {
            System.out.println(i + 1 + ". " + klanten.get(i).getNaam());
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wat is uw klantnummer?");
        int klantnummer = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < opslagruimtes.size(); i++) {
            System.out.println(i + 1 + ". ID: " + opslagruimtes.get(i).getID() + " maximale capaciteit: "   + opslagruimtes.get(i).getMaxCapaciteit() + " prijs per maand: " +  opslagruimtes.get(i).getPrijsPerMaand());

            System.out.println("Welke opslagruimte wilt u reserveren? 1, 2 of 3?");
            int opslagruimteNummer = scanner.nextInt();
            scanner.nextLine();




        }
    }
}
