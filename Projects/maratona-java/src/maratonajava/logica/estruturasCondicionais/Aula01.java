package maratonajava.logica.estruturasCondicionais;

public class Aula01 {
    public static void main(String[] args) {
        int salary = 5000;
        // (confição) ? verdadeiro : falso, tipo um if/else:
        String resultado = salary >= 5000 ? "Eu vou doar 500 para o DevDojo" : "N tenho condicoes de doar AINDA";
        // else if? bom n usar, mas é assim:
        String cafe = salary < 2000 ? "menor q 2000" : salary < 5000 ? "menor q 5000 maior q 2000" : "bem alto";
        System.out.println(cafe+ " "+resultado);
    }
}
