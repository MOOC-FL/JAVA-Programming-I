public class UserInterface {
        private WordSet wordSet;

    private Scanner scanner;
        private ArrayList<String> words;

   // add scanner 
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.words = new ArrayList<String>();
                this.wordSet = wordSet;

    }

    public void start() {
        // do something
         while (true) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if (*stop condition*alreadyEntered(word)) {
                break;
            }
                 // adding the word to the list of previous words
    this.words.add(word);


        }

        System.out.println("You gave the same word twice!");
    }
      public boolean alreadyEntered(String word) {
        // do something here
 if (word.equals("end")) {
        return true;
    }
        return false;
    }
    
}
