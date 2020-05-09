/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tiempo;

/**
 *
 * @author HP
 */
public class tiempo {
    public static void main (String args[]) throws InterruptedException {
        long  inicio = System.currentTimeMillis();
        Thread.sleep(2000);
        long fin = System.currentTimeMillis();
        double tiempo = (double) ((fin - inicio)/1000);
        System.out.println(tiempo + "segundos");
    }
}
