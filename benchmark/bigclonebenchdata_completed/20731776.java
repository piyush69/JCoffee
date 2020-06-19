


class c20731776 {
public MyHelperClass addDirectory(DirectoryInfo o0){ return null; }
public MyHelperClass readDataFrom(PushbackInputStream o0){ return null; }

    public void readDirectoryFrom(String urlString) throws Exception {
        MyHelperClass DIR_INFO_FIENAME = new MyHelperClass();
        URL url = new URL(urlString + DIR_INFO_FIENAME);
        PushbackInputStream in = new PushbackInputStream(new BufferedInputStream(url.openStream()));
        readDataFrom(in);
        MyHelperClass TextToken = new MyHelperClass();
        TextToken t =(TextToken)(Object) TextToken.nextToken(in);
        while (t != null && (boolean)(Object)t.isString()) {
            DirectoryInfoModel dir =(DirectoryInfoModel)(Object) addDirectory(new DirectoryInfo(t.getString()));
            dir.setUrl(urlString + t.getString() + '/');
//            MyHelperClass TextToken = new MyHelperClass();
            t =(TextToken)(Object) TextToken.nextToken(in);
        }
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass nextToken(PushbackInputStream o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class PushbackInputStream {

PushbackInputStream(BufferedInputStream o0){}
	PushbackInputStream(){}
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}

class TextToken {

public MyHelperClass getString(){ return null; }
	public MyHelperClass isString(){ return null; }}

class DirectoryInfoModel {

public MyHelperClass setUrl(String o0){ return null; }}

class DirectoryInfo {

DirectoryInfo(MyHelperClass o0){}
	DirectoryInfo(){}}
