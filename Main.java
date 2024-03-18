
public class Main {
    public static void main(String [] args) {

        Vetor lista = new Vetor();

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        Aluno a6 = new Aluno();
        Aluno a7 = new Aluno();
        Aluno a8 = new Aluno();
        Aluno a9 = new Aluno();
        Aluno a10 = new Aluno();
        Aluno a11 = new Aluno();
        Aluno a12 = new Aluno();
        Aluno a13 = new Aluno();
        Aluno a14= new Aluno();
        Aluno a15= new Aluno();
        Aluno a23 = new Aluno();
        Aluno a24 = new Aluno();

        a1.setNome("Gustavo Paiva");
        a2.setNome("Julia Maria");
        a3.setNome("Rebeca Silva");
        a4.setNome("Alexandre Pereira");
        a5.setNome("Pedro Henrique");
        a6.setNome("Karla Andressa");
        a7.setNome("Letícia Vitória");
        a8.setNome("Paula Aguiar");
        a9.setNome("Lucas Pedro");
        a10.setNome("Gustavo Paiva");
        a11.setNome("Mauricio Morizono");
        a12.setNome("Guilherme Albuquerque");
        a13.setNome("Karina");
        a14.setNome("Livia Emilly");
        a15.setNome("Ingrid morizono");
        a23.setNome("Matheus Arthur");
        a24.setNome("Pedro Vitor ");

        // adição de 15 alunos
        lista.Adiciona(a1);
        lista.Adiciona(a2);
        lista.Adiciona(a3);
        lista.Adiciona(a4);
        lista.Adiciona(a5);
        lista.Adiciona(a6);
        lista.Adiciona(a7);
        lista.Adiciona(a8);
        lista.Adiciona(a9);
        lista.Adiciona(a10);
        lista.Adiciona(a11);
        lista.Adiciona(a12);
        lista.Adiciona(a13);
        lista.Adiciona(a14);
        lista.Adiciona(a15);


        System.out.println(lista);

        lista.remove(0);
        lista.remove(1);

        lista.adicionaPosicao(0,a23);
        lista.adicionaPosicao(1,a24);
        System.out.println(lista);

    }
}