import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12530708 {
public MyHelperClass orderedFiles;
	public MyHelperClass IOUtils;
	public MyHelperClass orderingNames;
	public MyHelperClass getLog(){ return null; }

    private int mergeFiles(Merge merge) throws Throwable, MojoExecutionException {
        MyHelperClass DEFAULT_ENCODING = new MyHelperClass();
        String encoding =(String)(Object) DEFAULT_ENCODING;
        if (merge.getEncoding() != null &&(int)(Object) merge.getEncoding().length() > 0) {
            encoding =(String)(Object) merge.getEncoding();
        }
        int numMergedFiles = 0;
        Writer ostream = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream((String)(Object)merge.getTargetFile(), true);
            ostream = new OutputStreamWriter(fos, encoding);
            BufferedWriter output = new BufferedWriter(ostream);
            for (String orderingName :(String[])(Object) (Object[])(Object)this.orderingNames) {
                List<File> files =(List<File>)(Object) this.orderedFiles.get(orderingName);
                if (files != null) {
                    getLog().info("Appending: " + files.size() + " files that matched the name: " + orderingName + " to the target file: " + merge.getTargetFile().getAbsolutePath() + "...");
                    for (File file : files) {
                        String fileName = file.getName();
                        getLog().info("Appending file: " + fileName + " to the target file: " + merge.getTargetFile().getAbsolutePath() + "...");
                        InputStream input = null;
                        try {
                            input = new FileInputStream(file);
                            if (merge.getSeparator() != null &&(int)(Object) merge.getSeparator().trim().length() > 0) {
                                String replaced =(String)(Object) merge.getSeparator().trim();
                                replaced = replaced.replace("\n", "");
                                replaced = replaced.replace("\t", "");
                                replaced = replaced.replace("#{file.name}", fileName);
                                replaced = replaced.replace("#{parent.name}", file.getParentFile() != null ? file.getParentFile().getName() : "");
                                replaced = replaced.replace("\\n", "\n");
                                replaced = replaced.replace("\\t", "\t");
                                getLog().debug("Appending separator: " + replaced);
                                IOUtils.copy(new StringReader(replaced), output);
                            }
                            IOUtils.copy(input, output, encoding);
                        } catch (IOException ioe) {
                            throw new MojoExecutionException("Failed to append file: " + fileName + " to output file", ioe);
                        } finally {
                            IOUtils.closeQuietly(input);
                        }
                        numMergedFiles++;
                    }
                }
            }
            output.flush();
        } catch (IOException ioe) {
            throw new MojoExecutionException("Failed to open stream file to output file: " + merge.getTargetFile().getAbsolutePath(), ioe);
        } finally {
            if (fos != null) {
                IOUtils.closeQuietly(fos);
            }
            if (ostream != null) {
                IOUtils.closeQuietly(ostream);
            }
        }
        return numMergedFiles;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(StringReader o0, BufferedWriter o1){ return null; }
	public MyHelperClass closeQuietly(Writer o0){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, BufferedWriter o1, String o2){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }}

class Merge {

public MyHelperClass getEncoding(){ return null; }
	public MyHelperClass getTargetFile(){ return null; }
	public MyHelperClass getSeparator(){ return null; }}

class MojoExecutionException extends Exception{
	public MojoExecutionException(String errorMessage) { super(errorMessage); }
	MojoExecutionException(String o0, IOException o1){}
	MojoExecutionException(){}
}
