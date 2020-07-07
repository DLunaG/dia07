import java.util.Scanner;

public class SeriesNumeros {
//Pedir un nº y el programa debe de escribir una serie de lineas en las que empieza por 1 y va añadiendo un nº cada linea.
    //1
    //1 2
    //1 2 3
    //....
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nº para realizar tantas filas de ese nº: ");
        int num = sc.nextInt();


        for(int i = 1; i <= num; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //Ahora lo mismo pero al verrés
        System.out.println("===================================================");
        for(int i = num; i>0; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
