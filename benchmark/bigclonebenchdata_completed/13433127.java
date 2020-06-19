


class c13433127 {

    public void save(File selectedFile) throws IOException {
        MyHelperClass storeEntriesInFiles = new MyHelperClass();
        if ((boolean)(Object)storeEntriesInFiles) {
            boolean moved = false;
            MyHelperClass tempFiles = new MyHelperClass();
            for (int i = 0; i < (int)(Object)tempFiles.size(); i++) {
                File newFile = new File(selectedFile.getAbsolutePath() + "_" + Integer.toString(i) + ".zettmp");
//                MyHelperClass tempFiles = new MyHelperClass();
                moved =(boolean)(Object) tempFiles.get(i).renameTo(newFile);
                if (!moved) {
//                    MyHelperClass tempFiles = new MyHelperClass();
                    BufferedReader read = new BufferedReader(new FileReader(tempFiles.get(i)));
                    PrintWriter write = new PrintWriter(newFile);
                    String s;
                    while ((s =(String)(Object) read.readLine()) != null) write.print(s);
                    read.close();
                    write.flush();
                    write.close();
//                    MyHelperClass tempFiles = new MyHelperClass();
                    tempFiles.get(i).delete();
                }
//                MyHelperClass tempFiles = new MyHelperClass();
                tempFiles.set(i, newFile);
            }
        }
        GZIPOutputStream output = new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(selectedFile)));
        XStream xml_convert = new XStream();
        MyHelperClass XStream = new MyHelperClass();
        xml_convert.setMode(XStream.ID_REFERENCES);
        xml_convert.toXML(this, output);
        output.flush();
        output.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ID_REFERENCES;
public MyHelperClass set(int o0, File o1){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }
	public MyHelperClass get(int o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getAbsolutePath(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileReader {

FileReader(MyHelperClass o0){}
	FileReader(){}}

class PrintWriter {

PrintWriter(){}
	PrintWriter(File o0){}
	public MyHelperClass print(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class GZIPOutputStream {

GZIPOutputStream(BufferedOutputStream o0){}
	GZIPOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class XStream {

public MyHelperClass toXML(c13433127 o0, GZIPOutputStream o1){ return null; }
	public MyHelperClass setMode(MyHelperClass o0){ return null; }}
