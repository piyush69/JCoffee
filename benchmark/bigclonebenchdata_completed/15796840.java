


class c15796840 {

    public Boolean compress(String sSourceDir, ArrayList aFiles, String sDestinationFilename) {
        MyHelperClass logger = new MyHelperClass();
        logger.debug("compress(%s, %s, %s)", sSourceDir, aFiles, sDestinationFilename);
        BufferedInputStream oOrigin = null;
        FileOutputStream oDestination;
        ZipOutputStream oOutput = null;
        Iterator oIterator;
        byte[] aData;
        try {
            oDestination = new FileOutputStream(sDestinationFilename);
            oOutput = new ZipOutputStream(new BufferedOutputStream(oDestination));
            MyHelperClass BUFFER_SIZE = new MyHelperClass();
            aData = new byte[(int)(Object)BUFFER_SIZE];
            oIterator =(Iterator)(Object) aFiles.iterator();
            while ((boolean)(Object)oIterator.hasNext()) {
                try {
                    String sFilename = (String)(String)(Object) oIterator.next();
                    MyHelperClass File = new MyHelperClass();
                    FileInputStream fisInput = new FileInputStream(sSourceDir + File.separator + sFilename);
//                    MyHelperClass BUFFER_SIZE = new MyHelperClass();
                    oOrigin = new BufferedInputStream(fisInput, BUFFER_SIZE);
                    ZipEntry oEntry = new ZipEntry(sFilename.replace('\\', '/'));
                    oOutput.putNextEntry(oEntry);
                    int iCount;
//                    MyHelperClass BUFFER_SIZE = new MyHelperClass();
                    while ((iCount =(int)(Object) oOrigin.read(aData, 0, BUFFER_SIZE)) != -1) oOutput.write(aData, 0, iCount);
                } finally {
                    MyHelperClass StreamHelper = new MyHelperClass();
                    StreamHelper.close(oOrigin);
                }
            }
        } catch (Exception oException) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error(oException.getMessage(), oException);
            return false;
        } finally {
            MyHelperClass StreamHelper = new MyHelperClass();
            StreamHelper.close(oOutput);
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass close(ZipOutputStream o0){ return null; }
	public MyHelperClass debug(String o0, String o1, ArrayList o2, String o3){ return null; }
	public MyHelperClass close(BufferedInputStream o0){ return null; }}

class ArrayList {

public MyHelperClass iterator(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(FileInputStream o0, MyHelperClass o1){}
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(BufferedOutputStream o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}
