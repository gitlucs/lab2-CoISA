package lab2;

public class RegistroResumos {
    private Resumo[] resumos;
    private int indiceSubstituivel; /* fiz essa variavel para quando encher de resumos, ele lembrar o resumo mais antigo
                                       e substituir, se for adicionado um novo resumo*/

    public RegistroResumos(int numeroResumos){
        this.resumos = new Resumo[numeroResumos];
        this.indiceSubstituivel = 0;
    }

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

    public String[] pegaResumos(){
        int qntdResumos = this.conta();
        String[] resumosFormatado = new String[qntdResumos];

        for(int i = 0; i < qntdResumos; i ++){
            resumosFormatado[i] = this.resumos[i].getTema() + ": " + this.resumos[i].getConteudo();
        }
        return resumosFormatado;
    }

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
    public boolean temResumo(String tema){
        int qntdResumos = this.conta();
        for(int i = 0; i < qntdResumos; i++){
            if (this.resumos[i].getTema().equals(tema)){
                return true;
            }
        }
        return false;
    }
}