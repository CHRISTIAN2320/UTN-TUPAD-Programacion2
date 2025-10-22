package ejercicio3;

import java.util.ArrayList;

public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getEspecialidad() {
        return especialidad;
    }
    

    public String getId() {
        return id;
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
    }

    public void eliminarCurso(Curso c) {
        cursos.remove(c);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println("Nombre: " + curso.getNombre()
                    + "\nCodigo: " + curso.getCodigo());
        }
    }

    public int cantidadCursos() {
        return cursos.size();
    }

    public void mostrarInfo() {
        for (Curso curso : cursos) {
            System.out.println(curso.getProfesor()
                    + "\nCantidad de Cursos: " + cantidadCursos());
        }
    }

    @Override
    public String toString() {
        return "Profesor{" + "\nid=" + id + ", \nnombre=" + nombre + ", \nespecialidad=" + especialidad + '}';
    }

}
