
package ejercicio9;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Relacion Unidireccional CitaMedica -> Paciente
        CitaMedica Cita1 = new CitaMedica("28/09/2025", "12:00");
        Paciente paciente1 = new Paciente("Christian", "OSDE");
        Cita1.setPaciente(paciente1);           //Se establece la relacion
        Cita1.mostrarPaciente();
        // Relacion Unidireccional CitaMedica -> Profesional
        Profesional profesional1 = new Profesional("Emmanuel", "Neurocirujano");
        Cita1.setProfesional(profesional1);     //Se establece la relacion
        Cita1.MostrarProfesional(); 
    }
}
