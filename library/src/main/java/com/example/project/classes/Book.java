package com.example.project.classes;

public class Book {
    private String title;
    private boolean isRented = false;

    public Book(String title ){
        this.title = title;
        
    }
    
    public String getTitle() {
        return title;
    }
    public void setRented(boolean isRented) {
        this.isRented = isRented;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Titulo " + this.title;
    }
}
