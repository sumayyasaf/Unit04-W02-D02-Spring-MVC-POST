package org.dci.mvcpost.model;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int year;
    private boolean inStock;
    private double price;

    public Book() {
    }

    public Book(String title, String author, String genre, int year, boolean inStock, double price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.inStock = inStock;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
