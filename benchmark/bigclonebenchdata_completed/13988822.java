import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c13988822 {
public MyHelperClass logger;
public MyHelperClass url;
	public MyHelperClass baseDirectory;

    private void getServiceReponse(String service, NameSpaceDefinition nsDefinition) throws Exception {
        MyHelperClass Pattern = new MyHelperClass();
        Pattern pattern =(Pattern)(Object) Pattern.compile("(?i)(?:.*(xmlns(?:\\:\\w+)?=\\\"http\\:\\/\\/www\\.ivoa\\.net\\/.*" + service + "[^\\\"]*\\\").*)");
//        MyHelperClass Pattern = new MyHelperClass();
        pattern =(Pattern)(Object) Pattern.compile(".*xmlns(?::\\w+)?=(\"[^\"]*(?i)(?:" + service + ")[^\"]*\").*");
        logger.debug("read " + this.url + service);
        BufferedReader in = new BufferedReader(new InputStreamReader((new URL(this.url + service)).openStream()));
        String inputLine;
        BufferedWriter bfw = new BufferedWriter(new FileWriter(this.baseDirectory + service + ".xml"));
        boolean found = false;
        while ((inputLine = in.readLine()) != null) {
            if (!found) {
                Matcher m =(Matcher)(Object) pattern.matcher(inputLine);
                if ((boolean)(Object)m.matches()) {
                    nsDefinition.init("xmlns:vosi=" + m.group(1));
                    found = true;
                }
            }
            bfw.write(inputLine + "\n");
        }
        in.close();
        bfw.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class NameSpaceDefinition {

public MyHelperClass init(String o0){ return null; }}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass matches(){ return null; }}
