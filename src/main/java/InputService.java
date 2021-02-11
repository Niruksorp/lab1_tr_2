import java.io.IOException;

public class InputService {
    String getUserString() {
        String s = "";
        int inChar;
        try {
            inChar = System.in.read();
            while (System.in.available() > 0) {
                s += (char) inChar;
                inChar = System.in.read();
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
        return s;
    }
    Boolean validateUserInput(String s, char[] alphabet) {
        return s
                .chars()
                .allMatch(i -> i == alphabet[0] || i == alphabet[1]);
    }
}
