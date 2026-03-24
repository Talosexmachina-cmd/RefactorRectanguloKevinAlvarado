package App;

import figuras.Paralelogramo;

public class AppRectangulo {

    public static void main(String[] args) {

        Paralelogramo r1 = new Paralelogramo(10.5, 20.3);
        Paralelogramo r2 = new Paralelogramo(11.1, 19.7);
        Paralelogramo r3 = new Paralelogramo(10.5, 20.3);

        r1.mostrar();
        r2.mostrar();
        r3.mostrar();

        if (r1.compararTamanyo(r3, true)) {
            System.out.println("r1 y r3 son iguales (exactos)");
        }

        if (r1.compararTamanyo(r2, false)) {
            System.out.println("r1 y r2 son aproximadamente iguales");
        }
    }
}