public class App {
    public static void main(String[] args) throws Exception {
        // User user = new User(); 
        // user.name = "Luigi";
        // user.birthDate = LocalDate.of(2002, 8, 20); // We could also use parse("2002-08-20")

        User user = new User("Luigi", "2002-08-20"); 
        
        Book book = new Book("The Lord of the Rings", "J.R.R. Tolkien", 200);
        AudioBook audioBook = new AudioBook("The Hobbit", "J.R.R. Tolkien", 9000);
        Ebook ebook = new Ebook("The Silmarillion", "J.R.R. Tolkien", 300, "PDF");

        user.borrow(book);
        user.borrow(audioBook);
        user.borrow(ebook);

        System.out.printf("%s was born on %s and he is now %d years old. \n", user.getName(), user.getBirthDate().toString(), user.getAge());
        System.out.println("%s borrowed %d book(s) : %s".formatted(user.getName(), user.borrowedBooks.size(), user.borrowedBooks.toString()));
    }
}
