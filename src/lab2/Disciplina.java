package lab2;

import java.util.*;

/**
 * Representação de um estudante, especificamente de computação, matriculado da * UFCG. Todo aluno precisa ter uma matrícula e é identificado unicamente
 * por esta matrícula.
 *
 * @author Lucas Gabriel
 */
public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;
    private int[] pesos;

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

    public Disciplina(String nomeDisciplina, int qntdNotas, int[] pesos){
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[qntdNotas];
        this.pesos = pesos;

        for(int i = 0; i < notas.length; i++){
            this.notas[i] = 0;
        }
    }

    public void cadastraHoras(int horas){
        this.horasEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota){
        this.notas[nota - 1] = valorNota;
    }

    // criei porque vi que ia precisar utilizar o mesmo algoritmo de média repetidas vezes
    public double calculaMedia(){
        double soma = 0;
        double somaPesos = 0;

        for(int i = 0; i < this.notas.length ; i ++) {
            soma += (this.notas[i] * this.pesos[i]);
            somaPesos += this.pesos[i];
        }

        return (soma / somaPesos);
    }

    public boolean aprovado(){
        double media = this.calculaMedia();

        return (media >= 7.0);
    }

    @Override
    public String toString(){
        double media = this.calculaMedia();
        return this.nomeDisciplina + " " + this.horasEstudo + " " + media + " " + Arrays.toString(this.notas);
    }
}
