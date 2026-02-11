package com.example;

class Livro {
    private String titulo; // Variável de instância
    private String autor;  // Variável de instância
    private int ano;       // Variável de instância

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo :").append(this.titulo).append("\n");
        sb.append("Autor :").append(this.autor).append("\n");
        sb.append("Ano :").append(this.ano).append("\n");
        return sb.toString();
    }
}
