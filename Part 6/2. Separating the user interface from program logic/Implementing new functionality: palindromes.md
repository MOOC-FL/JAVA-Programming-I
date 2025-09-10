#### Implementing new functionality: palindromes
- In the future, we might want to augment the program so that the class 'WordSet' offers some new functionalities. If, for example, we wanted to know how many of the entered words were palindromes, we could add a method called 'palindromes' into the program.
```java
public void start() {

    while (true) {
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        if (this.wordSet.contains(word)) {
            break;
        }

        this.wordSet.add(word);
    }

    System.out.println("You gave the same word twice!");
    System.out.println(this.wordSet.palindromes() + " of the words were palindromes.");
}
```
- The user interface remains clean, because counting the palindromes is done inside the 'WordSet' object. The following is an example implementation of the method.
```java
public void start() {

    while (true) {
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        if (this.wordSet.contains(word)) {
            break;
        }

        this.wordSet.add(word);
    }

    System.out.println("You gave the same word twice!");
    System.out.println(this.wordSet.palindromes() + " of the words were palindromes.");
}
```
- The user interface remains clean, because counting the palindromes is done inside the 'WordSet' object. The following is an example implementation of the method.
```java
import java.util.ArrayList;

public class WordSet {
    private ArrayList<String> words;

    public WordSet() {
        this.words = new ArrayList<>();
    }

    public boolean contains(String word) {
        return this.words.contains(word);
    }

    public void add(String word) {
        this.words.add(word);
    }

    public int palindromes() {
        int count = 0;

        for (String word: this.words) {
            if (isPalindrome(word)) {
                count++;
            }
        }

        return count;
    }

    public boolean isPalindrome(String word) {
        int end = word.length() - 1;

        int i = 0;
        while (i < word.length() / 2) {
            // method charAt returns the character at given index
            // as a simple variable
            if(word.charAt(i) != word.charAt(end - i)) {
                return false;
            }

            i++;
        }

        return true;
    }
}
```
- The method 'palindromes' uses the helper method 'isPalindrome' to check whether the word that's given to it as a parameter is, in fact, a palindrome.
> Recycling
> When concepts have been separated into different classes in the code, recycling them and reusing them in other projects becomes easy. For example, the class 'WordSet' could be used in a graphical user interface, and it could also be part of a mobile phone application. In addition, testing the program is much easier when it has been divided into several concepts, each of which has its own separate logic and can function alone as a unit.
