package proyecto_final;

import java.util.Scanner;

public class Proyecto_Final {

    public static Scanner bob = new Scanner(System.in);
    public static int op;
    public static double num1, n1, n2, num2, res, rsultado;

    public static int Menu_Principal() {
        System.out.println("*Menu Principal*");
        System.out.println("1-Aritmetico");
        System.out.println("2-Converciones");
        System.out.println("3-Salir");
        op = bob.nextInt();
        return op;
    }

    public static int Aritmetico() {
        System.out.println("**Menu Aritmeico**");
        System.out.println("1-Suma");
        System.out.println("2-Resta");
        System.out.println("3-Multiplicacion");
        System.out.println("4-divicion");
        System.out.println("5-Regresar");
        op = bob.nextInt();
        return op;
    }

    public static void Suma() {
        int n;
        double suma = 0;
        System.out.print("Cauntos numero deseas sumar? ");
        n = bob.nextInt();
        int[] arreglo = new int[n];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Capture un numero " + (i + 1) + ": ");
            arreglo[i] = bob.nextInt();
        }
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        System.out.print("El resultado de la suma es de " + suma + "\n");

    }

    public static void Resta() {
        int n;
        System.out.print("Cauntos numero deseas restar? ");
        n = bob.nextInt();
        int[] arreglo = new int[n];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Capture un numero " + (i + 1) + ": ");
            arreglo[i] = bob.nextInt();
        }
        int resultado = arreglo[0];

        for (int i = 1; i < arreglo.length; i++) {
            resultado -= arreglo[i];
        }

        System.out.println("El resultado de la resta es: " + resultado);

    }

    public static double Multiplicacion() {
        System.out.println("Multiplicacion");
        System.out.print("Captura un numero ");
        n1 = bob.nextDouble();
        System.out.print("Captura un segundo numero ");
        n2 = bob.nextDouble();
        res = n1 * n2;
        return res;
    }

    public static double divicion(double num1, double num2) {

        rsultado = num1 / num2;
        return rsultado;
    }

    public static int conversiones() {
        System.out.println("Menu de Conversiones");
        System.out.println("1-Longitud");
        System.out.println("2-Masa");
        System.out.println("3-Temperatura");
        System.out.println("4-Regresar");
        op = bob.nextInt();
        return op;
    }

    public static int longitud() {
        System.out.println("Menu de Longitud");
        System.out.println("1-kilometros");
        System.out.println("2-centimetros");
        System.out.println("3-millas");
        System.out.println("4-pies");
        System.out.println("5-pulgadas");
        System.out.println("6-regresar");
        op = bob.nextInt();
        return op;
    }

    public static void kilometros() {
        double km, cm = 1000, millas = 0.621371, pies = 3280.84, pulgadas = 39370.1;
        System.out.println("Captura los kilomentros");
        km = bob.nextDouble();
        System.out.println("Kilometros a centimentros " + km * cm);
        System.out.println("Kilometros a millas " + km * millas);
        System.out.println("Kilometros a pies " + km * pies);
        System.out.println("Kilometros a pulgadas " + km * pulgadas);
        System.out.println("*********************************");
    }

    public static void centimetros() {
        double cm, km = 0.00001, millas = 6.2137, pies = 3280.84, pulgadas = 39370.1;
        System.out.println("Captura los centimetros");
        cm = bob.nextDouble();
        System.out.println("Centimetros a kilometros " + cm * km);
        System.out.println("Centimetros a millas " + cm * millas);
        System.out.println("Centimetros a pies " + cm * pies);
        System.out.println("Centimetros a pulgadas " + cm * pulgadas);
        System.out.println("*********************************");
    }

    public static void millas() {
        double millas, km = 1.60934, cm = 160934, pies = 5280, pulgadas = 63360;
        System.out.println("Captura los millas");
        millas = bob.nextDouble();
        System.out.println("Millas a kilometros " + millas * km);
        System.out.println("Millas a centimetros " + cm * millas);
        System.out.println("Millas a pies " + millas * pies);
        System.out.println("Millas a pulgadas " + millas * pulgadas);
        System.out.println("*********************************");
    }

    public static void pies() {
        double pies, km = 0.0003048, cm = 30.48, millas = 0.000189394, pulgadas = 12;
        System.out.println("Captura los pies");
        pies = bob.nextDouble();
        System.out.println("Pies a kilometros " + pies * km);
        System.out.println("Pies a centimetros " + pies * cm);
        System.out.println("Pies a Millas " + pies * millas);
        System.out.println("Pies a pulgadas " + pies * pulgadas);
        System.out.println("*********************************");
    }

    public static void pulgadas() {
        double pulgadas;
        System.out.println("Captura los Pulgadas");
        pulgadas = bob.nextDouble();
        System.out.println("Pies a kilometros " + pulgadas / 39370);
        System.out.println("Pies a centimetros " + pulgadas * 2.54);
        System.out.println("Pies a Millas " + pulgadas * 63360);
        System.out.println("Pies a pulgadas " + pulgadas * 12);
        System.out.println("*********************************");
    }

    public static int masa() {
        System.out.println("Menu de masa");
        System.out.println("1-libra");
        System.out.println("2-kilogramos");
        System.out.println("3-onzas");
        System.out.println("4-gramos");
        System.out.println("5-regresar");
        op = bob.nextInt();
        return op;
    }

    public static void libras() {
        double libras, kilogramos = 0.453592, onzas = 16;
        System.out.println("Captura las libras");
        libras = bob.nextInt();
        System.out.println("libras a kilogramos " + libras * kilogramos);
        System.out.println("libras a onzas " + libras * onzas);
        System.out.println("libras a gramos " + libras * 453.6);
        System.out.println("*********************************");
    }

    public static void kilogramos() {
        double kilogramos, libra = 2.20462, onzas = 35.274, gramos = 1000;
        System.out.println("Captura los kilogramos");
        kilogramos = bob.nextDouble();
        System.out.println("kilogramos a libra " + kilogramos * libra);
        System.out.println("kilogramos a onzas " + kilogramos * onzas);
        System.out.println("kilogramos a gramos " + kilogramos * gramos);
        System.out.println("*********************************");
    }

    public static void onzas() {
        double onzas, kilogramos = 0.0283495, libras = 0.0625, gramos = 28.3495;
        System.out.println("Captura las libras");
        onzas = bob.nextDouble();
        System.out.println("kilogramos a libra " + onzas * libras);
        System.out.println("kilogramos a onzas " + onzas * kilogramos);
        System.out.println("kilogramos a gramos " + onzas * gramos);
        System.out.println("*********************************");
    }

    public static void gramos() {
        double gramos, kilogramos = 0.001, libras = 0.00220462, onzas = 0.035274;
        System.out.println("Captura las libras");
        gramos = bob.nextDouble();
        System.out.println("kilogramos a libra " + gramos * libras);
        System.out.println("kilogramos a onzas " + gramos * kilogramos);
        System.out.println("kilogramos a gramos " + gramos * onzas);
        System.out.println("*********************************");
    }

    public static int temperatura() {
        System.out.println("Menu Tempertura");
        System.out.println("1-Celsius");
        System.out.println("2-Fahrenheit");
        System.out.println("3-Kelvin");
        System.out.println("5-Regresa");
        op = bob.nextInt();
        return op;
    }

    public static void Celsius() {
        int c;
        System.out.println("Captura los grados celsius ");
        c = bob.nextInt();
        System.out.println("Celsius a Fahrenheit " + (((c * 9) / 5) + 32));
        System.out.println("Celsius a Kelvin " + c + 273.15);
    }

    public static void Fahrenheit() {
        int f;
        System.out.println("Captura los grados frhrenheit");
        f = bob.nextInt();
        System.out.println("Fahrenheit a Celsius " + ((f - 32) * 5) / 9);
        System.out.println("Fahrenheit a Kelvin " + (((f - 32) * 5) / 9) + 273.15);
    }

    public static void Kelvin() {
        int k;
        System.out.println("Captra los grados kelvin");
        k = bob.nextInt();
        System.out.println("Kelvin a Celsius " + (k - 273.15));
        System.out.println("Kelvin a Fahrenheit " + ((k - 273.15) * 9) / 5 + 32);
    }

    public static void main(String[] args) {

        do {
            Menu_Principal();
            switch (op) {
                case 1:
                    do {
                        Aritmetico();
                        switch (op) {
                            case 1:
                                Suma();
                                break;
                            case 2:
                                Resta();
                                break;
                            case 3:
                                System.out.println("El resultado de la operacion es " + Multiplicacion());
                                break;
                            case 4:
                                System.out.println("Divicion");
                                System.out.println("Captura un numero");
                                num1 = bob.nextInt();
                                System.out.println("Captura un segundo numero");
                                num2 = bob.nextInt();
                                System.out.println("El resultado es " + divicion(num1, num2));
                                break;
                            case 5:
                                System.out.println("********************");
                                break;
                            default:
                                System.out.println("Opcion no valida");
                        }

                    } while (op != 5);
                    break;
                case 2:

                    do {
                        conversiones();
                        switch (op) {
                            case 1:
                                do {
                                    longitud();
                                    switch (op) {
                                        case 1:

                                            kilometros();

                                            break;
                                        case 2:
                                            centimetros();
                                            break;
                                        case 3:
                                            millas();
                                            break;
                                        case 4:
                                            pies();
                                            break;
                                        case 5:
                                            pulgadas();
                                            break;
                                        case 6:
                                            System.out.println("********");
                                            break;
                                        default:
                                            System.out.println("Opcion no valida");
                                    }
                                } while (op != 6);
                                break;
                            case 2:
                                do {
                                    masa();
                                    switch (op) {
                                        case 1:
                                            libras();
                                            break;
                                        case 2:
                                            kilogramos();
                                            break;
                                        case 3:
                                            onzas();
                                            break;
                                        case 4:
                                            gramos();
                                            break;
                                        case 5:
                                            System.out.println("******************************");
                                            break;
                                    }
                                } while (op != 5);
                                break;
                            case 3:
                                do {
                                    temperatura();
                                    switch (op) {
                                        case 1:
                                            Celsius();
                                            break;
                                        case 2:
                                            Fahrenheit();
                                            break;
                                        case 3:
                                            Kelvin();
                                            break;
                                        case 5:
                                            System.out.println("******************************");
                                            break;
                                        default:
                                            System.out.println("Opcion no valida");
                                    }
                                } while (op != 5);
                                break;

                            case 4:
                                System.out.println("********************");
                                break;
                        }

                    } while (op != 4);
                    break;
                case 3:
                    System.out.println("Fin del Programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (op != 3);
    }

}
