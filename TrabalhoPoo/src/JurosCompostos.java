public class JurosCompostos {
    private double capital;
    private double taxa;
    private int tempo;

    public JurosCompostos() {
        this.capital = capital;
        this.taxa = taxa;
        this.tempo = tempo;
    }

    public static double Calculo(double capital, double taxa, int tempo) {
        for (int i = 0; i < tempo; i++) {
            capital += capital * taxa / 100;
        }
        return capital;
    }
    public double getCapital() {
        return capital;
    }
    public void setCapital(double capital) {
        this.capital = capital;
    }
    public double getTaxa() {
        return taxa;
    }
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    public int getTempo() {
        return tempo;
    }
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
}

