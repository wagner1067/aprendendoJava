package funcoes;

public class Funcoes {
    //Função: Retorna um valor do tipo inteiro
    public static int soma (int a, int b){
        return a + b;//Retorna a soma de a e b
    }

    public static int subtracao() {
        int a = 100;
        int b = 60;

        return a - b; // Retorna a soma de a e b
    }

    // Procedimento (void): Não retorna valor
    public static void imprimirMensagem( String mensagem) {
        System.out.println(mensagem); // Imprime a mensagem no console
    }

    public static void imprimirNaTela () {
        System.out.println("Essa função não tem um parâmetro"); // imprime a mensagem no console
    }

    public static void main(String [] args){
        //Usando a função soma
        int resultado = soma(5, 7);
        System.out.println("O resultado da soma é: " + resultado);
        System.out.println("O resultado da soma é: " + soma(60, 40));

        //Usando a função de subtração
        System.out.println("O resultado da subtração é: " + subtracao());

        //Usando o procedimento imprimirMensagem
        imprimirMensagem("Olá, está é uma mensagem de exemplo!");

        //Usando o procedimenmto sem parâmetro
        imprimirNaTela();
    }
}
