package bank.mangement.system;

import javax.swing.*;

public class Login extends JFrame {
    Login(){
        setSize(800,400);
        setVisible(true);
        setLocation(350,200);
        setTitle("AUTOMATED TELLER MACHINE");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(""));
    }
    public static void main(String args[]){
        new Login();
    }
}
