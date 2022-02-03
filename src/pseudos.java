import java.util.Scanner;

public class pseudos
{
    public static void relogio()
    {
        int segundos, h,m,s;

        Scanner sc = new Scanner(System.in);

        segundos = sc.nextInt();

        s = segundos%60;
        m = (segundos/60) % 60;
        h = (segundos/60/60);

        System.out.println(h+":"+m+":"+s);
    }

    public static void ex3()
    {
        int num1, num2, num3, n;

        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if (num1 < num2)
        {
            n = num1;
            num1 = num2;
            num2 = n;
        }
        if (num1 < num3)
        {
            n = num1;
            num1 = num3;
            num3 = n;
        }
        if (num2 < num3)
        {
            n = num2;
            num2 = num3;
            num3 = n;
        }
        if (num2 < num1)
        {
            n = num2;
            num2 = num1;
            num1 = n;
        }
        if (num3 < num1)
        {
            n = num3;
            num3 = num1;
            num1 = n;
        }
        if (num3 < num2)
        {
            n = num3;
            num3 = num2;
            num2 = n;
        }

        System.out.println("Numeros: "+num1+" < "+num2+" < "+num3);
    }

    public static void ex3_2()
    {
        int num1, num2, num3, n;

        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if (num1 > num2)
        {
            n = num1;
            num1 = num2;
            num2 = n;
        }
        if (num1 > num3)
        {
            n = num1;
            num1 = num3;
            num3 = n;
        }
        if (num2 > num3)
        {
            n = num2;
            num2 = num3;
            num3 = n;
        }

        System.out.println("Numeros: "+num1+" < "+num2+" < "+num3);
    }


}