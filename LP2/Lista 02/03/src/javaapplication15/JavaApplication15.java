package javaapplication15;
/**
 *
 * @author jonas
 * Faça um programa usando a linguagem de programação Java que implemente uma classe Pessoa
que possui os atributos nome, altura e idade. A classe Pessoa deve conter um construtor para inicializar os
atributos e os seguintes métodos: um método para mostrar os dados da pessoa e outro método para calcular
o seu ano de nascimento. A Figura 1 apresenta o diagrama UML da classe Pessoa.

 */

public class JavaApplication15 {
    public static void main(String[] args) {
        ControleRemoto controleLG = new ControleRemoto(20,12);
        
        controleLG.DiminuirVolume();
        controleLG.DiminuirVolume();
        controleLG.Mostra();
        controleLG.DiminuirCanal();
        controleLG.DiminuirCanal();
        controleLG.Mostra();
        controleLG.IndicadoCanal();
        controleLG.Mostra();
    }
    
}
