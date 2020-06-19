import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c20134388 {
public MyHelperClass set;
	public MyHelperClass getDataUrl(){ return null; }

//    @Override
    public void parse() throws IOException {
        URL url = new URL((String)(Object)getDataUrl());
        URLConnection con = url.openConnection();
        BufferedReader bStream = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String str;
        while ((str = bStream.readLine()) != null) {
            String[] tokens = str.split(",");
            CurrencyUnit unit = new CurrencyUnit(tokens[1], Float.valueOf(tokens[3]), Integer.valueOf(tokens[2]));
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
