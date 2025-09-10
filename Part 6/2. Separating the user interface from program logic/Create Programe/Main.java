public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    UserInterface userInterface = new UserInterface(scanner);
    userInterface.start();
    for (String word: this.words) {
    System.out.println(word);
}
}

