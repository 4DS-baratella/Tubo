import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scelta = -1;
        boolean checkScelta;
        do{
            do{
                checkScelta = false;
                System.out.println("\n0. Per uscire dal programma;" +
                        "\n1. Per visualizzare la superificie del tubo;" +
                        "\n2. Per visualizzare il volume del tubo;" +
                        "\n\nInserire: ");
                try{
                    input = new Scanner(System.in);
                    scelta = input.nextInt();
                    checkScelta = true;
                }catch (InputMismatchException e){
                    System.out.println("\nLa scelta deve essere un numero intero.");
                }
            }while(!checkScelta);
        }while(scelta != 0);
    }
}