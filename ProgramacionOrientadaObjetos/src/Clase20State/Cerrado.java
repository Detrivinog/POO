package Clase20State;

public class Cerrado implements StateCarrito{
    private CarritoCompras cc;

    public Cerrado(CarritoCompras cc) {
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
