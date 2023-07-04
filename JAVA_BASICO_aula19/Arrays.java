package com.loiane.cursojava.aula19;

public class Arrays {
    public static void main(String[] args) {

        // cada variável do array recebe uma temperatura, referente a cada dia do ano

        double[] temperaturasAno = new double[365];

        temperaturasAno[0] = 35;
        temperaturasAno[1] = 33;
        temperaturasAno[2] = 31.2;
        temperaturasAno[3] = 28;
        temperaturasAno[4] = 30.5;

        System.out.println("Temperatura do 1º dia do ano foi: " + temperaturasAno[0]);

        // mesmo programa, mas utilizando um loop para imprimir a temperatura de 5 dias do ano

        double[] temperaturas5Dias = new double[5];

        temperaturas5Dias[0] = 35;
        temperaturas5Dias[1] = 33;
        temperaturas5Dias[2] = 31.2;
        temperaturas5Dias[3] = 28;
        temperaturas5Dias[4] = 30.5;

        System.out.println("- - - - - - - - - - -");
        for (int i = 0 ; i < temperaturas5Dias.length ; i++) {
            System.out.println("\nTemperatura do " + (i + 1) + " dia: " + temperaturas5Dias[i]);
        }

        // outra forma com um For "melhorado", obs.: nesse caso, não é possível declarar um contador junto com o For
        int i2 = 0;
        System.out.println("- - - - - - - - - - -");
        for (double temp : temperaturas5Dias) {
            i2++;
            System.out.println("\nTemperatura do " + i2 + " dia: " + temp);
        }

    }
}
