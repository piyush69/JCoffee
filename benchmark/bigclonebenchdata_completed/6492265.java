


class c6492265 {

    private File downloadPDB(String pdbId) {
        MyHelperClass path = new MyHelperClass();
        File tempFile = new File(path + "/" + pdbId + ".pdb.gz");
//        MyHelperClass path = new MyHelperClass();
        File pdbHome = new File(path);
        if (!(Boolean)(Object)pdbHome.canWrite()) {
            System.err.println("can not write to " + pdbHome);
            return null;
        }
        String ftp = String.format("ftp://ftp.ebi.ac.uk/pub/databases/msd/pdb_uncompressed/pdb%s.ent", pdbId.toLowerCase());
        System.out.println("Fetching " + ftp);
        try {
            URL url = new URL(ftp);
            InputStream conn =(InputStream)(Object) url.openStream();
            System.out.println("writing to " + tempFile);
            FileOutputStream outPut = new FileOutputStream(tempFile);
            GZIPOutputStream gzOutPut = new GZIPOutputStream(outPut);
            PrintWriter pw = new PrintWriter(gzOutPut);
            BufferedReader fileBuffer = new BufferedReader(new InputStreamReader(conn));
            String line;
            while ((line =(String)(Object) fileBuffer.readLine()) != null) {
                pw.println(line);
            }
            pw.flush();
            pw.close();
            outPut.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return tempFile;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(MyHelperClass o0){}
	File(String o0){}
	File(){}
	public MyHelperClass canWrite(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class GZIPOutputStream {

GZIPOutputStream(FileOutputStream o0){}
	GZIPOutputStream(){}}

class PrintWriter {

PrintWriter(){}
	PrintWriter(GZIPOutputStream o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
