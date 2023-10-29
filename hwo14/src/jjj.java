import java.util.Scanner;
import java.util.ArrayList;
public class jjj {
    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<Integer> scores = new ArrayList<>();
    public String enterName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name (or press Enter to finish): ");
        String name = scanner.nextLine();
        return name;
    }
    public void enterScore(String name) {
        if (!name.isEmpty()) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the high score for " + name + ": ");
            int score = scanner.nextInt();
            names.add(name);
            scores.add(score);
        }
    }

    public void printScores() {
        System.out.println("High Scores:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + ": " + scores.get(i));
        }
    }

    public static void main(String[] args) {
        jjj game = new jjj();
        String name;

        while (!(name = game.enterName()).isEmpty()) {
            game.enterScore(name);
        }

        game.printScores();
    }
}
