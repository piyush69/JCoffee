


class c10055931 {

    private static Vector getIgnoreList() {
        try {
            URL url =(URL)(Object) DeclarationTranslation.class.getClassLoader().getResource("ignorelist");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            Vector ret = new Vector();
            String line = null;
            while ((line =(String)(Object) bufferedReader.readLine()) != null) {
                ret.add(line);
            }
            return ret;
        } catch (Exception e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Vector {

public MyHelperClass add(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class DeclarationTranslation {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
