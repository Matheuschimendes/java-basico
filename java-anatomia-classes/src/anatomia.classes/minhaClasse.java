public class minhaClasse {
    public static void main(String[] args) {
        
        String primeiroNome = "Matheus";
        String segundoNome = "Chimendes";


        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do metedo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
