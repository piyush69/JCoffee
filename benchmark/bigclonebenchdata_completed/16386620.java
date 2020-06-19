


class c16386620 {
public static MyHelperClass Resources;
	public static MyHelperClass html2xhtml(FileReader o0, FileWriter o1){ return null; }
//public MyHelperClass Resources;
//	public MyHelperClass html2xhtml(FileReader o0, FileWriter o1){ return null; }

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader(args[0]);
            FileWriter writer = new FileWriter(args[1]);
            html2xhtml(reader, writer);
            writer.close();
            reader.close();
        } catch (Exception e) {
            Resources.getInstance().logException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass logException(Exception o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class FileReader {

FileReader(String o0){}
	FileReader(){}
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }}
