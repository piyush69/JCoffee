


class c7125457 {

    void readFileHeader(DmgConfigDMO config, ConfigLocation sl) throws IOException {
        String fileHeader;// = new String();
        fileHeader = "";
        if (config.getGeneratedFileHeader() != null) {
            StringBuffer sb = new StringBuffer();
            if (sl.getJarFilename() != null) {
                URL url = new URL("jar:file:" + sl.getJarFilename() + "!/" + sl.getJarDirectory() + "/" + config.getGeneratedFileHeader());
                LineNumberReader in = new LineNumberReader(new InputStreamReader(url.openStream()));
                String str;
                while ((str =(String)(Object) in.readLine()) != null) {
                    sb.append(str + "\n");
                }
                in.close();
            } else {
                MyHelperClass File = new MyHelperClass();
                LineNumberReader in = new LineNumberReader((InputStreamReader)(Object)new FileReader((int)(Object)sl.getDirectory() + (int)(Object)File.separator + (int)(Object)config.getGeneratedFileHeader()));
                String str;
                while ((str =(String)(Object) in.readLine()) != null) {
                    sb.append(str + "\n");
                }
                in.close();
            }
//            MyHelperClass fileHeader = new MyHelperClass();
            fileHeader = sb.toString();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
}

class DmgConfigDMO {

public MyHelperClass getGeneratedFileHeader(){ return null; }}

class ConfigLocation {

public MyHelperClass getJarFilename(){ return null; }
	public MyHelperClass getJarDirectory(){ return null; }
	public MyHelperClass getDirectory(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class LineNumberReader {

LineNumberReader(){}
	LineNumberReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class FileReader {

FileReader(){}
	FileReader(int o0){}}
