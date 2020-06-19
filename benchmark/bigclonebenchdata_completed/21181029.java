import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21181029 {
public MyHelperClass NULL;

    public void run()  throws Throwable {
        boolean isRunning = NULL; //new boolean();
        isRunning = true;
        try {
            URL url = new URL("http://dcg.ethz.ch/projects/sinalgo/version");
            URLConnection con = url.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.connect();
            PrintStream ps = new PrintStream(con.getOutputStream());
            ps.println("GET index.html HTTP/1.1");
            ps.flush();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line = in.readLine();
            if (line != null) {
                MyHelperClass Configuration = new MyHelperClass();
                if (line.equals(Configuration.versionString)) {
                    MyHelperClass displayIfOK = new MyHelperClass();
                    if ((boolean)(Object)displayIfOK) {
                        MyHelperClass Main = new MyHelperClass();
                        Main.info("You are using the most recent version of Sinalgo.");
                    }
                } else {
//                    MyHelperClass Configuration = new MyHelperClass();
                    String msg = "\n" + "+----------------------------------------------------------------------\n" + "| You are currently running Sinalgo " + Configuration.versionString + ".\n" + "| A more recent version of Sinalgo is available (" + line + ")\n" + "+---------------------------------------------------------------------\n" + "| To download the latest version, please visit\n" + "| http://sourceforge.net/projects/sinalgo/\n" + "+---------------------------------------------------------------------\n" + "| You may turn off these version checks through the 'Settings' dialog.\n" + "| Note:   Sinalgo automatically tests for updates at most once\n" + "|         every 24 hours.\n" + "+---------------------------------------------------------------------\n";
                    MyHelperClass Main = new MyHelperClass();
                    Main.warning(msg);
                }
            }
        } catch (Exception e) {
            MyHelperClass Configuration = new MyHelperClass();
            String msg = "\n" + ">----------------------------------------------------------------------\n" + "> Unable to test for updates of Sinalgo. The installed version\n" + "> is " + Configuration.versionString + "\n" + ">---------------------------------------------------------------------\n" + "> To check for more recent versions, please visit\n" + "> http://sourceforge.net/projects/sinalgo/\n" + ">---------------------------------------------------------------------\n" + "> You may turn off these version checks through the 'Settings' dialog.\n" + "| Note:   Sinalgo automatically tests for updates at most once\n" + "|         every 24 hours.\n" + ">---------------------------------------------------------------------\n";
            MyHelperClass Main = new MyHelperClass();
            Main.warning(msg);
        } finally {
//            MyHelperClass isRunning = new MyHelperClass();
            isRunning =(boolean)(Object)(MyHelperClass)(Object) false;
            MyHelperClass AppConfig = new MyHelperClass();
            AppConfig.getAppConfig().timeStampOfLastUpdateCheck = System.currentTimeMillis();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass timeStampOfLastUpdateCheck;
	public MyHelperClass versionString;
public MyHelperClass getAppConfig(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass warning(String o0){ return null; }}
