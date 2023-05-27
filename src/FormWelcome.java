import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FormWelcome extends Fundo{


        //tela2 = tela de boas vindas
        JFrame frameWelcome = new JFrame();

        //ImageIcon fundo = new ImageIcon(getClass().getResource("BlackPurple.jpg"));

        JLabel label2 = new JLabel(fundo);
        JLabel label3 = new JLabel();

        JButton continuar = new JButton();

        FormWelcome(String userID){

                /*_______________Botão_______________*/

                continuar.setVisible(true);
                continuar.setText("Continuar");
                continuar.setOpaque(false);
                continuar.setBackground(Color.magenta);
                continuar.setForeground(Color.white);
                continuar.setFont(new Font("Colibri",Font.PLAIN, 30));
                continuar.setBounds(510,420,250,70);
                continuar.setHorizontalAlignment(JLabel.CENTER);
                continuar.setVerticalAlignment(JLabel.BOTTOM);

                continuar.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                               if (e.getSource()==continuar){
                                       frameWelcome.dispose();
                                       new FormCadastroFilme();

                                }
                        }
                });




                /*_______________Título_______________*/

                label2.setSize(1280,720);
                label2.setOpaque(true);
                label2.setVisible(true);

                label3.setVisible(true);
                label3.setBounds(-5,0,1280,720);
                label3.setText("Bem-Vindo!");
                label3.setFont(new Font("Colibri",Font.BOLD, 70));
                label3.setForeground(Color.white);
                label3.setHorizontalTextPosition(JLabel.CENTER);
                label3.setVerticalTextPosition(JLabel.BOTTOM);
                label3.setHorizontalAlignment(JLabel.CENTER);
                label3.setVerticalAlignment(JLabel.CENTER);

                label3.setOpaque(false);
                label3.add(continuar);

                label2.add(label3);
                label2.add(continuar);


                /*_______________Frames_______________*/

                Toolkit toolkit = Toolkit.getDefaultToolkit();

                Dimension screenSize = toolkit.getScreenSize();

                int largura = screenSize.width;
                int altura = screenSize.height;

                int formWidth = 1280;
                int formHeight = 720;

                int formX  = (largura - formWidth) / 2;
                int formY = (altura - formHeight) / 2;

                frameWelcome.setVisible(true);
                frameWelcome.setLocation(formX,formY);
                frameWelcome.setForeground(new Color(0x44014F));
                frameWelcome.setBackground(new Color(0x44014F));
                frameWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frameWelcome.setResizable(false);
                frameWelcome.setSize(formWidth,formHeight);
                frameWelcome.setTitle("MovieTime");
                frameWelcome.add(label2);



        }

}