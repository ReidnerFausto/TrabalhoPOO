class Converter {
    private Moeda[] moedas;

    public Converter() {
        moedas = new Moeda[5];
        moedas[0] = new Moeda(" Dólar americano", 5.43f);
        moedas[1] = new Moeda(" Euro", 6.07f);
        moedas[2] = new Moeda(" Libra esterlina", 7.27f);
        moedas[3] = new Moeda(" Bitcoin", 355999.24f);
        moedas[4] = new Moeda(" Peso argentino", 0.0056f);
    }

    public void mostrarMoedas() {
        System.out.println(" CONVERSOR DE MOEDAS ");
        System.out.println();
        for (int i = 0; i < moedas.length; i++) {
            System.out.println("[" + (i + 1) + "] " + moedas[i].getName());
        }
    }

    public void mostrarTaxa(int escolha) {
        if (escolha >= 1 && escolha <= 5) {
            Moeda moeda = moedas[escolha - 1];
            System.out.printf("1 %s = R$ %.2f\n", moeda.getName(), moeda.gettaxa());
        } else {
            System.out.println("Digite o número da moeda 1, 2, 3 ou 4");
        }
    }

    public void convertorMoeda(int escolha, float valorReal) {
        if (escolha >= 1 && escolha <= 5) {
            Moeda moeda = moedas[escolha - 1];
            double valorConvertido;
            // Verifica se o valor da cotação é maior ou meno que 1 e utiliza o calculo necessario com base na situação
            if (moeda.gettaxa() < 1){
                valorConvertido = valorReal * moeda.gettaxa();
            }
            else {
                valorConvertido = valorReal / moeda.gettaxa();
            }
            System.out.printf("R$ %.2f convertidos para %s são %.2f\n", valorReal, moeda.getName(), valorConvertido);
        } else {
            System.out.println("Escolha inválida.");
        }
    }
}
