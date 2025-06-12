package utez.edu.mx;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int opc = 0;
        do {
            double cantidad =0;
            double cambio =0;
            System.out.println("Bienvenido a la conversion de Dinero");
            System.out.println("Ingresa una opcion \n1. Pesos mexicanos a dólares\n2.Pesos mexicanos a euros\n3.Dólares a pesos\n4.Euros a pesos\n5. Salir");
        opc = sc.nextInt();
        switch (opc){
            case 1:
                System.out.println("Ingresa la cantidad que quieres cambiar");
                cantidad = sc.nextDouble();
                cambio = cantidad/17.5;
                System.out.println("tu cambios es :"+cambio+" Dolares");
                break;
            case 2:
                System.out.println("Ingresa la cantidad que quieres cambiar");
                cantidad = sc.nextDouble();
                cambio = cantidad/19.2;
                System.out.println("tu cambios es :"+cambio+" Euros");
                break;
            case 3:
                System.out.println("Ingresa la cantidad que quieres cambiar");
                cantidad = sc.nextDouble();
                cambio =cantidad * 17.5;
                System.out.println("tu cambios es :"+cambio+" Pesos Mexicanos MXN)");
                break;
            case 4:
                System.out.println("Ingresa la cantidad que quieres cambiar");
                cantidad = sc.nextDouble();
                cambio =cantidad * 19.2;
                System.out.println("tu cambios es :"+cambio+" Pesos Mexicanos MXN)");
                break;
            case 5:
                System.out.println("Saliendo del sistema..........");
                break;
            default:
                System.out.println("Opcion no valida");
        }
        }while(opc !=5);
    }
}