


class c7945594 {
public static MyHelperClass Logger;
//public MyHelperClass Logger;

    public static void fileDownload(String fAddress, String destinationDir) {
        int slashIndex = fAddress.lastIndexOf('/');
        int periodIndex = fAddress.lastIndexOf('.');
        String fileName = fAddress.substring(slashIndex + 1);
        URL url;
        try {
            url = new URL(fAddress);
            URLConnection uc =(URLConnection)(Object) url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            File file = new File(destinationDir + "/download.pdf");
            FileOutputStream fos = new FileOutputStream(file);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));
            int inputLine;
            while ((inputLine =(int)(Object) in.read()) != -1) out.write(inputLine);
            in.close();
        } catch (Exception ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(UrlDownload.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, Object o1, Exception o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class File {

File(String o0){}
	File(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(OutputStreamWriter o0){}
	public MyHelperClass write(int o0){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(FileOutputStream o0){}
	OutputStreamWriter(){}}

class UrlDownload {

}
