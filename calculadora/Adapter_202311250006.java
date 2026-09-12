/**
 * Classe Adapter_202311250006
 *
 * Implementa o padrão de projeto Adapter: "adapta" a interface de
 * Calculadora_202311250006 (que trabalha com double e usa os nomes
 * somar/subtrair/multiplicar/dividir) para a interface Alvo, esperada
 * pelo cliente (que trabalha com int e usa os nomes add/sub/mult/div).
 *
 * Herda (extends) o comportamento real de Calculadora_202311250006 e
 * expõe (implements) os métodos no formato definido por Alvo.
 *
 * Matrícula: 202311250006
 */
public class Adapter_202311250006 extends Calculadora_202311250006 implements Alvo {
 
    @Override
    public int add(int a, int b) {
        double resultado = somar(a, b);
        return (int) resultado;
    }
 
    @Override
    public int sub(int a, int b) {
        double resultado = subtrair(a, b);
        return (int) resultado;
    }
 
    @Override
    public int mult(int a, int b) {
        double resultado = multiplicar(a, b);
        return (int) resultado;
    }
 
    @Override
    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        double resultado = dividir(a, b);
        return (int) resultado;
    }
}
