import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro extends JFrame {
    private JTextField campoNome;
    private JTextField campoEmail;
    private JTextField campoDataNascimento;
    private JPasswordField campoSenha;
    private JPasswordField campoConfirmarSenha;
    private JButton botaoCadastrar;
    private JButton botaoLimpar;

    public TelaCadastro() {
        setTitle("Cadastro - OnLibras");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 1));

        campoNome = new JTextField();
        campoEmail = new JTextField();
        campoDataNascimento = new JTextField("dd/mm/aaaa");
        campoSenha = new JPasswordField();
        campoConfirmarSenha = new JPasswordField();

        botaoCadastrar = new JButton("Cadastrar");
        botaoLimpar = new JButton("Limpar campos");

        add(new JLabel("Nome completo:"));
        add(campoNome);
        add(new JLabel("Email:"));
        add(campoEmail);
        add(new JLabel("Data de nascimento:"));
        add(campoDataNascimento);
        add(new JLabel("Senha:"));
        add(campoSenha);
        add(new JLabel("Confirmação da senha:"));
        add(campoConfirmarSenha);
        add(botaoCadastrar);
        add(botaoLimpar);

        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText();
                String email = campoEmail.getText();
                String dataNascimento = campoDataNascimento.getText();
                String senha = new String(campoSenha.getPassword());
                String confirmarSenha = new String(campoConfirmarSenha.getPassword());

                if (senha.equals(confirmarSenha)) {
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "As senhas não conferem!");
                }
            }
        });

        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campoNome.setText("");
                campoEmail.setText("");
                campoDataNascimento.setText("dd/mm/aaaa");
                campoSenha.setText("");
                campoConfirmarSenha.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaCadastro tela = new TelaCadastro();
            tela.setVisible(true);
        });
    }
}
