/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funciones_joptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author ItsqmetEstudiantes
 */
public class Funciones_JOptionPane {

    public static void main(String[] args) {
        String nombre ="";
        int edad=0;
        double notas[]={7,9,6,3,6,2,4};
        double notas1[]={8,7,7,8};
        
        nombre = JOptionPane.showInputDialog("Ingresar nombre");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresar edad"));
        
        mensaje(nombre, edad);
        //JOptionPane.showMessageDialog(null, "El promedio es: "+promedio(notas));
        JOptionPane.showMessageDialog(null, "El promedio es: "+promedio(notas1));
        //promedio(notas);
        
    }
    
    public static void mensaje(String nombres,int edades){
        JOptionPane.showMessageDialog(null, nombres + " tiene "+ edades + " anios");
        
    }
    
    public static double promedio(double[]calificaciones){
        double suma=0;
        double respuesta;
        for(int i=0;i< calificaciones.length; i++){
            suma=suma+calificaciones[i];
        }
        respuesta = suma / calificaciones.length;
        
        return respuesta;
    }
}
