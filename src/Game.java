public class Game {
    private int wordLength;
    private String word;

    Game(int wordLength, String word) {
        this.wordLength = wordLength;
        this.word = word; // api üzerinden bilgi almak şeklinde düzeltilecek
    }

    public int getWordLength() {
        return wordLength;
    }

    public String getWord() {
        return word;
    }
}
