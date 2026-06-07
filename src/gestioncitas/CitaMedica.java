/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioncitas;

/**
 *
 * @author aleja
 */

public abstract class CitaMedica {

    private String nombrePaciente;
    private String cedula;
    private String fecha;
    private String hora;
    private String motivoConsulta;

    public CitaMedica() {
        this.nombrePaciente = "";
        this.cedula = "";
        this.fecha = "";
        this.hora = "";
        this.motivoConsulta = "";
    }

    public CitaMedica(String nombrePaciente, String cedula, String fecha, String hora, String motivoConsulta) {
        this.nombrePaciente = nombrePaciente;
        this.cedula = cedula;
        this.fecha = fecha;
        this.hora = hora;
        this.motivoConsulta = motivoConsulta;
    }

    public String getNombrePaciente(){ 
        return nombrePaciente;
    }
    
    public void setNombrePaciente(String nombrePaciente){ 
        this.nombrePaciente = nombrePaciente;
    }
    
    public String getCedula() {
        return cedula; 
    }
    
    public void setCedula(String cedula) { 
        this.cedula = cedula; 
    }
    
    public String getFecha() { 
        return fecha; 
    }
    
    public void setFecha(String fecha) { 
        this.fecha = fecha; 
    }
    
    public String getHora() { 
        return hora; 
    }
    
    public void setHora(String hora) { 
        this.hora = hora; 
    }
    
    public String getMotivoConsulta() { 
        return motivoConsulta; 
    }
    
    public void setMotivoConsulta(String motivoConsulta) { 
        this.motivoConsulta = motivoConsulta; 
    }
    
    public abstract boolean validarRequisitos();
    
    public abstract String procesarCita();

    @Override
    public String toString() {
        return "Paciente: " + nombrePaciente
                + "\nCedula: " + cedula
                + "\nFecha: " + fecha + " | Hora: " + hora
                + "\nMotivo: " + motivoConsulta;
    }

}
