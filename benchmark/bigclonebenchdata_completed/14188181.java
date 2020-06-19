


class c14188181 {

    protected void copyFile(String from, String to, String workingDirectory) throws Exception {
        URL monitorCallShellScriptUrl =(URL)(Object) Thread.currentThread().getContextClassLoader().getResource(from);
        File f = new File((String)(Object)monitorCallShellScriptUrl.getFile());
        String directoryPath =(String)(Object) f.getAbsolutePath();
        String fileName = from;
        InputStream in = null;
        if (directoryPath.indexOf(".jar!") > -1) {
            URL urlJar = new URL(directoryPath.substring(directoryPath.indexOf("file:"), directoryPath.indexOf('!')));
            JarFile jf = new JarFile(urlJar.getFile());
            JarEntry je =(JarEntry)(Object) jf.getJarEntry(from);
            fileName =(String)(Object) je.getName();
            in =(InputStream)(Object) Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
        } else {
            in =(InputStream)(Object) new FileInputStream(f);
        }
        File outScriptFile = new File(to);
        FileOutputStream fos = new FileOutputStream(outScriptFile);
        int nextChar;
        while ((nextChar =(int)(Object) in.read()) != -1) fos.write(nextChar);
        fos.flush();
        fos.close();
        try {
            LinuxCommandExecutor cmdExecutor = new LinuxCommandExecutor();
            cmdExecutor.setWorkingDirectory(workingDirectory);
            cmdExecutor.runCommand("chmod 777 " + to);
        } catch (Exception e) {
            throw e;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass getFile(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getAbsolutePath(){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }}

class JarFile {

JarFile(MyHelperClass o0){}
	JarFile(){}
	public MyHelperClass getJarEntry(String o0){ return null; }}

class JarEntry {

public MyHelperClass getName(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class LinuxCommandExecutor {

public MyHelperClass runCommand(String o0){ return null; }
	public MyHelperClass setWorkingDirectory(String o0){ return null; }}
