package Clase6;

public class Perro {
    // Atributos
    private Boolean enAdopcion;
    private String raza;
    private int anioNacimiento;
    private Float peso;
    private Boolean tieneChip;
    private Boolean estaLastimado;
    private String nombre;
    //Constructores
    Perro(){}

    Perro(Boolean enAdopcion, String nombre, int anioNacimiento){
        this.enAdopcion = enAdopcion;
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
    }
    // Alt + insert

    public Perro(int anioNacimiento, Float peso, String nombre) {
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.nombre = nombre;
    }

    // Getters y Setters
    public Boolean getEnAdopcion() {
        return enAdopcion;
    }

    public void setEnAdopcion(Boolean enAdopcion) {
        this.enAdopcion = enAdopcion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Boolean getTieneChip() {
        return tieneChip;
    }

    public void setTieneChip(Boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    public Boolean getEstaLastimado() {
        return estaLastimado;
    }

    public void setEstaLastimado(Boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodos
    public int edadPerro(){
        return 2021-this.getAnioNacimiento();
    }

    public Boolean factiblePerderse(){
        return !this.getTieneChip();
    }

    public Boolean posibleAdoptar(){
        if (!getEstaLastimado() && getPeso()> 5){
            return true;
        }else {
            return false;
        }
    }
}
