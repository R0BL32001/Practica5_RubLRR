/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.practica5_rublrr;

import com.mycompany.practica5_rublrr.CCuenta;


public class Main {

    public static void main(String[] args) {
        CCuenta miCuenta;
        double saldoActual;
        

        miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
    
    }
    
    public static void probarIngresar(CCuenta c, int cantidad) throws Exception{
        c.ingresar(cantidad);
        
    }
    
    public static void probarRetirar(CCuenta c, int cantidad) throws Exception{
        c.retirar(cantidad);
    }
}
