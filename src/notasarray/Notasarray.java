/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasarray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Manu
 */
public class Notasarray {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //Añado un arraylist y guardo memoria
        ArrayList<Double> listajava = new ArrayList<Double>();
        //Añado un arraylist de tipo Mmedia que es la clase que he creado
        ArrayList<Mmedia> listamediatotal = new ArrayList<Mmedia>();
        String nombre;
        do {
            System.out.println("Introduce el nombre de la materia");
            nombre = teclado.next();
            System.out.println(nombre);
            if (!nombre.equals("q")) {
                //Si es true llama a la funcion
                calcularMedia(listajava, nombre, listamediatotal);
            } else {
                //Si es false te saca del bucle con break
                break;
            }
        } while (nombre != "q");
        System.out.println("Estoy fuera de while");
        //Con este for recorremos el array
        for (Mmedia a:listamediatotal){
            System.out.println("El nombre de la asignatura es "+a.getNombre()+" y su  nota media es "+a.getNotamedia());
        }
    }
    //Calcular media funcion
    public static void calcularMedia(ArrayList<Double> lista, String nombre, ArrayList<Mmedia> listamediatotal) {
        double nota;
        //Reseteamos el array lista 
        lista.clear();
        System.out.println("Introduce una nota");
        System.out.println("Introduce -1 para salir");
        do {
            nota = teclado.nextDouble();
            if (nota >= 0) {
                lista.add(nota);
            }
        } while (nota != -1);
        double resultado;
        resultado = 0;
        for (Double a : lista) {
            resultado = resultado + a;
        }
        resultado = resultado / lista.size();
        System.out.println("El resultado de la materia de " + nombre + " es " + resultado);
        //Juntamos todo en juntar
        Mmedia juntar=new Mmedia(nombre,resultado);
        //Juntamos a listamediatotal el juntar
        listamediatotal.add(juntar);
    }
}
