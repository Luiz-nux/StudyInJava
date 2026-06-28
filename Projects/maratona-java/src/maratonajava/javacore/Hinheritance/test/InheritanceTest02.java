package maratonajava.javacore.Hinheritance.test;

import maratonajava.javacore.Hinheritance.domain.Manager;

public class InheritanceTest02 {

     // 0- bloco de inicialização statico da superclasse é executado quando a jvm carregar a classe pai
     // 1- bloco de inicialização statico da subclasse é executado quando a jvm carregar a classe filha
     // 2 - alocado espaço em memoria para objeto da superclass
     // 3 - cada um dos atributos de superclass é criado e inicializado com valores default ou oq foi passado
     // 4 - o bloco de inicialização da super classe é executado na ordem em q aparece
     // 5 - o construtor da superclass é executado
     // 6 - alocado espaço em memoria para objeto da subclass
     // 7 - cada um dos atributos de subclass é criado e inicializado com valores default ou oq foi passado
     // 8 - o bloco de inicialização da subclass é executado na ordem em q aparece
     // 9 - o construtor da subclass é executado
    public static void main(String[] args) {
        new Manager("luiz");
    }
}
