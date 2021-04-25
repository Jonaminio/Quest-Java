package javaapplication15;

public class Pessoa {
    // atributos
    String nome;
    int idade;
    float altura;

    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    void MostrarDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Altura: "+this.altura); 
    }
    void CalcularAnoDeNascimento(){
       int idadenas = 2021 - this.idade;
        System.out.println("Ano de nascimento: "+idadenas);
    }
}
