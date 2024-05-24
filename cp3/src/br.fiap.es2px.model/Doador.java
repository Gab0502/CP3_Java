package br.fiap.es2px.model;

import java.util.ArrayList;

public class Doador {
    private String nome;
    private String cpf;
    private String endereco;
    private String contato;
    private ArrayList<Doacao> historicoDoacoes;

    // Construtor
    public Doador(String nome, String cpf, String endereco, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.historicoDoacoes = new ArrayList<>();
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public ArrayList<Doacao> getHistoricoDoacoes() {
        return historicoDoacoes;
    }

    public void setHistoricoDoacoes(ArrayList<Doacao> historicoDoacoes) {
        this.historicoDoacoes = historicoDoacoes;
    }

    public void registrarDoacao(Doacao doacao) {
        historicoDoacoes.add(doacao);
    }

    public void imprimirDados() {
        System.out.println("Doador: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Contato: " + contato);
        System.out.println("Histórico de Doações:");
        for (Doacao doacao : historicoDoacoes) {
            System.out.println(" - " + doacao.toString());
        }
    }

    public static class Doacao {
        private String descricao;
        private int data;
        private double valor;

        // Construtor
        public Doacao(String descricao, int data, double valor) {
            this.descricao = descricao;
            this.data = data;
            this.valor = valor;
        }

        @Override
        public String toString() {
            return "Doacao{" +
                    "descricao='" + descricao + '\'' +
                    ", data=" + data +
                    ", valor=" + valor +
                    '}';
        }

        // Getters e Setters

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }
    }
}
