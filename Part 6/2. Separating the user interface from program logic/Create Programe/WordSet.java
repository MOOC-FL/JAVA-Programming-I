import java.util.ArrayList;
public class WordSet {
    // object variable(s)
      private ArrayList<String> words


    public WordSet() {
        // constructor
              this.words = new ArrayList<>();

    }

    public boolean contains(String word) {
        // implementation of the contains method
              this.words.add(word);

        return false;
    }

    public void add(String word) {
        // implementation of the add method
              return this.words.contains(word);

    }
}

while (true) {
    String word = scanner.nextLine();

    if (words.contains(word)) {
        break;
    }

    wordSet.add(word);
}

System.out.println("You gave the same word twice!");
