import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c11834952 {
public MyHelperClass translationsFile;
	public MyHelperClass languageServer;
	public MyHelperClass languages;
	public MyHelperClass naiveLanguage;
	public MyHelperClass loadTranslations(){ return null; }

    public void downloadTranslationsAndReload() {
        File languages = new File((String)(Object)this.translationsFile);
        try {
            URL languageURL = new URL((String)(Object)languageServer);
            InputStream is = languageURL.openStream();
            OutputStream os = new FileOutputStream(languages);
            byte[] read = new byte[512000];
            int bytesRead = 0;
            do {
                bytesRead = is.read(read);
                if (bytesRead > 0) {
                    os.write(read, 0, bytesRead);
                }
            } while (bytesRead > 0);
            is.close();
            os.close();
            this.loadTranslations();
        } catch (Exception e) {
            System.err.println("Remote languages file not found!");
            if (languages.exists()) {
                try {
                    XMLDecoder loader = new XMLDecoder(new FileInputStream(languages));
                    this.languages =(MyHelperClass)(Object) (Hashtable)(Hashtable)(Object) loader.readObject();
                    loader.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    this.languages.put(naiveLanguage, new Hashtable());
                }
            } else this.languages.put(naiveLanguage, new Hashtable());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(MyHelperClass o0, Hashtable o1){ return null; }}

class XMLDecoder {

XMLDecoder(FileInputStream o0){}
	XMLDecoder(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readObject(){ return null; }}
