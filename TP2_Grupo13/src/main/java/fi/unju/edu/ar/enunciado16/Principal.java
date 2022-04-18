package fi.unju.edu.ar.enunciado16;


import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Prueba2Application {

    public static void main(String[] args) {
        SpringApplication.run(Prueba2Application.class, args);

        Scanner teclado = new Scanner(System.in);
        Scanner teclado1 = new Scanner(System.in);


        Calendar hoy = Calendar.getInstance();
        int hoya = hoy.get(Calendar.YEAR);
        int hoym = hoy.get(Calendar.MONTH);
        int hoyd = hoy.get(Calendar.DAY_OF_MONTH);

        System.out.println("Ingrese su nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese su año de nacimiento: ");
        int año = teclado1.nextInt();
        while ( año > hoya) {
            System.out.println("No puedes ingresar un año mayor al actual!!");
            System.out.println("Ingrese su año de nacimiento: ");
            año = teclado1.nextInt();
        }
        System.out.println("Ingrese su mes de nacimiento: ");
        int mes = teclado1.nextInt();
        while ( mes < 1 || mes > 12 ) {
            System.out.println("Mes ingresado fuera de rango!!");
            System.out.println("Ingrese su mes de nacimiento: ");
            mes = teclado1.nextInt();
        }
        System.out.println("Ingrese su dia de nacimiento: ");
        int dia = teclado1.nextInt();
        while ( dia < 1 || dia > 31 ) {
            System.out.println("Dia ingresado fuera de rango!!");
            System.out.println("Ingrese su dia de nacimiento: ");
            dia = teclado1.nextInt();
        }
int cal = hoya - año;
        if ( hoym < mes ) {
                cal = cal - 1;
                System.out.println("Edad: " + cal + " años");
        }else {
            if ( hoyd < dia ) {
                cal = cal - 1;
                System.out.println("Edad: " + cal + " años");
            }else {
                System.out.println("Edad: " + cal + " años");
            }
        }

        if ((dia >= 21 && mes > 11) || (dia <= 20 && mes < 4)) {
            System.out.println("Estacion: VERANO");
        }else {
            if ((dia >= 21 && mes > 2 ) || (dia <= 20 && mes < 7)) {
                System.out.println("Estacion: OTOÑO");
            }else {
                if ((dia >= 21 && mes > 5) || (dia <= 20 && mes < 10)) {
                    System.out.println("Estacion: INVIERNO");
                }else {
                    if ((dia >= 21 && mes > 8) ||(dia <= 20 && mes < 13)) {
                        System.out.println("Estacion: PRIMAVERA");
                    }
                }
            }
        }

    }


}