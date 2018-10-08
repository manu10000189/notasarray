/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasarray;

/**
 *
 * @author Manu
 */
public class Mmedia {
    private String nombre;
    private double notamedia;

    public Mmedia() {
    }

    public Mmedia(String nombre, double notamedia) {
        this.nombre = nombre;
        this.notamedia = notamedia;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotamedia() {
        return notamedia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotamedia(double notamedia) {
        this.notamedia = notamedia;
    }
    
}
