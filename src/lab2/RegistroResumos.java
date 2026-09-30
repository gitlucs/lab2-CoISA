package lab2;

public class RegistroResumos {
    private String[] temas;
    private String[] resumos;
    private int indiceSubstituivel; /* fiz essa variavel para quando encher de resumos, ele lembrar o resumo mais antigo
                                    /  e substitui-lo se for adicionado um novo resumo*/

    public RegistroResumos(int numeroResumos){
        this.temas = new String[numeroResumos];
        this.resumos = new String[numeroResumos];
        this.indiceSubstituivel = 0;
    }

    public void adiciona(String tema, String conteudo){
        if (this.temResumo(tema)){
            return;
        }
        this.temas[this.indiceSubstituivel] = tema;
        this.resumos[this.indiceSubstituivel] = conteudo;
        if (this.indiceSubstituivel == this.temas.length - 1){
            indiceSubstituivel = 0;
        } else {
            indiceSubstituivel += 1;
        }
    }

    public String[] pegaResumos(){
        int qntdResumos = this.conta();
        String[] resumosFormatado = new String[qntdResumos];

        for(int i = 0; i < qntdResumos; i ++){
            resumosFormatado[i] = this.temas[i] + ": " + this.resumos[i];
        }
        return resumosFormatado;
    }

    public String imprimeResumos(){
        int qntdResumos = this.conta();
        String impressao = "- " + qntdResumos + " resumo(s) cadastrado(s)\n-";
        for(int i = 0; i < qntdResumos; i ++){
            if(i != qntdResumos - 1) {
                impressao += " " + this.temas[i] + " |";
            } else {
                impressao += " " + this.temas[i];
            }
        }
        return impressao;


    }

    public int conta(){
        int contagem = 0;
        for(int i = 0; i < this.temas.length; i ++){
            if(temas[i] == null){
                return contagem;
            }
            contagem += 1;
        }
        return contagem;
    }
    public boolean temResumo(String tema){
        int qntdResumos = this.conta();
        for(int i = 0; i < qntdResumos; i++){
            if (this.temas[i].equals(tema)){
                return true;
            }
        }
        return false;
    }


}