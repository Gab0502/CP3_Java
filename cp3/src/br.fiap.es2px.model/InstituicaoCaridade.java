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

    /**
     * Construtor da classe InstituicaoCaridade.
     *
     * @param nome           Nome da instituição.
     * @param cpnj           CNPJ da instituição.
     * @param endereco       Endereço da instituição.
     * @param contato        Contato da instituição.
     * @param areaAtuacao    Área de atuação da instituição.
     * @param voluntarios    Lista de voluntários.
     * @param historicoDoacao Lista de histórico de doações.
     */
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

    /**
     * Obtém o nome da instituição.
     *
     * @return Nome da instituição.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da instituição.
     *
     * @param nome Nome da instituição.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o CNPJ da instituição.
     *
     * @return CNPJ da instituição.
     */
    public int getCpnj() {
        return cpnj;
    }

    /**
     * Define o CNPJ da instituição.
     *
     * @param cpnj CNPJ da instituição.
     */
    public void setCpnj(int cpnj) {
        this.cpnj = cpnj;
    }

    /**
     * Obtém o endereço da instituição.
     *
     * @return Endereço da instituição.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço da instituição.
     *
     * @param endereco Endereço da instituição.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Obtém o contato da instituição.
     *
     * @return Contato da instituição.
     */
    public String getContato() {
        return contato;
    }

    /**
     * Define o contato da instituição.
     *
     * @param contato Contato da instituição.
     */
    public void setContato(String contato) {
        this.contato = contato;
    }

    /**
     * Obtém a área de atuação da instituição.
     *
     * @return Área de atuação da instituição.
     */
    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    /**
     * Define a área de atuação da instituição.
     *
     * @param areaAtuacao Área de atuação da instituição.
     */
    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    /**
     * Obtém a lista de voluntários da instituição.
     *
     * @return Lista de voluntários.
     */
    public ArrayList<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    /**
     * Define a lista de voluntários da instituição.
     *
     * @param voluntarios Lista de voluntários.
     */
    public void setVoluntarios(ArrayList<Voluntario> voluntarios) {
        this.voluntarios = voluntarios;
    }

    /**
     * Obtém o histórico de doações da instituição.
     *
     * @return Histórico de doações.
     */
    public ArrayList<HistDoacao> getHistoricoDoacao() {
        return historicoDoacao;
    }

    /**
     * Define o histórico de doações da instituição.
     *
     * @param historicoDoacao Histórico de doações.
     */
    public void setHistoricoDoacao(ArrayList<HistDoacao> historicoDoacao) {
        this.historicoDoacao = historicoDoacao;
    }

    /**
     * Imprime os dados da instituição, incluindo voluntários e histórico de doações.
     */
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

    /**
     * Representa um voluntário que trabalha na instituição de caridade.
     */
    public static class Voluntario {
        private String nome;
        private int cpf;

        /**
         * Construtor da classe Voluntario.
         *
         * @param nome Nome do voluntário.
         * @param cpf  CPF do voluntário.
         */
        public Voluntario(String nome, int cpf) {
            this.nome = nome;
            this.cpf = cpf;
        }

        // Getters e Setters

        /**
         * Obtém o nome do voluntário.
         *
         * @return Nome do voluntário.
         */
        public String getNome() {
            return nome;
        }

        /**
         * Define o nome do voluntário.
         *
         * @param nome Nome do voluntário.
         */
        public void setNome(String nome) {
            this.nome = nome;
        }

        /**
         * Obtém o CPF do voluntário.
         *
         * @return CPF do voluntário.
         */
        public int getCpf() {
            return cpf;
        }

        /**
         * Define o CPF do voluntário.
         *
         * @param cpf CPF do voluntário.
         */
        public void setCpf(int cpf) {
            this.cpf = cpf;
        }
    }

    /**
     * Representa uma doação registrada no histórico de doações da instituição.
     */
    public static class HistDoacao {
        private int data;
        private String descricao;
        private Doador doador;

        /**
         * Construtor da classe HistDoacao.
         *
         * @param data      Data da doação no formato AAAAMMDD.
         * @param descricao Descrição da doação.
         * @param doador    Doador que realizou a doação.
         */
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
         * Obtém o doador que realizou a doação.
         *
         * @return Doador que realizou a doação.
         */
        public Doador getDoador() {
            return doador;
        }

        /**
         * Define o doador que realizou a doação.
         *
         * @param doador Doador que realizou a doação.
         */
        public void setDoador(Doador doador) {
            this.doador = doador;
        }
    }
}
