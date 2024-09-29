class Converter {
    private Moeda[] moedas;
    //Lista de Moedas
    public Converter() {
        moedas = new Moeda[5];
        moedas[0] = new Moeda(" Dólar americano", 5.43);
        moedas[1] = new Moeda(" Euro", 6.07);
        moedas[2] = new Moeda(" Libra esterlina", 7.27);
        moedas[3] = new Moeda(" Bitcoin", 355999.24);
        moedas[4] = new Moeda(" Peso argentino", 0.0056);
    }
    //Menu responsavel por mostrar os tipos de moedas e fornecer a opção de escolha
    public void mostrarMoedas() {
        System.out.println(" CONVERSOR DE MOEDAS ");
        System.out.println();
        for (int i = 0; i < moedas.length; i++) {
            System.out.println("[" + (i + 1) + "] " + moedas[i].getName());
        }
    }
    //Mostra a taxa da moeda escolhida
    public void mostrarTaxa(int escolha) {
        if (escolha >= 1 && escolha <= 5) {
            Moeda moeda = moedas[escolha - 1];
            System.out.printf("1 %s = R$ %.4f\n", moeda.getName(), moeda.gettaxa());
        }
        else {
            System.out.println("Valor invalido! por favor digite o número da moeda 1, 2, 3, 4 ou 5");
            System.exit(0);
        }
    }
    //Responsavel por retornar o calculo do valor convertido
    public void convertorMoeda(int escolha, double valorReal) {
        if (escolha >= 1 && escolha <= 5) {
                Moeda moeda = moedas[escolha - 1];
                double valorConvertido = valorReal / moeda.gettaxa();
                System.out.printf("R$ %.2f convertidos para %s são %.2f\n", valorReal, moeda.getName(), valorConvertido);
            } else {
                System.out.println("Escolha inválida.");
            }
        }

}

