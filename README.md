```
 __        __   _                            _          _____ _                 
 \ \      / /__| | ___ ___  _ __ ___   ___  | |_ ___   |  ___(_)_ __   ___ _ __ 
  \ \ /\ / / _ \ |/ __/ _ \| '_ ` _ \ / _ \ | __/ _ \  | |_  | | '_ \ / _ \ '__|
   \ V  V /  __/ | (_| (_) | | | | | |  __/ | || (_) | |  _| | | | | |  __/ |   
    \_/\_/ \___|_|\___\___/|_| |_| |_|\___|  \__\___/  |_|   |_|_| |_|\___|_|   
                                                                                 
```

# Wordle Clone in Java

## Description

This is a simple console-based Wordle clone implemented in Java. The game gives the player **5 chances** to guess a hidden word. After each guess, the game provides visual feedback using symbols:
- **✔**: Correct letter in the correct position.
- **❔**: Correct letter in the wrong position.
- **❌**: Incorrect letter.

The project is structured in a way that you can later integrate an API to fetch the word dynamically, replacing the hardcoded value.

## How to Play

1. **Objective:** Guess the hidden word within 5 attempts.
2. **Input:** Type your guess and press Enter.
3. **Feedback:**  
   - A **✔** symbol indicates that the letter is in the correct spot.  
   - A **❔** symbol means the letter is in the word but in a different position.  
   - A **❌** symbol shows that the letter is not in the word.
4. **Win Condition:** If you guess the word correctly, you will receive a congratulatory message.
5. **Restart:** After completing a round, you can choose to play again by entering `y` or quit with `n`.

## Getting Started

### Prerequisites

- **Java Development Kit (JDK)**: Ensure you have JDK 8 or above installed.
- A terminal or command prompt for running the game.

### Installation

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/yourusername/wordle-clone-java.git
   ```

2. **Navigate to the Project Directory:**

   ```bash
   cd wordle-clone-java
   ```

3. **Compile the Code:**

   ```bash
   javac Main.java Game.java
   ```

4. **Run the Game:**

   ```bash
   java Main
   ```

## Code Structure

- **Game.java**  
  Contains the `Game` class which holds the hidden word and its length.  
  Future plans include integrating an API to dynamically retrieve the word.

- **Main.java**  
  Manages the game loop and user interactions. It reads user input, checks the guess against the hidden word, and displays feedback using symbols.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
