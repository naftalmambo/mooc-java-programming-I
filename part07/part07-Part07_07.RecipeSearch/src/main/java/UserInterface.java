import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipes;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.recipes = new ArrayList<>();
    }

    public void start() {
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        System.out.println("");

        readRecipesFromFile(fileName);

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            processCommand(command);
            System.out.println("");
        }
    }

    private void readRecipesFromFile(String fileName) {
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                if (name.isEmpty()) {
                    continue;
                }

                int cookingTime = Integer.valueOf(fileScanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();

                while (fileScanner.hasNextLine()) {
                    String ingredient = fileScanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }

                recipes.add(new Recipe(name, cookingTime, ingredients));
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private void processCommand(String command) {
        if (command.equals("list")) {
            System.out.println("\nRecipes:");
            for (Recipe recipe : recipes) {
                System.out.println(recipe);
            }
        } else if (command.equals("find name")) {
            System.out.print("Searched word: ");
            String searchedWord = scanner.nextLine();
            System.out.println("\nRecipes:");
            for (Recipe recipe : recipes) {
                if (recipe.getName().contains(searchedWord)) {
                    System.out.println(recipe);
                }
            }
        } else if (command.equals("find cooking time")) {
            System.out.print("Max cooking time: ");
            int maxTime = Integer.valueOf(scanner.nextLine());
            System.out.println("\nRecipes:");
            for (Recipe recipe : recipes) {
                if (recipe.getCookingTime() <= maxTime) {
                    System.out.println(recipe);
                }
            }
        } else if (command.equals("find ingredient")) {
            System.out.print("Ingredient: ");
            String targetIngredient = scanner.nextLine();
            System.out.println("\nRecipes:");
            for (Recipe recipe : recipes) {
                if (recipe.getIngredients().contains(targetIngredient)) {
                    System.out.println(recipe);
                }
            }
        }
    }
}
