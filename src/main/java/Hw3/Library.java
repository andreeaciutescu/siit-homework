package Hw3;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {

        Novel novel1 = new Novel("Carmen", 233, "realista");

        Novel novel2 = new Novel("Micul print", 157, "roman");

        Novel novel3 = new Novel("Intrusul", 120, "sf");

        Album album1 = new Album("Arta", 89, true);

        Album album2 = new Album("Arta de a fi", 100, true);

        Album album3 = new Album("Arta arhitecturii", 100, false);

        Scanner scanner = new Scanner(System.in);


        Book[] listBook = new Book[6];
        listBook[0] = novel1;
        listBook[1] = novel2;
        listBook[2] = novel3;
        listBook[3] = album1;
        listBook[4] = album2;
        listBook[5] = album3;


        System.out.println("Press 1 to add a book");
        System.out.println("Press 2 to remove a book");
        System.out.println("Press 4 to list all books");
        System.out.println("Press 0 to close program");
        int condition = 0;
        while (condition == 0) {
            int key = scanner.nextInt();
            if (key == 1) {
                System.out.println("Press N for novel or press A for album");
                String next = scanner.next();
                if (next.equals("A")) {
                    System.out.print("Name: ");
                    String albumName = scanner.next();
                    System.out.print("Pages: ");
                    int nrAlbumPages = scanner.nextInt();
                    System.out.print("Paper quality: ");
                    boolean paperQuality = scanner.nextBoolean();
                    listBook = addBooks(new Album(albumName, nrAlbumPages, paperQuality), listBook);
                } else {

                    System.out.print("Name: ");
                    String novelName = scanner.next();
                    System.out.print("Pages: ");
                    int nrNovelPages = scanner.nextInt();
                    System.out.print("Type: ");
                    String type = scanner.next();
                    listBook = addBooks(new Novel(novelName, nrNovelPages, type), listBook);
                }
            } else if (key == 4) {
                for (Book book : listBook
                ) {
                    System.out.println(book);
                }
            } else if (key == 0) {
                condition = 1;
            } else if (key == 2) {
                System.out.println("Enter the name of the book");
                String name = scanner.next();
                int index = 0;
                boolean deleted = false;
                for (Book book : listBook) {
                    if (name.equals(book.getName())) {
                        listBook = ArrayUtils.remove(listBook, index);
                        System.out.println("Book " + name + " has been deleted.");
                        deleted = true;
                    }
                    index++;
                }
                if (deleted == false) {
                    System.out.println("The book " + name + " doesn't exist.");
                }
            }
        }
    }

    private static Book[] addBooks(Book book, Book[] listBook) {

        Book[] added;
        added = ArrayUtils.add(listBook, book);
        book.add();
        return added;
    }
}
