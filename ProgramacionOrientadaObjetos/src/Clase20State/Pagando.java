package Clase20State;

public class Pagando implements StateCarrito{
    private CarritoCompras cc;

    public Pagando(CarritoCompras cc) {
        this.cc = cc;
    }

    @Override
    public void agregarProducto() {

    }

    @Override
    public void cancelarCarrito() {

    }

    @Override
    public void volverAnterior() {

    }

    @Override
    public void siguienteEstado() {

    }
}
