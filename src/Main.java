import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scelta = -1;
        do{
            System.out.println("\n0. Per uscire dal programma;" +
                    "\n1. Per visualizzare la superificie del tubo;" +
                    "\n2. Per visualizzare il volume del tubo;" +
                    "\n\nInserire: ");

        }while(scelta != 0);
    }
}