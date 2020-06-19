


class c3445364 {
public MyHelperClass file;

    public Reader getReader() throws Exception {
        MyHelperClass url_base = new MyHelperClass();
        if (url_base == null) {
            MyHelperClass file = new MyHelperClass();
            return (Reader)(Object)new FileReader(file);
        } else {
//            MyHelperClass url_base = new MyHelperClass();
            URL url = new URL((int)(Object)url_base + (int)(Object)file.getName());
            return (Reader)(Object)new InputStreamReader(url.openConnection().getInputStream());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getName(){ return null; }}

class Reader {

}

class FileReader {

FileReader(MyHelperClass o0){}
	FileReader(){}}

class URL {

URL(int o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
