package com.example.myapplication;

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Perro perro1 = new Perro();

        perro1.nombre = "Milaneso";
        perro1.edad = 3;
        perro1.vacunado = false;
        perro1.trabaja = false;

        perro1.mostrarDatos();
        perro1.sonido();
        perro1.vacunar();
        perro1.trabaja();

        Gato gato1 = new Gato();

        System.out.println("Dame el nombre del gato");
        gato1.nombre = entrada.nextLine();
        System.out.println("Dame la edad del gato");
        gato1.edad = entrada.nextInt();
        System.out.println("¿Está vacunado?");
        gato1.vacunado = entrada.nextBoolean();
        System.out.println("¿Sale de noche?");
        gato1.sale_de_noche = entrada.nextBoolean();

        gato1.mostrarDatos();
        gato1.sonido();
        gato1.vacunar();
        gato1.sale();



    }
}