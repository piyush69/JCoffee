import java.io.*;
import java.lang.*;
import java.util.*;



class c17499607 {
public MyHelperClass setProgress(int o0){ return null; }

//        @Override
        public Void doInBackground() {
            java.io.FileOutputStream fos = null;
            try {
                String localFile = "JavaPointNew.jar";
                java.io.BufferedInputStream in = null;
                try {
                    MyHelperClass url = new MyHelperClass();
                    HttpURLConnection httpConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                    MyHelperClass contentLength = new MyHelperClass();
                    contentLength = httpConn.getContentLength();
//                    MyHelperClass contentLength = new MyHelperClass();
                    if ((int)(Object)contentLength == -1) {
                        System.out.println("unknown content length");
                    } else {
//                        MyHelperClass contentLength = new MyHelperClass();
                        System.out.println("content length: " + contentLength + " bytes");
                    }
                    in = new java.io.BufferedInputStream((InputStream)(Object)httpConn.getInputStream());
                } catch (UncheckedIOException ex) {
                    ex.printStackTrace();
                }
                fos = new java.io.FileOutputStream(localFile);
                java.io.BufferedOutputStream bout = new BufferedOutputStream(fos, 1024);
                byte[] data = new byte[1024];
                int x = 0;
                int bytes = 0;
                while ((x = in.read(data, 0, 1024)) >= 0) {
                    bout.write(data, 0, x);
                    bytes += x;
                    MyHelperClass contentLength = new MyHelperClass();
                    setProgress((int) ((Math.min(bytes * 100 / (int)(Object)contentLength, 100)) + .5));
                }
                bout.close();
                in.close();
                MyHelperClass mainFrame = new MyHelperClass();
                File jarFile =(File)(Object) mainFrame.presentationFile;
                if (jarFile.exists()) {
                    MyHelperClass Utilities = new MyHelperClass();
                    final File temporaryJarFile =(File)(Object) Utilities.createTemporaryFile("presentation", ".jar", false, null);
                    final JarFile updatedJarFile = new JarFile(localFile);
                    final JarOutputStream output = new JarOutputStream(new FileOutputStream(temporaryJarFile));
//                    MyHelperClass Utilities = new MyHelperClass();
                    for (final JarEntry entry :(JarEntry[])(Object) (Object[])(Object)Utilities.toList(updatedJarFile.entries())) {
                        MyHelperClass Constants = new MyHelperClass();
                        if (!(Boolean)(Object)entry.getName().startsWith(Constants.JAR_ENTRY_PRESENTATION_PREFIX)) {
                            final InputStream entryStream =(InputStream)(Object) updatedJarFile.getInputStream(entry);
                            output.putNextEntry(entry);
//                            MyHelperClass Utilities = new MyHelperClass();
                            Utilities.write(entryStream, output);
                        }
                    }
//                    MyHelperClass mainFrame = new MyHelperClass();
                    new SlidesWriter().write(mainFrame.getSlides(), output);
                    jarFile.delete();
                    new File(localFile).delete();
                    if (!temporaryJarFile.renameTo(jarFile)) {
                        throw new RuntimeException("Failed to update " + jarFile);
                    }
                } else {
//                    MyHelperClass mainFrame = new MyHelperClass();
                    new SlidesWriter().write(mainFrame.getSlides(), new JarOutputStream(new FileOutputStream(jarFile)));
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    fos.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            return null;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass JAR_ENTRY_PRESENTATION_PREFIX;
	public MyHelperClass presentationFile;
public MyHelperClass startsWith(MyHelperClass o0){ return null; }
	public MyHelperClass toList(MyHelperClass o0){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass write(InputStream o0, JarOutputStream o1){ return null; }
	public MyHelperClass getSlides(){ return null; }
	public MyHelperClass createTemporaryFile(String o0, String o1, boolean o2, Object o3){ return null; }}

class HttpURLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class JarFile {

JarFile(){}
	JarFile(String o0){}
	public MyHelperClass getInputStream(JarEntry o0){ return null; }
	public MyHelperClass entries(){ return null; }}

class JarOutputStream {

JarOutputStream(){}
	JarOutputStream(FileOutputStream o0){}
	public MyHelperClass putNextEntry(JarEntry o0){ return null; }}

class JarEntry {

public MyHelperClass getName(){ return null; }}

class SlidesWriter {

public MyHelperClass write(MyHelperClass o0, JarOutputStream o1){ return null; }}
