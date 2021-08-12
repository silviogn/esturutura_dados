public class AulaEstruturaDados {


    public static void main(String[] args){
        System.out.println("Hello estrutura de dados");
        Pessoa p = new Pessoa();
        p.message();
    }

    static class Pessoa {
        public void message(){
            System.out.println("Bom dia, tudo bom?");
        }
    }

}
