package EstruturaCondicional.Simples;


public class CaixaEletronico {
    public static void main(String[] args){
        double saldo = 25.0;
        double valorSolicitado = 10.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println(" Saque realizado com sucesso! Seu Saldo é: " + saldo);
        }
        else
            System.out.println("Saldo insuficiente: " + saldo);
    }
}
