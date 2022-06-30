package Modelo;


public class Constructora {

    private Proyecto[] proyectos_demo, proyectos_clientes;
    private Material[] materiales;
    private Cliente[] clientes;
    private int indice_proyectosDemo, indice_proyectosClientes,indiceClientes;

    public Constructora(int cantProyectosClientes,int cantClientes) {
        this.proyectos_clientes = new Proyecto[cantProyectosClientes];
        this.indice_proyectosClientes = 0;
        this.indice_proyectosDemo = 0;
        this.inicializarArregloMateriales();
        this.inicializarArregloProyectosDemo();
        this.clientes = new Cliente[cantClientes];
    }

    private void inicializarArregloMateriales() {
        String[] nombreMateriales = {"Pasto Artificial", "Piedra", "Asfalto", "Cemento", "Madera", "Ladrillos", "Hormigón", "Acero", "Grava", "Arena", "Vidrio", "Cerámica", "PVC"};
        double[] precioMateriales = {12000, 4000, 2000, 3000, 5000, 3000, 8000, 2000, 7000, 7886, 14777, 48000, 1300};

        this.materiales = new Material[nombreMateriales.length];

        for (int i = 0; i < nombreMateriales.length; i++) {
            this.materiales[i] = new Material(nombreMateriales[i], precioMateriales[i]);
        }
    }

    private void inicializarArregloProyectosDemo() {
        String tipo = "demo",
                nombreProyectos[] = {"BASICO", "SOFISTICADO", "AVANZADO", "BASICO", "SOFISTICADO", "AVANZADO", "BASICO", "SOFISTICADO", "AVANZADO"};
        double[] salarioMensualXTrabajador = {2000, 4000, 2500, 2354, 8009, 2400, 9076, 24000, 1300};
        int[] cantTrabajadores = {12, 40, 46, 30, 35, 45, 200, 240, 380};
        short[] duracionAproxEnMeses = {20, 40, 25, 23, 10, 24, 90, 24, 130};
        byte[] tipoProyectos = {Proyecto.VIVIENDA, Proyecto.VIVIENDA, Proyecto.VIVIENDA, Proyecto.CAMINO, Proyecto.CAMINO, Proyecto.CAMINO, Proyecto.EDIFICIO, Proyecto.EDIFICIO, Proyecto.EDIFICIO};
        Material[][] materiales = {
            {this.materiales[10], this.materiales[5], this.materiales[2], this.materiales[1], this.materiales[6], this.materiales[4], this.materiales[11], this.materiales[12]},
            {this.materiales[3], this.materiales[1], this.materiales[2], this.materiales[5], this.materiales[11], this.materiales[10], this.materiales[6], this.materiales[9], this.materiales[12], this.materiales[12], this.materiales[4]},
            {this.materiales[1], this.materiales[4], this.materiales[2], this.materiales[5], this.materiales[6], this.materiales[10], this.materiales[11], this.materiales[12], this.materiales[12], this.materiales[9], this.materiales[3], this.materiales[7], this.materiales[8]},
            {this.materiales[7], this.materiales[1], this.materiales[4], this.materiales[8], this.materiales[9], this.materiales[2], this.materiales[5], this.materiales[6], this.materiales[10], this.materiales[11], this.materiales[12], this.materiales[12]},
            {this.materiales[4], this.materiales[10], this.materiales[2], this.materiales[5], this.materiales[6], this.materiales[1], this.materiales[12], this.materiales[11], this.materiales[12], this.materiales[3]},
            {this.materiales[6], this.materiales[1], this.materiales[2], this.materiales[5], this.materiales[4], this.materiales[10], this.materiales[9], this.materiales[12], this.materiales[12], this.materiales[11], this.materiales[3]},
            {this.materiales[1], this.materiales[4], this.materiales[7], this.materiales[8], this.materiales[9], this.materiales[2], this.materiales[5], this.materiales[6], this.materiales[10], this.materiales[11], this.materiales[12], this.materiales[12]},
            {this.materiales[5], this.materiales[6], this.materiales[2], this.materiales[1], this.materiales[4], this.materiales[10], this.materiales[11], this.materiales[12], this.materiales[12], this.materiales[9], this.materiales[3]},
            {this.materiales[1], this.materiales[2], this.materiales[4], this.materiales[5], this.materiales[3], this.materiales[9], this.materiales[11], this.materiales[12], this.materiales[12], this.materiales[10], this.materiales[6], this.materiales[7], this.materiales[8]}
        };

        this.proyectos_demo = new Proyecto[nombreProyectos.length];

        for (int i = 0; i < nombreProyectos.length; i++) {

            this.addProyecto(tipo, i, nombreProyectos[i], salarioMensualXTrabajador[i], cantTrabajadores[i], duracionAproxEnMeses[i], tipoProyectos[i], materiales[i], null);
        }
    }

