import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c17261863 {
public MyHelperClass set;
	public MyHelperClass getDataUrl(){ return null; }

//    @Override
    public void parse() throws IOException {
        URL url = new URL((String)(Object)getDataUrl());
        URLConnection con = url.openConnection();
        BufferedReader bStream = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String s = bStream.readLine();
        String[] tokens = s.split("</html>");
        tokens = tokens[1].split("<br>");
        for (String sToken : tokens) {
            String[] sTokens = sToken.split(";");
            CurrencyUnit unit = new CurrencyUnit(sTokens[4], Float.valueOf(sTokens[9]), Integer.valueOf(sTokens[5]));
            this.set.add(unit);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(CurrencyUnit o0){ return null; }}

class CurrencyUnit {

CurrencyUnit(){}
	CurrencyUnit(String o0, Float o1, Integer o2){}}
