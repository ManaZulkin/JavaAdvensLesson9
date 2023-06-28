package task3;


public class Main {

    public static void main(String[] args) {
        Shavel shavel;

        Book[] books = new Book[3];
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book();
            books[i].setName("Book" + i);
            books[i].setAuthor("Author" + i);
            books[i].setPublished(2000 + i);
        }
        shavel = book -> {
            System.out.println(book.getAuthor());
            System.out.println(book.getName());
            System.out.println(book.getPublished());
        };
        for (Book book : books) {
            shavel.lookOnBook(book);
            System.out.println("------------------------------------");
        }

    }
}

