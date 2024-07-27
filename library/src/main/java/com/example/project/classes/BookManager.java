package com.example.project.classes;

import java.util.ArrayList;
import java.util.List;

public class BookManager implements Ibooks{
    private List<Book> books;

    public BookManager(){
        books  = new ArrayList<>();
        System.out.println("Construtor bookmanager chamado");
    }

    @Override
    public Book creatBook(String title) {

        Book book = new Book(title);
        books.add(book);
        return book;
    }

    public void showBook(){

        for(int i=0 ;i< books.size(); i++){
            System.out.println(books.get(i).getTitle());
        }
    }
}
