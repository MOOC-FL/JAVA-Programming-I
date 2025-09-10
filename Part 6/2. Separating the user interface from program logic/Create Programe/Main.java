public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    UserInterface userInterface = new UserInterface(scanner);
    userInterface.start();
    for (String word: this.words) {
    System.out.println(word);
}
}
// Starting the program is now done as follows:

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    WordSet set = new WordSet();

    UserInterface userInterface = new UserInterface(set, scanner);
    userInterface.start();
}

