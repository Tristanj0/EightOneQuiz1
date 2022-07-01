import javax.swing.*;

public class LoopFun {

    /**
     * Given a number, return the factorial of that number.
     * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
     *
     * @param number
     * @return the factorial of the number
     */
    public Integer factorial(Integer number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            number = number * i;
        }
        return number;
    }


    /**
     * Given a phrase, get the acronym of that phrase. Acronym is the combination of
     * the first character of each word in upper case.
     * For example, given "Ruby on Rails", this method will return "ROR"
     *
     * @param phrase
     * @return Upper case string of the first letter of each word
     */
    public String acronym(String phrase) {
        String[] phrase2 = phrase.split(" ");
        String acronym = "";

        for (int i = 0; i <= phrase2.length - 1; i++) {
            acronym += phrase2[i].charAt(0);
        }
        return acronym.toUpperCase();
    }


    /**
     * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
     * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
     * at the end of the alphabet, it will wraps around.
     * For example:
     * 'a' => 'd'
     * 'w' => 'z'
     * 'x' => 'a'
     * 'y' => 'b'
     *
     * @param word
     * @return the encrypted string by shifting each character by three character
     */
    public String encrypt(String word) {
        StringBuilder crypt = new StringBuilder();
        int i;
        for (i = 0; i < word.length(); i++) {

            switch (word.charAt(i)) {
                case 'x':
                    crypt.append('a');
                    break;
                case 'y':
                    crypt.append('b');
                    break;
                case 'z':
                    crypt.append('c');
                    break;
                default:
                    crypt.append((char) (word.charAt(i) + 3));
            }
        }
        return crypt.toString();
    }
}

