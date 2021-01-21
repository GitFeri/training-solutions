package week12d04;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Decoder {
    public void readFileAndWrite(String fileName) {
        Path file = Path.of(fileName);
        try (InputStream inputStream = new BufferedInputStream(Files.newInputStream(file))) {
            byte[] bytes = new byte[1000];
            int size;
            while ((size = inputStream.read(bytes)) > 0) {
                decodeIntsAndWrite(bytes, size);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private void writeFromByteToChar(byte[] bytes) {
        for (byte b : bytes) {
            System.out.print((char)b);
        }

    }

    private void decodeIntsAndWrite(byte[] bytes, int size) {
        byte[] result = new byte[size];
        for (int i = 0; i < size; i++) {
            result[i] = (byte) (bytes[i] + 10);
        }
        writeFromByteToChar(result);
    }


    public static void main(String[] args) {
        Decoder decoder = new Decoder();
        decoder.readFileAndWrite("secret.dat");
    }
}
