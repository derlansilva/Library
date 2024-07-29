package com.example.project.classes;

public class Book {
    private String title;
    private boolean isRented = false;

    private People people;

    public Book(String title ){
        this.title = title;
        
    }
    
    public String getTitle() {
        return title;
    }
    public boolean getIsrented(){
        return isRented;
    }
    
    public void setRented(boolean isRented) {
        this.isRented = isRented;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPeople(People people) {
        this.people = people;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Titulo " + this.title;
    }
}
