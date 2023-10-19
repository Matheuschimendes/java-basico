/*
 Operador Ternario / expressao boolean
    - representado pelos simbolos ?: utilizados na seguinte estrutura de sintaxe:
    <Expressao Condicional> ? <Caso condição seja TRUE> : <Caso condição seja FALSE>
 */

public class Ternario {
    public static void main(String[] args){
        int a, b;

        a = 1;
        b = 10;

        String resultado = a==b ? "verdadeiro" : "falso";

        // /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE */
        // String resultado = "";

        // if(a==b)
        //     resultado = "verdadeiro";
        // else
        //     resultado = "falso"; 
        System.out.println(resultado);
    }
}
