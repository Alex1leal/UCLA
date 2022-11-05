package Modelos;
                             
import java.util.*;
/**El paquete java.util, es uno de los principales paquetes que usaremos cuando estemos programando 
 * con el lenguaje Java, y junto al paquete java.lang 

/**
 *
 * @author Jesus
 */
public class MVigilante {

    
  // Se crean las variables que almacenaran la informacion de los vigilantes
   
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;
    private String telf;
    private Date fechaN;
    private char estado;
    
//Creamos el Constructor
    public MVigilante() {
    }
//Metodos Set y Get de cada variable
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
}
