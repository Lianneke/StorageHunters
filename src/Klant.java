import java.util.ArrayList;

public class Klant {

    private String naam;
    private ArrayList <Opslagruimte> opslagruimtes = new ArrayList<>();

    public Klant(String naam) {
        this.naam = naam;
    }

    public void opslagruimteReserveren(Opslagruimte opslagruimte){
    opslagruimtes.add(opslagruimte);
    }

    public String getNaam() {
        return naam;
    }
}
