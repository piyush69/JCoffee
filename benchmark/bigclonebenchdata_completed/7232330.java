import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c7232330 {
public MyHelperClass workDir;
	public MyHelperClass fromServer;
	public MyHelperClass info;
	public MyHelperClass toServer;

    public void LocalizationSolver(String name, String serverIP, int portNum, String workDir) {
        this.info =(MyHelperClass)(Object) new HashMap<String, Object>();
        this.workDir =(MyHelperClass)(Object) workDir;
        try {
            Socket solverSocket = new Socket(serverIP, portNum);
            this.fromServer =(MyHelperClass)(Object) new Scanner(solverSocket.getInputStream());
            this.toServer =(MyHelperClass)(Object) new PrintWriter(solverSocket.getOutputStream(), true);
            this.toServer.println("login client abc");
            this.toServer.println("solver " + name);
            System.out.println(this.fromServer.nextLine());
        } catch (IOException e) {
            System.err.println(e);
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println("Localization Solver started with name: " + name);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass nextLine(){ return null; }
	public MyHelperClass println(String o0){ return null; }}
