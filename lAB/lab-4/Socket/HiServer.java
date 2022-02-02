import java.io.*;
import java.net.*;
class HiServer{
public static void main(String[] args) throws IOException{
    ServerSocket ss = new ServerSocket(2222);
    Socket socket = ss.accept();
    DataInputStream input = new DataInputStream(socket.getInputStream());
    String message = (String)input.readUTF();

    System.out.println("Client is trying to say" +message);
    ss.close();

}
}