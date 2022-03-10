package edu.monmouth.book;

public class Book {

    int numberOfPages;
    BookTypes bookType;
    String Title;
    double price;

    @Override
    public String toString() {
        return "Book{" +
                "numberOfPages=" + numberOfPages +
                ", bookType=" + bookType +
                ", Title='" + Title + '\'' +
                ", price=" + price +
                '}';
    }

    public Book(int numberOfPages, double price, String Title, BookTypes bookType) throws BookException {
        setNumberOfPages(numberOfPages);
        setBookType(bookType);
        setPrice(price);
        setTitle(Title);
    }

    public void setNumberOfPages(int numberOfPages) throws BookException {
        if (numberOfPages < 1) {
            throw new BookException("Book must have 1 or more pages");
        }
        this.numberOfPages = numberOfPages;
    }

    public void setBookType(BookTypes bookType) {
        this.bookType = bookType;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) throws BookException {
           if ((title == null) || (title.length() < 1)){
               throw new BookException("Book must have a title");
           }
        Title = title;
        }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws BookException {
        if (price <= 0){
            throw new BookException("Price must be positive value");
        }
        this.price = price;
    }
}
