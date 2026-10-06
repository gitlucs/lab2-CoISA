package lab2;

/**
 * Representação do descanso do aluno, auxiliando no seu monitoramento
 * todo aluno tem uma rotina de descanso que envolve horas totais, e as semanas em que essas horas foram distribuidas
 *
 * @author Lucas Gabriel
 */
public class Descanso {
    private int horasDescanso;
    private int numeroSemanas;

    /**
     * Inicializa o monitoramento do descanso do aluno
     * Todo aluno começa com as horas de descanso nulas, e o numero de semanas igual a 1
     */
    public Descanso(){
        this.defineHorasDescanso(0);
        this.defineNumeroSemanas(1);
    }

    /**
     * Define as horas de descanso do aluno com base no valor fornecido
     *
     * @param valor é o valor inteiro que define a quantidade de horas de descanso
     */
    public void defineHorasDescanso(int valor){
        this.horasDescanso = valor;
    }

    /**
     * Define as semanas em que o aluno distribuiu seu descanso com base no valor fornecido
     *
     * @param valor é o valor inteiro que define a quantidade de semanas de descanso
     */
    public void defineNumeroSemanas(int valor){
        this.numeroSemanas = valor;
    }

    /**
     * Calcula a distribuição do descanso durante as semanas, e define o status do aluno com base nesse calculo,ou seja,
     * verifica se o aluno está cansado ou descansado
     *
     * @return retorna uma string do estado do aluno: descansado ou cansado
     */
    public String getStatusGeral(){
        if((horasDescanso / numeroSemanas) >= 26){
            return "descansado";
        }else{
            return "cansado";
        }
    }
}
