/**
 * Classe Calculadora_202311250006
 *
 * Biblioteca que implementa as quatro operações matemáticas básicas:
 * soma, subtração, multiplicação e divisão.
 *
 * Esta classe foi projetada para ser empacotada como uma biblioteca (.jar)
 * e reutilizada por qualquer classe Cliente de outro aluno, bastando
 * importar/adicionar o .jar ao classpath do projeto e instanciar a classe.
 *
 * Matrícula: 202311250006
 */
public class Calculadora_202311250006 {

    /**
     * Realiza a soma de dois números.
     *
     * @param a primeira parcela
     * @param b segunda parcela
     * @return o resultado da soma (a + b)
     */
    public double somar(double a, double b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números.
     *
     * @param a minuendo
     * @param b subtraendo
     * @return o resultado da subtração (a - b)
     */
    public double subtrair(double a, double b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números.
     *
     * @param a primeiro fator
     * @param b segundo fator
     * @return o resultado da multiplicação (a * b)
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Realiza a divisão de dois números.
     *
     * @param a dividendo
     * @param b divisor (não pode ser zero)
     * @return o resultado da divisão (a / b)
     * @throws ArithmeticException caso o divisor (b) seja igual a zero
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return a / b;
    }
}
