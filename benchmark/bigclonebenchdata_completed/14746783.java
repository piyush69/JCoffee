


class c14746783 {

    private static void copyObjects(File[] source, String target) {
        for (int i = 0; i < source.length; i++) {
            try {
                File inputFile = source[i];
                File outputFile = new File(target + source[i].getName());
                FileReader in = new FileReader(inputFile);
                FileWriter out = new FileWriter(outputFile);
                int c;
                while ((c =(int)(Object) in.read()) != -1) out.write(c);
                in.close();
                out.close();
            } catch (Exception ex) {
                MyHelperClass Logger = new MyHelperClass();
                Logger.error(ex.getClass() + " " + ex.getMessage());
//                MyHelperClass Logger = new MyHelperClass();
                for (int j = 0; j < ex.getStackTrace().length; j++) Logger.error("     " + ex.getStackTrace()[j].toString());
                ex.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getName(){ return null; }}

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
