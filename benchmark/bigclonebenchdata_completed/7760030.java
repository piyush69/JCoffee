import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7760030 {
public MyHelperClass addFormat(String o0, DecimalFormat o1){ return null; }

    private void loadNumberFormats()  throws Throwable {
        MyHelperClass FILENAME_NUMBER_FMT = new MyHelperClass();
        String fileToLocate = "/" + FILENAME_NUMBER_FMT;
        URL url = getClass().getClassLoader().getResource(fileToLocate);
        if (url == null) {
            return;
        }
        List<String> lines;
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            lines =(List<String>)(Object) IOUtils.readLines(url.openStream());
        } catch (IOException e) {
            throw new ConfigurationException("Problem loading file " + fileToLocate, e);
        }
        for (String line : lines) {
            MyHelperClass StringUtils = new MyHelperClass();
            if (line.startsWith("#") || (boolean)(Object)StringUtils.isBlank(line)) {
                continue;
            }
//            MyHelperClass StringUtils = new MyHelperClass();
            String[] parts =(String[])(Object) StringUtils.split(line, "=");
            addFormat(parts[0], new DecimalFormat(parts[1]));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isBlank(String o0){ return null; }
	public MyHelperClass readLines(InputStream o0){ return null; }
	public MyHelperClass split(String o0, String o1){ return null; }}

class ConfigurationException extends Exception{
	public ConfigurationException(String errorMessage) { super(errorMessage); }
	ConfigurationException(){}
	ConfigurationException(String o0, IOException o1){}
}

class DecimalFormat {

DecimalFormat(String o0){}
	DecimalFormat(){}}
