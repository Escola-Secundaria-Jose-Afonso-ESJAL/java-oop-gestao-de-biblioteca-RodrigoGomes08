package com.example;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("O Senhor dos Anéis", "J.R.R Tolkien", 1954);
        Livro l2 = new Livro("Duna", "Frank Herbert", 1965);
        Livro l3 = new Livro("1984", "George Orwell", 1949);
        
        Biblioteca b1 = new Biblioteca();
        
        boolean primeiroLivroAdicionado = b1.adicionarLivro(l1);
        boolean segundoLivroAdicionado = b1.adicionarLivro(l2);
        boolean terceiroLivroAdicionado = b1.adicionarLivro(l3);
        
        System.out.println(primeiroLivroAdicionado);
        System.out.println(segundoLivroAdicionado);
        System.out.println(terceiroLivroAdicionado);
        
        boolean livroRemovido = b1.removerLivro(l1.getTitulo());
        
        System.out.println(livroRemovido);
        
        b1.listarLivros();
    }
}
