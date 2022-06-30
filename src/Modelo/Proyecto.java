
package Modelo;

public class Proyecto {
    
    public static final byte VIVIENDA=0,EDIFICIO= 1,CAMINO= 2;
    
    private String nombre;
    private Material[] materiales;
    private Fase[] fases;
    private byte tipo_proyecto;
    private Cliente cliente;
    private int cantTrabajadores,id;
    private short duracionEnMesesAprox;
    private double salarioXTrabajador;
    
    public Proyecto(){
        this.nombre = "";
        this.id = -1;
        this.materiales = null;
        this.tipo_proyecto = -1;
        this.cliente = null;
        this.cantTrabajadores = 0;
        this.duracionEnMesesAprox = 0;
        this.salarioXTrabajador = 0;
        this.inicializarFases();
    }
    
    private void inicializarFases(){
        this.fases = new Fase[Fase.fases.length];        
        for(int i = 0;i<this.fases.length;i++){
            this.fases[i] = new Fase();
            this.fases[i].setNombre(Fase.fases[i]);
        }
    }
    
    public String getEstado() {
        String estado = "TERMINADO";
        for(int i = 0;i<this.fases.length;i++){
            if(this.fases[i].getEstado()==Fase.EN_PROCESO){
                estado = "EN PROCESO";
                break;
            }
        }
                
        return estado;
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

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCantTrabajadores() {
        return cantTrabajadores;
    }
    public void setCantTrabajadores(int cantTrabajadores) {
        this.cantTrabajadores = cantTrabajadores;
    }

    public short getDuracionEnMesesAprox() {
        return duracionEnMesesAprox;
    }
    public void setDuracionEnMesesAprox(short duracionEnMesesAprox) {
        this.duracionEnMesesAprox = duracionEnMesesAprox;
    }

    public double getSalarioXTrabajador() {
        return salarioXTrabajador;
    }
    public void setSalarioXTrabajador(double salarioXTrabajador) {
        this.salarioXTrabajador = salarioXTrabajador;
    }

    public Fase[] getFases() {
        return fases;
    }
    public void setFases(Fase[] fases) {
        this.fases = fases;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    
}
