
package ejercicio9;

public class CitaMedica {
    private String fecha;
    private String hora ;
    private Paciente paciente; // Asoc. Unidireccional 1:1
    private Profesional profesional; // Asoc. Unidireccional 1:1
    //Constructor
    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public void mostrarPaciente() {
        if (paciente != null) {
            System.out.println("El paciente cargado es: " + paciente.getNombre() +
                    " y su obra sociales es: " + paciente.getObraSocial() + "\n");
        } else {
            System.out.println("No se ha cargado paciente");
        }
    }
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    public void MostrarProfesional (){
        if (profesional != null) {
            System.out.println("El profesional cargado es: " + profesional.getNombre() +
                    " y su especialidad es: " + profesional.getEspecialidad() + "\n");
        } else {
             System.out.println("No se ha cargado profesional");
        }
    }
}
