


class c11188585 {

    public static void initStaticStuff() {
        Enumeration urls = null;
        try {
            urls =(Enumeration)(Object) Play.class.getClassLoader().getResources("play.static");
        } catch (Exception e) {
        }
        while (urls != null && (boolean)(Object)urls.hasMoreElements()) {
            URL url =(URL)(Object) urls.nextElement();
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"));
                String line = null;
                while ((line =(String)(Object) reader.readLine()) != null) {
                    try {
                        Class.forName(line);
                    } catch (Exception e) {
                        System.out.println("! Cannot init static : " + line);
                    }
                }
            } catch (Exception ex) {
                MyHelperClass Logger = new MyHelperClass();
                Logger.error(ex, "Cannot load %s", url);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(Exception o0, String o1, URL o2){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Play {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}
