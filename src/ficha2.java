import java.util.Scanner;

public class ficha2
{
    public static void ex2()
    {
        int numAlunos, notaPositiva;
        float nota, negTotal;

        notaPositiva = 0;
        negTotal = 0f;

        Scanner sc = new Scanner(System.in);

        numAlunos = sc.nextInt();

        if (numAlunos > 0)
        {
            for(int i = 0; i < numAlunos; i++)
            {
                nota = sc.nextFloat();

                if (nota >= 9.5f)
                {
                    notaPositiva++;
                }
                else
                {
                    negTotal += nota;
                }
            }

            System.out.println("Percentagem de positivas: "+(notaPositiva * 100) / numAlunos);

            if (numAlunos != notaPositiva)
            {
                System.out.println("Media de negativas: "+ negTotal / (numAlunos - notaPositiva));
            }
            else
            {
                System.out.println("Nao ha negativas");
            }
        }
        else
        {
            System.out.println("Numero invalido de alunos");
        }
    }

    public static void ex3()
    {
        int numero, menor, parNum, imparNum, parTotal;

        menor = 0;
        parNum = 0;
        imparNum = 0;
        numero = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 100 && (numero = sc.nextInt()) > 0; i++)
        {
            if (i == 0) menor = numero;

            if (numero % 2 == 0)
            {
                parNum++;
            }
            else
            {
                imparNum++;
            }
        }

        parTotal = parNum+imparNum;

        if (parNum > 0 || imparNum > 0)
        {
            System.out.println("Média dos pares: "+parTotal / parNum);
            System.out.println("Percentagem dos impares: "+(imparNum * 100) / (imparNum + parNum));
            System.out.println("O menor número foi : "+menor);
        }
    }

    public static void autEx2()
    {
        int minVal, maxVal;

        Scanner sc = new Scanner(System.in);

        minVal = sc.nextInt();
        maxVal = sc.nextInt();

        if (minVal >= maxVal)
        {
            System.out.println("Intervalo errado");
        }
        else
        {
            for (int i = 0; i < maxVal-1; i++)
            {
                if (i % 2 == 0 && i % 3 == 0)
                {
                    System.out.println("Numero: "+i);
                }
            }
        }
    }

    public static void autEx3()
    {
        int acc, num, menor, max;

        acc = 0;
        menor = 0;

        Scanner sc = new Scanner(System.in);

        max = sc.nextInt();

        while (acc <= max)
        {
            num = sc.nextInt();

            if (num < menor || menor == 0)
            {
                menor = num;
            }

            acc += num;
        }

        System.out.println("O menor numero foi "+menor);
    }

    public static void autEx4()
    {
        int funcionarios, numHoras;
        float salarioBase, accSalario, valor;
        final float PERCENTAGEM = 0.02f;

        funcionarios = 0;
        valor = 0;
        accSalario = 0;

        Scanner sc = new Scanner(System.in);

        numHoras = sc.nextInt();

        while(numHoras != -1)
        {
            salarioBase = sc.nextInt();

            if(salarioBase > 0 || numHoras >= 0)
            {
                valor = salarioBase + ((PERCENTAGEM * salarioBase) * numHoras);
                accSalario += valor;
                funcionarios++;
                System.out.println("Salario "+valor);
            }
            else
            {
                System.out.println("Salario ou horas extraordinarias invalidas");
            }

            numHoras = sc.nextInt();
        }

        if (funcionarios > 0)
        {
            System.out.println("A média de salarios para o mes atual é "+accSalario / funcionarios);
        }
    }

    public static void autEx6()
    {
        int a,b,c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Escreve o coeficiente A: ");
        a = sc.nextInt();

        System.out.print("Escreve o coeficiente B: ");
        b = sc.nextInt();

        System.out.print("Escreve o termo C: ");
        c = sc.nextInt();

        if (a == 0)
        {
            System.out.println("Nao e uma equaçao");
        }
        else
        {
            float val = (float) Math.sqrt(Math.pow(b,2)-4*(a*c));

            if (val < 0f)
            {
                System.out.println("Raiz imaginaria");
            }
            else if (val > 0f)
            {
                System.out.println("Duas raizes");
            }
            else
            {
                System.out.println("Raiz dupla");
            }
        }
    }
}