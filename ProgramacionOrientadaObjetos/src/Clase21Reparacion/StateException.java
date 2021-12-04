package Clase21Reparacion;

public class StateException extends Exception{
    public StateException(){
        super();
    }
    public StateException(String mensaje){
        super(mensaje);
    }
    public String toString(){
        return "Se produjo la sigueinte Excepción" + this.getClass().getName() + "\n" +
                " Mensaje: "+this.getMessage() + "\n";
    }
}
