import java.io.*;
import java.lang.*;
import java.util.*;



class c7366470 {
public MyHelperClass mnemos;

    public void RFC1345List(URL url) {
        if (url == null) return;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader((InputStream)(Object)new GZIPInputStream(url.openStream())));
            final String linePattern = " XX???????      HHHH    X";
            String line;
            mnemos =(MyHelperClass)(Object) new HashMap();
            nextline: while ((line = br.readLine()) != null) {
                if (line.length() < 9) continue nextline;
                if (line.charAt(7) == ' ' || line.charAt(8) != ' ') {
                    line = line.substring(0, 8) + "        " + line.substring(8);
                }
                if (line.length() < linePattern.length()) continue nextline;
                for (int i = 0; i < linePattern.length(); i++) {
                    char c = line.charAt(i);
                    switch(linePattern.charAt(i)) {
                        case ' ':
                            if (c != ' ') continue nextline;
                            break;
                        case 'X':
                            if (c == ' ') continue nextline;
                            break;
                        case '?':
                            break;
                        case 'H':
                            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f')) ; else continue nextline;
                            break;
                        default:
                            throw new RuntimeException("Pattern broken!");
                    }
                }
                char c = (char) Integer.parseInt(line.substring(16, 20), 16);
                String mnemo = line.substring(1, 16).trim();
                if (mnemo.length() < 2) throw new RuntimeException();
                mnemos.put(mnemo, new Character(c));
            }
            br.close();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(String o0, Character o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class GZIPInputStream {

GZIPInputStream(){}
	GZIPInputStream(MyHelperClass o0){}}
