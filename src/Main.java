import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Register register = new Register();

//action listener for btn click
        register.getBtn_register().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //can add some validation


                
                //submitting all data to the array
                String [] data = {
                        "You Entered Following Data: ",
                        "Username: " + register.getEt_username().getText(),
                        "Email: " + register.getEt_email().getText(),
                        "Country: : " + register.getEt_country().getText(),
                        "City: " + register.getEt_city().getText(),
                        "Street: " + register.getEt_street().getText(),
                        "Password: " + register.getEt_password().getText(),
                        "PhoneNumber: " + register.getEt_phoneNumber().getText(),
                        "Gender Male: " + register.getCb_male().isSelected(),
                        "Gender Female: " + register.getCb_female().isSelected(),
                        "Successfully registered!"};

                //Passing data to the Jlist object
                register.getList1().setListData(data);


                //Resetting values of the fields
                register.getEt_username().setText("");
                register.getEt_email().setText("");
                register.getEt_country().setText("");
                register.getEt_city().setText("");
                register.getEt_street().setText("");
                register.getEt_password().setText("");
                register.getEt_phoneNumber().setText("");
                register.getCb_male().setSelected(false);
                register.getCb_female().setSelected(false);

            }
        });



    }
}