import java.util.Scanner;

public class ficha1
{
    public static void ex1()
    {
        int num, dig1, dig2, dig3;

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        if (num < 100 || num > 999) {
            System.out.println("Numero nao tem 3 digitos");
        } else {
            dig3 = num & 10;
            dig2 = (num / 10) & 10;
            dig1 = (num / 100) & 10;

            System.out.println(dig1 + " " + dig2 + " " + dig3);

            if (num % 2 == 0) {
                System.out.println("O numero é par.");
            } else {
                System.out.println("O numero é impar");
            }
        }
    }

    public static void ex2()
    {
        /*Elabore uma aplicação para apoio à CP que permita indicar a hora de chegada de um
    determinado comboio (horas e minutos), conhecida a hora de partida (horas e minutos) e a
    duração da viagem (horas e minutos). Deve ainda ser indicado se o comboio chega no próprio
    dia ou no dia seguinte, considerando que a duração da viagem nunca é superior a 24 horas*/

        int horaChegada, minutoChegado;
        int durationHoras, durationMinutos;
        int partidaHoras, partidaMinutos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Hora partida: ");
        partidaHoras = sc.nextInt();
        System.out.println("Minuto partida: ");
        partidaMinutos = sc.nextInt();

        System.out.println("Duraçao horas: ");
        durationHoras = sc.nextInt();
        System.out.println("Duraçao minutos: ");
        durationMinutos = sc.nextInt();

        horaChegada = (partidaHoras+durationHoras)%24;
        minutoChegado = (partidaMinutos+durationMinutos);

        if (minutoChegado >= 60)
        {
            horaChegada++;
        }

        minutoChegado = (partidaMinutos+durationMinutos)%60;

        System.out.println("Tempo de chegada: "+horaChegada+":"+minutoChegado);

        if (horaChegada == partidaHoras || horaChegada > partidaHoras)
        {
            System.out.println("O comboio chega no mesmo dia");
        }
        else
        {
            System.out.println("O comboio chega no dia seguinte.");
        }
    }

    public static void autEx1()
    {
        final int DIAS = 5;

        float finalValue = 0f;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o valor dos "+DIAS+" dias em milhas");

        for(int i = 0; i < DIAS; i++)
        {
            finalValue += sc.nextFloat() * 1.609f;
        }

        finalValue /= DIAS;

        System.out.println("A média em km é de "+finalValue);
    }

    public static void autEx2()
    {
        int x1,x2,y1,y2;
        double d = 0d;

        Scanner sc = new Scanner(System.in);

        System.out.print("X1:");
        x1 = sc.nextInt();
        System.out.print("Y1");
        y1 = sc.nextInt();
        System.out.print("X2:");
        x2 = sc.nextInt();
        System.out.print("Y2");
        y2 = sc.nextInt();

        d = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

        System.out.println("Distancia é "+d);
    }

    public static void autEx3()
    {
        double perimetro, raio, area;

        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva o perimetro: ");

        perimetro = sc.nextDouble();

        raio = perimetro / (Math.PI * 2);

        area = Math.PI * Math.pow(raio,2);

        System.out.println("A área e de "+area);
    }

    public static void autEx4()
    {
        double x = 0;

        Scanner sc = new Scanner(System.in);

        x = sc.nextDouble();

        if (x < 0)
        {
            System.out.println("f(x): "+x);
        }
        else if (x == 0)
        {
            System.out.println("f(x): "+x);
        }
        else
        {
            x = Math.pow(x,2)-2*x;
            System.out.println("f(x): "+x);
        }
    }

    public static void autEx5()
    {
        int x,y;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        if (x % y == 0)
        {
            System.out.println("X e multiplo de Y");
        }
        else if (y % x == 0)
        {
            System.out.println("Y e multiplo de X");
        }
        else
        {
            System.out.println("X nao e multplo de Y");
        }
    }

    public static void autEx6()
    {
        int dia, mes, ano;

        int val = 0;

        int dias = 0;

        int[] meses = {31,29,31,30,31,30,31,31,30,31,30,31};

        Scanner sc = new Scanner(System.in);

        System.out.println("Ano");
        ano = sc.nextInt();

        System.out.println("Mes do ano");
        mes = sc.nextInt();

        System.out.println("Dia do mes");
        dia = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0)
        {
            dias = 366;
        }
        else
        {
            dias = 365;
        }

        for(int i = 0; i < mes; i++)
        {
            if (i == mes-1)
            {
                val -= meses[i]-dia;
            }
            val += meses[i];
        }

        System.out.println("Faltam "+(dias-val)+" dias ate ao fim do ano");
    }

}
