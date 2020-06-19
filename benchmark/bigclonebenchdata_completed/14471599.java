


class c14471599 {

    private void copy(String url, File toDir) throws IOException {
        System.err.println("url=" + url + " dir=" + toDir);
        if (url.endsWith("/")) {
            String basename = url.substring(url.lastIndexOf("/", url.length() - 2) + 1);
            File directory = new File(toDir, basename);
            directory.mkdir();
            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new URL(url).openStream(), "utf-8"));
            String line;
            while ((line =(String)(Object) reader.readLine()) != null) {
                System.err.println(line.replace('\t', '|'));
                int tab = line.lastIndexOf('\t', line.lastIndexOf('\t', line.lastIndexOf('\t') - 1) - 1);
                System.err.println(tab);
                char type = line.charAt(tab + 1);
                String file = line.substring(0, tab);
                MyHelperClass URIUtil = new MyHelperClass();
                copy(url + URIUtil.encodePath(file) + (type == 'd' ? "/" : ""), directory);
            }
        } else {
            String basename = url.substring(url.lastIndexOf("/") + 1);
            File file = new File(toDir, basename);
            System.err.println("copy " + url + " --> " + file);
            MyHelperClass IO = new MyHelperClass();
            IO.copy(new URL(url).openStream(), new FileOutputStream(file));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encodePath(String o0){ return null; }
	public MyHelperClass copy(MyHelperClass o0, FileOutputStream o1){ return null; }}

class File {

File(File o0, String o1){}
	File(){}
	public MyHelperClass mkdir(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class LineNumberReader {

LineNumberReader(){}
	LineNumberReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
