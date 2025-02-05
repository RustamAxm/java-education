import org.example.protobuf.ApplicationProtos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ApplicationProtos.Application app =
                ApplicationProtos.Application.newBuilder()
                        .setPayload(15)
                        .build();
        System.out.println(app.getPayload());

        FileOutputStream fos = new FileOutputStream("out/out.bin");
        app.writeTo(fos);
        ApplicationProtos.Application deserialized
                = ApplicationProtos.Application.newBuilder()
                .mergeFrom(new FileInputStream("out/out.bin")).build();

        System.out.println(deserialized.getPayload());
    }
}