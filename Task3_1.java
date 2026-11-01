public class Task3_1 {
    public static void main(String[] args) {
        Author author = new Author("Лев Толстой", 1828);
        Book book = new Book("Война и мир", author);
        book.displayBookInfo();
    }
}

class Author {
    private String name;
    private int birthYear;

    public Author(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getBirthYear() { return birthYear; }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }
}

class Book {
    private String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public void displayBookInfo() {
        System.out.println("Книга: " + title);
        System.out.println("Автор: " + author.getName() + " (" + author.getBirthYear() + " г.р.)");
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public Author getAuthor() { return author; }
    public void setAuthor(Author author) { this.author = author; }
}
