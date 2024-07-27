package com.example;

import java.util.Scanner;

import com.example.project.classes.Book;
import com.example.project.classes.BookManager;

public class Main {

    private static BookManager bookManager = new BookManager();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("[1] - ADICIONAR LIVRO");
            System.out.println("[2] - LISTAR LIVROS");
            System.out.println("ESCOLHA UMA DAS OPÇOES");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    create();
                    break;
            
                case 2:
                    show();
                    break;
                default:
                    break;
            }
        }
    }
    private static void show(){
        System.out.println("______________________________");
        System.out.println("  LISTA DE LIVROS   \n");
        bookManager.showBook();
        System.out.println("______________________________");
    }

    private static void create(){

        
            System.out.println("TITULO DO LIVRO");
            String title = scanner.nextLine();
    
            Book book = bookManager.creatBook(title);

            System.out.println(book.getTitle() +" Livro adicionado");
         
        
    }
}