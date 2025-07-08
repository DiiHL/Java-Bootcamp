package com.model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Curso {
    private String nomeDoCurso;
    private String instrutor;

    Set<Aluno> alunoSet = new HashSet<>();

    protected void adicionarAluno(Aluno aluno){

        if (alunoSet.add(aluno)){
            System.out.printf("Aluno %s adicionado com sucesso\n" ,aluno.getNome());
            return;
        }else {
            System.out.printf("Aluno com matricula %s ja cadastrado\n" ,aluno.getMatricula());
        }
    }

    protected void removerAluno(String matricula){
        Iterator<Aluno> alunoIterator = alunoSet.iterator();
        while (alunoIterator.hasNext()){
            Aluno aluno = alunoIterator.next();
            if (aluno.getMatricula().trim().equalsIgnoreCase(matricula)){
                alunoIterator.remove();
                return;
            }
        }
        System.out.printf("Aluno com matricula %s não encontrado\n" ,matricula);
    }

    protected void exibirAluno(){
        alunoSet.forEach(System.out::println);
    }

    public void quantidadeAlunoCadastrado(){
        System.out.println(alunoSet.size());
    }

    public Curso(String nomeDoCurso, String instrutor) {
        this.nomeDoCurso = nomeDoCurso;
        this.instrutor = instrutor;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(nomeDoCurso, curso.nomeDoCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nomeDoCurso);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nomeDoCurso='" + nomeDoCurso + '\'' +
                ", instrutor='" + instrutor + '\'' +
                '}';
    }
}