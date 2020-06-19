


class c18539085 {
public static MyHelperClass prop;
//public MyHelperClass prop;

    static void createCompleteXML(File file) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            MyHelperClass errorFile = new MyHelperClass();
            fis = new FileInputStream(errorFile);
            fos = new FileOutputStream(file);
            byte[] data = new byte[Integer.parseInt((String)(Object)prop.getProperty("allocationUnit"))];
            int offset;
            while ((offset =(int)(Object) fis.read(data)) != -1) fos.write(data, 0, offset);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (Exception e) {
            }
            try {
                fos.close();
            } catch (Exception e) {
            }
        }
        FileWriter fw = null;
        try {
            fw = new FileWriter(file, true);
            fw.append("</detail>");
            fw.append("\n</exception>");
            fw.append("\n</log>");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (Exception e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getProperty(String o0){ return null; }}

class File {

}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(File o0, boolean o1){}
	FileWriter(){}
	public MyHelperClass append(String o0){ return null; }
	public MyHelperClass close(){ return null; }}
