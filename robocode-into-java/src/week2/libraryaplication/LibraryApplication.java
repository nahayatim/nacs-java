package week2.libraryaplication;



public class LibraryApplication {

    public static void main(String[] args){
        Library library = new Library();
        Book book = library.getBook("sidgehf");

        Reader reader = new Reader();
        reader.read(book);



    }
}
