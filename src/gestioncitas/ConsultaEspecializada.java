/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestioncitas;

/**
 *
 * @author Dani
 */
public class ConsultaEspecializada extends CitaMedica implements Notificable {
    
    

    private String especialidad;
    private String codigoEspecialista;

    public ConsultaEspecializada() {
        super();
        this.especialidad = "";
        this.codigoEspecialista = "";
    }

    public ConsultaEspecializada(String nombrePaciente, String cedula,
            String fecha, String hora, String motivoConsulta,
            String especialidad, String codigoEspecialista) {

        super(nombrePaciente, cedula, fecha, hora, motivoConsulta);

        this.especialidad = especialidad;
        this.codigoEspecialista = codigoEspecialista;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCodigoEspecialista() {
        return codigoEspecialista;
    }

    public void setCodigoEspecialista(String codigoEspecialista) {
        this.codigoEspecialista = codigoEspecialista;
    }

    @Override
    public boolean validarRequisitos() {

        return especialidad != null
                && !especialidad.isEmpty()
                && codigoEspecialista != null
                && !codigoEspecialista.isEmpty();
    }

    @Override
    public String enviarNotificacion() {

        return "Notificacion enviada al paciente "
                + getNombrePaciente()
                + " para consulta especializada en "
                + especialidad;
    }

    @Override
    public String procesarCita() {

        if (validarRequisitos()) {
            return "Consulta Especializada confirmada.\n"
                    + enviarNotificacion();
        } else {
            return "Consulta Especializada rechazada: "
                    + "especialidad o especialista invalido.";
        }
    }

    @Override
    public String toString() {

        return "--- Consulta Especializada ---\n"
                + super.toString()
                + "\nEspecialidad: " + especialidad
                + "\nCodigo Especialista: "
                + codigoEspecialista
                + "\n" + procesarCita();
    }
    
}
