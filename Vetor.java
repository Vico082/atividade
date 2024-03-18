import java.util.Arrays;
public class Vetor {
    private Aluno[] alunos = new Aluno[100];

    private int totalDealunos = 0;

    public boolean Adiciona (Aluno aluno){
        this.alunos[this.totalDealunos]= aluno;
        this.totalDealunos++;
        return false;
    }

    public int getTotalDealunos(){
        return totalDealunos;
    }

    public boolean adicionaPosicao(int posicao, Aluno aluno){
        if (!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = this.totalDealunos - 1; i >= posicao; i-=1) {
            this.alunos[i + 1] = this.alunos[i];
        }
        this.alunos[posicao] = aluno;
        this.totalDealunos++;
        return false;
    }
    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= this.totalDealunos;
    }
            

    public Aluno Alunopega (int posicao){
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.alunos[posicao];
    }


    public boolean remove(int posicao){
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.totalDealunos - 1; i++) {
            this.alunos[i] = this.alunos[i + 1];
        }
        this.totalDealunos--;
        return false;
    }
    private boolean posicaoOcupada(int posicao) {
        return posicao < this.alunos.length && posicao >= 0;
    }
    

    public  boolean contem(Aluno aluno){
        for (int i = 0; i < this.alunos.length; i++){
            if(aluno == this.alunos[i]){
                return true;
            }
        }
        return false;
    }

    public int tamanho (){
        return this.totalDealunos;
    }

    public String toString() {
        return Arrays.toString(alunos);
    }

}
