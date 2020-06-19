


class c8113080 {
public MyHelperClass set;
	public MyHelperClass getDataUrl(){ return null; }

//    @Override
    public void parse() throws DocumentException, IOException {
        URL url = new URL(getDataUrl());
        URLConnection con =(URLConnection)(Object) url.openConnection();
        BufferedReader bStream = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String s =(String)(Object) bStream.readLine();
        bStream.readLine();
        while ((s =(String)(Object) bStream.readLine()) != null) {
            String[] tokens = s.split("\\|");
            ResultUnit unit = new ResultUnit(tokens[3], Float.valueOf(tokens[4]), Integer.valueOf(tokens[2]));
            set.add(unit);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(ResultUnit o0){ return null; }}

class DocumentException extends Exception{
	public DocumentException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class ResultUnit {

ResultUnit(String o0, Float o1, Integer o2){}
	ResultUnit(){}}
