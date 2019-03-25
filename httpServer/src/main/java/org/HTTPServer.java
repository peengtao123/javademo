package org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;

public class HTTPServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8080);

            while (true) {
                Socket socket = ss.accept();
                BufferedReader bd = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                /**
                 * 接受HTTP请求
                 */
                String requestHeader;
                while ((requestHeader = bd.readLine()) != null && !requestHeader.isEmpty()) {
                    System.out.println(URLDecoder.decode(requestHeader));
                }

                //发送回执啊
                PrintWriter pw = new PrintWriter(socket.getOutputStream());

                pw.println("HTTP/1.1 200 OK");
                pw.println("Content-type:text/html;charset=utf-8");
                pw.println();
                pw.println("<h1>success!查</h1>");

                pw.flush();
                socket.close();
                System.out.println("----------------------------------------------------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}