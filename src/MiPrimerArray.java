import java.util.Random;

import static java.lang.Math.random;

public class MiPrimerArray {

    public static void main(String[] args) {

        int[] arrayInt;
        arrayInt = new int[3];

        arrayInt[0] = 1;
        arrayInt[1] = 2;


        for(int i = 0; i < arrayInt.length; i++){
            System.out.println(arrayInt[i]);
        }
        System.out.println();
        //Haz un array de 5 valores y súmalos.
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 3;
        numeros[2] = 5;
        numeros[3] = 2;
        numeros[4] = 6;
        int suma = 0;

        for(int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        System.out.println("La suma da: " + suma);
        System.out.println("La media es: "+ ((float)suma/numeros.length));

        System.out.println();
        //Haz una array que introduzca números aleatorios.
        int[] num = new int[5];
        for(int i = 0; i<num.length; i++){
            double randNum = Math.random()*10;
            num[i] = (int) randNum;
        }
        for(int i = 0; i < num.length; i++){
            System.out.println("Elemento "+i+": "+num[i]);
        }
        System.out.println(new Random().nextInt(11));
    }
}
