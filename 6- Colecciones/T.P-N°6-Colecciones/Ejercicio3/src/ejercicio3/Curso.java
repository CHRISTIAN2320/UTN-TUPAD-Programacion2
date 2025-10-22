package ejercicio3;

public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void mostrarInfo() {
        System.out.println("Codigo del curso: " + getCodigo()
                + "\nNombre del Curso: " + getNombre()
                + "\n" + getProfesor());
    }

    @Override
    public String toString() {
        return "Curso{" + "\ncodigo=" + codigo + ", \nnombre=" + nombre 
                + ", profesor=" + (profesor != null ? profesor.getNombre() : "sin profesor")
                + '}';
    }

}
