//Daniela Solorzano Perez 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CalcuBasic extends JFrame implements ActionListener {

   JPanel fondo = new JPanel();
   JLabel jlYatra;
   JTextField disply;
   double num1, num2;
   int operacion;
   JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jb0;
   JButton jborrar, jbigual, jbpunt, jbsum, jbres, jbmult, jbdiv;
   
   public CalcuBasic() {
      this.setSize(290, 420);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setTitle("CALCULADORA");
      this.setLocationRelativeTo(null);
      fondo.setLayout(null);
      this.setContentPane(fondo);
      
      jlYatra = new JLabel();
      jlYatra.setText("YATRA");
      jlYatra.setBounds(30, 50, 70, 80);
      jlYatra.setFont(new Font("cooper black", Font.BOLD, 16));
      fondo.add(jlYatra);
      
      disply = new JTextField(" ");
      disply.setFont(new Font("Arial", Font.BOLD, 50));
      disply.setBounds(10, 10, 240, 50);
      disply.setEditable(false);
      fondo.add(disply);
      
      jborrar = new JButton("C");
      jborrar.setBounds(200, 70, 50, 50);
      jborrar.setFont(new Font("Arial", Font.BOLD, 18));
      jborrar.addActionListener(this);
      fondo.add(jborrar);
      
      jb0 = new JButton("0");
      jb0.setBounds(80, 310, 50, 50);
      jb0.setFont(new Font("Arial", Font.BOLD, 20));
      jb0.addActionListener(this);
      fondo.add(jb0);

      jb1 = new JButton("1");
      jb1.setBounds(20, 250, 50, 50);
      jb1.setFont(new Font("Arial", Font.BOLD, 20));
      jb1.addActionListener(this);
      fondo.add(jb1);

      jb2 = new JButton("2");
      jb2.setBounds(80, 250, 50, 50);
      jb2.setFont(new Font("Arial", Font.BOLD, 20));
      jb2.addActionListener(this);
      fondo.add(jb2);

      jb3 = new JButton("3");
      jb3.setBounds(140, 250, 50, 50);
      jb3.setFont(new Font("Arial", Font.BOLD, 20));
      jb3.addActionListener(this);
      fondo.add(jb3);

      jb4 = new JButton("4");
      jb4.setBounds(20, 190, 50, 50);
      jb4.setFont(new Font("Arial", Font.BOLD, 20));
      jb4.addActionListener(this);
      fondo.add(jb4);

      jb5 = new JButton("5");
      jb5.setBounds(80, 190, 50, 50);
      jb5.setFont(new Font("Arial", Font.BOLD, 20));
      jb5.addActionListener(this);
      fondo.add(jb5);

      jb6 = new JButton("6");
      jb6.setBounds(140, 190, 50, 50);
      jb6.setFont(new Font("Arial", Font.BOLD, 20));
      jb6.addActionListener(this);
      fondo.add(jb6);

      jb7 = new JButton("7");
      jb7.setBounds(20, 130, 50, 50);
      jb7.setFont(new Font("Arial", Font.BOLD, 20));
      jb7.addActionListener(this);
      fondo.add(jb7);

      jb8 = new JButton("8");
      jb8.setBounds(80, 130, 50, 50);
      jb8.setFont(new Font("Arial", Font.BOLD, 20));
      jb8.addActionListener(this);
      fondo.add(jb8);

      jb9 = new JButton("9");
      jb9.setBounds(140, 130, 50, 50);
      jb9.setFont(new Font("Arial", Font.BOLD, 20));
      jb9.addActionListener(this);
      fondo.add(jb9);
      
      jbmult = new JButton("x");
      jbmult.setBounds(200, 250, 50, 50);
      jbmult.setFont(new Font("Arial", Font.BOLD, 20));
      jbmult.addActionListener(this);
      fondo.add(jbmult);

      jbsum = new JButton("+");
      jbsum.setBounds(200, 130, 50, 50);
      jbsum.setFont(new Font("Arial", Font.BOLD, 20));
      jbsum.addActionListener(this);
      fondo.add(jbsum);

      jbres = new JButton("-");
      jbres.setBounds(200, 190, 50, 50);
      jbres.setFont(new Font("Arial", Font.BOLD, 20));
      jbres.addActionListener(this);
      fondo.add(jbres);

      jbdiv = new JButton("/");
      jbdiv.setBounds(200, 310, 50, 50);
      jbdiv.setFont(new Font("Arial", Font.BOLD, 20));
      jbdiv.addActionListener(this);
      fondo.add(jbdiv);
      
      jbpunt = new JButton(".");
      jbpunt.setBounds(20, 310, 50, 50);
      jbpunt.setFont(new Font("Arial", Font.BOLD, 20));
      jbpunt.addActionListener(this);
      fondo.add(jbpunt);

      jbigual = new JButton("=");
      jbigual.setBounds(140, 310, 50, 50);
      jbigual.setFont(new Font("Arial", Font.BOLD, 20));
      jbigual.addActionListener(this);
      fondo.add(jbigual);

   }
   
   public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jb0) {
            disply.setText(disply.getText() + "0");
        }

        if (ae.getSource() == jb1) {
            disply.setText(disply.getText() + "1");
        }

        if (ae.getSource() == jb2) {
            disply.setText(disply.getText() + "2");
        }

        if (ae.getSource() == jb3) {
            disply.setText(disply.getText() + "3");
        }

        if (ae.getSource() == jb4) {
            disply.setText(disply.getText() + "4");
        }

        if (ae.getSource() == jb5) {
            disply.setText(disply.getText() + "5");
        }

        if (ae.getSource() == jb6) {
            disply.setText(disply.getText() + "6");
        }

        if (ae.getSource() == jb7) {
            disply.setText(disply.getText() + "7");
        }

        if (ae.getSource() == jb8) {
            disply.setText(disply.getText() + "8");
        }

        if (ae.getSource() == jb9) {
            disply.setText(disply.getText() + "9");
        }

        if (ae.getSource() == jbpunt) {
            disply.setText(disply.getText() + ".");
        }

        if (ae.getSource() == jborrar) {
            disply.setText(" ");
        }

        if (ae.getSource() == jbsum) {
            num1 = Double.parseDouble(disply.getText());
            operacion = 1;
            disply.setText("");
        }

        if (ae.getSource() == jbres) {
            num1 = Double.parseDouble(disply.getText());
            operacion = 2;
            disply.setText("");
        }

        if (ae.getSource() == jbmult) {
            num1 = Double.parseDouble(disply.getText());
            operacion = 3;
            disply.setText("");
        }

        if (ae.getSource() == jbdiv) {
            num1 = Double.parseDouble(disply.getText());
            operacion = 4;
            disply.setText("");
        }

        if (ae.getSource() == jbigual) {
            num2 = Double.parseDouble(disply.getText());
            switch (operacion) {
                case 1:
                    disply.setText(String.valueOf(num1 + num2));
                    break;
                case 2:
                    disply.setText(String.valueOf(num1 - num2));
                    break;
                case 3:
                    disply.setText(String.valueOf(num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");
                        
                    } else {
                        disply.setText(String.valueOf(num1 / num2));
                    }
                    break;
            }
        }
    }

}
