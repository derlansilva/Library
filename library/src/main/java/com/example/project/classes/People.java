package com.example.project.classes;

public class People {
    private String name;
    private String cpf;

    private Book book;

    public People( String name, String cpf){
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }
    public String getCpf() {
        return cpf;
    }

    public Book getBook() {
        return book;
    }
public void setBook(Book book) {
    this.book = book;
}

    public void setName(String name) {
        this.name = name;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nome:"+ this.name +
                "CPF: "+ this.cpf;
    }
    
}
