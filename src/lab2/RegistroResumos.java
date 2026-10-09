package lab2;

import java.util.Arrays;

/**
 * Local de onde se registra todos os resumos e encapsula todas as operações com resumos.
 *
 * @author Lucas Gabriel
 */
public class RegistroResumos {
    private Resumo[] resumos;
    private int indiceSubstituivel;

    /**
     * Constroi o RegistroResumos, inicializa o array onde será armazenado os resumos e o indice que servirá de apontador para o espaço livre
     *
     * @param numeroResumos define o tamanho do array de resumos
     */
    public RegistroResumos(int numeroResumos){
        this.resumos = new Resumo[numeroResumos];
        this.indiceSubstituivel = 0;
    }

    /**
     * Adiciona resumos que ainda não existem, no array
     *
     * @param tema tema do resumo
     * @param conteudo conteudo do resumo
     */
    public void adiciona(String tema, String conteudo){
        if (this.temResumo(tema)){
            return;
        }
        this.resumos[this.indiceSubstituivel] = new Resumo(tema, conteudo);

        if (this.indiceSubstituivel == this.resumos.length - 1){
            indiceSubstituivel = 0;
        } else {
            indiceSubstituivel += 1;
        }
    }

    /**
     * Pega todos os resumos existentes e retorna um array de string com os resumos formatados com tema e conteudo
     * juntos
     * @return um array de String com todos os resumos
     */
    public String[] pegaResumos(){
        int qntdResumos = this.conta();
        String[] resumosFormatado = new String[qntdResumos];

        for(int i = 0; i < qntdResumos; i ++){
            resumosFormatado[i] = this.resumos[i].toString();
        }
        return resumosFormatado;
    }

    /**
     * Informa a informação do estado atual do registro
     *
     * @return Um String com as informações gerais do estado dos registros
     */
    public String imprimeResumos(){
        int qntdResumos = this.conta();
        String impressao = "- " + qntdResumos + " resumo(s) cadastrado(s)\n-";
        for(int i = 0; i < qntdResumos; i ++){
            if(i != qntdResumos - 1) {
                impressao += " " + this.resumos[i].getTema() + " |";
            } else {
                impressao += " " + this.resumos[i].getTema();
            }
        }
        return impressao;
    }

    /**
     * conta quantos resumos existem no array de resumos
     *
     * @return a quantidade de resumos preenchendo o array
     */
    public int conta(){
        int contagem = 0;
        for(int i = 0; i < this.resumos.length; i ++){
            if(this.resumos[i] == null){
                return contagem;
            }
            contagem += 1;
        }
        return contagem;
    }

    /**
     * Verifica se já existe um resumo com aquele tema e
     *
     * @param tema tema do resumo procurado
     * @return um boolean que diz se há ou não há resumo daquele tema
     */
    public boolean temResumo(String tema){
        int qntdResumos = this.conta();
        for(int i = 0; i < qntdResumos; i++){
            if (this.resumos[i].getTema().equals(tema)){
                return true;
            }
        }
        return false;
    }

    /**
     * Busca resumos que possuem a palavra chave no seu conteudo
     *
     * @param chaveDeBusca palavra chave que sera procurada nos resumos
     * @return um array de resumos dos temas dos resumos que possuem aquela palavra em seu conteudo
     */
    public String[] busca(String chaveDeBusca){
        String[] temas = new String[this.conta()];
        int inseridos = 0;
        for(int i = 0 ; i < this.conta(); i++) {
            String[] conteudos = this.resumos[i].getConteudo().split(" ");
            for (int j = 0; j < conteudos.length; j++) {
                if (chaveDeBusca.toLowerCase().equals(conteudos[j].toLowerCase())) {
                    temas[i] = this.resumos[i].getTema();
                    inseridos += 1;
                }
            }
        }

        String[] temasEnxuto = new String[inseridos];
        int indiceApoio = 0;
        for(int i = 0; i < inseridos; i++){
            if(temas[i] != null){
                temasEnxuto[indiceApoio] = temas[i];
                indiceApoio += 1;
            }
        }
        Arrays.sort(temasEnxuto);
        return temasEnxuto;
    }
}