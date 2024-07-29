package com.example.project.classes;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager implements Ibooks{
    private List<Book> books;
    private List<People> peoples;

    public LibraryManager(){
        books  = new ArrayList<>();
        peoples = new ArrayList<>();
    }

    @Override
    public Book creatBook(String title) {

        Book book = new Book(title);
        
        books.add(book);
        return book;
    }

    public void showBook(){
        for(int i=0 ;i< books.size(); i++){
            if(books.get(i).getIsrented() == false){
                System.out.println("["+ i +"] - "+ books.get(i).getTitle());
            }
        }
    }

    public Book getBook(int index){
        books.get(index).setRented(true);
        return books.get(index);
        
        
    }


    //emprestar livro
    public void loaded(int index , String cpf ){
        Book book = books.get(index);
        if(book == null){
            System.out.println("Livro não localizado");
            return;
        }
        People people = findMember(cpf);

        if(people == null){
            System.out.println("Pessoa Não localizada");
            return;
        }else{
            book.setRented(true);
            people.setBook(book);
        }


        System.out.println("LIVRO:" + book.getTitle());
        System.out.println("EMPRESTADO PARA " + people.getName());

        
    }

    //adicionar pessoas
    public void addMember(People people){
        peoples.add(people);
        
    }

    //metodo para exibir livros emprestados
    public void print(){
        System.out.println("LIVROS EMPRESTADOS");
        for(int i= 0 ; i< books.size() ; i++){
            if(books.get(i).getIsrented() == false){
                System.out.println("Titulo: "+ books.get(i).getTitle());
            }
        }
      
    }

    //metodo para localizar a pessoa
    public People findMember(String cpf){
        return peoples.stream()
                .filter(member -> member.getCpf().equals(cpf) )
                .findFirst()
                .orElse(null);
    }


    public Book findBook(int index ){
        return books.get(index);
    }

    public void giveBack(String cpf){
        People people = findMember(cpf);

        System.out.println("Voce tem o livro emprestado :"+ people.getBook().getTitle());
        System.out.println("DESEJA DEVOLVER?");
        System.out.println("[1] - SIM");
        System.out.println("[2] - NÃO");
        
    
    }
}
