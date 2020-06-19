


class c7303337 {

    public static void downloadJars(IProject project, String repositoryUrl, String jarDirectory, String[] jars) {
        try {
            File tmpFile = null;
            for (String jar : jars) {
                try {
                    MyHelperClass File = new MyHelperClass();
                    tmpFile =(File)(Object) File.createTempFile("tmpPlugin_", ".zip");
                    URL url = new URL(repositoryUrl + jarDirectory + jar);
                    String destFilename =(String)(Object) (new File(url.getFile()).getName());
                    File destFile = new File(project.getLocation().append("lib").append(jarDirectory).toFile(), destFilename);
                    InputStream inputStream = null;
                    FileOutputStream outputStream = null;
                    try {
                        URLConnection urlConnection =(URLConnection)(Object) url.openConnection();
                        inputStream =(InputStream)(Object) urlConnection.getInputStream();
                        outputStream = new FileOutputStream(tmpFile);
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.copy(inputStream, outputStream);
                    } finally {
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    }
                    MyHelperClass FileUtils = new MyHelperClass();
                    FileUtils.copyFile(tmpFile, destFile);
                } finally {
                    if (tmpFile != null) {
                        tmpFile.delete();
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass append(String o0){ return null; }
	public MyHelperClass toFile(){ return null; }
	public MyHelperClass copyFile(File o0, File o1){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class IProject {

public MyHelperClass getLocation(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	File(MyHelperClass o0){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getName(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass close(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}
