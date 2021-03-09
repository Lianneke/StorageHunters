public class Opslagruimte {

    private String ID;
    private int maxCapaciteit;
    private double prijsPerMaand;
    private boolean verzekering = false;
    private double verzekerdBedrag = 0.00;
    private Klant klant;

    public Opslagruimte(String ID, int maxCapaciteit, double prijsPerMaand) {
        this.ID = ID;
        this.maxCapaciteit = maxCapaciteit;
        this.prijsPerMaand = prijsPerMaand;
    }

    public void klantToewijzenAanOpslagruimte(Klant klant){
            this.klant = klant;
    }

    public String getID() {
        return ID;
    }

    public int getMaxCapaciteit() {
        return maxCapaciteit;
    }

    public double getPrijsPerMaand() {
        return prijsPerMaand;
    }

    public boolean isVerzekering() {
        return verzekering;
    }

    public double getVerzekerdBedrag() {
        return verzekerdBedrag;
    }

    public Klant getKlant() {
        return klant;
    }
}

