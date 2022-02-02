import java.net.*;
import java.io.*;
public class HiClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("111.0.0.45" ,2222);
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        output.writeUTF("HOLA PEOPLE");
        output.flush();
        output.close();

        socket.close();
    }
    
}
