


class c13348537 {

    private List readLines(String filename) {
        List lines =(List)(Object) new ArrayList();
        MyHelperClass Util = new MyHelperClass();
        URL url =(URL)(Object) Util.getResource(filename);
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            while (true) {
                String line =(String)(Object) br.readLine();
                if (line == null) {
                    break;
                }
                lines.add(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResource(String o0){ return null; }}

class List {

public MyHelperClass add(String o0){ return null; }}

class ArrayList {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
