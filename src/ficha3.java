import java.util.Scanner;

public class ficha3 {
    public static void ex1() {
        int num, sum;

        sum = 0;

        System.out.println("Escreve um numero");

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        while (num > 0) {

            while (num != 0) {
                int ch = num % 10;
                if (ch % 2 == 0) sum += ch;
                num /= 10;
            }

            System.out.println("Soma dos pares: " + sum);

            num = sc.nextInt();
        }
    }

    public static void ex3() {
        int num, num1, dig;

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        num1 = 0;

        if (num % 2 == 0 && num % 3 != 0) {
            while (num != 0) {
                dig = num % 10;
                num1 = num1 * 10 + dig;
                num /= 10;
            }
        }

        System.out.println("Resultado: " + num1);
    }

    public static void ex5() {
        int num = 0;

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        for (int i = 1; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " e primo");
                break;
            } else {
                System.out.println(num + " nao e primo");
                break;
            }
        }
    }

    public static void autEx1() {
        int num;

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        while (num > 999 && num < 10000 && num % 2 == 0) {
            for (int i = 0; i < num; i += 7) {
                System.out.println("Encontrou " + i);
            }

            num = sc.nextInt();
        }
    }

    public static void autEx2() {
        double deposito, taxa, valor;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Valor para depositar: ");
            deposito = sc.nextDouble();
        } while (deposito <= 0);

        valor = deposito;

        for (int i = 0; i < 12; i++) {
            do {
                System.out.print("Taxa para o mes " + (i + 1) + ": ");
                taxa = sc.nextDouble();
            } while (taxa <= 0);

            valor = valor + (deposito * (taxa / 100));
        }

        System.out.println("Valor inicial: " + deposito + " - valor final - " + valor);
    }

    public static void autEx3() {
        int altura1, altura2, cresc1, cresc2;
        int anos = 0;

        Scanner sc = new Scanner(System.in);

        altura1 = sc.nextInt();
        cresc1 = sc.nextInt();
        altura2 = sc.nextInt();
        cresc2 = sc.nextInt();

        if (cresc1 < cresc2 || cresc1 == cresc2) {
            System.out.println("Nunca vai chegar");
        } else {
            if (altura1 > altura2 || altura1 == altura2) {
                System.out.println("Alturas invalidas");
            } else {
                while (altura1 < altura2) {
                    anos++;
                    altura1 += cresc1;
                    altura2 += cresc2;
                    System.out.println("Ano " + anos + " - " + altura1 + "," + altura2);
                }

                System.out.println("Demora " + anos + " anos");
            }

            //anos = (float)(altura2-altura1) / (cresc1-cresc2);
        }
    }

    public static void autEx4() {
        int x1, x2, desc, num, max;
        boolean ant = false;

        x1 = 0;
        x2 = 0;
        desc = 0;

        max = 0;

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        while (num != 0) {
            if (ant) {
                x1 = num % 10;
                if (x2 > x1) {
                    desc++;
                } else {
                    desc = 0;
                }
            } else {
                x2 = num % 10;

                if (x1 > x2) {
                    desc++;
                } else {
                    desc = 0;
                }
            }

            if (max < desc) max = desc;

            ant = !ant;
            num /= 10;
        }

        System.out.println("Sequencia: " + (max + 1));
    }

    public static void autEx5() {
        int num = 0;

        Scanner sc = new Scanner(System.in);

        do {
            num = sc.nextInt();
        } while (num <= 0 || num > 20);


        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }

        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
