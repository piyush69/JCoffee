import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14633134 {

    public static String getRandomUserAgent()  throws Throwable {
        MyHelperClass USER_AGENT_CACHE = new MyHelperClass();
        if (USER_AGENT_CACHE == null) {
            Collection<String> userAgentsCache = new ArrayList<String>();
            try {
                MyHelperClass Tools = new MyHelperClass();
                URL url = Tools.getResource(UserAgent.class.getClassLoader(), "user-agents-browser.txt");
                BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
                String str;
                while ((str = in.readLine()) != null) {
                    userAgentsCache.add(str);
                }
                in.close();
                MyHelperClass USER_AGENT_CACHE = new MyHelperClass();
                USER_AGENT_CACHE = userAgentsCache.toArray(new String[userAgentsCache.size()]);
            } catch (Exception e) {
                System.err.println("Can not read file; using default user-agent; error message: " + e.getMessage());
                MyHelperClass DEFAULT_USER_AGENT = new MyHelperClass();
                return DEFAULT_USER_AGENT;
            }
        }
        MyHelperClass USER_AGENT_CACHE = new MyHelperClass();
        return USER_AGENT_CACHE[new Random().nextInt(USER_AGENT_CACHE.length)];
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class UserAgent {

}
