package com.educompass.model;

public class BookResource extends Resource {
    Float book_price;

    public BookResource(Integer id, String title, Semester semester, String course, ResLink resource_link, Float book_price) {
        super(id, title, semester, course, resource_link);
        this.book_price = book_price;
    }

public BookResource(Integer id, String title, int semester, String course, ResLink resource_link, Float book_price) {
        super(id, title, semester, course, resource_link);
        this.book_price = book_price;
    }
    public Float getBook_price() {
        return this.book_price;
    }

    public void setBook_price(Float book_price) {
        this.book_price = book_price;
    }

    @Override
    public String getType() {
        return "book";
    }

}
