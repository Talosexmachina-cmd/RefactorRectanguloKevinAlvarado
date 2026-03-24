package figuras;

public class Paralelogramo {
    private  double base;
    private  double altura;
    private String tipo;

    public Paralelogramo(double a, double b) {
        base = a;
        altura = b;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void mostrar() {
        tipo = "Rectángulo";

        System.out.println("Tipo: " + tipo);
        System.out.println("Ancho: " + base);
        System.out.println("Alto: " + altura);

        System.out.println("Perímetro: " + ((base * 2) + (altura * 2)));

        double area = getArea();
        System.out.println("Área: " + area);
    }

    private double getArea() {
        return base * altura;
    }

    public boolean compararTamanyo(Paralelogramo Paral, boolean exactitud) {
        if (exactitud) {
            return this.base == Paral.base && this.altura == Paral.altura;
        } else {
            return Math.abs(this.base - Paral.base) < 1 && Math.abs(this.altura - Paral.altura) < 1;
        }
    }
}