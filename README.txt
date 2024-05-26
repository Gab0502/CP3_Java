# Sistema de Gestão de Doações - CP3

# Membros

 Enricco Rossi de Souza Carvalho Miranda - rm551717
 Gabriel Marquez Trevisan - rm99227
 Guilherme Silva dos Santos - rm551168
 Kayque Moraes Dias - rm97592
 Samuel Ramos de Almeida - rm99134

Este projeto é um sistema simples para gerenciar doações feitas por doadores e armazenar essas informações em instituições de caridade. O sistema permite registrar doações, listar doadores e imprimir informações detalhadas sobre doações e instituições de caridade.

## Estrutura do Projeto

O projeto está organizado em três classes principais:

1. **Doador**: Representa um doador que faz doações.
2. **InstituicaoCaridade**: Representa uma instituição de caridade que recebe doações e tem voluntários.
3. **Main**: Classe principal que demonstra a criação e utilização das classes `Doador` e `InstituicaoCaridade`.

### Classes

#### Doador

- **Atributos**:
  - `nome`: Nome do doador.
  - `cpf`: CPF do doador.
  - `endereco`: Endereço do doador.
  - `contato`: Informações de contato do doador.
  - `historicoDoacoes`: Lista de doações feitas pelo doador.

- **Métodos**:
  - Construtores, Getters e Setters.
  - `registrarDoacao(Doacao doacao)`: Adiciona uma doação ao histórico do doador.
  - `imprimirDados()`: Imprime os dados do doador e seu histórico de doações.

- **Classe Interna Doacao**:
  - Representa uma doação feita pelo doador.
  - Atributos: `descricao`, `data`, `valor`.
  - Métodos: Construtores, Getters, Setters, `toString()`.

#### InstituicaoCaridade

- **Atributos**:
  - `nome`: Nome da instituição.
  - `cpnj`: CNPJ da instituição.
  - `endereco`: Endereço da instituição.
  - `contato`: Informações de contato da instituição.
  - `areaAtuacao`: Área de atuação da instituição.
  - `voluntarios`: Lista de voluntários que trabalham na instituição.
  - `historicoDoacao`: Histórico de doações recebidas pela instituição.

- **Métodos**:
  - Construtores, Getters e Setters.
  - `imprimirDados()`: Imprime os dados da instituição, incluindo voluntários e histórico de doações.

- **Classe Interna Voluntario**:
  - Representa um voluntário que trabalha na instituição.
  - Atributos: `nome`, `cpf`.
  - Métodos: Construtores, Getters, Setters.

- **Classe Interna HistDoacao**:
  - Representa uma doação registrada no histórico de doações da instituição.
  - Atributos: `data`, `descricao`, `doador`.
  - Métodos: Construtores, Getters, Setters, `toString()`.

#### Main

- **Métodos**:
  - `main(String[] args)`: Método principal que demonstra a criação e uso das classes `Doador` e `InstituicaoCaridade`.
  - `criarDoadores()`: Cria e configura objetos `Doador` e suas doações.
  - `criarInstituicoes(ArrayList<Doador> doadores)`: Cria e configura objetos `InstituicaoCaridade`, incluindo voluntários e histórico de doações.

