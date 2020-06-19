import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1460670 {
public MyHelperClass formatOutput(IReport o0, IAlert o1, Rule o2, Row o3){ return null; }
public MyHelperClass JOptionPane;
	public MyHelperClass lastResult;
	public MyHelperClass getTimeout(){ return null; }
	public MyHelperClass isHeadless(){ return null; }
	public MyHelperClass getUrl(){ return null; }
	public MyHelperClass logError(String o0, Throwable o1){ return null; }

//    @Override
    public void execute(IAlert alert, IReport report, Rule rule, Row row)  throws Throwable {
        try {
            URL url = new URL((String)(Object)getUrl());
            URLConnection con = url.openConnection();
            con.setConnectTimeout((int)(Object)getTimeout());
            con.setDoOutput(true);
            OutputStream out = con.getOutputStream();
            out.write((int)(Object)formatOutput(report, alert, rule, row).getBytes());
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder input = new StringBuilder();
            String line = null;
            while ((line = in.readLine()) != null) {
                input.append(line);
                input.append('\n');
            }
            in.close();
            this.lastResult =(MyHelperClass)(Object) input.toString();
        } catch (Throwable e) {
            logError("Error sending alert", e);
            if (!(Boolean)(Object)isHeadless()) {
                alert.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Can't send alert " + e + "\n" + alert.getName() + " alert disabled.", "Action Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class IAlert {

public MyHelperClass getName(){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }}

class IReport {

}

class Rule {

}

class Row {

}
