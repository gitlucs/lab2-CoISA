package lab2;

/**
 * Registro do tempo de estudo online do aluno
 *
 * @author Lucas Gabriel
 */
public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnline;
    private int tempoOnlineEsperado;


    /**
     * Constroi o registro do tempo de estudo online do aluno definindo o tempo online esperado como por definição 120
     * e registra o nome da disciplina recebido como parametro
     *
     * @param nomeDisciplina nome da disciplina
     */
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnline = 0;
        this.tempoOnlineEsperado = 120;
    }

    /**
     * Constroi o registro do tempo de estudo online do aluno definindo o tempo online e o registra o nome da disciplina
     * recebidos como parametro
     *
     * @param nomeDisciplina nome da disciplina
     * @param tempoOnlineEsperado o tempo online esperado para completar a disciplina
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnline = 0;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    /**
     * ascrescenta tempo para o tempoonline acumulado
     *
     * @param tempo o tempo que o aluno contabilizou online para adicionar
     */
    public void adicionaTempoOnline(int tempo) {
        this.tempoOnline += tempo;
    }

    /**
     * verifica se a meta de tempo online foi batida
     *
     * @return retorna um boolean que mostra se atingiu a meta ou nao
     */
    public boolean atingiuMetaTempoOnline() {
        return this.tempoOnline >= this.tempoOnlineEsperado;
    }

    /**
     * faz a representação visual do estado do objeto mostrando a disciplina, o tempo online e o tempo esperado
     *
     * @return String com todas as informações
     */
    @Override
    public String toString() {
        return this.nomeDisciplina  + " " + this.tempoOnline + "/" + this.tempoOnlineEsperado;
    }
}
