
package ejercicio14;

public class Render {
    private String formato;
    private Proyecto proyecto;
    // Constructor
    public Render(String formato) {
        this.formato = formato;
    }
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
    public void MostrarProyecto(){
        System.out.println("El proyecto se llama " + proyecto.getNombre() 
        + " y tiene una duracion de: " +proyecto.getDuracionMin() + " min \n"
        + "renderizado en formato. " +getFormato() );
    }
    public String getFormato() {
        return formato;
    }
}
