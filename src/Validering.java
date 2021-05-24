
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */
public class Validering {
    
 public static boolean validationTxt(JTextField fieldToValidate, JLabel message) {
        boolean result = true;
        if (fieldToValidate.getText().isEmpty()) {
            message.setText("En eller flera rutor är tomma!");
            result = false;
            fieldToValidate.requestFocus();
        }
        return result;
    }

    public static boolean validationTxt(JTextField fieldToValidate, JTextArea message) {
        boolean result = true;
        if (fieldToValidate.getText().isEmpty()) {
            message.setText("En eller flera rutor är tomma!");
            result = false;
            fieldToValidate.requestFocus();
        }
        return result;
    }

    public static boolean validationTxtAndCb(JTextField fieldOne, JTextField fieldTwo, JComboBox cBox, JLabel message) {
        boolean result = true;
        if (fieldOne.getText().isEmpty() && fieldTwo.getText().isEmpty() && cBox.getSelectedItem().equals("-----")) {
            message.setText("Välj minst en ruta att uppdatera för den valda alien.");
            result = false;
        }
        return result;
    }

    public static boolean validationTxtDate(JTextField fieldToValidate, JLabel message) {
        boolean result = true;
        String fullDate = fieldToValidate.getText();

        if (fullDate.length() != 10) {
            message.setText("Datumet är felaktigt!");
            result = false;
        } else {
            String year = fullDate.substring(0, 4);
            String month = fullDate.substring(5, 7);
            String day = fullDate.substring(8, 10);
            String lineOne = fullDate.substring(4, 5);
            String lineTwo = fullDate.substring(7, 8);

            String regex = "\\d+"; //Kontrollerar att det er ett tal från 0 eller större

            Boolean yearTest = year.matches(regex);
            Boolean monthTest = month.matches(regex);
            Boolean dayTest = day.matches(regex);

            if (yearTest && monthTest && dayTest
                    && lineOne.equals("-") && lineTwo.equals("-")
                    && Integer.parseInt(month) >= 1 && Integer.parseInt(month) <= 12
                    && Integer.parseInt(day) >= 1 && Integer.parseInt(day) <= 31) {
            } else {
                result = false;
                message.setText("Datumet är felaktigt!");
                fieldToValidate.requestFocus();
            }
        }
        return result;
    }

    public static boolean validationTxtPhone(JTextField fieldToValidate, JTextArea message) {
        boolean result = false;
        if (fieldToValidate.getText().matches("[+() [0-9]-]+") || fieldToValidate.getText().matches("")) {

            result = true;

        } else {
            message.setText("Telefonnumret har fel format!");
            fieldToValidate.requestFocus();
        }
        return result;
    }

    public static boolean validationNumbers(JTextField fieldToValidate, JTextArea message, String messageText) {
        boolean result = false;
        if (fieldToValidate.getText().matches("[0-9]+")) {

            result = true;

        } else {
            message.setText(messageText);
            fieldToValidate.requestFocus();
            
        }
        return result;
    }
    

    public static boolean validationTxtPhone(JTextField fieldToValidate, JLabel message) {
        boolean result = false;
        if (fieldToValidate.getText().matches("[+() [0-9]-]+") || fieldToValidate.getText().matches("")) {

            result = true;
            fieldToValidate.requestFocus();

        } else {
            message.setText("Telefonnumret har fel format!");
        }
        return result;
    }

    public static boolean validationCb(JComboBox fieldToValidate, JLabel message) {
        boolean result = true;
        if (fieldToValidate.getSelectedItem().equals("Select")) {
            message.setText("En eller flera rutor är tomma!");
            result = false;
            fieldToValidate.requestFocus();
        }
        return result;
    }

    public static boolean validationCb(JComboBox fieldToValidate, JTextArea message) {
        boolean result = true;
        if (fieldToValidate.getSelectedItem().equals("-----")) {
            message.setText("En eller flera rutor är tomma!");
            result = false;
            fieldToValidate.requestFocus();
        }
        return result;
    }

    public static boolean validationTxtInt(JTextField fieldToValidate, JLabel message) {
        boolean result = false;
        if (fieldToValidate.getText().matches("[0-9]+") || fieldToValidate.getText().matches("")) {

            result = true;
            fieldToValidate.requestFocus();

        } else {
            message.setText("Ange siffror!");
        }
        return result;
    }

    public static boolean validationTxtNrOfChar(JTextField fieldToValidate, JLabel message) {
        boolean result = false;
        if (fieldToValidate.getText().length() <= 20) {

            result = true;
            fieldToValidate.requestFocus();

        } else {
            message.setText("För många tecken!");
        }
        return result;
    }

    
}
