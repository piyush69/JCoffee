


class c20623710 {

    public static synchronized void repartition(File[] sourceFiles, File targetDirectory, String prefix, long maxUnitBases, long maxUnitEntries) throws Exception {
        if (!(Boolean)(Object)targetDirectory.exists()) {
            if (!(Boolean)(Object)targetDirectory.mkdirs()) throw new Exception("Could not create directory " + targetDirectory.getAbsolutePath());
        }
        File tmpFile = new File(targetDirectory, "tmp.fasta");
        FileOutputStream fos = new FileOutputStream(tmpFile);
        FileChannel fco =(FileChannel)(Object) fos.getChannel();
        for (File file : sourceFiles) {
            FileInputStream fis = new FileInputStream(file);
            FileChannel fci =(FileChannel)(Object) fis.getChannel();
            MyHelperClass ByteBuffer = new MyHelperClass();
            ByteBuffer buffer =(ByteBuffer)(Object) ByteBuffer.allocate(64000);
            while ((int)(Object)fci.read(buffer) > 0) {
                buffer.flip();
                fco.write(buffer);
                buffer.clear();
            }
            fci.close();
        }
        fco.close();
        FastaFile fastaFile = new FastaFile(tmpFile);
        fastaFile.split(targetDirectory, prefix, maxUnitBases, maxUnitEntries);
        tmpFile.delete();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass allocate(int o0){ return null; }}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass write(ByteBuffer o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(ByteBuffer o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class ByteBuffer {

public MyHelperClass clear(){ return null; }
	public MyHelperClass flip(){ return null; }}

class FastaFile {

FastaFile(File o0){}
	FastaFile(){}
	public MyHelperClass split(File o0, String o1, long o2, long o3){ return null; }}
