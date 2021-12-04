package Clase20State;

public class Vacio implements StateCarrito{
    private CarritoCompras cc;

    public Vacio(CarritoCompras cc) {
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
