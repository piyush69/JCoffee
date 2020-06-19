


class c14288802 {

    static Object read(String path, String encoding, boolean return_string) throws IOException {
        InputStream in;
        if (path.startsWith("classpath:")) {
            path = path.substring("classpath:".length());
            URL url =(URL)(Object) Estimate.class.getClassLoader().getResource(path);
            if (url == null) {
                throw new IllegalArgumentException("Not found " + path + " in classpath.");
            }
            System.out.println("read content from:" + url.getFile());
            in =(InputStream)(Object) url.openStream();
        } else {
            File f = new File(path);
            if (!(Boolean)(Object)f.exists()) {
                throw new IllegalArgumentException("Not found " + path + " in system.");
            }
            System.out.println("read content from:" + f.getAbsolutePath());
            in =(InputStream)(Object) new FileInputStream(f);
        }
        Reader re;
        if (encoding != null) {
            re =(Reader)(Object) new InputStreamReader(in, encoding);
        } else {
            re =(Reader)(Object) new InputStreamReader(in);
        }
        if (!return_string) {
            return re;
        }
        char[] chs = new char[1024];
        int count;
        StringBuffer content = new StringBuffer();
        while ((count =(int)(Object) re.read(chs)) != -1) {
            content.append(chs, 0, count);
        }
        re.close();
        return content.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class Estimate {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass exists(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class Reader {

public MyHelperClass read(char[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}
