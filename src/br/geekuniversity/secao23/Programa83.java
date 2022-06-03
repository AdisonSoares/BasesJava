package br.geekuniversity.secao23;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Criando_aplicatico_executavel_no_windows
 */
public class Programa83 {
    public static void main(String[] args) {
        //Usuario e senha
        final String USER = "Admin";
        final String PASS = "123";

        //Titulo da janela
        JFrame frame = new JFrame("Login::Acesso ao sistema");

        //Ao clicar no x vai fechar a janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Agrupar os componentes da janela
        JPanel panel = new JPanel();

        //Definicao de layout
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        //Usuario
        JLabel lblUsuario = new JLabel("Usuario ");
        JTextField txtUsuario = new JTextField(20);
        txtUsuario.setToolTipText("Informe seu usuario de acesso: ");
        JLabel lblSenha = new JLabel("Senha ");
        JPasswordField txtSenha = new JPasswordField(20);
        txtSenha.setToolTipText("Informe sua senha de acesso: ");
        JButton btnLogin = new JButton("Login ");

        //Definindo o evento/acao no botao
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtUsuario.getText().equals(USER) && new String(txtSenha.getPassword()).equals(PASS)){
                    JOptionPane.showMessageDialog(frame, "Acesso permitido");
                }else{
                    JOptionPane.showMessageDialog(frame, "Acesso negado!");
                }
            }
        });

        //Agrupando o usuario no painel
        panel.add(lblUsuario);
        panel.add(txtUsuario);
        panel.add(lblSenha);
        panel.add(txtSenha);
        panel.add(btnLogin);

        //Alocando os recursos
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
