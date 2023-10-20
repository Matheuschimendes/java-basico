package EstruturaCondicional.SwitchCase;

public class SistemaDeMedida {
    public static void main(String[] args) {
        String sigla = "";
        
       switch (sigla){
        case "P","t":{
            System.out.println("Pequeno");
            break;
        }
        case "M","m":{
            System.out.println("Medio");
            break;
        }
        case "G","g":{
            System.out.println("Grande");
            break;
        }
        default:{
            System.out.println("Tamanhos maiores");
            break;
        }
       }
    }
}
