import java.io.*;
import java.lang.*;
import java.util.*;



class c15171197 {

    private static Pattern getBotPattern() {
        StringBuilder sb = new StringBuilder();
        try {
            MyHelperClass CONFIG = new MyHelperClass();
            Enumeration<URL> urls =(Enumeration<URL>)(Object) AbstractPustefixRequestHandler.class.getClassLoader().getResources((String)(Object)CONFIG);
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                InputStream in =(InputStream)(Object) url.openStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(in, "utf8"));
                String line;
                while ((line = reader.readLine()) != null) {
                    line = line.trim();
                    if (!line.startsWith("#") && !line.equals("")) {
                        if (sb.length() > 0) sb.append("|");
                        sb.append("(").append(line).append(")");
                    }
                }
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading bot user-agent configuration", e);
        }
        MyHelperClass Pattern = new MyHelperClass();
        return(Pattern)(Object) Pattern.compile(sb.toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass compile(String o0){ return null; }}

class Pattern {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class AbstractPustefixRequestHandler {

}
