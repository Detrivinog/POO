package Clase20State;

import java.util.List;

public class CarritoCompras {
    private StateCarrito estado;
    private List<Producto> productos;

    public CarritoCompras(){
        this.estado = new Vacio(this);
    }


}
