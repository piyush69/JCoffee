import java.io.*;
import java.lang.*;
import java.util.*;



class c13725738 {

    public FlashExObj get(String s, int page) {
        FlashExObj retVal = new FlashExObj();
        s = s.replaceAll("[^a-z0-9_]", "");
        ArrayList list = new ArrayList();
        retVal.list =(MyHelperClass)(Object) list;
        try {
            String result = null;
            MyHelperClass URLEncoder = new MyHelperClass();
            URL url = new URL("http://www.flashcardexchange.com/flashcards/list/" + URLEncoder.encode(s, "UTF-8") + "?page=" + page);
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)");
            connection.setDoOutput(false);
            BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)connection.getInputStream(), "UTF-8"));
            String inputLine;
            int state = 2;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                if (state == 0) {
                    int textPos = inputLine.indexOf("Number of Card");
                    if (textPos >= 0) {
                        state = 1;
                    }
                } else if (state == 1) {
                    int s1 = inputLine.indexOf(">");
                    int s2 = inputLine.indexOf("<", 1);
                    if (s1 >= 0 && s1 < s2) {
                        String numOfCardStr = inputLine.substring(s1 + 1, s2);
                        try {
                        } catch (Exception e) {
                        }
                        state = 2;
                    }
                } else if (state == 2) {
                    int textPos = inputLine.indexOf("tbody class=\"shaded\"");
                    if (textPos >= 0) {
                        state = 3;
                    }
                } else if (state == 3) {
                    int textPos = inputLine.indexOf("tbody");
                    if (textPos >= 0) {
                        break;
                    }
                    sb.append(inputLine);
                    sb.append(" ");
                }
            }
            in.close();
            MyHelperClass Pattern = new MyHelperClass();
            Pattern myPattern =(Pattern)(Object) Pattern.compile("<td>(.*?)</td>");
            Matcher myMatcher =(Matcher)(Object) myPattern.matcher(sb);
            String str;
            int counter = 0;
            String buff[] = new String[4];
            while ((boolean)(Object)myMatcher.find()) {
                int tt = counter % 4;
                buff[tt] =(String)(Object) myMatcher.group(1);
                if (tt == 3) {
                    String toAdd[] = new String[2];
                    toAdd[0] = buff[1];
                    toAdd[1] = buff[2];
                    list.add(toAdd);
                }
                counter++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retVal;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0, String o1){ return null; }
	public MyHelperClass compile(String o0){ return null; }}

class FlashExObj {
public MyHelperClass list;
}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class Pattern {

public MyHelperClass matcher(StringBuilder o0){ return null; }}

class Matcher {

public MyHelperClass find(){ return null; }
	public MyHelperClass group(int o0){ return null; }}
