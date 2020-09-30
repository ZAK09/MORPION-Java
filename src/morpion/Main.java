package morpion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        GameEngine new_game = new GameEngine();
        int n = new_game.StartGame();
        char[][] grille = new char[n][n];
        GraphicEngine.display(grille);

        Scanner firstpl = new Scanner(System.in);
        System.out.println("1er Joueur: ");
        String joueur_1 = firstpl.nextLine();
        Gamer player1 = new Gamer(joueur_1);
        System.out.println("Bienvenue, " + player1.ReturnName());

        Scanner secondpl = new Scanner(System.in);
        System.out.println("2ème Joueur: ");
        String joueur_2 = secondpl.nextLine();
        Gamer player2 = new Gamer(joueur_2);
        System.out.println("Bienvenue, " + player2.ReturnName());

    }
}
