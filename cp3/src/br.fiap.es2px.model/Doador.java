package br.fiap.es2px.model;

import java.util.ArrayList;

/**
 * Representa um doador com seus dados pessoais e histórico de doações.
 */
public class Doador {
    private String nome;
    private String cpf;
    private String endereco;
    private String contato;
    private ArrayList<Doacao> historicoDoacoes;

    /**
     * Construtor da classe Doador.
     *
     * @param nome      Nome do doador.
     * @param cpf       CPF do doador.
     * @param endereco  Endereço do doador.
     * @param contato   Contato do doador.
     */
    public Doador(String nome, String cpf, String endereco, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.historicoDoacoes = new ArrayList<>();
    }

    // Getters e Setters

    /**
     * Obtém o nome do doador.
     *
     * @return Nome do doador.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do doador.
     *
     * @param nome Nome do doador.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o CPF do doador.
     *
     * @return CPF do doador.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF do doador.
     *
     * @param cpf CPF do doador.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Obtém o endereço do doador.
     *
     * @return Endereço do doador.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço do doador.
     *
     * @param endereco Endereço do doador.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Obtém o contato do doador.
     *
     * @return Contato do doador.
     */
    public String getContato() {
        return contato;
    }

    /**
     * Define o contato do doador.
     *
     * @param contato Contato do doador.
     */
    public void setContato(String contato) {
        this.contato = contato;
    }

    /**
     * Obtém o histórico de doações do doador.
     *
     * @return Histórico de doações.
     */
    public ArrayList<Doacao> getHistoricoDoacoes() {
        return historicoDoacoes;
    }

    /**
     * Define o histórico de doações do doador.
     *
     * @param historicoDoacoes Histórico de doações.
     */
    public void setHistoricoDoacoes(ArrayList<Doacao> historicoDoacoes) {
        this.historicoDoacoes = historicoDoacoes;
    }

    /**
     * Registra uma nova doação no histórico do doador.
     *
     * @param doacao Doação a ser registrada.
     */
    public void registrarDoacao(Doacao doacao) {
        historicoDoacoes.add(doacao);
    }

    /**
     * Imprime os dados do doador, incluindo o histórico de doações.
     */
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

    /**
     * Representa uma doação realizada por um doador.
     */
    public static class Doacao {
        private String descricao;
        private int data;
        private double valor;

        /**
         * Construtor da classe Doacao.
         *
         * @param descricao Descrição da doação.
         * @param data      Data da doação no formato AAAAMMDD.
         * @param valor     Valor da doação.
         */
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

        /**
         * Obtém a descrição da doação.
         *
         * @return Descrição da doação.
         */
        public String getDescricao() {
            return descricao;
        }

        /**
         * Define a descrição da doação.
         *
         * @param descricao Descrição da doação.
         */
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        /**
         * Obtém a data da doação.
         *
         * @return Data da doação no formato AAAAMMDD.
         */
        public int getData() {
            return data;
        }

        /**
         * Define a data da doação.
         *
         * @param data Data da doação no formato AAAAMMDD.
         */
        public void setData(int data) {
            this.data = data;
        }

        /**
         * Obtém o valor da doação.
         *
         * @return Valor da doação.
         */
        public double getValor() {
            return valor;
        }

        /**
         * Define o valor da doação.
         *
         * @param valor Valor da doação.
         */
        public void setValor(double valor) {
            this.valor = valor;
        }
    }
}