import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c661335 {
public MyHelperClass Main;
	public MyHelperClass fileName;
	public MyHelperClass result;
	public MyHelperClass Debug;

    public void update(String target, String cfgVersion) throws Throwable, MalformedURLException, FileNotFoundException, IOException {
        MyHelperClass Debug = new MyHelperClass();
        Debug.log("Config Updater", "Checking for newer configuration...");
        URL url = new URL(target);
        String[] urlSplit = target.split("/");
        this.fileName =(MyHelperClass)(Object) urlSplit[urlSplit.length - 1];
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(Main.getHomeDir() + "tmp-" + this.fileName));
        URLConnection urlConnection = url.openConnection();
        InputStream in = urlConnection.getInputStream();
        byte[] buffer = new byte[1024];
        int numRead;
        int fileSize = 0;
        while ((numRead = in.read(buffer)) != -1) {
            out.write(buffer, 0, numRead);
            fileSize += numRead;
        }
        Debug.log("Config Updater", "Read latest configuration: " + fileSize + " bytes");
        in.close();
        out.close();
        XMLController xmlC = new XMLController();
        String newFileVersion = xmlC.readCfgVersion(Main.getHomeDir() + "tmp-" + this.fileName);
        if (new File(Main.getHomeDir() + this.fileName).exists()) {
            Debug.log("Config Updater", "Local configfile '" + Main.getHomeDir() + this.fileName + "' exists (version " + cfgVersion + ")");
            if (Double.parseDouble(newFileVersion) > Double.parseDouble(cfgVersion)) {
                Debug.log("Config Updater", "Removing old config and replacing it with version " + newFileVersion);
                new File(Main.getHomeDir() + this.fileName).delete();
                new File(Main.getHomeDir() + "tmp-" + this.fileName).renameTo(new File(Main.getHomeDir() + this.fileName));
                this.result = "ConfigFile upgraded to version "(MyHelperClass)(Object) + newFileVersion;
            } else {
                new File(Main.getHomeDir() + "tmp-" + this.fileName).delete();
                Debug.log("Config Updater", "I already have the latest version " + cfgVersion);
            }
        } else {
            Debug.log("Config Updater", "Local config doesn't exist. Loading the new one, version " + newFileVersion);
            new File(Main.getHomeDir() + "tmp-" + this.fileName).renameTo(new File(Main.getHomeDir() + this.fileName));
            this.result = "ConfigFile upgraded to version "(MyHelperClass)(Object) + newFileVersion;
        }
        Debug.log("Config Updater", "Update of configuration done");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getHomeDir(){ return null; }
	public MyHelperClass log(String o0, String o1){ return null; }}

class XMLController {

}
