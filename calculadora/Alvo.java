/**
 * Interface Alvo
 *
 * Define o contrato que o Adapter_202311250006 deve implementar.
 * Representa a "interface esperada" pelo cliente que consome operações
 * matemáticas com inteiros (int), diferente da interface original de
 * Calculadora_202311250006, que trabalha com double.
 *
 * Este é o papel clássico do "Target" no padrão de projeto Adapter.
 */
public interface Alvo {
    int add(int a, int b);
    int sub(int a, int b);
    int mult(int a, int b);
    int div(int a, int b);
}
 
