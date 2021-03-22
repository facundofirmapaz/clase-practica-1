package demo;

import java.util.Scanner;

public class Main
{

    public static boolean esPrimo(int x)
    {
        int cont = 0;
        for (int i = 1; i <= x; i++)
        {
            if ((x % i) == 0)
                cont++;
        }

        return cont <= 2;
    }

    public static void ejercicioUno()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++)
        {
            System.out.println(i*2);
        }

        scanner.close();
    }

    public static void ejercicioDos()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");
        int n = scanner.nextInt();

        System.out.println("Ingrese el otro numero: ");
        int m = scanner.nextInt();

        for (int i = 1; i <= n; i++)
        {
            System.out.println(i*m);
        }

        scanner.close();
    }

    public static void ejercicioTres()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");
        int n = scanner.nextInt();

        if (esPrimo(n))
            System.out.println("Es primo");
        else
            System.out.println("No es primo");

        scanner.close();
    }

    public static void ejercicioCuatro()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");
        int n = scanner.nextInt();

        int c = 1;
        int i = 1;
        while (c <= n)
        {
            if (esPrimo(i)) {
                System.out.println(i);
                c++;
            }
            i++;
        }

        scanner.close();
    }

    public static void ejercicioCinco()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero n: ");
        int n = scanner.nextInt();

        System.out.println("Ingrese el numero m: ");
        int m = scanner.nextInt();

        System.out.println("Ingrese el numero d: ");
        int d = scanner.nextInt();

        int c = 1;
        int i = 1;
        while (c <= n)
        {
            if (cantidadDigitosD(i, d) >= m) {
                System.out.println(i);
                c++;
            }
            i++;
        }

        scanner.close();

    }

    public static int cantidadDigitosD(int num, int d)
    {
        String numero = String.valueOf(num);

        int cant = 0;

        for (int i = 0; i < numero.length(); i++)
        {
            if (Integer.parseInt(String.valueOf(numero.charAt(i))) == d)
                cant++;
        }

        return cant;
    }

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero de ejercicio (1 al 5): ");
        int n = scanner.nextInt();

        switch (n)
        {
            case 1:
                ejercicioUno();
                break;
            case 2:
                ejercicioDos();
                break;
            case 3:
                ejercicioTres();
                break;
            case 4:
                ejercicioCuatro();
                break;
            case 5:
                ejercicioCinco();
                break;
        }

        scanner.close();
    }
}
