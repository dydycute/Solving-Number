package Controller;

import java.util.Scanner;
import model.Algorithm;
import view.Menu;

public class Main extends Menu<String> {

    private final Algorithm algorithm;

    public Main(Algorithm algorithm) {
        super("Students Management", new String[]{"calculateSuperlativeEquation",
            "calculateQuadraticEquation",
            "Exit"
            }
        );
        this.algorithm = algorithm;
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1 ->
                algorithm.calculateSuperlativeEquation();
            case 2 ->
                algorithm.calculateQuadraticEquation();
            case 3 ->
                System.exit(0);
            default ->
                System.out.println("Invalid selection!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Algorithm algorithm = new Algorithm(scanner);
        Main mainMenu = new Main(algorithm);
        mainMenu.run();
    }
}
