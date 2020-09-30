package morpion;
import java.util.Scanner;

public class GameEngine{
    public static int StartGame(){

        System.out.println("Taille de la grille (MAX 4, MIN 3): ");
        Scanner myGrid = new Scanner(System.in);
        int n = myGrid.nextInt();

        if(n != 3 && n != 4){
            System.out.println("(MAX: 4, MIN: 3)");
            return StartGame();
        }

        return n;
    }
}
