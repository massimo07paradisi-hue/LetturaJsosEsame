package org.example;

public class Giocatore {
    private String id;
    private String nome;
    private int numeroMaglia;

    public Giocatore(String id, String nome, int numeroMaglia) {
        this.id = id;
        this.nome = nome;
        this.numeroMaglia = numeroMaglia;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMaglia() {
        return numeroMaglia;
    }

    @Override
    public String toString() {
        return nome + " (#" + numeroMaglia + ")";
    }
}
