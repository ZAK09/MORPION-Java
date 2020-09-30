package morpion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        GameEngine new_game = new GameEngine();
        int n = new_game.StartGame();
        char[][] grille = new char[n][n];
        GraphicEngine.display(grille);

        Scanner myObj = new Scanner(System.in);
        System.out.println("Votre prenom: ");
        String name = myObj.nextLine();
        Gamer new_name = new Gamer(name);

        System.out.println("Bienvenue, " + new_name.ReturnName());
    }
}
