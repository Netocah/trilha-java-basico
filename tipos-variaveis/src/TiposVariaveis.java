public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitivos
        //String
        String meuNome = "Francisco Neto";
        byte idade = 30;
        short ano = 2023;
        int cep = 21070333;//cep qualquer
        long cpf = 98765432109l;//cpf ilustrativo
        float pi = 3.14f;
        final float VALOR_DE_PI = 3.14f;
        double salario = 1825.33;//salário ilustrativo
        /*teste de atribuição de valores entre variáveis
         de diferentes tipos*/
        int numeroA = 10;
        int numeroB = 3;
        /*Neste exemplo eu tenho que tipar a entrada da variável
         * divisao para que o Java atribua o valor da operação
         */
        double divisao = (double) numeroA/numeroB;
        System.out.println("Resultado: "+divisao);
        
    }
}
