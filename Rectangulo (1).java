package utilidades;

public class Rectangulo {
private double ancho;
private double alto;

public Rectangulo(double a, double b) {
ancho = a;
alto = b;
}

public void mostrar() {
String tipo = "Rectángulo";
System.out.println("Tipo: " + tipo);
System.out.println("Ancho: " + ancho);
System.out.println("Alto: " + alto);

double per = (ancho * 2) + (alto * 2);
System.out.println("Perímetro: " + per);

double area = ancho * alto;
System.out.println("Área: " + area);
}

public boolean mismoTamaño(Rectangulo r, boolean exacto) {
if (exacto) {
return this.ancho == r.ancho && this.alto == r.alto;
} else {
return Math.abs(this.ancho - r.ancho) < 1 &&
Math.abs(this.alto - r.alto) < 1;
}
}
}