    public String buscarProyectos(Proyecto[] lista, byte dat) {
        String posiciones = "";
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getTipo_proyecto() == dat) {
                posiciones += i + "-";
            }
        }
        return posiciones;
    }

    public Proyecto buscarProyecto(Proyecto[] lista, int dat) {
        Proyecto proyecto = null;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getId() == dat) {
                proyecto = lista[i];
            }
        }
        return proyecto;
    }

    public static double cotizarProyecto(Proyecto proyecto) {
        double precioFinal = 0;
        for (Material material : proyecto.getMateriales()) {
            precioFinal += material.getPrecio();
        }
        precioFinal += (proyecto.getCantTrabajadores() * proyecto.getSalarioXTrabajador()) * proyecto.getDuracionEnMesesAprox();

        return precioFinal;
    }

    public boolean addProyecto(String tipo, int id, String nombre, double salarioMensualXTrabajador, int cantTrabajadores, short duracionMeses, byte tipo_proyecto, Material[] materiales, Cliente cliente) {

        if (((tipo.equalsIgnoreCase("demo")) && (this.indice_proyectosDemo < this.proyectos_demo.length)) || ((tipo.equalsIgnoreCase("clientes")) && (this.indice_proyectosClientes < this.proyectos_clientes.length))){
            
            Proyecto proyecto = new Proyecto();
            proyecto.setNombre(nombre);
            proyecto.setId(id);
            proyecto.setSalarioXTrabajador(salarioMensualXTrabajador);
            proyecto.setCantTrabajadores(cantTrabajadores);
            proyecto.setDuracionEnMesesAprox(duracionMeses);
            proyecto.setMateriales(materiales);
            proyecto.setTipo_proyecto(tipo_proyecto);
            
            if (tipo.equalsIgnoreCase("demo")) {
                this.proyectos_demo[this.indice_proyectosDemo++] = proyecto;
            } else if (tipo.equalsIgnoreCase("clientes")) {
                proyecto.setCliente(cliente);
                this.proyectos_clientes[this.indice_proyectosClientes++] = proyecto;
                System.out.println("CLiente agregafdo");
            }
            return true;
        }else{
            javax.swing.JOptionPane.showMessageDialog(null,"Error: no puede agregar mas proyectos");
        }
        return false;
    }
    
    public boolean addCliente(String nombre,String direccion, String telefono, String id){
        if(this.verificarDisponibilidadDeIDCliente(id) && this.indiceClientes<this.clientes.length){
            Cliente cliente = new Cliente();
            cliente.setNombre(nombre);
            cliente.setDireccion(direccion);
            cliente.setTelefono(telefono);
            cliente.setIdentificacion(id);
            this.clientes[this.indiceClientes++] = cliente;
            return true;
        }
        return false;
    }
    
    public int getLargoCliente(){
        return this.indiceClientes;
    }
    
    public int getLargoProyectosCliente(){
        return this.indice_proyectosClientes;
    }
    
    public boolean verificarDisponibilidadDeIDProyecto(int id){
        for(int i = 0;i<this.indice_proyectosClientes;i++){
            if(this.proyectos_clientes[i].getId()==id){
                return false;
            }
        }
        return true;
    }
    
    private boolean verificarDisponibilidadDeIDCliente(String id){
        for(int i = 0;i<this.indiceClientes;i++){
            if(this.clientes[i].getIdentificacion().equalsIgnoreCase(id)){
                return false;
            }
        }
        return true;
    }

    public Proyecto[] getProyectos(String tipoLista) {
        return (tipoLista.equalsIgnoreCase("demo")) ? this.proyectos_demo : (tipoLista.equalsIgnoreCase("clientes")) ? this.proyectos_clientes : null;
    }

    
    public Cliente[] getClientes() {
        return this.clientes;
    }

}
