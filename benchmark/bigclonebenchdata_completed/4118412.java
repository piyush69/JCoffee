


class c4118412 {
public MyHelperClass getAppConfig(){ return null; }

    private void compress(String outputFile, ArrayList inputFiles, PrintWriter log, boolean compress) throws Exception {
        String absPath =(String)(Object) getAppConfig().getPathConfig().getAbsoluteServerPath();
        log.println("Concat files into: " + outputFile);
        OutputStream out =(OutputStream)(Object) new FileOutputStream(absPath + outputFile);
        byte[] buffer = new byte[4096];
        int readBytes;
        for (String file :(String[])(Object) (Object[])(Object)inputFiles) {
            log.println(" Read: " + file);
            InputStream in =(InputStream)(Object) new FileInputStream(absPath + file);
            while ((readBytes =(int)(Object) in.read(buffer)) != -1) {
                out.write(buffer, 0, readBytes);
            }
            in.close();
        }
        out.close();
        if (compress) {
            long normalSize =(long)(Object) (new File(absPath + outputFile).length());
            ProcessBuilder builder = new ProcessBuilder("java", "-jar", "WEB-INF/yuicompressor.jar", outputFile, "-o", outputFile, "--line-break", "4000");
            builder.directory((java.io.File)(Object)new File(absPath));
            Process process = builder.start();
            process.waitFor();
            long minSize =(long)(Object) (new File(absPath + outputFile).length());
            long diff = normalSize - minSize;
            double percentage = Math.floor((double) diff / normalSize * 1000.0) / 10.0;
            double diffSize = (Math.floor(diff / 1024.0 * 10.0) / 10.0);
            log.println("Result: " + percentage + " % (" + diffSize + " KB)");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getPathConfig(){ return null; }
	public MyHelperClass getAbsoluteServerPath(){ return null; }}

class ArrayList {

}

class PrintWriter {

public MyHelperClass println(String o0){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class File {

File(String o0){}
	File(){}
	public MyHelperClass length(){ return null; }}
