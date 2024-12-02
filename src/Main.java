import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // frame principal
        JFrame frame = new JFrame("Calculadora de IMC");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new BorderLayout());

        // painel central com layout
        JPanel painelCentral = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Espaçamento interno

        // label e campo para o peso
        JLabel labelPeso = new JLabel("Peso (kg):");
        gbc.gridx = 0;
        gbc.gridy = 0;
        painelCentral.add(labelPeso, gbc);

        JTextField campoPeso = new JTextField(10);
        gbc.gridx = 1;
        painelCentral.add(campoPeso, gbc);

        // label e campo para a altura
        JLabel labelAltura = new JLabel("Altura (m):");
        gbc.gridx = 0;
        gbc.gridy = 1;
        painelCentral.add(labelAltura, gbc);

        JTextField campoAltura = new JTextField(10);
        gbc.gridx = 1;
        painelCentral.add(campoAltura, gbc);

        // botão de calcular
        JButton button = new JButton("Calcular");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2; // o botão ocupa duas colunas
        gbc.fill = GridBagConstraints.CENTER;
        painelCentral.add(button, gbc);

        // adicionar o painel ao frame
        frame.add(painelCentral, BorderLayout.CENTER);

        // exibir o frame (visibilidade deve ser feita após adicionar os componentes)
        frame.setVisible(true);

        // ação do botão
        button.addActionListener(e -> {
            try {
                // captura dos valores inseridos
                double peso = Double.parseDouble(campoPeso.getText());
                double altura = Double.parseDouble(campoAltura.getText());
                double imc = peso / (altura * altura);

                // exibição do resultado
                JOptionPane.showMessageDialog(frame, String.format("Seu IMC é: %.2f", imc),
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Por favor, insira valores numéricos válidos.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
