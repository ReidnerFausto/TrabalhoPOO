public class EquacaoSegundoGrau {
    private double a;
    private double b;
    private double c;
    private double raiz1;
    private double raiz2;


    public EquacaoSegundoGrau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean Calculo(){
        double delta = (b * b) - (4 * c * a);

        if (delta < 0){
            System.out.println("Valor de Delta negativo ");
        }

        double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("Raiz 1: " + raiz1);
        System.out.println("Raiz 2: " + raiz2);
        return true;
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getRaiz1() {
        return raiz1;
    }

    public double getRaiz2() {
        return raiz2;
    }
}
