package uefs.ecomp.PSConsumer.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author larsid
 */
public class Client {
    private int a=5;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    
    public void startConnection(String ip, int port) throws IOException {
        clientSocket = new Socket("localhost", 4000);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }
    
    public String sendMessage(int a) throws IOException {
        out.println(a);
        String resp = in.readLine();
        return resp;
    }
    
    public void stopConnection() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
    }
    
   /* public static void main(String[] args){
        
        
    }
*/
}
