package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        double x = 10.35784;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.println(x);
		/*Para deixar apenas duas casas decimais, para o double e acrescentar linha, ficará assim 10.35784
10,36*/
        System.out.printf("%.2f%n", x);

        //4 casas, ele arredonda 10,3578
        System.out.printf("%.4f%n", x);

        //Configurar teclado para o país US 10.3578
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);

        //Concatenar, juntar
        System.out.println("Resultado = " + x + " METROS");
        //Duas casas decimais arredondadas para double
        System.out.printf("Resultado = %.2f metros%n", x);

        // %s= String; %d= idade; %.2f= renda
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

    }

}
