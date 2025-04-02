# Wordle Java Game

A simple, console-based Wordle game implemented in Java. The game dynamically fetches random words from an external API based on the specified word length, providing an interactive and enjoyable guessing experience. I made this just for fun its not a serious project.

---

## Project Structure

- **Main.java:**
  - Handles the game's main loop, user input validation, and gameplay flow.
  - Prompts the user to input the word length (between 2 and 15 characters).
  - Provides 5 attempts for the user to guess the word, displaying intuitive symbols as feedback.

- **Game.java:**
  - Manages core game logic including word checking and user feedback.
  - Interacts with `DatabaseContact` to obtain words.

- **DatabaseContact.java:**
  - Connects to the [Random Word API](https://random-word-api.herokuapp.com/) to retrieve random words of a specified length.
  - Handles HTTP requests and responses, ensuring reliable word fetching.

---

## How to Play

1. **Start the Game:** Run the `Main` class.
2. **Choose Word Length:** Enter a word length between 2 and 15.
3. **Guess the Word:** You have 5 attempts.
   - **✔** indicates the letter is in the correct position.
   - **❔** indicates the letter exists but in the wrong position.
   - **❌** indicates the letter does not exist in the word.
4. **Play Again:** After each round, choose whether to play another round.

---

## Installation & Usage

### Clone Repository
```bash
git clone https://github.com/emre-tiryaki/Wordle.git
cd Wordle
```

### Compile & Run
```bash
javac Main.java Game.java DatabaseContact.java
java Main
```

---

## Requirements

- Java Development Kit (JDK 8+)
- Internet Connection (required for API access)

---

## License

This project is open-source and available under the MIT License.

Enjoy playing and happy coding!

