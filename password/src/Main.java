import javax.swing.*;
import javax.swing.JOptionPane;
import java.security.SecureRandom;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
        String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String DIGITS = "0123456789";
        String SPECIAL_CHARACTER = "!@#$%&/()<>;";

        SecureRandom random = new SecureRandom();
        int length = 8;
        String includeUppercase = JOptionPane.showInputDialog("¿Incluir mayúsculas? (Sí/No)").toLowerCase();
        String includeSpecial = JOptionPane.showInputDialog("¿Incluir caracteres especiales? (Sí/No)").toLowerCase();
        String lengthInput = JOptionPane.showInputDialog("Introduce la longitud de la contraseña (por defecto es 8 caracteres):");

        if (!lengthInput.isEmpty()) {
            length = Integer.parseInt(lengthInput);
        }

        String password = generateRandomPassword(length, includeUppercase.equals("sí"), includeSpecial.equals("sí"));
        JOptionPane.showMessageDialog(null, "Tu contraseña generada es: " + password);
        checkPasswordStrength(password);
    }

    private static String generateRandomPassword(int len, boolean includeUppercase, boolean includeSpecial) {
        String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
        String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String DIGITS = "0123456789";
        String SPECIAL_CHARACTER = "!@#$%&/()<>;";

        String characters = LOWERCASE + DIGITS;
        if (includeUppercase) {
            characters += UPPERCASE;
        }
        if (includeSpecial) {
            characters += SPECIAL_CHARACTER;
        }

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            password.append(characters.charAt(random.nextInt(characters.length())));
        }
        return password.toString();
    }

    private static void checkPasswordStrength(String password) {
        int strengthScore = 0;

        if (password.length() >= 8) strengthScore++;
        if (password.matches(".*[A-Z].*")) strengthScore++;
        if (password.matches(".*[a-z].*")) strengthScore++;
        if (password.matches(".*[0-9].*")) strengthScore++;
        if (password.matches(".*[!@#$%&/()<>;].*")) strengthScore++;

        String strength;
        switch (strengthScore) {
            case 5:
                strength = "Muy fuerte";
                break;
            case 4:
                strength = "Fuerte";
                break;
            case 3:
                strength = "Media";
                break;
            default:
                strength = "Débil";
                break;
        }

        JOptionPane.showMessageDialog(null, "La fortaleza de tu contraseña es: " + strength);
    }


}