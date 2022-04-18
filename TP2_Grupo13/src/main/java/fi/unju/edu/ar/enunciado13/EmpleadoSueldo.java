package fi.unju.edu.ar.enunciado13;



import java.util.Scanner;

public class EmpleadoSueldo {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String nombre;
        int fecha;
        int sueldo;
        String Email;
        int legajo;
        int horas;
        int cal1;
        int cal2;
        int cal3;
        int cal4;
        System.out.println("ingrese el nombre");
        nombre = teclado.next();
        //System.out.println("ingrese la fecha de ingreso");
        //fecha= teclado.nextInt();
        System.out.println("ingrese el legajo");
        legajo=teclado.nextInt();
        System.out.println("ingrese la el Email");
        Email=teclado.next();
        System.out.println("ingrese las hora de trabajo");
        horas=teclado.nextInt();
        if(horas>160) {
            cal1=160*600;
            cal2=horas-160;
            cal3=cal2*650;
            cal4=cal1+cal3;
            System.out.println(cal4);
        }else {
            cal4=horas*600;
            System.out.println(cal4);
        }
        System.out.println("*******************************Dato del Empleado******************");
        System.out.println("************************Empleado       : "+ nombre+"  ******************");
        System.out.println("************************Legajo         : "+ legajo+"  ******************");
        System.out.println("************************Gmail          : "+ Email+ "  *******************");
        System.out.println("************************HS de trabajo  : "+ horas+ "  *******************");
        System.out.println("*******************Sueldo del trabajor : "+ cal4+ "  *******************");

    }

}