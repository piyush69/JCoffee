import java.io.*;
import java.lang.*;
import java.util.*;



class c6310814 {
public MyHelperClass NULL;
public int currentTLEindex;
	public MyHelperClass[] fileNames;
//public MyHelperClass fileNames;
	public MyHelperClass rootWeb;
//	public MyHelperClass currentTLEindex;
	public MyHelperClass localPath;
	public MyHelperClass errorText;
	public MyHelperClass hasMoreToDownload(){ return null; }

    public boolean downloadNextTLE() {
        boolean success = true;
        MyHelperClass downloadINI = new MyHelperClass();
        if (!(Boolean)(Object)downloadINI) {
            String errorText =(String)(Object) NULL; //new String();
            errorText = "startTLEDownload() must be ran before downloadNextTLE() can begin";
            return false;
        }
        if (!(Boolean)(Object)this.hasMoreToDownload()) {
            errorText =(MyHelperClass)(Object) "There are no more TLEs to download";
            return false;
        }
        int i =(int)(Object) currentTLEindex;
        try {
            URL url = new URL((int)(Object)rootWeb + (int)(Object)fileNames[i]);
            URLConnection c =(URLConnection)(Object) url.openConnection();
            InputStreamReader isr = new InputStreamReader((InputStream)(Object)c.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            File outFile = new File((String)(Object)(int)(Object)localPath + (int)(Object)fileNames[i]);
            BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
            String currentLine = "";
            while ((currentLine = br.readLine()) != null) {
                writer.write(currentLine);
                writer.newLine();
            }
            br.close();
            writer.close();
        } catch (Exception e) {
            System.out.println("Error Reading/Writing TLE - " + fileNames[i] + "\n" + e.toString());
            success = false;
            errorText =(MyHelperClass)(Object) e.toString();
            return false;
        }
        currentTLEindex++;
        return success;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(){}
	URL(int o0){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}
