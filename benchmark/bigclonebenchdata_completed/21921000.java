import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c21921000 {
public MyHelperClass set;

//    @Override
    public void parse() throws IOException {
        MyHelperClass DomainName = new MyHelperClass();
        URL url = new URL((String)(Object)(new DataUrlResolver()).getDataUrl(DomainName.CROATIA));
        URLConnection con = url.openConnection();
        BufferedReader bStream = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String str;
        bStream.readLine();
        while ((str = bStream.readLine()) != null) {
            String[] tokens = str.split("(\\s+)");
            String charCode = tokens[0].replaceAll("([0-9+])", "");
            Float value = Float.parseFloat(tokens[2].trim().replace(",", "."));
            MyHelperClass DEFAULT_MULTIPLIER = new MyHelperClass();
            CurrencyUnit unit = new CurrencyUnit(charCode, value, DEFAULT_MULTIPLIER);
            this.set.add(unit);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CROATIA;
public MyHelperClass add(CurrencyUnit o0){ return null; }}

class CurrencyUnit {

CurrencyUnit(String o0, Float o1, MyHelperClass o2){}
	CurrencyUnit(){}}

class DataUrlResolver {

public MyHelperClass getDataUrl(MyHelperClass o0){ return null; }}
