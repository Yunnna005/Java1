package labsheet5;

import javax.swing.*;

public class containsCharacterMethod {
    public static void main(String[] args) {
        String text, characterAsString;
        char character;

        text = JOptionPane.showInputDialog("Enter a piece of text");

        characterAsString = JOptionPane.showInputDialog("Enter a keyboard character");
        character = characterAsString.charAt(0);
        if(containsCharacter(text,character)){
            JOptionPane.showMessageDialog(null, "The text you entered contained the character "
                    + character, "Character Tester", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"The text you entered does not contain the character "
                            +character,"Character Tester", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }

    public static boolean containsCharacter(String s, char c){
        boolean result = false;
        for(int i = 0; i<s.length(); i++){
            if (s.charAt(i) == c){
                result = true;
                break;
            }
        }
        return result;
    }
}
