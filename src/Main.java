import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scelta = -1;
        boolean checkScelta, checkRaggio;
        float raggio = 0;

        do{
            checkRaggio = false;
            try{
                System.out.println("\nInserire il raggio del tubo: ");
                input = new Scanner(System.in);
                raggio = input.nextFloat();
                checkRaggio = true;
            }catch (InputMismatchException e){
                System.out.println("\nIl raggio deve essere un numero.");
            }
            if(raggio < 1){
                System.out.println("\nIl raggio deve essere maggiore di 1.");
            }
        }while(raggio > 0 && checkRaggio);



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