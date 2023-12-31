import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scelta = -1;
        boolean checkScelta, checkRaggio, checkAltezza;
        float raggio = 0, altezza = 0;

        do{
            checkRaggio = false;
            checkAltezza = false;
            try{
                System.out.println("\nInserire il raggio del tubo: ");
                input = new Scanner(System.in);
                raggio = input.nextFloat();
                checkRaggio = true;

                System.out.println("\nInserire l'altezza del tubo: ");
                input = new Scanner(System.in);
                altezza = input.nextFloat();
                checkAltezza = true;
            }catch (InputMismatchException e){
                System.out.println("\nIl raggio e l'altezza devono essere un numero.");
            }
            if(raggio < 1 || altezza < 1){
                System.out.println("\nIl raggio e l'altezza devono essere maggiore di 1.");
            }
        }while(raggio < 0 || altezza < 0 || !checkRaggio || !checkAltezza);

        Tubo tubo = new Tubo(raggio, altezza);

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

            switch (scelta){
                case 0:
                    break;

                case 1:
                    System.out.println("\nLa superficie del tubo è: " + tubo.getSuperficie());
                    break;

                case 2:
                    System.out.println("\nIl volume del tubo è: " + tubo.getVolume());
                    break;

                default:
                    System.out.println("\nLa scelta fatta non corrisponde a nessuna opzione del menu.");
                    break;
            }
        }while(scelta != 0);
    }
}