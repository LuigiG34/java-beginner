import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    private String name;
    private LocalDate birthDate;
    public ArrayList<Book> borrowedBooks = new ArrayList<>();


    User(String name, String birthDate) {
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate);
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public void borrow(Book book) {
        this.borrowedBooks.add(book);
    }

    public int getAge() {
        int age = Period.between(this.birthDate, LocalDate.now()).getYears();
        return age;
    }
}
