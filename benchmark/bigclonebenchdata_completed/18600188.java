


class c18600188 {
public MyHelperClass provider;

    private void copyFile(String fileName, String messageID, boolean isError) {
        try {
            File inputFile = new File(fileName);
            File outputFile = null;
            if (isError) {
                MyHelperClass folderName = new MyHelperClass();
                outputFile = new File(provider.getErrorDataLocation(folderName) + messageID + ".xml");
            } else {
                MyHelperClass folderName = new MyHelperClass();
                outputFile = new File(provider.getDataProcessedLocation(folderName) + messageID + ".xml");
            }
            FileReader in = new FileReader(inputFile);
            FileWriter out = new FileWriter(outputFile);
            int c;
            while ((c =(int)(Object) in.read()) != -1) out.write(c);
            in.close();
            out.close();
        } catch (Exception e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getDataProcessedLocation(MyHelperClass o0){ return null; }
	public MyHelperClass getErrorDataLocation(MyHelperClass o0){ return null; }}

class File {

File(String o0){}
	File(){}}

class FileReader {

FileReader(File o0){}
	FileReader(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}
