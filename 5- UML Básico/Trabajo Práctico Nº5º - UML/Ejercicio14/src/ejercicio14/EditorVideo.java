
package ejercicio14;


public class EditorVideo {
    public static void exportar (String formato, Proyecto proyecto){
        Render render1 = new Render(formato);
        render1.setProyecto(proyecto);
        render1.MostrarProyecto();
    }

}
