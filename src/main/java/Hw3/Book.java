package Hw3;

public abstract class Book {
    private String name;
    private int nrOfPages;

    public Book(String name, int nrOfPages) {
        this.name = name;
        this.nrOfPages = nrOfPages;
    }

    public String getName() {
        return name;
    }

    public int getNrOfPages() {
        return nrOfPages;
    }

    public void delete() {

        System.out.println("Delete a book");
    }

    public void add() {

        System.out.println("Book: " + name + " added to library.");
    }
}
