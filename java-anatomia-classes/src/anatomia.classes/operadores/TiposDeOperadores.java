/* Simbolos especiais que tem um significado proprio para a linguagem e estao associados a determinadas operações.
 
° Operadores;
    - Atribuição: = 
    - Aritimeticos: +, -, *, /
    - // classe Operadores.java
     1 double soma = 10.5 + 15.7;
     2 int subtracao = 113 - 25;
     3 int multiplicacao = 20 * 7;
     4 int divisao = 15 / 3;
     5 int modulo = 18 % 3;
     6 double resultado = (10 * 7) + (20/4);

    Concatenação
*/

public class TiposDeOperadores {
    public static void main(String[] args){
        // String nomeCompleto = "LINGUAGEM " + "java";
        // System.out.println(nomeCompleto);

        String concatenacao = "?";
        
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1;

        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);
        
        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);
        
        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

    }
}