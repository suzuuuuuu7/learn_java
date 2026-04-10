import java.io.*;
import java.util.*;
import java.net.*;
public class Server {
    static int fact(int a) {
        if (a == 0)
            return 1;
        return a * fact(a - 1);
    }

        public static void main (String[]args)throws IOException {
            try {
                ServerSocket socket = new ServerSocket(3333);
                Socket clientsocket = socket.accept();
                System.out.println("Server is running");
                Scanner ins = new Scanner(clientsocket.getInputStream());
                PrintWriter outs = new PrintWriter(clientsocket.getOutputStream(), true);
                int num = ins.nextInt();
                outs.println(Server.fact(num));
                ins.close();
                outs.close();


            } catch (IOException e) {
                System.out.println("input output error" + e.getMessage());

            }
        }
    }
