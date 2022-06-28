package Modelo;

//Harold muchas gracias por los conocimientos brindados se que la nota maxima es un 5 pero quiero un 7
public class Constructora {

    private Proyecto[] proyectos_demo, proyectos_clientes;
    private Material[] materiales;
    private int indice_materiales, indice_proyectosDemo, indice_proyectosClientes;

    public Constructora(int cantProyectosClientes, int estimadoMateriales) {
        this.proyectos_demo = new Proyecto[6];
        this.proyectos_clientes = new Proyecto[cantProyectosClientes];
        this.materiales = new Material[estimadoMateriales];
        this.indice_materiales = 0;
        this.indice_proyectosClientes = 0;
        this.indice_proyectosDemo = 0;
    }
    
    public double cotizarProyecto(Proyecto proyecto){
        
        double precioFinal = 0;
        for(Material material: proyecto.getMateriales()){
            precioFinal += material.getPrecio();
        }
        
        precioFinal += (proyecto.getCantTrabajadores()*proyecto.getSalarioXTrabajador())*proyecto.getDuracionEnMesesAprox();
        
        return precioFinal;
    }

    public void addMaterial(String nombre, double precio) {
        if (this.indice_materiales < this.materiales.length) {
            Material material = new Material();
            material.setNombre(nombre);
            material.setPrecio(precio);
            this.materiales[this.indice_materiales++] = material;
        }
    }

    public Material[] getMateriales() {
        return this.materiales;
    }

    public void addProyecto(String tipo, String nombre, byte tipo_proyecto, Material[] materiales) {
        Proyecto proyecto = new Proyecto();
        proyecto.setNombre(nombre);
        proyecto.setMateriales(materiales);
        proyecto.setTipo_proyecto(tipo_proyecto);

        if (tipo.equalsIgnoreCase("demo") && this.indice_proyectosDemo<this.proyectos_demo.length) {
            this.proyectos_demo[this.indice_proyectosDemo++] = proyecto;
        } else if (tipo.equalsIgnoreCase("clientes") && this.indice_proyectosClientes<this.proyectos_clientes.length) {
            this.proyectos_clientes[this.indice_proyectosClientes++] = proyecto;
        }
    }

    public Proyecto[] getProyectos(String tipoLista) {
        return (tipoLista.equalsIgnoreCase("demo")) ? this.proyectos_demo : (tipoLista.equalsIgnoreCase("clientes")) ? this.proyectos_clientes : null;
    }

}
