package no.rubstein;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class HttpClient {
    public HttpClient(String host, int port, String request){
    }

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("httpbin.org", 80);

        socket.getOutputStream().write(
                ("GET /html HTTP/1.1\r\n" +
                        "Connection: close\r\n" +
                        "Host: httpbin.org\r\n" +
                        "\r\n").getBytes()
        );

        InputStream in = socket.getInputStream();
        int c;
        while ((c = in.read()) != -1) {
            System.out.print((char)c);
        }

    }

    public int getStatusCode() {
        return 200;
    }
}
