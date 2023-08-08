/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyect;

import javax.swing.JOptionPane;


/**
 *
 * @author USUARIO
 */
public class Proyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int CantFincas = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantas fincas hay?:"));
      
      Finca[] Fincas = new Finca[CantFincas];
        for (int i = 0; i < CantFincas; i++) {
           String NombreFinca= JOptionPane.showInputDialog(null, "Cual es el nombre de la finca "+i+"?:");
           String Ubicacion = JOptionPane.showInputDialog(null, "Cual es la ubicacion de la finca "+i+"?:");
           String NombreEncargado = JOptionPane.showInputDialog(null, "Cual es el nombre del encargado "+i+"?:");
           String IdEncargado = JOptionPane.showInputDialog(null, "Cual es el ID del encargado de la finca "+i+"?:");
           String TeleEncargado = JOptionPane.showInputDialog(null, "Cual es el telefono del encargado "+i+"?:");
           int CantPotrero = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos potreros hay en la finca "+i+"?:"));
           String TamañoFinca = JOptionPane.showInputDialog(null, "Cual es el tamaño de la finca "+i+"?:");
           int CantAnimales = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos animales hay "+i+"?:"));
           
            Fincas[i] = new Finca(NombreFinca,Ubicacion,NombreEncargado,IdEncargado,TeleEncargado,CantPotrero,TamañoFinca,CantAnimales);
            
        }
        System.out.println(Fincas.length);
    }
    
}
