package Modelos;

/**
 *
 * @author Jesus
 */
public class MCliente {

    /**Se crean las variables 
     * que almacenaran la informacion 
     * de los clientes */
    private String id;
    private String nombre;
    private String descripcion;
    private String direccion;
    private String telf;
    char estado;
//Creamos el Constructor
    public MCliente() {
    }

//Metodos Set y Get de cada variable
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
}