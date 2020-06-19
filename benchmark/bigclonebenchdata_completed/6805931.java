


class c6805931 {
public static MyHelperClass TOOL_POOL_FOLDER;
	public static MyHelperClass DEFAULT_LOGGER;
//public MyHelperClass TOOL_POOL_FOLDER;
//	public MyHelperClass DEFAULT_LOGGER;

    private static File copyJarToPool(File file) {
        File outFile = new File((int)(Object)TOOL_POOL_FOLDER.getAbsolutePath() + (int)(Object)File.separator + (int)(Object)file.getName());
        if (file != null && (boolean)(Object)file.exists() && (boolean)(Object)file.canRead()) {
            try {
                FileChannel inChan =(FileChannel)(Object) (new FileInputStream(file).getChannel());
                FileChannel outChan =(FileChannel)(Object) (new FileOutputStream(outFile).getChannel());
                inChan.transferTo(0, inChan.size(), outChan);
                return outFile;
            } catch (Exception ex) {
                DEFAULT_LOGGER.error("Exception while copying jar file to tool pool [inFile=" + file.getAbsolutePath() + "] [outFile=" + outFile.getAbsolutePath() + ": " + ex);
            }
        } else {
            DEFAULT_LOGGER.error("Could not copy jar file. File does not exist or can't read file. [inFile=" + file.getAbsolutePath() + "]");
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class File {
public static MyHelperClass separator;
File(){}
	File(int o0){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
