import java.io.*;
import java.lang.*;
import java.util.*;



class c8023601 {

    protected static List<Pattern> getBotPatterns() {
        List<Pattern> patterns = new ArrayList<Pattern>();
        try {
            Enumeration<URL> urls =(Enumeration<URL>)(Object) AbstractPustefixRequestHandler.class.getClassLoader().getResources("META-INF/org/pustefixframework/http/bot-user-agents.txt");
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                InputStream in =(InputStream)(Object) url.openStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(in, "utf8"));
                String line;
                while ((line = reader.readLine()) != null) {
                    line = line.trim();
                    if (!line.startsWith("#")) {
                        MyHelperClass Pattern = new MyHelperClass();
                        Pattern pattern =(Pattern)(Object) Pattern.compile(line);
                        patterns.add(pattern);
                    }
                }
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading bot user-agent configuration", e);
        }
        return patterns;
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
