import br.fiap.es2px.model.Doador;
import br.fiap.es2px.model.InstituicaoCaridade;

import java.util.ArrayList;

/**
 * Classe principal para demonstrar o funcionamento das classes Doador e InstituicaoCaridade.
 */
public class Main {

    public static void main(String[] args) {
        // Criar e configurar doadores
        ArrayList<Doador> doadores = criarDoadores();

        // Criar e configurar instituições de caridade
        ArrayList<InstituicaoCaridade> instituicoes = criarInstituicoes(doadores);

        // Imprimindo os dados dos doadores
        System.out.println("Doadores:");
        for (Doador doador : doadores) {
            doador.imprimirDados();
            System.out.println();
        }

        // Imprimindo os dados das instituições de caridade
        System.out.println("Instituições de Caridade:");
        for (InstituicaoCaridade instituicao : instituicoes) {
            instituicao.imprimirDados();
            System.out.println();
        }
    }

    /**
     * Cria e configura objetos Doador.
     *
     * @return Lista de doadores.
     */
    private static ArrayList<Doador> criarDoadores() {
        ArrayList<Doador> doadores = new ArrayList<>();

        // Criando doador 1 com suas doações
        Doador doador1 = new Doador("Fulano", "12345678910", "Endereço 1", "Contato 1");
        doador1.registrarDoacao(new Doador.Doacao("Doação inicial", 20240524, 100.00));
        doador1.registrarDoacao(new Doador.Doacao("Doação secundária", 20240525, 150.00));
        doadores.add(doador1);

        // Criando doador 2 com suas doações
        Doador doador2 = new Doador("Ciclano", "98765432100", "Endereço 2", "Contato 2");
        doador2.registrarDoacao(new Doador.Doacao("Doação terciária", 20240526, 200.00));
        doador2.registrarDoacao(new Doador.Doacao("Doação quaternária", 20240527, 250.00));
        doadores.add(doador2);

        return doadores;
    }

    /**
     * Cria e configura objetos InstituicaoCaridade.
     *
     * @param doadores Lista de doadores.
     * @return Lista de instituições de caridade.
     */
    private static ArrayList<InstituicaoCaridade> criarInstituicoes(ArrayList<Doador> doadores) {
        ArrayList<InstituicaoCaridade> instituicoes = new ArrayList<>();

        // Criando instituição 1 com voluntários e histórico de doações
        InstituicaoCaridade instituicao1 = new InstituicaoCaridade("Nome Instituicao 1", 123456789, "Endereço 1", "Contato 1", "Área 1", new ArrayList<>(), new ArrayList<>());
        instituicao1.getVoluntarios().add(new InstituicaoCaridade.Voluntario("Voluntário 1", 111111111));
        instituicao1.getVoluntarios().add(new InstituicaoCaridade.Voluntario("Voluntário 2", 222222222));
        instituicao1.getHistoricoDoacao().add(new InstituicaoCaridade.HistDoacao(20240528, "Doação para a instituição 1", doadores.get(0)));
        instituicoes.add(instituicao1);

        // Criando instituição 2 com voluntários e histórico de doações
        InstituicaoCaridade instituicao2 = new InstituicaoCaridade("Nome Instituicao 2", 987654321, "Endereço 2", "Contato 2", "Área 2", new ArrayList<>(), new ArrayList<>());
        instituicao2.getVoluntarios().add(new InstituicaoCaridade.Voluntario("Voluntário 3", 333333333));
        instituicao2.getHistoricoDoacao().add(new InstituicaoCaridade.HistDoacao(20240529, "Doação para a instituição 2", doadores.get(1)));
        instituicoes.add(instituicao2);

        return instituicoes;
    }
}
