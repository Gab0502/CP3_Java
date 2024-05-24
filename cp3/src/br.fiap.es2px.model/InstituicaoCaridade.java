package br.fiap.es2px.model;

import java.util.ArrayList;

public class InstituicaoCaridade {
    private String nome;
    private int cpnj;
    private String endereco;
    private String contato;
    private String areaAtuacao;
    private ArrayList<Voluntario> voluntarios;
    private ArrayList<HistDoacao> historicoDoacao;

    public InstituicaoCaridade(String nome, int cpnj, String endereco, String contato, String areaAtuacao, ArrayList<Voluntario> voluntarios, ArrayList<HistDoacao> historicoDoacao) {
        this.nome = nome;
        this.cpnj = cpnj;
        this.endereco = endereco;
        this.contato = contato;
        this.areaAtuacao = areaAtuacao;
        this.voluntarios = voluntarios;
        this.historicoDoacao = historicoDoacao;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpnj() {
        return cpnj;
    }

    public void setCpnj(int cpnj) {
        this.cpnj = cpnj;
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

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public ArrayList<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(ArrayList<Voluntario> voluntarios) {
        this.voluntarios = voluntarios;
    }

    public ArrayList<HistDoacao> getHistoricoDoacao() {
        return historicoDoacao;
    }

    public void setHistoricoDoacao(ArrayList<HistDoacao> historicoDoacao) {
        this.historicoDoacao = historicoDoacao;
    }

    public void imprimirDados() {
        System.out.println("Instituição: " + nome + " - CNPJ: " + cpnj);
        System.out.println("Endereço: " + endereco);
        System.out.println("Contato: " + contato);
        System.out.println("Área de Atuação: " + areaAtuacao);
        System.out.println("Voluntários:");
        for (Voluntario voluntario : voluntarios) {
            System.out.println(" - " + voluntario.getNome());
        }
        System.out.println("Histórico de Doações:");
        for (HistDoacao doacao : historicoDoacao) {
            System.out.println(" - " + doacao.toString());
        }
    }

    public static class Voluntario {
        private String nome;
        private int cpf;

        public Voluntario(String nome, int cpf) {
            this.nome = nome;
            this.cpf = cpf;
        }

        // Getters e Setters

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getCpf() {
            return cpf;
        }

        public void setCpf(int cpf) {
            this.cpf = cpf;
        }
    }

    public static class HistDoacao {
        private int data;
        private String descricao;
        private Doador doador;

        public HistDoacao(int data, String descricao, Doador doador) {
            this.data = data;
            this.descricao = descricao;
            this.doador = doador;
        }

        @Override
        public String toString() {
            return "HistDoacao{" +
                    "data=" + data +
                    ", descricao='" + descricao + '\'' +
                    ", doador=" + doador.getNome() + // Exibe o nome do doador
                    '}';
        }

        // Getters e Setters

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public Doador getDoador() {
            return doador;
        }

        public void setDoador(Doador doador) {
            this.doador = doador;
        }
    }
}
