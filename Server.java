/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Point;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author noudo
 */
public class Server {
    
    public static void main(String[] args) throws IOException {
         ServerSocket ss = new ServerSocket(1234);
         System.out.println("Démarrage du serveur");
         
         Socket s = ss.accept();
         
         //Lecture de données
         InputStream is = s.getInputStream();
         InputStreamReader isr = new InputStreamReader(is);
         BufferedReader br = new BufferedReader(isr);
         
         
         //Ecriture de données
         OutputStream os = s.getOutputStream();
         PrintWriter pw = new PrintWriter(os,true);
         
         String IP = s.getRemoteSocketAddress().toString();
         pw.println("Bienvenue client IP= " +IP);
         String chaine = br.readLine();
         int n = chaine.length();
         
         pw.println("La longueur de la chaine est :" +n);
    }
     
    
}
