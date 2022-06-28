
package Modelo;

public class Proyecto {
    
    private static String[] tipo_proyectos = {"Vivienda","Edificio","Camino"};
    
    private String nombre;
    private Material[] materiales;
    private byte tipo_proyecto;
    
    public Proyecto(){
        this.nombre = "";
        this.materiales = null;
        this.tipo_proyecto = -1;
    }

    public static String[] getTipo_proyectos() {
        return tipo_proyectos;
    }

    public static void setTipo_proyectos(String[] aTipo_proyectos) {
        tipo_proyectos = aTipo_proyectos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Material[] getMateriales() {
        return materiales;
    }

    public void setMateriales(Material[] materiales) {
        this.materiales = materiales;
    }

    public byte getTipo_proyecto() {
        return tipo_proyecto;
    }

    public void setTipo_proyecto(byte tipo_proyecto) {
        this.tipo_proyecto = tipo_proyecto;
    }
    
    
    
}
