/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestioncitas;

/**
 *
 * @author Dani
 */
public class CitaLaboratorio extends CitaMedica {

    private String tipoExamen;
    private String codigoOrdenMedica;

    public CitaLaboratorio() {
        super();
        this.tipoExamen = "";
        this.codigoOrdenMedica = "";
    }

    public CitaLaboratorio(String nombrePaciente, String cedula,
            String fecha, String hora, String motivoConsulta,
            String tipoExamen, String codigoOrdenMedica) {

        super(nombrePaciente, cedula, fecha, hora, motivoConsulta);

        this.tipoExamen = tipoExamen;
        this.codigoOrdenMedica = codigoOrdenMedica;
    }

    public String getTipoExamen() {
        return tipoExamen;
    }

    public void setTipoExamen(String tipoExamen) {
        this.tipoExamen = tipoExamen;
    }

    public String getCodigoOrdenMedica() {
        return codigoOrdenMedica;
    }

    public void setCodigoOrdenMedica(String codigoOrdenMedica) {
        this.codigoOrdenMedica = codigoOrdenMedica;
    }

    @Override
    public boolean validarRequisitos() {

        return tipoExamen != null
                && !tipoExamen.isEmpty()
                && codigoOrdenMedica != null
                && !codigoOrdenMedica.isEmpty();
    }

    @Override
    public String procesarCita() {

        if (validarRequisitos()) {
            return "Cita de laboratorio confirmada.";
        } else {
            return "Cita de laboratorio pendiente de revision.";
        }
    }

    @Override
    public String toString() {

        return "--- Cita de Laboratorio ---\n"
                + super.toString()
                + "\nTipo de examen: " + tipoExamen
                + "\nCodigo orden medica: "
                + codigoOrdenMedica
                + "\n" + procesarCita();
    }
    
}
