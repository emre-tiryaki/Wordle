import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = 0;
        Game game;
        boolean isRunning = true;
        String guess = "";
        char again;

        System.out.print("word length: ");
        while (length < 2 || length > 15) {
            length = sc.nextInt();
            if (length < 2 || length > 15)
                System.out.println("Invalid word length, please try again");
        }
        game = new Game(length);

        while (isRunning) {
            if(game.getWord() == null)
                break;

            System.out.println("\nYou have 5 chances to guess the word");

            for(int i = 0;i < game.getWordLength(); i++) {
                while (guess.length() != length){
                    System.out.print("Word: ");
                    guess = sc.nextLine();
                    if (guess.length() != length)
                        System.out.println("please enter a " + length + " characters long word!!!");
                }

                if(game.checkWord(guess) == 1)
                    break;

                guess = "";
            }
            System.out.println("the word was: " + game.getWord());


            System.out.println("Again?(y/n)");
            again = sc.next().charAt(0);
            if(Character.toLowerCase(again) == 'y'){
                game.setNewWord();
                guess = "";
                sc.nextLine();
            }
            if(Character.toLowerCase(again) == 'n')
                isRunning = false;
        }
        sc.close();
        System.out.println("Thanks for playing!");
    }
}