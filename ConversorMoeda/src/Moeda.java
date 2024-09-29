class Moeda {
    private String nome;
    private double taxa;

    public Moeda(String nome, double taxa) {
        this.nome = nome;
        this.taxa = taxa;
    }

    public String getName() {
        return nome;
    }

    public double gettaxa() {
        return taxa;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
