package morpion;

public class GraphicEngine {
    public static void display(char[][] grille){

        for (int i = 0;i < grille.length; i++){
            for (int j = 0;j < grille[i].length;j++){
                grille[i][j] = 'O';
                System.out.print("[" + grille[i][j] + "]");
            }
            System.out.println();
        }
    }
}
