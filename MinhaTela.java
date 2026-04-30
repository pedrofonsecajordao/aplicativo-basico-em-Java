import javax.swing.*;
import java.awt.event.*;

public class MinhaTela {
    public static void main(String[] args) {
        // 1. Criar o frame (a janela)
        JFrame frame = new JFrame("Minha Primeira Tela");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Usando layout nulo para posicionar manualmente

        // 2. Criar os componentes
        JLabel labelUsuario = new JLabel("Usuário:");
        labelUsuario.setBounds(20, 20, 80, 25);
        frame.add(labelUsuario);

        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(100, 20, 160, 25);
        frame.add(campoTexto);

        JButton botao = new JButton("Entrar");
        botao.setBounds(100, 80, 100, 25);
        frame.add(botao);

        // 3. Adicionar uma ação ao botão
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = campoTexto.getText();
                JOptionPane.showMessageDialog(frame, "Olá, " + nome + "!");
            }
        });

        // 4. Tornar a janela visível
        frame.setVisible(true);
    }
}