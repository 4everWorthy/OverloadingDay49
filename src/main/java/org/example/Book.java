package org.example;

public class Book {
    private String title;
    private int numberOfPages;
    private int publicationYear;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.numberOfPages = 0;
        this.publicationYear = 0;
    }

    // Constructor with title and numberOfPages
    public Book(String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = 0;
    }

    // Constructor with all attributes
    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return title + ", " + numberOfPages + " pages, " + publicationYear;
    }

    public String getTitle() {
        return title;
    }
}
