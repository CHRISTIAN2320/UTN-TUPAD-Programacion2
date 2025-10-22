package ejercicio3;

import java.util.ArrayList;

public class Universidad {

    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso cursoEncontrado = null;
        Profesor profesorEncontrado = null;
        for (Curso curso : cursos) {
            if (curso.getCodigo().equalsIgnoreCase(codigoCurso)) {
                cursoEncontrado = curso;
                break;
            }
        }
        for (Profesor profesor : profesores) {
            if (profesor.getId().equalsIgnoreCase(idProfesor)) {
                profesorEncontrado = profesor;
                break;
            }
        }
        if (cursoEncontrado != null && profesorEncontrado != null) {
            cursoEncontrado.setProfesor(profesorEncontrado);
            profesorEncontrado.agregarCurso(cursoEncontrado);
        } else {
            System.out.println("Curso o profesor no encontrado.");
        }
    }

    public void listarProfesores() {
        for (Profesor profesore : profesores) {
            System.out.println(profesore);

        }
    }

    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor profesore : profesores) {
            if (id.equalsIgnoreCase(profesore.getId())) {
                return profesore;
            }
        }
        return null;
    }

    public void eliminarProfesor(String id) {
        for (Curso curso : cursos) {
            if (curso.getProfesor() != null && curso.getProfesor().getId().equals(id)) {
                curso.setProfesor(null);
            }
        }
        Profesor p = buscarProfesorPorId(id);
        profesores.remove(p);
    }
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso : cursos) {
            if (codigo.equalsIgnoreCase(curso.getCodigo())) {
                return curso;
            }
        }
        return null;
    }
    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        for (Profesor profesor : profesores) {
            profesor.getCursos().remove(curso);
        }
        cursos.remove(curso);
    }

    public void listarCursosPorProfesor() {
        System.out.println("---- Profesores -----");
        for (Profesor profesor : profesores) {
            System.out.println("Profesor: " + profesor.getNombre() + " (" + profesor.getId() + ")");
            for (Curso curso : profesor.getCursos()) {
                System.out.println("  - Curso: " + curso.getNombre() + " [" + curso.getCodigo() + "]");
            }
            System.out.println(); // Línea en blanco para separar
        }
    }

    public void mostrarReporte() {
        System.out.println("---- Reporte: Cantidad de cursos por profesor ----");
        for (Profesor profesor : profesores) {
            System.out.println("Profesor: " + profesor.getNombre() + " (" + profesor.getEspecialidad() + ")");
            System.out.println("Id : " +  profesor.getId());
            System.out.println("Cantidad de cursos asignados: " + profesor.cantidadCursos() + " cursos");
            for (Curso curso : profesor.getCursos()) {
                System.out.println("Nombre del Curso: "+ curso.getNombre());
                System.out.println("Codigo del curso: " + curso.getCodigo());
                System.out.println("------");
            }
            System.out.println(); // Línea en blanco para separar
        }
    }

}
