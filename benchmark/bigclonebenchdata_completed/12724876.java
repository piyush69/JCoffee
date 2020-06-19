import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c12724876 {
public MyHelperClass tmpVRMLFile;

    private void loadURL(URL url, String username, String password, JLabel statusDialogMBLabel) throws IOException {
        URLConnection connection = url.openConnection();
        if (username != null && !username.equals("")) {
            if (password == null) {
                password = "";
            }
            String encoding = new sun.misc.BASE64Encoder().encode(new String(username + ":" + password).getBytes());
            connection.setRequestProperty("Authorization", "Basic " + encoding);
        }
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        this.tmpVRMLFile =(MyHelperClass)(Object) File.createTempFile("xnavi-", null, null);
        System.out.println("Created tmp file: " + this.tmpVRMLFile.getAbsolutePath());
        FileWriter fw = new FileWriter((String)(Object)this.tmpVRMLFile);
        long bytesInFile =(long)(Object) this.tmpVRMLFile.length();
        double sizeInMB = ((double) bytesInFile) / (1024.0 * 1024.0);
        String response = "";
        while ((inputLine = in.readLine()) != null) {
            response = inputLine + "\n";
            fw.write(response);
            fw.flush();
            if (statusDialogMBLabel != null) {
                bytesInFile =(long)(Object) this.tmpVRMLFile.length();
                sizeInMB = ((double) bytesInFile) / (1024.0 * 1024.0);
                sizeInMB *= 100.0;
                sizeInMB = (double) ((int) sizeInMB);
                sizeInMB /= 100.0;
                statusDialogMBLabel.setText(sizeInMB + " MB");
                statusDialogMBLabel.repaint();
            }
        }
        fw.close();
        System.out.println("Wrote file " + this.tmpVRMLFile.getAbsolutePath());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass length(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class JLabel {

public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass repaint(){ return null; }}
