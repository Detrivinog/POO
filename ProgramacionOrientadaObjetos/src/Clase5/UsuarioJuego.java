package Clase5;

public class UsuarioJuego {
    //Atributos
    private String nombre;
    private String clave;
    private Double puntaje = 0.0;
    private int nivel = 0;

    //Contructor
    public UsuarioJuego(String nombre, String clave){
        this.nombre = nombre;
        this.clave = clave;
        System.out.println("Has creado el usuario "+getNombre()+ " Con la clave "+getClave());
    }
    //Métodos
    public void aumentarPuntaje(){
        this.puntaje++;
        System.out.println("Tu puntaje se ha aumentada en 1, ahora es "+getPuntaje());
    }

    public void subirNivel(){
        this.nivel++;
        System.out.println("Tu nivel se ha aumentada en 1, ahora es "+getNivel());
    }

    public void bonus(int valor){
        this.puntaje += valor;
        System.out.println("Tu puntaje se ha aumentado en "+valor+ " ahora es "+getPuntaje());
    }

    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
