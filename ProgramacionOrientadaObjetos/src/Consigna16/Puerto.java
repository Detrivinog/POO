package Consigna16;

import java.util.ArrayList;
import java.util.List;

public class Puerto {
    private List<Contenedor> contenedores;

    public Puerto() {
        this.contenedores = new ArrayList<>();
    }

    public void addContenedor(Contenedor contenedor){
        this.contenedores.add(contenedor);
    }

    public void mostrarConedores(){
        this.contenedores.sort(null);

        for (Contenedor contenedor: this.contenedores){
            System.out.println(contenedor.getId());
        }
    }

    public int cantidadContenedoresPeligrosos(){
        int cantidad = 0;
        for (Contenedor contenedor: this.contenedores){
            if (contenedor.isPeligroso() && contenedor.getPais().equals("Desconocido")){
                cantidad ++;
            }
        }
        return cantidad;
    }
}
