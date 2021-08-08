//KAROL EUNICE CASTILLO RAMIREZ 0909-20-19052 PARCIAL I PROGRAII

package com.company;
import java.util.Scanner;
import  sun.font.TrueTypeFont;
public class MenuPrincipal {

    public static void menu(){
        int opcion= 0;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("\nPARCIAL I DE PROGRAMACION II\n");
            System.out.println("\nCALCULADORA\n");
            System.out.println("OPERACIONES BASICAS CON DOS DATOS: \n" +
                    " 1.Sumar\n" +
                    " 2.Restar\n" +
                    " 3.Multiplicar\n" +
                    " 4.Dividir\n" );
            System.out.println( "OPERACIONES AVANZADAS: \n" +
                    " 5.Raiz Cuadrada\n" +
                    " 6.Potencia\n" +
                    " 7.Seno\n" +
                    " 8.Coseno\n" +
                    " 9.Tangente\n" );
            System.out.println( "Precione el 0 para abandonar el programa");
            System.out.println("Inserte  su opcion : ");
            opcion = in.nextInt();

            switch(opcion){
                case 1 :
                    FuncionBasica.suma();
                    if(VolverMenu.backMenu()){
                        break;
                    } else {
                        opcion = 0;
                        break;
                    }

                case 2 :
                    FuncionBasica.resta();
                    if(VolverMenu.backMenu()){
                        break;
                    } else {
                        opcion = 0;
                        break;
                    }
                case 3 :
                    FuncionBasica.multiplicacion();
                    if(VolverMenu.backMenu()){
                        break;
                    } else {
                        opcion = 0;
                        break;
                    }
                case 4 :
                    FuncionBasica.division();
                    if(VolverMenu.backMenu()){
                        break;
                    } else {
                        opcion = 0;
                        break;
                    }
                case 5 :
                    FuncionAvanzada.RaizCuadrada();
                    if(VolverMenu.backMenu()){
                        break;
                    } else {
                        opcion = 0;
                        break;
                    }
                case 6 :
                    FuncionAvanzada.Potencia();
                    if(VolverMenu.backMenu()){
                        break;
                    } else {
                        opcion = 0;
                        break;
                    }
                case 7 :
                    FuncionAvanzada.Seno();
                    if(VolverMenu.backMenu()){
                        break;
                    } else {
                        opcion = 0;
                        break;
                    }
                case 8 :
                    FuncionAvanzada.Coseno();
                    if (VolverMenu.backMenu()){
                        break;
                    } else {
                       opcion = 0;
                        break;
                    }
                case 9 :
                    FuncionAvanzada.Tangente();
                    if(VolverMenu.backMenu()){
                        break;
                    } else {
                        opcion = 0;
                        break;
                    }
                case 0 : System.out.println("FINALIZAR SISTEMA...................."); break;
                default: System.out.println("ERROR.....................INSERTE UNA OPCION VALIDA");

            }
        }while (opcion!=0);
    }
}