
package ejercicio14;

public class Ejercicio14 {

    public static void main(String[] args) {
        //Asociacion
        Proyecto proyecto = new Proyecto("Christian", 142);
        Render render = new Render("mp4");
        render.setProyecto(proyecto); // Establecemos la relacion
        render.MostrarProyecto();
        //Dependencia de Creacion
        Proyecto proyecto2 = new Proyecto("Emmanuel", 160);
        EditorVideo.exportar("mkv", proyecto2);
       
        
    }

}
