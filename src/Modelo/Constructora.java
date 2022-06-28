package Modelo;

//Harold muchas gracias por los conocimientos brindados se que la nota maxima es un 5 pero quiero un 7
public class Constructora {

    private Proyecto[] proyectos_demo, proyectos_clientes;
    private Material[] materiales;
    private int indice_materiales, indice_proyectosDemo, indice_proyectosClientes;

    public Constructora() {
        this.proyectos_demo = new Proyecto[6];
        this.proyectos_demo[0] = new Proyecto("DEMO_1",);
    }

    public void addMaterial(String nombre, double precio) {
        Material material = new Material();
        material.setNombre(nombre);
        material.setPrecio(precio);
        this.materiales[indice_materiales++] = material;
    }

    public void addProyecto(String tipo, String nombre, byte tipo_proyecto, Material[] materiales) {
        Proyecto proyecto = new Proyecto();
        proyecto.setNombre(nombre);
        proyecto.setMateriales(materiales);
        proyecto.setTipo_proyecto(tipo_proyecto);

        if (tipo.equalsIgnoreCase("demo")) {
            this.proyectos_clientes[indice_proyectosDemo++] = proyecto;
        } else if (tipo.equalsIgnoreCase("clientes")) {
            this.proyectos_clientes[indice_proyectosClientes++] = proyecto;
        }
    }

}
