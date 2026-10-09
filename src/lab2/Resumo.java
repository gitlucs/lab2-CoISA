package lab2;

/**
 * Classe de representação dos Resumos contidos na classe RegistroResumos
 *
 * @author Lucas Gabriel
 */
public class Resumo {
    private String tema;
    private String conteudo;

    /**
     * Constrói um resumo a partir de seu tema e conteudo
     *
     * @param tema o tema do resumo
     * @param conteudo o conteudo do resumo
     */
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * Retorna a String do tema do resumo.
     *
     * @return o tema do resumo
     */
    public String getTema() {
        return tema;
    }

    /**
     * Retorna a String do conteudo do resumo.
     *
     * @return o conteudo do resumo
     */
    public String getConteudo() {
        return conteudo;
    }

    /**
     * Retorna a String que representa o resumo. A representação segue o
     * formato “Tema: conteudo do resumo”.
     *
     * @return a representação em String de um resumo.
     */
    @Override
    public String toString(){
        return this.tema + ": " + this.conteudo;
    }

}
