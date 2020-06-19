


class c15988143 {

    public static List getUrlData(URL url) throws IOException {
        List beans =(List)(Object) new ArrayList(256);
        System.out.println("Retreiving content for: " + url);
        StringBuffer content = new StringBuffer(4096);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String str;
        while ((str =(String)(Object) in.readLine()) != null) {
            if (str.startsWith("#")) {
                continue;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, "\t");
            String InteractionAc =(String)(Object) stringTokenizer.nextToken();
            String reactomeId =(String)(Object) stringTokenizer.nextToken();
            ReactomeBean reactomeBean = new ReactomeBean();
            reactomeBean.setReactomeID(reactomeId);
            reactomeBean.setInteractionAC(InteractionAc);
            beans.add(reactomeBean);
        }
        in.close();
        return beans;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class List {

public MyHelperClass add(ReactomeBean o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ArrayList {

ArrayList(int o0){}
	ArrayList(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class StringTokenizer {

StringTokenizer(String o0, String o1){}
	StringTokenizer(){}
	public MyHelperClass nextToken(){ return null; }}

class ReactomeBean {

public MyHelperClass setReactomeID(String o0){ return null; }
	public MyHelperClass setInteractionAC(String o0){ return null; }}
