import br.fiap.es2px.model.Doador;
import br.fiap.es2px.model.InstituicaoCaridade;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando alguns doadores e suas doações
        Doador.Doacao doacao1 = new Doador.Doacao("Doação inicial", 20240524, 100.00);
        Doador.Doacao doacao2 = new Doador.Doacao("Doação secundária", 20240525, 150.00);
        Doador doador1 = new Doador("Fulano", "12345678910", "Endereço 1", "Contato 1");
        doador1.registrarDoacao(doacao1);
        doador1.registrarDoacao(doacao2);

        Doador.Doacao doacao3 = new Doador.Doacao("Doação terciária", 20240526, 200.00);
        Doador.Doacao doacao4 = new Doador.Doacao("Doação quaternária", 20240527, 250.00);
        Doador doador2 = new Doador("Ciclano", "98765432100", "Endereço 2", "Contato 2");
        doador2.registrarDoacao(doacao3);
        doador2.registrarDoacao(doacao4);

        // Criando alguns objetos de InstituicaoCaridade com voluntários e histórico de doações
        InstituicaoCaridade instituicao1 = new InstituicaoCaridade("Nome Instituicao 1", 123456789, "Endereço 1", "Contato 1", "Área 1", new ArrayList<>(), new ArrayList<>());
        instituicao1.getVoluntarios().add(new InstituicaoCaridade.Voluntario("Voluntário 1", 111111111));
        instituicao1.getVoluntarios().add(new InstituicaoCaridade.Voluntario("Voluntário 2", 222222222));
        instituicao1.getHistoricoDoacao().add(new InstituicaoCaridade.HistDoacao(20240528, "Doação para a instituição 1", doador1));

        InstituicaoCaridade instituicao2 = new InstituicaoCaridade("Nome Instituicao 2", 987654321, "Endereço 2", "Contato 2", "Área 2", new ArrayList<>(), new ArrayList<>());
        instituicao2.getVoluntarios().add(new InstituicaoCaridade.Voluntario("Voluntário 3", 333333333));
        instituicao2.getHistoricoDoacao().add(new InstituicaoCaridade.HistDoacao(20240529, "Doação para a instituição 2", doador2));

        // Imprimindo os dados dos doadores
        System.out.println("Doadores:");
        doador1.imprimirDados();
        System.out.println();
        doador2.imprimirDados();
        System.out.println();

        // Imprimindo os dados das instituições de caridade
        System.out.println("Instituições de Caridade:");
        instituicao1.imprimirDados();
        System.out.println();
        instituicao2.imprimirDados();
    }
}
