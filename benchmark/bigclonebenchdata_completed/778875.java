


class c778875 {

    public BufferedWriter createOutputStream(String inFile, String outFile) throws IOException {
        int k_blockSize = 1024;
        int byteCount;
        char[] buf = new char[k_blockSize];
        File ofp = new File(outFile);
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(ofp));
        MyHelperClass ZipOutputStream = new MyHelperClass();
        zos.setMethod(ZipOutputStream.DEFLATED);
        OutputStreamWriter osw = new OutputStreamWriter(zos, "ISO-8859-1");
        BufferedWriter bw = new BufferedWriter(osw);
        ZipEntry zot = null;
        File ifp = new File(inFile);
        ZipInputStream zis = new ZipInputStream(new FileInputStream(ifp));
        InputStreamReader isr = new InputStreamReader(zis, "ISO-8859-1");
        BufferedReader br = new BufferedReader(isr);
        ZipEntry zit = null;
        while ((zit =(ZipEntry)(Object) zis.getNextEntry()) != null) {
            if (zit.getName().equals("content.xml")) {
                continue;
            }
            zot = new ZipEntry((String)(Object)zit.getName());
            zos.putNextEntry(zot);
            while ((byteCount =(int)(Object) br.read(buf, 0, k_blockSize)) >= 0) bw.write(buf, 0, byteCount);
            bw.flush();
            zos.closeEntry();
        }
        zos.putNextEntry(new ZipEntry("content.xml"));
        bw.flush();
        osw = new OutputStreamWriter(zos, "UTF8");
        bw = new BufferedWriter(osw);
        return bw;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEFLATED;
}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(OutputStreamWriter o0){}
	public MyHelperClass write(char[] o0, int o1, int o2){ return null; }
	public MyHelperClass flush(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass setMethod(MyHelperClass o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class OutputStreamWriter {

OutputStreamWriter(ZipOutputStream o0, String o1){}
	OutputStreamWriter(){}}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}
	public MyHelperClass getName(){ return null; }}

class ZipInputStream {

ZipInputStream(FileInputStream o0){}
	ZipInputStream(){}
	public MyHelperClass getNextEntry(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class InputStreamReader {

InputStreamReader(ZipInputStream o0, String o1){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass read(char[] o0, int o1, int o2){ return null; }}
