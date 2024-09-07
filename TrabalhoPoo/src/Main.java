public class Main {
    //Atividade numero 1
    public void main(String[] args) {
        EquacaoSegundoGrau a1 = new EquacaoSegundoGrau(2, 10, 4);
        var conta = a1.Calculo();
        System.out.println(conta);

//Atividade numero 2
        DesvioPadrao a2 = new DesvioPadrao();
        int[] numerosarray = {1, 2, 3, 4, 5, 6, 7, 8};
        a2.calculoVariancia(numerosarray);

//Atividade numero 3
        JurosCompostos a3 = new JurosCompostos(1000.0, 0.05, 2, 12);
        double montante = a3.calcularMontante();
        double jurosCompostos = a3.calcularJuros();
        System.out.println("Montante: " + montante );
        System.out.println("Juros Compostos: " + jurosCompostos);
    }
}
