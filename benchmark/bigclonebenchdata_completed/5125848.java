import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5125848 {
public static MyHelperClass IOUtils;
	public static MyHelperClass Configuration;
	public static MyHelperClass logger;
	public static MyHelperClass FileUtils;
	public static MyHelperClass fileName(URL o0){ return null; }
	public static MyHelperClass buildUrl(URL o0, String o1){ return null; }
public MyHelperClass Configuration;
	public MyHelperClass logger;
	public MyHelperClass IOUtils;
	public MyHelperClass FileUtils;
	public MyHelperClass fileName(URL o0){ return null; }
	public MyHelperClass buildUrl(URL o0, String o1){ return null; }

//    @SuppressWarnings({ "ResultOfMethodCallIgnored" })
    public static Node combineJs(URL base, List<Node> linkJs, List<File> newFiles) throws Throwable, IOException {
        File dir = File.createTempFile("javascript", "" + System.currentTimeMillis());
        StringBuilder name = new StringBuilder();
        try {
            if (dir.delete() && dir.mkdirs()) {
                File minDir = new File(dir, "min");
                minDir.mkdir();
                File combineFile = new File(minDir, "script.js");
                File concatFile = new File(minDir, "concat.js");
                Writer combineWriter = new FileWriter(combineFile);
                Writer concatWriter = new FileWriter(concatFile);
                final List<Boolean> fails = new LinkedList<Boolean>();
                boolean first = true;
                for (Node link : linkJs) {
                    String path = ((Element)(Element)(Object) link).getAttribute("src");
                    URL url = new URL((String)(Object)buildUrl(base, path));
                    InputStream inputStream = url.openStream();
                    File jsFile = new File((String)(Object)dir, fileName(url));
                    FileOutputStream outputStream = new FileOutputStream(jsFile);
                    IOUtils.copy(inputStream, outputStream);
                    outputStream.close();
                    inputStream.close();
                    if (!first) {
                        combineWriter.write("\n;\n");
                        concatWriter.write("\n;\n");
                    } else {
                        first = false;
                    }
                    if (Configuration.jsMinification()) {
                        Reader reader = new FileReader(jsFile);
                        try {
                            JavaScriptCompressor jsCompressor = new JavaScriptCompressor(reader, new ErrorReporter() {

//                                @Override
                                public void warning(String s, String s1, int i, String s2, int i1) {
                                    fails.add(true);
                                }

//                                @Override
                                public void error(String s, String s1, int i, String s2, int i1) {
                                    fails.add(true);
                                }

//                                @Override
                                public EvaluatorException runtimeError(String s, String s1, int i, String s2, int i1) {
                                    fails.add(true);
                                    return null;
                                }
                            });
                            jsCompressor.compress(combineWriter, 0, false, false, true, true);
                        } catch (Exception e) {
                            fails.add(true);
                        }
                        reader.close();
                    }
                    Reader reader = new FileReader(jsFile);
                    IOUtils.copy(reader, concatWriter);
                    reader.close();
                    String fileName = jsFile.getName();
                    int pos = fileName.lastIndexOf('.');
                    if (pos >= 0) {
                        fileName = fileName.substring(0, pos);
                    }
                    name.append(fileName).append(",");
                }
                combineWriter.close();
                concatWriter.close();
                FileReader reader;
                if (fails.size() == 0 && Configuration.jsMinification()) {
                    reader = new FileReader(combineFile);
                } else {
                    reader = new FileReader(concatFile);
                }
                name.append(hashCode(IOUtils.toString(reader))).append(".js");
                reader.close();
                File targetFile = new File(Configuration.getJsLocalDir(), name.toString());
                if (!targetFile.exists()) {
                    targetFile.getParentFile().mkdirs();
                    if (fails.size() == 0 && Configuration.jsMinification()) {
                        FileUtils.copyFile(combineFile, targetFile);
                    } else {
                        FileUtils.copyFile(concatFile, targetFile);
                    }
                    newFiles.add(targetFile);
                    logger.info("Combined several js files into the single " + targetFile + " [size=" + targetFile.length() + "].");
                }
            }
        } finally {
            FileUtils.deleteQuietly(dir);
        }
        if (name.length() != 0) {
            Element element = (Element)(Element)(Object) linkJs.get(0);
            element.setAttribute("src", Configuration.getJsUrlPrefix() + name.toString());
            return(Node)(Object) element;
        } else {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass deleteQuietly(File o0){ return null; }
	public MyHelperClass getJsUrlPrefix(){ return null; }
	public MyHelperClass jsMinification(){ return null; }
	public MyHelperClass copyFile(File o0, File o1){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getJsLocalDir(){ return null; }
	public MyHelperClass copy(Reader o0, Writer o1){ return null; }}

class Node {

}

class Element {

}

class JavaScriptCompressor {

JavaScriptCompressor(Reader o0, <anonymous ErrorReporter> o1){}
	JavaScriptCompressor(){}
	public MyHelperClass compress(Writer o0, int o1, boolean o2, boolean o3, boolean o4, boolean o5){ return null; }}

class ErrorReporter {

}

class EvaluatorException extends Exception{
	public EvaluatorException(String errorMessage) { super(errorMessage); }
}

class Object {

public MyHelperClass toString(FileReader o0){ return null; }}
