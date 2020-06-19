


class c14667831 {
public MyHelperClass IOUtils;
	public MyHelperClass getTargetFile(){ return null; }
	public MyHelperClass getFiles(){ return null; }
	public MyHelperClass getDelimiter(){ return null; }
	public MyHelperClass getEncoding(){ return null; }
	public MyHelperClass getLog(){ return null; }
	public MyHelperClass getTargetDirectory(){ return null; }

    public void concatFiles() throws IOException {
        Writer writer = null;
        try {
            final File targetFile = new File(getTargetDirectory(), getTargetFile());
            targetFile.getParentFile().mkdirs();
            if (null != getEncoding()) {
                getLog().info("Writing aggregated file with encoding '" + getEncoding() + "'");
                writer =(Writer)(Object) new BufferedWriter(new OutputStreamWriter(new FileOutputStream(targetFile), getEncoding()));
            } else {
                getLog().info("WARNING: writing aggregated file with system encoding");
                writer =(Writer)(Object) new FileWriter(targetFile);
            }
            for (File file :(File[])(Object) (Object[])(Object)getFiles()) {
                Reader reader = null;
                try {
                    if (null != getEncoding()) {
                        getLog().info("Reading file " + file.getCanonicalPath() + " with encoding  '" + getEncoding() + "'");
                        reader =(Reader)(Object) new BufferedReader(new InputStreamReader(new FileInputStream(file), getEncoding()));
                    } else {
                        getLog().info("WARNING: Reading file " + file.getCanonicalPath() + " with system encoding");
                        reader =(Reader)(Object) new FileReader(file);
                    }
                    IOUtils.copy(reader, writer);
                    final String delimiter =(String)(Object) getDelimiter();
                    if (delimiter != null) {
                        writer.write(delimiter.toCharArray());
                    }
                } finally {
                    IOUtils.closeQuietly(reader);
                }
            }
        } finally {
            IOUtils.closeQuietly(writer);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(Reader o0, Writer o1){ return null; }
	public MyHelperClass closeQuietly(Writer o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass closeQuietly(Reader o0){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Writer {

public MyHelperClass write(char[] o0){ return null; }}

class File {

File(MyHelperClass o0, MyHelperClass o1){}
	File(){}
	public MyHelperClass getCanonicalPath(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(OutputStreamWriter o0){}}

class OutputStreamWriter {

OutputStreamWriter(FileOutputStream o0, MyHelperClass o1){}
	OutputStreamWriter(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}}

class Reader {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(FileInputStream o0, MyHelperClass o1){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileReader {

FileReader(File o0){}
	FileReader(){}}
