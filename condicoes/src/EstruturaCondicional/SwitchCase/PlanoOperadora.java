package EstruturaCondicional.SwitchCase;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "t";
        
       switch (plano){
        case "T","t":{
            System.out.println("Seu plano é: " + plano + "\n" + "5Gb Youtube");
            break;
        }
        case "M","m":{
            System.out.println( "Seu plano é: " + plano + "\n" +"Whats e Instagram grátis");
            break;
        }
        case "B","b":{
            System.out.println("Seu plano é: " + plano + "\n" + "100 minutos de ligação");
            break;
        }
        default:{
            System.out.println("Outros Planos");
            break;
        }
       }
    }
}
