
package Modelo;

/**
 *
 * @author Jes011
 * @github https://github.com/Jes011
 */
public class Cliente {
    private String nombre, direccion, telefono, id;
    
    public Cliente(){
        this.nombre = "";
        this.direccion = "";
        this.telefono = "";
        this.id = "";
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIdentificacion() {
        return id;
    }
    public void setIdentificacion(String id) {
        this.id = id;
    }
}
