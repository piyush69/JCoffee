import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c12678042 {
public MyHelperClass _emDate;
	public MyHelperClass _projectInfo;
	public MyHelperClass _local;
	public MyHelperClass _emFileDate;
	public MyHelperClass getInfo(int o0){ return null; }
	public MyHelperClass createInfo(int o0){ return null; }

    private void addEMInformation() {
        try {
            long emDate = System.currentTimeMillis();
            MyHelperClass _local = new MyHelperClass();
            if ((boolean)(Object)_local == true) {
                File emFile = new File("emprotz.dat");
                if (!emFile.exists()) {
                    return;
                }
                emDate = emFile.lastModified();
            }
            if (emDate > (long)(Object)this._emFileDate) {
                this._emFileDate =(MyHelperClass)(Object) emDate;
                this._emDate =(MyHelperClass)(Object) emDate;
                for (int ii = 0; ii < (int)(Object)this._projectInfo.size(); ii++) {
                    Information info =(Information)(Object) getInfo(ii);
                    if (info != null) {
                        info._emDeadline = null;
                        info._emFrames = null;
                        info._emValue = null;
                    }
                }
                Reader reader = null;
                if ((boolean)(Object)_local == true) {
                    reader = new FileReader("emprotz.dat");
                } else {
                    StringBuffer urlName = new StringBuffer();
                    urlName.append("http://home.comcast.net/");
                    urlName.append("~wxdude1/emsite/download/");
                    urlName.append("emprotz.zip");
                    try {
                        URL url = new URL(urlName.toString());
                        InputStream stream = url.openStream();
                        ZipInputStream zip = new ZipInputStream(stream);
                        zip.getNextEntry();
                        reader = new InputStreamReader((InputStream)(Object)zip);
                    } catch (MalformedURLException mue) {
                        mue.printStackTrace();
                    }
                }
                BufferedReader file = new BufferedReader(reader);
                try {
                    String line1 = null;
                    int count = 0;
                    while ((line1 = file.readLine()) != null) {
                        String line2 = (line1 != null) ? file.readLine() : null;
                        String line3 = (line2 != null) ? file.readLine() : null;
                        String line4 = (line3 != null) ? file.readLine() : null;
                        count++;
                        if ((count > 1) && (line1 != null) && (line2 != null) && (line3 != null) && (line4 != null)) {
                            if (line1.length() > 2) {
                                int posBegin = line1.indexOf("\"", 0);
                                int posEnd = line1.indexOf("\"", posBegin + 1);
                                if ((posBegin >= 0) && (posEnd >= 0)) {
                                    String project = line1.substring(posBegin + 1, posEnd - posBegin);
                                    int projectNum = Integer.parseInt(project);
                                    Integer deadline = Integer.valueOf(line2.trim());
                                    Double value = Double.valueOf(line3.trim());
                                    Integer frames = Integer.valueOf(line4.trim());
                                    Information info =(Information)(Object) getInfo(projectNum);
                                    if (info == null) {
                                        info =(Information)(Object) createInfo(projectNum);
                                    }
                                    if (info._emValue == null) {
                                        info._emDeadline =(MyHelperClass)(Object) deadline;
                                        info._emFrames =(MyHelperClass)(Object) frames;
                                        info._emValue =(MyHelperClass)(Object) value;
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    file.close();
                }
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass size(){ return null; }}

class Information {
public MyHelperClass _emDeadline;
	public MyHelperClass _emFrames;
	public MyHelperClass _emValue;
}

class ZipInputStream {

ZipInputStream(InputStream o0){}
	ZipInputStream(){}
	public MyHelperClass getNextEntry(){ return null; }}
