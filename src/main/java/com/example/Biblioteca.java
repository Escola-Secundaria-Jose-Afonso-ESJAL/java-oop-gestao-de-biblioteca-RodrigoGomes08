package  com.example;

import java.util.ArrayList;

public class Biblioteca {
    private static final int MAX_LIVROS = 100; // Variável de classe
    private ArrayList<Livro> livros; // Variável de instância
    private int i = 0;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public boolean adicionarLivro(Livro livro) {
        for(Livro l : this.livros)
        {
            if(l.getTitulo() == livro.getTitulo()){
                return false;
            }
        }
        if(this.livros.size() == MAX_LIVROS)
        {
            return false;
        } else {
            this.livros.add(livro);   
        }
        return true;
    }
    
    public boolean removerLivro(String titulo) {
        for(Livro l : this.livros)
        {
            if(l.getTitulo() == titulo){
                this.livros.remove(titulo);
                return true;
            }
        }
        return false;
    }

    public void listarLivros() {
        for(Livro l : this.livros)
        {
            if(this.i < this.livros.size() - 1)
            {
                System.out.println("Titulo: " + l.getTitulo() + "Autor: " + l.getAutor() + "Ano: " + l.getAno());
            }   
        }
    }
}