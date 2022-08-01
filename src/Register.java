import javax.swing.*;

public class Register extends JFrame {
    private JPanel panel1;
    private JButton btn_register;
    private JTextField et_username;
    private JTextField et_email;
    private JTextField et_country;
    private JTextField et_city;
    private JTextField et_street;
    private JTextField et_phoneNumber;
    private JTextField et_password;
    private JList list1;
    private JCheckBox cb_female;
    private JCheckBox cb_male;

    //Parameters for Frame
    public Register() {
        add(panel1);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Registration Basic");
        setVisible(true);
    }

//Getters for buttons
    public JPanel getPanel1() {
        return panel1;
    }

    public JButton getBtn_register() {
        return btn_register;
    }

    public JTextField getEt_username() {
        return et_username;
    }

    public JTextField getEt_email() {
        return et_email;
    }

    public JTextField getEt_country() {
        return et_country;
    }

    public JTextField getEt_city() {
        return et_city;
    }

    public JTextField getEt_street() {
        return et_street;
    }

    public JTextField getEt_phoneNumber() {
        return et_phoneNumber;
    }

    public JTextField getEt_password() {
        return et_password;
    }

    public JList getList1() {
        return list1;
    }

    public JCheckBox getCb_female() {
        return cb_female;
    }

    public JCheckBox getCb_male() {
        return cb_male;
    }

}
