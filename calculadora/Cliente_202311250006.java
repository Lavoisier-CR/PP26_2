/**
 * Classe Cliente_202311250006
 *
 * Classe cliente que utiliza os métodos públicos da biblioteca
 * Calculadora_202311250006 (fornecida como .jar) para disparar uma
 * sequência de chamadas às quatro operações básicas e apresentar
 * os resultados no terminal (shell).
 *
 * Para executar em qualquer computador, basta ter o Calculadora_202311250006.jar
 * no classpath (ver README_202311250006.txt para instruções).
 *
 * Matrícula: 202311250006
 */
public class Cliente_202311250006 {

    public static void main(String[] args) {
        // Instancia a biblioteca Calculadora_202311250006
        Calculadora_202311250006 calculadora = new Calculadora_202311250006();

        double a = 10;
        double b = 5;

        System.out.println("=== Cliente_202311250006 utilizando a biblioteca Calculadora_202311250006 ===");
        System.out.println("Valores utilizados: a = " + a + " | b = " + b);
        System.out.println();

        double resultadoSoma = calculadora.somar(a, b);
        System.out.println("Soma: " + a + " + " + b + " = " + resultadoSoma);

        double resultadoSubtracao = calculadora.subtrair(a, b);
        System.out.println("Subtração: " + a + " - " + b + " = " + resultadoSubtracao);

        double resultadoMultiplicacao = calculadora.multiplicar(a, b);
        System.out.println("Multiplicação: " + a + " * " + b + " = " + resultadoMultiplicacao);

        try {
            double resultadoDivisao = calculadora.dividir(a, b);
            System.out.println("Divisão: " + a + " / " + b + " = " + resultadoDivisao);
        } catch (ArithmeticException e) {
            System.out.println("Erro na divisão: " + e.getMessage());
        }

        System.out.println();
        System.out.println("Testando divisão por zero (tratamento de exceção):");
        try {
            double resultadoDivisaoZero = calculadora.dividir(a, 0);
            System.out.println("Divisão: " + a + " / 0 = " + resultadoDivisaoZero);
        } catch (ArithmeticException e) {
            System.out.println("Erro na divisão: " + e.getMessage());
        }
    }
}
