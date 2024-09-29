import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        converter.mostrarMoedas();
        // Demonstra o valor da cotação da moeda

        System.out.print("Digite o número da moeda estrangeira para saber a cotação: ");
        int moedaEscolhida = scanner.nextInt();
        System.out.println();
        converter.mostrarTaxa(moedaEscolhida);

        // Fornece ao usuario a oportunidade de escolher se deseja ou nao converter um valor especifico

        System.out.print("Deseja converter um valor específico de R$ para outra moeda? (S/N): ");
        char querConverter = scanner.next().toLowerCase().charAt(0);

        // Converte o valor caso o usuario selecione sim
        if (querConverter == 's') {

            System.out.print("Digite o valor em R$: ");
            double valorEmReais =  scanner.nextDouble();

            // Verifica se o número da moeda escolhida é válido (entre 1 e 4)
            if (moedaEscolhida >= 1 && moedaEscolhida <= 5) {
                converter.convertorMoeda(moedaEscolhida, valorEmReais);
            } else {
                System.out.println("Moeda inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}