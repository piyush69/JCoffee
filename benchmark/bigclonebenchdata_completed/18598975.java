import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18598975 {
public MyHelperClass[] characterWidths;
public MyHelperClass Constants;
//	public MyHelperClass characterWidths;

    private  void Face(String font) throws Throwable, IOException {
        characterWidths =(MyHelperClass[])(Object)(MyHelperClass)(Object) new double[256];
        StringBuffer sb = new StringBuffer();
        sb.append('/');
        sb.append(Constants.FONTS_DIR);
        sb.append('/');
        sb.append(font);
        sb.append(Constants.CHAR_WIDTHS_SUFFIX);
        String path = sb.toString();
        URL url = getClass().getResource(path);
        InputStream is = url.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        int pos = 0;
        String width = br.readLine();
        while (width != null && pos < 256) {
            characterWidths[pos] =(MyHelperClass)(Object) Double.parseDouble(width);
            pos++;
            width = br.readLine();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CHAR_WIDTHS_SUFFIX;
	public MyHelperClass FONTS_DIR;
}
