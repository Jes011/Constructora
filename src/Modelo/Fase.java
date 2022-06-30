
package Modelo;

public class Fase {
    
    public static final String[] fases={ 
            "CONCEPCION, DISEÑO Y PLANIFICACION DEL PROYECTO",
            "ABASTECIMIENTO",
            "CIERRE DEL AREA",
            "LIEMPIEZA Y NIVELACION DEL TERRENO",
            "CONSTRUCCION",
            "COMPROBACION",
            "OPERACIONES Y MANTENIMIENTO"};
    public static final byte EN_PROCESO = 1,TERMINADO = 2;
                   
    private String nombre;
    private byte estado;
    
    public Fase(){
        this.nombre = "";
        this.estado = 1;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEstado() {
        return estado;
    }
    public void setEstado(byte estado) {
        this.estado = estado;
    }
    
    
}
