/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioncitas;

/**
 *
 * @author aleja
 */
public class ConsultaGeneral extends CitaMedica implements Notificable {
    
    private String codigoMedicoGeneral;
    
    public ConsultaGeneral(){
        super();
        this.codigoMedicoGeneral = "";
    }
    
    public ConsultaGeneral(String nombrePaciente, String cedula, String fecha, 
            String hora, String motivoConsulta, String codigoMedicoGeneral){
        super(nombrePaciente, cedula, fecha, hora, motivoConsulta);
        
    }
    
    public String getCodigoMedicoGeneral() { 
        return codigoMedicoGeneral; 
    }
    
    public void setCodigoMedicoGeneral(String codigoMedicoGeneral) { 
        this.codigoMedicoGeneral = codigoMedicoGeneral; 
    }

    @Override
    public boolean validarRequisitos() {
        return codigoMedicoGeneral != null && !codigoMedicoGeneral.isEmpty();
    }

    @Override
    public String enviarNotificacion() {
        return "Notificacion enviada al paciente " + getNombrePaciente()
                + " para su consulta general con el medico codigo: " + codigoMedicoGeneral;
    }

    @Override
    public String procesarCita() {
        if (validarRequisitos()) {
            return "Consulta General confirmada.\n" + enviarNotificacion();
        } else {
            return "Consulta General rechazada: el codigo del medico general no es valido.";
        }
    }
    
    @Override
    public String toString() {
        return "--- Consulta General ---\n"
                + super.toString()
                + "\nCodigo Medico: " + codigoMedicoGeneral
                + "\n" + procesarCita();
    }
    
}
