package Co.edu.sena.soy;


import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner scr = new Scanner(System.in);

        double numero1 = 0;
        double numero2 = 0;
        double numero3 = 0;

        int opcion;
        Data data = new Data();

        System.out.println("miscelanea de ejercicios oop java");
        System.out.println("-----------");
        System.out.println("1. operadores");
        System.out.println("2 condicionales");
        System.out.println("3 ciclos");
        System.out.println("4 arreglos");
        System.out.println("99 salir");
        System.out.println(" Ingrese una opcion");

        opcion = scr.nextInt();
        switch (opcion) {
            case 1: {
                //submenu operadores
                System.out.println("categoria operadores");
                System.out.println("1 calcular area triangulo");
                System.out.println(" ");
                System.out.println("2 sumar dos numeros");
                System.out.println(" ");
                System.out.println("3 elevar el numero al cuadrado");
                System.out.println(" ");
                System.out.println("4 conversion de moneda");
                System.out.println(" ");
                System.out.println("5 area y perimetro cuadrado");
                System.out.println(" ");
                System.out.println("6 area y volumen cilindro");
                System.out.println(" ");
                System.out.println("7 area de un circulo");
                System.out.println(" ");
                System.out.println("8 promedio");
                System.out.println(" ");
                System.out.println(" Ingrese una opcion");
                opcion = scr.nextInt();
                switch (opcion) {
                    case 1: {
                        System.out.println("------------");
                        System.out.println(" ");
                        System.out.println("1 calcular area  triangulo");
                        System.out.println("ingresa la base");
                        numero1 = scr.nextDouble();
                        System.out.println("ingresa la altura");
                        numero2= scr.nextDouble();
                        System.out.println("el area del triangulo es:" + data.areaTriangulo(numero1, numero2));
                        System.out.println(" ");
                    };
                    break;
                    case 2: {
                        System.out.println("---------------------");
                        System.out.println("2 sumar dos numeros");
                        System.out.println("ingresa primer numero");
                        numero1 = scr.nextDouble();
                        System.out.println("ingresa segundo numero");
                        numero2 = scr.nextDouble();
                        System.out.println("la suma de los numeros es:" + data.sumardosnumero(numero1, numero2));
                        System.out.println(" ");
                    };
                    break;
                    case 3: {
                        System.out.println("---------------------------");
                        System.out.println("3 elevar el numero al cuadrado");
                        System.out.println("ingresa numero");
                        numero1 = scr.nextDouble();
                        System.out.println("La potencia al cuadrado es:" + data.elevarnumeroalcuadrado(numero1));
                        System.out.println(" ");
                    };
                    break;
                    case 4: {
                        System.out.println("-----------------------------------------");
                        System.out.println("4 conversion de moneda");
                        System.out.println("ingresa numero");
                        numero1 = scr.nextDouble();
                        System.out.println("Euro a dolar es:" + data.conversionmoneda(numero1));
                        System.out.println(" ");
                    };
                    break;
                    case 5: {
                        System.out.println("----------------------------------------");
                        System.out.println("5 area y perimetro cuadrado");
                        System.out.println("ingresa lado del cuadrado en cm");
                        numero1 = scr.nextDouble();
                        System.out.println(" ");
                        System.out.println("El area del cuadrado es" + data.areacuadrado(numero1) + " cm2 ");
                        System.out.println(" ");
                        System.out.println("El perimetro del cuadrado es" + data.perimetrocuadrado(numero1) + " cm ");
                    };
                    break;
                    case 6: {
                        System.out.println("-----------------------------------------");
                        System.out.println("6 area y volumen cilindro");
                        System.out.println("ingrese el radio del cilindro");
                        numero1 = scr.nextDouble();
                        System.out.println("ingrese la altura del cilindro");
                        numero3 = scr.nextDouble();
                        System.out.println(" ");
                        System.out.println("El area del cilindro es:" + data.areacilindro(numero1, numero3) + " cm2 ");
                        System.out.println(" ");
                        System.out.println("El volumen del cilindro es:" + data.volumencilindro(numero1, numero3) + " cm ");
                        System.out.println(" ");
                    };
                    break;
                    case 7: {
                        System.out.println("-----------------------------------------");
                        System.out.println("7 area de un circulo");
                        System.out.println("Ingrese el radio");
                        numero1 = scr.nextDouble();
                        System.out.println("El area del circulo es" + data.areacirculo(numero1) + " cm2 ");
                        System.out.println(" ");
                    };
                    break;
                    case 8: {
                        System.out.println("-----------------------------------------");
                        System.out.println("8 Promedio");
                        System.out.println("Ingrese 1er numero");
                        numero1 = scr.nextDouble();
                        System.out.println("Ingrese 2do numero");
                        numero2 = scr.nextDouble();
                        System.out.println("Ingrese 3er numero");
                        numero3 = scr.nextDouble();
                        System.out.println("El promedio de los números es" + data.promedionumeros(numero1, numero2, numero3));
                    };
                    break;
                };
                break;
            }
            case 2: {}; break;
            case 3: {}; break;
            case 4: {}; break;
            case 99: {}; break;
            default: System.out.println("No valido");
            break;
        };




















    }
}
