package decorator.IODecorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author tanzhen
 * @description
 * @date 2018/8/11
 */
public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        if (c != -1) {
            c = Character.toLowerCase(c);
        }
        return c;
    }

    @Override
    public int read(byte b[], int off, int len) throws IOException {
        int result = super.read(b, off, len);
        if (result != -1) {
            result = Character.toLowerCase(result);
        }
        return result;
    }
}
