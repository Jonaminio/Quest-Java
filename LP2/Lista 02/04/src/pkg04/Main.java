package pkg04;
/**
 *
 * @author jonas
 * Crie um programa que implemente uma classe Disciplina que possui os atributos: nome da
disciplina e código. A classe Disciplina deve conter um construtor para inicializar os atributos, um método
que retorno o seu nome, um método para adicionar um professor e um método para retornar o nome do
professor (caso tenha). Implemente também uma classe Professor que possui os atributos nome, id. A
classe Professor deve possuir um construtor para inicializar os atributos. Uma disciplina pode possuir
nenhum ou pelo menos um professor responsável. A Figura 2 apresenta o diagrama UML da associação
 */
public class Main {

    public static void main(String[] args) {
        // criando os objetos que representarem os professores Maurício e Fulano de Tal.
        Professor profMauricio = new Professor("Maurício Neto", 1);
        Professor profJoao = new Professor("João de Fulano", 2);
        // criando os objetos que representam as disciplinas de LIP e POO
        Disciplina poo = new Disciplina("Programação Orientado a Objetos", 123);
        Disciplina lip = new Disciplina("Linguagens de Programação I", 321);
        // Adicionando os professores às disciplinas
        poo.addProfessor(profMauricio);
        lip.addProfessor(profJoao);
        lip.addProfessor(profMauricio);
        // Associando as disiciplinas aos professores
        profMauricio.addDisciplina(poo);
        profMauricio.addDisciplina(lip);
        profJoao.addDisciplina(lip);
        // verificando as associações
        System.out.println("Disciplinas Ministradas por " + profMauricio.getNomeProfessor());
        profMauricio.mostrarDisciplinasMinistradas();
        
        System.out.println("-----------------"); 
        System.out.println("Disciplinas Ministradas por " + profJoao.getNomeProfessor());
        profJoao.mostrarDisciplinasMinistradas();
        
        System.out.println("-----------------");
        System.out.println("Professores da disciplina de: " + lip.getNomeDisciplina() + ": ");
        lip.mostrarProfessoresDasDisciplina();
    }
    
}
