package LacosDeRepeticao;

import java.util.Random;

public class DoWhile { //Do while - Faça Enquanto
    public static void main(String[] args) {
        System.out.println("Digitando....");

        do{
            //executando repetidas vezes ate alguem atender
            System.out.println("Telefone Tocando");
        }while(tocando());

        System.out.println("Aloo !!!");
    }
    //Metodo
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==2;
        System.out.println("Atendeu ? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;
    }
}
