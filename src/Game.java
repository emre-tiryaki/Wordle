public class Game {
    private final int wordLength;
    private String word;
    DatabaseContact db;

    Game(int wordLength) {
        this.wordLength = wordLength;
        db = new DatabaseContact(wordLength);
        this.word = db.getWord();
    }
    
    public int checkWord(String word) {

        if(word.equalsIgnoreCase(this.getWord())){
            System.out.println("You guessed the word, Congratulations!");
            return 1;
        }

        for(int i = 0;i < this.wordLength; i++) {
            if(word.charAt(i) == this.word.charAt(i))
                System.out.print("✔");
            else if (this.getWord().indexOf(word.charAt(i)) != -1)
                System.out.print("❔");
            else
                System.out.print("❌");
        }
        System.out.println();
        return 0;
    }

    public int getWordLength() {
        return wordLength;
    }

    public String getWord() {
        return word;
    }

    public void setNewWord() {
        this.word = db.getWord();
    }
}