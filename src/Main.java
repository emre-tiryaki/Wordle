import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game game = new Game(5, "chase");
        boolean isRunning = true;
        String guess = "";
        char again;
        while (isRunning) {
            System.out.println("You have 5 chances to guess the word");

            for(int i = 0;i < game.getWordLength(); i++) {
                guess = sc.nextLine();
                for(int j = 0;j < game.getWordLength(); j++) {
                    if(guess.charAt(j) == game.getWord().charAt(j))
                        System.out.print("✔");
                    else if (game.getWord().indexOf(guess.charAt(j)) != -1)
                        System.out.print("❔");
                    else
                        System.out.print("❌");
                }
                System.out.println();
                if(guess.equalsIgnoreCase(game.getWord().toLowerCase())){
                    System.out.println("You guessed the word, Congratulations!");
                    break;
                }
            }

            System.out.println("Again?(y/n)");
            again = sc.next().charAt(0);
            if(Character.toLowerCase(again) == 'y')
                isRunning = false;
        }
        System.out.println("Thanks for playing!");
    }
}