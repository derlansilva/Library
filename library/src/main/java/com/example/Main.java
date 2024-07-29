package com.example;

import java.util.Scanner;

import com.example.project.classes.Book;
import com.example.project.classes.LibraryManager;
import com.example.project.classes.People;

public class Main {

    private static LibraryManager libraryManager = new LibraryManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("[1] - ADICIONAR LIVRO");
            System.out.println("[2] - ADICIONAR MEMBRO");
            System.out.println("[3] - LISTAR LIVROS");
            System.out.println("[4] - EMPRESTAR UM LIVRO");
            System.out.println("[5] - DEVOLVER LIVRO");
            System.out.println("[6] - LISTAR LIVROS EMPRESTADOS");
            System.out.println("ESCOLHA UMA DAS OPÇOES");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    create();
                    break;

                case 2:
                addMember();
                    break;
                case 3:
                    show();
                    break;
                case 4:
                    loaded();
                    break;

                case 5:
                    giveBack();
                    break;
                case 6:
                    showLoaded();
                    break;

                default:
                    System.out.println("OPÇÃO NÃO ENCONTRADA");
                    break;
            }
        }
    }

    private static void show() {
        System.out.println("______________________________");
        System.out.println("  LISTA DE LIVROS   \n");
        libraryManager.showBook();
        System.out.println("______________________________");
    }

    private static void create() {
        System.out.println("TITULO DO LIVRO");
        String title = scanner.nextLine();
        Book book = libraryManager.creatBook(title);
        System.out.println(book.getTitle() + " Livro adicionado");
    }

    private static void loaded() {
        System.out.println("DIGITE O CPF");
        String cpf = scanner.nextLine();

        System.out.println(" LIVROS DISPONIVEIS ");
        libraryManager.showBook();
        System.out.println("QUAL LIVRO DESEJA EMPRESTAR?");
        int choice = scanner.nextInt();

       libraryManager.loaded(choice, cpf);

    }

    private static void giveBack() {
        System.out.println("Digite seu cpf");
        String cpf = scanner.nextLine();

        libraryManager.giveBack(cpf);
    }

    private static void showLoaded() {
        libraryManager.print();
    }

    private static void addMember(){
        System.out.println("PRENCHA OS DADOS ");
        System.out.print("NOME:");
        String name = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        People people = new People(name, cpf);

        libraryManager.addMember(people);
    }
}