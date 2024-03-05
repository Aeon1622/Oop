package Co.edu.sena.soy;

public class Data {
    //Area triangulo
    public double areaTriangulo(double numero1, double numero2){
        return (numero1 * numero2) / 2;
    };
    //sumar dos numeros
    public double sumardosnumero(double numero1, double numero2) {
        return (numero1 + numero2);
    };
    // potencia al cuadrado
    public double elevarnumeroalcuadrado(double numero1){
        return Math.pow(numero1,2);
    };
    //conversion euro
    public double conversionmoneda(double numero1) {
        return  (numero1 * 1.08);
    };
    // area y perimetro cuadrado
    public double areacuadrado(double numero1) {
        return Math.pow(numero1,2);
    }
    public double perimetrocuadrado(double numero1) {
        return numero1 * 4;
    }
    // area y volumen cilindro donde se multiplica 2 por pi (3.1415) por variable 1 por variable + variable 2
    // y volumen pi * elevado variable al cuadrado por variable 2
    public double areacilindro(double numero1, double numero3) {
        return ((2*Math.PI)*numero1)*(numero1+numero3);
    }
    public double volumencilindro(double numero1, double numero3) {
        return  Math.PI*Math.pow(numero1,2)*numero3;
    }
    // areacirculo multiplicando pi (3.1415)* radio * radio
    public double areacirculo(double numero1) {
        return  (Math.PI* (numero1*numero1));
    }
    //promedio de numeros
    public double promedionumeros(double numero1, double numero2, double numero3) {
        return  (numero1+numero2+numero3)/3;
    }

    }




