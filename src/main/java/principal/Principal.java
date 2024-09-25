package principal;

import javax.swing.JOptionPane;
import model.Triangulo;

public class Principal {
    public static void main(String[] args) {
        // Declara e instância o objeto
        Triangulo tril = new Triangulo();

        // Entrada
        tril.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo")));
        tril.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo")));

        // Saída
        JOptionPane.showMessageDialog(null, "A área do triângulo é " + tril.getArea());
    }
}
