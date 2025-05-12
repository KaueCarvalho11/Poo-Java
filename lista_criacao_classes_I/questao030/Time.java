package lista_criacao_classes_I.questao030;

public class Time {
    String nome;
    String localSede;
    int posicaoTabela;
    int anoFundacao;
    int numeroJogadores;
    String ultimoTitulo;

    Time(String nome, String localSede, int posicaoTabela, int anoFundacao, int numeroJogadores, String ultimoTitulo) {
        this.nome = nome;
        this.localSede = localSede;
        this.posicaoTabela = posicaoTabela;
        this.anoFundacao = anoFundacao;
        this.numeroJogadores = numeroJogadores;
        this.ultimoTitulo = ultimoTitulo;
    }

    public void exibir() {
        System.out.println("Nome = " + nome);
        System.out.println("Sede do clube = " + localSede);
        System.out.println("Posição na tabela do campeonado = " + posicaoTabela);
        System.out.println("Ano de fundação =  " + anoFundacao);
        System.out.println("Número de jogadores = " + numeroJogadores);
        System.out.println("Último título = " + ultimoTitulo);
    }
}
