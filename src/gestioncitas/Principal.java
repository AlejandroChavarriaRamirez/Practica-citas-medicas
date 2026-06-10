/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestioncitas;

/**
 *
 * Integrantes:
 * 
 * Alejandro Chavarria Ramirez
 * Daniela Jazmin Gomez Peña
 * Marisol Del Carmen Masis Monge
 * 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CitaMedica cg = new ConsultaGeneral(
                "Maria Fernandez", "109870654",
                "10/06/2026", "9:00",
                "Dolor de cabeza frecuente", "MG201");

        CitaMedica ce = new ConsultaEspecializada(
                "Carlos Mendez", "304560123",
                "11/06/2026", "10:30",
                "Revision anual", "Cardiologia", "ESP402");

        CitaMedica cl1 = new CitaLaboratorio(
                "Ana Jimenez", "203210789",
                "12/06/2026", "7:00",
                "Control de glucosa", "Hemograma completo", "ORD551");

        CitaMedica cl2 = new CitaLaboratorio(
                "Luis Vargas", "4-0112-0334",
                "12/06/2026", "8:00",
                "Chequeo general", "Perfil lipidico", "");

        System.out.println(cg);
        System.out.println("-------------------------------");
        System.out.println(ce);
        System.out.println("-------------------------------");
        System.out.println(cl1);
        System.out.println("-------------------------------");
        System.out.println(cl2);
        System.out.println("-------------------------------");
    
    
    }
    
}
