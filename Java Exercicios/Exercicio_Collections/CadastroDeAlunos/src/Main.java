import com.model.Aluno;
import com.model.Curso;
import com.model.PlataformaEnsino;

import java.util.Scanner;

public class Main {
    private static final Scanner sc1 = new Scanner(System.in);

    public static void main(String[] args) {
        PlataformaEnsino curso = new PlataformaEnsino();
        Aluno aluno1 = new Aluno("A", "1");
        Aluno aluno2 = new Aluno("B", "2");
        Aluno aluno3 = new Aluno("C", "3");
        Aluno aluno4 = new Aluno("D", "4");

        Curso curso1 = new Curso("Java", "jehar");

        curso.adicionarCurso("Java", "Jehar");

        curso.matricularAlunoNoCurso("Java", aluno1);




    }
}