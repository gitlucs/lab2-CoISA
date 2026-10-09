package lab2;

import java.util.*;

/**
 * Representação da situação do aluno em uma disciplina especifica, tendo ela nome, horas de estudo, notas e pesos para cada nota
 *
 * @author Lucas Gabriel
 */
public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;
    private int[] pesos;

    /**
     * Constroi o objeto apenas com o nome da disciplina, definindo por padrao as notas como sendo 4 notas e os pesos todos sendo 1
     *
     * @param nomeDisciplina nome da disciplina
     */
    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[4];
        this.pesos = new int[4];

        for(int i = 0; i < notas.length; i++){
            this.notas[i] = 0;
            this.pesos[i] = 1;
        }
    }

    /**
     * Constroi o objeto apenas com o nome da disciplina, definindo a quantidade de espaço do array de notas pelo parametro  e os pesos todos sendo 1 por padrao
     *
     * @param nomeDisciplina nome da disciplina
     * @param qntdNotas quantidade de notas
     */
    public Disciplina(String nomeDisciplina, int qntdNotas){
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[qntdNotas];
        this.pesos = new int[qntdNotas];

        for(int i = 0; i < notas.length; i++){
            this.notas[i] = 0;
            this.pesos[i] = 1;
        }
    }

    /**
     * Constroi o objeto apenas com o nome da disciplina, definindo a quantidade de espaço do array de notas pelo parametro  e os pesos definidos pelo array recebido
     *
     * @param nomeDisciplina nome da disciplina
     * @param qntdNotas quantidade de notas
     * @param pesos recebe um array de todos os pesos das notas
     */
    public Disciplina(String nomeDisciplina, int qntdNotas, int[] pesos){
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[qntdNotas];
        this.pesos = pesos;

        for(int i = 0; i < notas.length; i++){
            this.notas[i] = 0;
        }
    }

    /**
     * acumula horas na disciplina
     *
     * @param horas horas que serao cadastradas
     */
    public void cadastraHoras(int horas){
        this.horasEstudo += horas;
    }

    /**
     * cadastra nota no array de notas a partir do indice recebido como parametro
     *
     * @param nota indice da nota no array
     * @param valorNota valor da nota que sera cadastrada
     */
    public void cadastraNota(int nota, double valorNota){
        this.notas[nota - 1] = valorNota;
    }

    /**
     * pega os pesos e as notas e calcula sua média ponderada
     *
     * @return retorna a média ponderada das notas
     */
    public double calculaMedia(){
        double soma = 0;
        double somaPesos = 0;

        for(int i = 0; i < this.notas.length ; i ++) {
            soma += (this.notas[i] * this.pesos[i]);
            somaPesos += this.pesos[i];
        }

        return (soma / somaPesos);
    }

    /**
     * verifica se o aluno esta aprovado ou não a partir da media 7
     *
     * @return retorna um boolean que indica a aprovação
     */
    public boolean aprovado(){
        double media = this.calculaMedia();

        return (media >= 7.0);
    }

    /**
     * monta uma string com as informações da disciplina do aluno sendo elas:
     * nome, horas de estudo, média e notas
     *
     * @return retorna o estado atual do aluno com a disciplina
     */
    @Override
    public String toString(){
        double media = this.calculaMedia();
        return this.nomeDisciplina + " " + this.horasEstudo + " " + media + " " + Arrays.toString(this.notas);
    }
}
