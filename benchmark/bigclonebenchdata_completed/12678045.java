import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12678045 {
public MyHelperClass _local;
	public MyHelperClass _qdDate;
	public MyHelperClass _qdFileDate;
	public MyHelperClass _projectInfo;
	public MyHelperClass createInfo(int o0){ return null; }
	public MyHelperClass getInfo(int o0){ return null; }

    private void addQDInformation()  throws Throwable {
        try {
            long qdDate = System.currentTimeMillis();
            MyHelperClass _local = new MyHelperClass();
            if ((boolean)(Object)_local == true) {
                File qdFile = new File("qdinfo.dat");
                if (!qdFile.exists()) {
                    return;
                }
                qdDate = qdFile.lastModified();
            }
            if (qdDate > (long)(Object)this._qdFileDate) {
                this._qdFileDate =(MyHelperClass)(Object) qdDate;
                for (int ii = 0; ii < (int)(Object)this._projectInfo.size(); ii++) {
                    Information info =(Information)(Object) getInfo(ii);
                    if (info != null) {
                        info._qdValue = null;
                    }
                }
                Reader reader = null;
                if ((boolean)(Object)_local == true) {
                    reader = new FileReader("qdinfo.dat");
                } else {
                    StringBuffer urlName = new StringBuffer();
                    urlName.append("http://boston.quik.com/rph/");
                    urlName.append("qdinfo.dat");
                    try {
                        URL url = new URL(urlName.toString());
                        InputStream stream = url.openStream();
                        reader = new InputStreamReader(stream);
                    } catch (MalformedURLException mue) {
                        mue.printStackTrace();
                    }
                }
                BufferedReader file = new BufferedReader(reader);
                try {
                    String line = null;
                    while ((line = file.readLine()) != null) {
                        if (line.startsWith("pg ")) {
                            this._qdDate =(MyHelperClass)(Object) Long.parseLong(line.substring(3), 16);
                            this._qdDate =(MyHelperClass)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object) ((int)(Object)this._qdDate + 946684800) * 1000;
                        } else if (line.startsWith("pt ")) {
                            line = line.substring(3).trim();
                            int pos = -1;
                            while ((line.length() > 0) && ((pos = line.indexOf(' ')) > 0)) {
                                int projectNum = 0;
                                Double value = null;
                                if (pos > 0) {
                                    projectNum = Integer.parseInt(line.substring(0, pos));
                                    line = line.substring(pos).trim();
                                }
                                pos = line.indexOf(' ');
                                if (pos > 0) {
                                    value = new Double((double) Integer.parseInt(line.substring(0, pos)) / 100);
                                    line = line.substring(pos).trim();
                                }
                                Information info =(Information)(Object) getInfo(projectNum);
                                if (info == null) {
                                    info =(Information)(Object) createInfo(projectNum);
                                }
                                if (info._qdValue == null) {
                                    info._qdValue =(MyHelperClass)(Object) value;
                                }
                            }
                        }
                    }
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
public MyHelperClass _qdValue;
}
