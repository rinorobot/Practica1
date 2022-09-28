package com.example.myapplication;

//Molde para crear alumnos
public class Alumno {
    //Atributos
    String nombre;
    int edad;
    double promedio;

    //Métodos
    static void mostrarDatos(String nombre, int edad, double promedio){
        System.out.println("El alumno "+nombre+" tiene una edad de "+edad+" y un promedio de "+promedio);
    }

    void asignarBeca(){
        if(promedio>8){
            System.out.println("Al alumno "+nombre+" se le asignó una beca por su promedio de "+promedio);
        }else{
            System.out.println("Al alumno "+nombre+" no se le asignó una beca por su promedio de "+promedio);
        }
    }

}
