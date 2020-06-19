import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3229363 {
public MyHelperClass PHRASES;

    public void copyFile2(String src, String dest) throws Throwable, IOException {
        String newLine = System.getProperty("line.separator");
        FileWriter fw = null;
        FileReader fr = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        File source = null;
        try {
            fr = new FileReader(src);
            fw = new FileWriter(dest);
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            source = new File(src);
            int fileLength = (int) source.length();
            char charBuff[] = new char[fileLength];
            while (br.read(charBuff, 0, fileLength) != -1) bw.write(charBuff, 0, fileLength);
        } catch (FileNotFoundException fnfe) {
            throw new FileCopyException(src + " " + PHRASES.getPhrase("35"));
        } catch (IOException ioe) {
            throw new FileCopyException((String)(Object)PHRASES.getPhrase("36"));
        } finally {
            try {
                if (br != null) br.close();
                if (bw != null) bw.close();
            } catch (IOException ioe) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getPhrase(String o0){ return null; }}

class FileCopyException extends Exception{
	public FileCopyException(String errorMessage) { super(errorMessage); }
}
