
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9327648 {
public MyHelperClass CVS_LOG;
	public MyHelperClass cleanup(File o0){ return null; }
public MyHelperClass CHUNK_SIZE;
	public MyHelperClass debugSequence(String o0){ return null; }
	public MyHelperClass getSeparatorSequence(){ return null; }
	public MyHelperClass findIndexOf(byte[] o0, byte[] o1, int o2){ return null; }

    public File getPreprocessedTextFile(File originalTextFile) throws IOException {
        MyHelperClass File = new MyHelperClass();
        File preprocessedTextFile =(File)(Object) File.createTempFile("cvs", null);
        String separatorSeq =(String)(Object) getSeparatorSequence();
        byte[] newLine = separatorSeq.getBytes();
        CVS_LOG.debug("Preprocessing " + originalTextFile.getAbsolutePath() + " to " + preprocessedTextFile.getAbsolutePath() + " using " + debugSequence(separatorSeq));
        byte[] crlf = "\r\n".getBytes();
        byte[] lf = "\n".getBytes();
        OutputStream out = null;
        InputStream in = null;
        try {
            in =(InputStream)(Object) new BufferedInputStream(new FileInputStream(originalTextFile));
            out =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(preprocessedTextFile));
            byte[] fileChunk = new byte[(int)(Object)CHUNK_SIZE];
            byte[] fileWriteChunk = new byte[(int)(Object)CHUNK_SIZE];
            for (int readLength =(int)(Object) in.read(fileChunk); readLength > 0; readLength =(int)(Object) in.read(fileChunk)) {
                if (newLine.length == 0) {
                    out.write(fileChunk, 0, readLength);
                } else {
                    int writeLength = 0;
                    for (int i = 0; i < readLength; ) {
                        int pos =(int)(Object) findIndexOf(fileChunk, crlf, i);
                        int lineSepLength = crlf.length;
                        if (pos < i || pos >= readLength) {
                            pos =(int)(Object) findIndexOf(fileChunk, lf, i);
                            lineSepLength = lf.length;
                        }
                        if (pos >= i && pos < readLength) {
                            try {
                                System.arraycopy(fileChunk, i, fileWriteChunk, writeLength, pos - i);
                            } catch (ArrayIndexOutOfBoundsException aiobe) {
                                CVS_LOG.error("fileChunk.length=" + fileChunk.length + " i=" + i + " writeLength=" + writeLength + " pos=" + pos + " fileWriteChunk.length=" + fileWriteChunk.length);
                                throw aiobe;
                            }
                            writeLength += pos - i;
                            i = pos + lineSepLength;
                            for (int j = 0; j < newLine.length; j++) fileWriteChunk[writeLength++] = newLine[j];
                        } else {
                            System.arraycopy(fileChunk, i, fileWriteChunk, writeLength, readLength - i);
                            writeLength += readLength - i;
                            i = readLength;
                        }
                    }
                    out.write(fileWriteChunk, 0, writeLength);
                }
            }
            return preprocessedTextFile;
        } catch (UncheckedIOException ex) {
            if (preprocessedTextFile != null) {
                cleanup(preprocessedTextFile);
            }
            throw ex;
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (UncheckedIOException ex) {
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (UncheckedIOException ex) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createTempFile(String o0, Object o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
