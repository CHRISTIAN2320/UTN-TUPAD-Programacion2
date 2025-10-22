
package ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {
        
       Profesor p1 = new Profesor("qwert123", "Carlos", "Electronica");
       Profesor p2 = new Profesor("asdf345", "Juan", "Informatica");
       Profesor p3 = new Profesor("jkl987", "Elvio", "Base de datos I");
       
       Curso c1 = new Curso("aa00", "Programacion I");
       Curso c2 = new Curso("ab01", "Electronica");
       Curso c3 = new Curso("fa03", "Intro. Informatica");
       Curso c4 = new Curso("a204", "BD I");
       Curso c5 = new Curso("a709", "Analisis");
    
       Universidad u1 = new Universidad("UTN");
       u1.agregarProfesor(p1);
       u1.agregarProfesor(p2);
       u1.agregarProfesor(p3);
       
       u1.agregarCurso(c1);
       u1.agregarCurso(c2);
       u1.agregarCurso(c3);
       u1.agregarCurso(c4);
       u1.agregarCurso(c5);
       
       
       u1.asignarProfesorACurso("aa00", "asdf345");
       u1.asignarProfesorACurso("fa03", "asdf345");
       u1.asignarProfesorACurso("ab01", "qwert123");
       u1.asignarProfesorACurso("a204", "jkl987");
       u1.asignarProfesorACurso("a709", "asdf345");
       
       System.out.println("REPORTE INICIAL");
       u1.mostrarReporte();

       u1.listarProfesores();
       System.out.println("");
       u1.listarCursos();
       
       System.out.println("");

       
       u1.eliminarProfesor("jkl987");
       System.out.println(" ---- Cursos -----");
       u1.listarCursos();
       System.out.println(" ---- Profesores -----");
       u1.listarCursosPorProfesor();
       
       System.out.println("");
       
       u1.eliminarCurso("ab01");
       System.out.println(" ---- Cursos -----");
       u1.listarCursos();
       u1.listarCursosPorProfesor();
       
       System.out.println("REPORTE FINAL");
       System.out.println("");
       u1.mostrarReporte();
       
    }
    
    

}
