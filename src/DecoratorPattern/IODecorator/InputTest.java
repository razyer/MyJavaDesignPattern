package DecoratorPattern.IODecorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author tanzhen
 * @description
 * @date 2018/8/11
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        InputStream test = null;
        try {
            test = new LowerCaseInputStream(new FileInputStream("test.txt"));
            while ((c = test.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (test != null) {
                try {
                    test.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
