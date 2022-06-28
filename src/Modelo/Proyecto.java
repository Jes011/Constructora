
package Modelo;

public class Proyecto {
    
    public static final String[] tipo_proyectos = {"Vivienda","Edificio","Camino"};
    
    private String nombre;
    private Material[] materiales;
    private byte tipo_proyecto;
    private Cliente cliente;
    private int cantTrabajadores;
    private short duracionEnMesesAprox;
    private double salarioXTrabajador;
    
    public Proyecto(){
        this.nombre = "";
        this.materiales = null;
        this.tipo_proyecto = -1;
        this.cliente = null;
        this.cantTrabajadores = 0;
        this.duracionEnMesesAprox = 0;
        this.salarioXTrabajador = 0;
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
}
