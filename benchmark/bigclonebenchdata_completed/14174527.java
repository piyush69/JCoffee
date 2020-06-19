import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14174527 {
public MyHelperClass term(){ return null; }

    public void run_two()  throws Throwable {
        System.out.println("Waiting to see if server has logged in");
        MyHelperClass rept = new MyHelperClass();
        if (rept != null) {
            MyHelperClass rept = new MyHelperClass();
            rept.post("Checking if RegServer is online..");
        }
        try {
            boolean waiting = true;
            while (waiting) {
                String con = "";
                String s;
                MyHelperClass where = new MyHelperClass();
                URL url = new URL(where);
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                System.out.print("Checking for xRegistry..");
                MyHelperClass rept = new MyHelperClass();
                if (rept != null) {
                    MyHelperClass rept = new MyHelperClass();
                    rept.post("Searching for xRegistryServer..");
                }
                while ((s = br.readLine()) != null) {
                    con = con + s;
                }
                MyHelperClass err_catch = new MyHelperClass();
                err_catch = con;
                try {
                    br.close();
                } catch (IOException ioe) {
                    System.out.print("..b_r wouldn't close..");
                }
                MyHelperClass servers = new MyHelperClass();
                servers = xls.split("SERVER", con);
                MyHelperClass servers = new MyHelperClass();
                if (servers.length < 1) {
                    System.out.println("-->Server not available yet.");
                    MyHelperClass rept = new MyHelperClass();
                    if (rept != null) {
                        MyHelperClass rept = new MyHelperClass();
                        rept.post("-->Server currently unavailable..");
                    }
                    try {
                        MyHelperClass read_delay = new MyHelperClass();
                        Thread.sleep(read_delay);
                    } catch (Exception inter) {
                    }
                    MyHelperClass read_delay = new MyHelperClass();
                    if (read_delay < 20000) {
                        MyHelperClass read_delay = new MyHelperClass();
                        read_delay = read_delay * 2;
                        MyHelperClass debug = new MyHelperClass();
                        if (debug == true) {
                            MyHelperClass read_delay = new MyHelperClass();
                            System.out.println("Set read_delay to:" + read_delay);
                        }
                    } else {
                        MyHelperClass read_delay = new MyHelperClass();
                        read_delay = read_delay + 3000;
                    }
                    MyHelperClass read_delay = new MyHelperClass();
                    if (read_delay > 90000) {
                        waiting = false;
                    }
                }
                MyHelperClass servers = new MyHelperClass();
                if (servers.length > 0) {
                    waiting = false;
                }
            }
            MyHelperClass servers = new MyHelperClass();
            String[] regip = xls.split("IP", servers[0]);
            MyHelperClass servers = new MyHelperClass();
            String[] regport = xls.split("PORT", servers[0]);
            int rp = 0;
            try {
                rp = Integer.parseInt(regport[0]);
            } catch (NumberFormatException nfe) {
                rp = 0;
            }
            System.out.println("Trying for socket on " + regip[0] + ", port:" + rp);
            MyHelperClass rept = new MyHelperClass();
            if (rept != null) {
                MyHelperClass rept = new MyHelperClass();
                rept.post("Connecting to RegServer");
            }
            int f = 0;
            Socket client = new Socket(InetAddress.getByName(regip[0]), rp);
            System.out.println("Socket connected to xRegistry");
            MyHelperClass rept = new MyHelperClass();
            if (rept != null) {
                MyHelperClass rept = new MyHelperClass();
                rept.post("Connected to RegServer");
            }
            MyHelperClass xcc = new MyHelperClass();
            xcc = new xClientConn(client);
            MyHelperClass ipad = new MyHelperClass();
            xcc.set_IP(ipad);
            MyHelperClass port = new MyHelperClass();
            xcc.set_Port(port);
            MyHelperClass xcc = new MyHelperClass();
            xcc.setListen(this);
            MyHelperClass xcc = new MyHelperClass();
            new Thread(xcc).start();
        } catch (Exception e) {
            MyHelperClass err_catch = new MyHelperClass();
            System.out.println("Failed client connection to registry, 'Java' errorcodes:\n" + e.toString() + "\n\nMessage from server?:\n" + err_catch);
            MyHelperClass rept = new MyHelperClass();
            if (rept != null) {
                MyHelperClass rept = new MyHelperClass();
                rept.post("Failed at registry connect!");
            }
            MyHelperClass debug = new MyHelperClass();
            if (debug == true) {
                e.printStackTrace();
            }
            term();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
