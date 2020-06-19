import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19812348 {
public static MyHelperClass translate(MyHelperClass o0){ return null; }
//public MyHelperClass translate(MyHelperClass o0){ return null; }
	public static MyHelperClass lowercase(byte[] o0){ return null; }
//public MyHelperClass lowercase(byte[] o0){ return null; }

    static ConversionMap create(String file) {
        ConversionMap out = new ConversionMap();
        URL url = ConversionMap.class.getResource(file);
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = in.readLine();
            while (line != null) {
                if (line.length() > 0) {
                    String[] arr = line.split("\t");
                    try {
                        double value = Double.parseDouble(arr[1]);
                        out.put(translate(lowercase(arr[0].getBytes())), value);
                       (double)(Object) out.defaultValue += value;
                        out.length =(MyHelperClass)(Object) arr[0].length();
                    } catch (NumberFormatException e) {
                        throw new RuntimeException("Something is wrong with in conversion file: " + e);
                    }
                }
                line = in.readLine();
            }
            in.close();
           (double)(Object) out.defaultValue /= Math.pow(4,(double)(Object) out.length);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Their was an error while reading the conversion map: " + e);
        }
        return out;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ConversionMap {
public MyHelperClass defaultValue;
	public MyHelperClass length;
public MyHelperClass put(MyHelperClass o0, double o1){ return null; }}
