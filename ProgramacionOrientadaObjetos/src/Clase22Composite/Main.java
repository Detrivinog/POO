package Clase22Composite;

public class Main {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5, 4);
        Figura cir1 = new Circulo(1);
        Figura cir2 = new Circulo(1);
        Figura cir3 = new Circulo(1);

        Vagon vagon = new Vagon("Vagon1");
        vagon.agregarFigura(rectangulo);
        vagon.agregarFigura(cir1);
        vagon.agregarFigura(cir2);
        vagon.agregarFigura(cir3);

        System.out.println("Área total del"+vagon.getNombre()+" es "+ vagon.calcularArea());

        Figura rect1 = new Rectangulo(6,4);
        Figura triangulo = new Triangulo(2,2);
        Vagon locomotora = new Vagon("locomotor");

        locomotora.agregarFigura(rect1);
        locomotora.agregarFigura(cir1);
        locomotora.agregarFigura(cir2);
        locomotora.agregarFigura(triangulo);

        System.out.println("Área total de la "+locomotora.getNombre()+" es "+locomotora.calcularArea());

    }
}
