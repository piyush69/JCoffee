import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5125847 {
public static MyHelperClass IOUtils;
	public static MyHelperClass Configuration;
	public static MyHelperClass logger;
	public static MyHelperClass FileUtils;
	public static MyHelperClass fileName(URL o0){ return null; }
	public static MyHelperClass buildUrl(URL o0, String o1){ return null; }
//public MyHelperClass Configuration;
//	public MyHelperClass logger;
//	public MyHelperClass IOUtils;
//	public MyHelperClass FileUtils;
//	public MyHelperClass fileName(URL o0){ return null; }
//	public MyHelperClass buildUrl(URL o0, String o1){ return null; }

//    @SuppressWarnings({ "ResultOfMethodCallIgnored" })
    public static Node combineCss(URL base, List<Node> linkCss, List<File> newFiles) throws Throwable, IOException {
        File dir = File.createTempFile("css", "" + System.currentTimeMillis());
        StringBuilder name = new StringBuilder();
        try {
            if (dir.delete() && dir.mkdirs()) {
                File minDir = new File(dir, "min");
                minDir.mkdir();
                File combineFile = new File(minDir, "style.css");
                Writer writer = new FileWriter(combineFile);
                boolean first = true;
                for (Node link : linkCss) {
                    String path = ((Element)(Element)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) link).getAttribute("href");
                    URL url = new URL((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)buildUrl(base, path));
                    InputStream inputStream = url.openStream();
                    File cssFile = new File((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)dir, fileName(url));
                    FileOutputStream outputStream = new FileOutputStream(cssFile);
                    IOUtils.copy(inputStream, outputStream);
                    outputStream.close();
                    inputStream.close();
                    if (!first) {
                        writer.write('\n');
                    } else {
                        first = false;
                    }
                    Reader reader = new FileReader(cssFile);
                    if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)Configuration.cssMinification()) {
                        CssCompressor cssCompressor = new CssCompressor(reader);
                        cssCompressor.compress(writer, 0);
                    } else {
                        IOUtils.copy(reader, writer);
                    }
                    reader.close();
                    String fileName = cssFile.getName();
                    int pos = fileName.lastIndexOf('.');
                    if (pos >= 0) {
                        fileName = fileName.substring(0, pos);
                    }
                    name.append(fileName).append(",");
                }
                writer.close();
                FileReader reader = new FileReader(combineFile);
                name.append(hashCode(IOUtils.toString(reader))).append(".css");
                reader.close();
                File targetFile = new File((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)Configuration.getCssLocalDir(), name.toString());
                if (!targetFile.exists()) {
                    targetFile.getParentFile().mkdirs();
                    FileUtils.copyFile(combineFile, targetFile);
                    newFiles.add(targetFile);
                    logger.info("Combined several css files into the single " + targetFile + " [size=" + targetFile.length() + "].");
                }
            }
        } finally {
            FileUtils.deleteQuietly(dir);
        }
        if (name.length() != 0) {
            Element element = (Element)(Element)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) linkCss.get(0);
            element.setAttribute("href", Configuration.getCssUrlPrefix() + name.toString());
            return(Node)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) element;
        } else {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass deleteQuietly(File o0){ return null; }
	public MyHelperClass getCssLocalDir(){ return null; }
	public MyHelperClass copyFile(File o0, File o1){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass cssMinification(){ return null; }
	public MyHelperClass getCssUrlPrefix(){ return null; }
	public MyHelperClass copy(Reader o0, Writer o1){ return null; }}

class Node {

}

class Element {

public MyHelperClass setAttribute(String o0, String o1){ return null; }}

class CssCompressor {

CssCompressor(Reader o0){}
	CssCompressor(){}
	public MyHelperClass compress(Writer o0, int o1){ return null; }}

class Object {

public MyHelperClass toString(FileReader o0){ return null; }}
