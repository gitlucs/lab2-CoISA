package lab2;

import java.util.*;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas = new double[4];

    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;

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

        for(int i = 0; i < this.notas.length ; i ++) {
            soma += this.notas[i];
        }

        return (soma / this.notas.length);
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
