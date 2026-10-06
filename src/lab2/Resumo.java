package lab2;

/**
 * Representação de um estudante, especificamente de computação, matriculado da * UFCG. Todo aluno precisa ter uma matrícula e é identificado unicamente
 * por esta matrícula.
 *
 * @author Lucas Gabriel
 */
public class Resumo {
    private String tema;
    private String conteudo;

    /**
     * Constrói um aluno a partir de sua matrícula e nome.
     * Todo aluno começa com o campo CRA como nulo.
     *
     * @param matricula a matrícula do aluno, no formato “0000000000”
     * @param nome o nome do aluno
     */
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * Retorna a String que representa o aluno. A representação segue o
     * formato “MATRICULA - Nome do Aluno”.
     *
     * @return a representação em String de um aluno.
     */

    public String getTema() {
        return tema;
    }

    /**
     * Retorna a String que representa o aluno. A representação segue o
     * formato “MATRICULA - Nome do Aluno”.
     *
     * @return a representação em String de um aluno.
     */

    public String getConteudo() {
        return conteudo;
    }
    /**
     * Retorna a String que representa o aluno. A representação segue o
     * formato “MATRICULA - Nome do Aluno”.
     *
     * @return a representação em String de um aluno.
     */


    @Override
    public String toString(){
        return this.tema + ": " + this.conteudo;
    }

}
