import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        List<Opslagruimte> opslagruimtes = new ArrayList<>();
        opslagruimtes.add(new Opslagruimte("1", 20, 10.50));
        opslagruimtes.add(new Opslagruimte("2", 50, 13.20));
        opslagruimtes.add(new Opslagruimte("3", 40, 12.95));

        Klant klant1 = new Klant("Klaas Torenstra");
        Klant klant2 = new Klant("Dick Trom");

        List<Klant> klanten = new ArrayList<>();
        klanten.add(klant1);
        klanten.add(klant2);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < klanten.size(); i++) {
            System.out.println(i + 1 + ". " + klanten.get(i).getNaam());
        }


        System.out.println("Wat is uw klantnummer?");
        String klantnummer = scanner.nextLine();
       //  scanner.nextLine();

        for (Opslagruimte dataPrinter : opslagruimtes) {
            System.out.println(dataPrinter.toString());
        }

        System.out.println("Welke opslagruimte wilt u reserveren? 1, 2 of 3?");

 //       for (int i = 0; i < opslagruimtes.size(); i++) {
 //           System.out.println(i + 1 + ". ID: " + opslagruimtes.get(i).getID() + " maximale capaciteit: " + opslagruimtes.get(i).getMaxCapaciteit() + " prijs per maand: " + opslagruimtes.get(i).getPrijsPerMaand());
 //       }

           int opslagruimteNummer = scanner.nextInt() - 1;
        //   scanner.nextLine();

        if(klantnummer.equals("1")){
            klant1.opslagruimteReserveren(opslagruimtes.get(opslagruimteNummer));
        }else{
            klant2.opslagruimteReserveren(opslagruimtes.get(opslagruimteNummer));
        }
        System.out.println(klant1.getOpslagruimtes());




            }
        }


