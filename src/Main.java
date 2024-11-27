//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // função para calcular o IMC
    public static void calculoPrincipal(double peso, double altura) {
        double calcAltura = Math.pow(altura, 2);  // eleva a altura ao quadrado
        double imc = peso / calcAltura;  // calcula o IMC
        System.out.println(imc);  // exibe o resultado
    }

    public static void main(String[] args) {
        double peso = 80;
        double altura = 1.82;

        // chama a função calculoPrincipal passando peso e altura
        calculoPrincipal(peso, altura);
    }
}
