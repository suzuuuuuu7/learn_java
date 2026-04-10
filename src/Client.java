import java.io.*;
import java.util.*;
import java.net.*;
public class Client {
    public static void main(String[] args)throws IOException {
        // Create connection
      try {
          Socket socket = new Socket("localhost", 3333);
          Scanner ins = new Scanner(socket.getInputStream());
          PrintWriter outs = new PrintWriter(socket.getOutputStream(),true);
          outs.println(6);
          int fact = ins.nextInt();
          ins.close();
          outs.close();
          socket.close();
      }
      catch (IOException e){
          System.out.println("Failed to connection"+e.getMessage());
      }


    }
}
