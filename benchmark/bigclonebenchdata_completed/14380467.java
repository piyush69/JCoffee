


class c14380467 {

    public String readTemplateToString(String fileName) {
        URL url = null;
        MyHelperClass classLoader = new MyHelperClass();
        url =(URL)(Object) classLoader.getResource(fileName);
        StringBuffer content = new StringBuffer();
        if (url == null) {
            String error = "Template file could not be found: " + fileName;
            throw new RuntimeException(error);
        }
        try {
            BufferedReader breader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
            String strLine = "";
            while ((strLine =(String)(Object) breader.readLine()) != null) {
                content.append(strLine).append("\n");
            }
            breader.close();
        } catch (Exception e) {
            throw new RuntimeException("Problem while loading file: " + fileName);
        }
        return content.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResource(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}
