import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22442269 {
public MyHelperClass start(){ return null; }
public MyHelperClass start(){ return null; }
//public MyHelperClass start(){ return null; }
//public MyHelperClass start(){ return null; }
//public MyHelperClass start(){ return null; }
//public MyHelperClass start(){ return null; }
//public MyHelperClass start(){ return null; }
//public MyHelperClass start(){ return null; }
//public MyHelperClass start(){ return null; }

    public static void checkAndUpdateGameData()  throws Throwable {
        new ErrThread() {

//            @Override
            public void handledRun() throws Throwable {
                try {
                    MyHelperClass ONLINE_CLIENT_DATA = new MyHelperClass();
                    URL url = new URL(ONLINE_CLIENT_DATA + "gamedata.xml");
                    BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                    int lastversion = 0;
                    String readHeader1 = br.readLine();
                    String readHeader2 = br.readLine();
                    String[] parts = readHeader2.split(" ");
                    lastversion = new Integer(parts[1]);
                    MyHelperClass GameDatabase = new MyHelperClass();
                    GameDatabase.loadVersion();
//                    MyHelperClass GameDatabase = new MyHelperClass();
                    if ((int)(Object)GameDatabase.version < lastversion) {
                        MyHelperClass LogTypes = new MyHelperClass();
                        MyHelperClass Logger = new MyHelperClass();
                        Logger.log(LogTypes.LOG, "Downloading new gamedata");
                        BufferedOutputStream bo = null;
//                        MyHelperClass GameDatabase = new MyHelperClass();
                        File destfile = new File((String)(Object)GameDatabase.dataFilePath);
                        if (!destfile.createNewFile()) {
                            destfile.delete();
                            destfile.createNewFile();
                        }
                        bo = new BufferedOutputStream(new FileOutputStream(destfile));
                        bo.write((readHeader1 + "\n").getBytes());
                        bo.write((readHeader2 + "\n").getBytes());
                        int readedbyte;
                        while ((readedbyte = br.read()) != -1) {
                            bo.write(readedbyte);
                        }
                        bo.flush();
                        try {
                            br.close();
                            bo.close();
                        } catch (Exception ex) {
//                            MyHelperClass Logger = new MyHelperClass();
                            Logger.log(ex);
                        }
                    }
                } catch (java.net.UnknownHostException unknownHost) {
                    MyHelperClass Logger = new MyHelperClass();
                    Logger.log("Sourceforge is down, cannot update gamedata");
                } catch (Exception e) {
                    MyHelperClass FrameOrganizer = new MyHelperClass();
                    MyHelperClass JOptionPane = new MyHelperClass();
                    JOptionPane.showMessageDialog(FrameOrganizer.getClientFrame(), "The gamedata is outdated, but Coopnet couldn't update it!", "Gamedata outdated", JOptionPane.INFORMATION_MESSAGE);
                    throw e;
                } finally {
                    MyHelperClass GameDatabase = new MyHelperClass();
                    GameDatabase.loadVersion();
//                    MyHelperClass GameDatabase = new MyHelperClass();
                    GameDatabase.load("", GameDatabase.dataFilePath);
//                    MyHelperClass GameDatabase = new MyHelperClass();
                    GameDatabase.detectGames();
                }
            }
        }.start();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LOG;
	public MyHelperClass dataFilePath;
	public MyHelperClass version;
	public MyHelperClass INFORMATION_MESSAGE;
public MyHelperClass log(Exception o0){ return null; }
	public MyHelperClass log(String o0){ return null; }
	public MyHelperClass loadVersion(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass showMessageDialog(MyHelperClass o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass detectGames(){ return null; }
	public MyHelperClass getClientFrame(){ return null; }
	public MyHelperClass load(String o0, MyHelperClass o1){ return null; }}

class ErrThread {

}
