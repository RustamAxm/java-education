import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int b;
        int crc = 0;
        try {
            while ((b = inputStream.read()) != -1) {
                crc = Integer.rotateLeft(crc, 1) ^ b;
            }
        } catch (IOException e) {
            throw new IOException();
        }

        return crc;
    }
    public static InputStream getStream(byte [] data) {
        return new ByteArrayInputStream(data);
    }

    public static int [] getChars() {
        Charset charset = StandardCharsets.UTF_8;
        byte [] b = "Ы".getBytes(charset);
        int [] result = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            result [i] = Byte.toUnsignedInt(b [i]);
        }
        return result;
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[4096];
        int nRead;
        while ((nRead = inputStream.read(buffer)) != -1) {
            out.write(buffer, 0, nRead);
        }
        return new String(out.toByteArray(), charset);
    }

    public static void main(String[] args) {
        Logger log = Logger.getLogger("demo");
        InputStream stream;
        stream = getStream( new byte[] { 0x33, 0x45, 0x01});
        try {
            int result = checkSumOfStream(stream);
            log.log(Level.INFO, String.valueOf(result));
        } catch (Exception e) {
            log.log(Level.WARNING, e.getMessage());
        }
        int [] a = getChars();
        String b = new String("");
        for (int i = 0; i < a.length; i++) {
            b += a[i];
        }
        log.log(Level.INFO, b);

        Charset charset = StandardCharsets.UTF_8;
        stream = getStream( new byte[] {48, 49, 50, 51});
        try {
            String vals = readAsString(stream, charset);
            log.log(Level.INFO, vals);
        } catch (Exception _) {

        }
    }
}