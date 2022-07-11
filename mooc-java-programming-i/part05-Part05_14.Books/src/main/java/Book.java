
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object name) {
        if (this == name) {
            return true;
        }
        
        if (!(name instanceof Book)) {
            return false;
        }
        
        Book comparedBook = (Book) name;
        
        if (this.name.equals(comparedBook.name) && this.publicationYear == comparedBook.publicationYear) {
            return true;
        }
        
        return false;
    } 

}
