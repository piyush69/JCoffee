import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9980609 {
public static MyHelperClass setLastModified(Touchable o0, MyHelperClass o1){ return null; }
public static MyHelperClass SelectorUtils;
	public static MyHelperClass getOutputStream(Resource o0, boolean o1, Project o2){ return null; }
//	public MyHelperClass setLastModified(Touchable o0, MyHelperClass o1){ return null; }
//public MyHelperClass SelectorUtils;
//	public MyHelperClass getOutputStream(Resource o0, boolean o1, Project o2){ return null; }

    public static void copyResource(Resource source, Resource dest, FilterSetCollection filters, Vector filterChains, boolean overwrite, boolean preserveLastModified, boolean append, String inputEncoding, String outputEncoding, Project project) throws Throwable, IOException {
        MyHelperClass FileUtils = new MyHelperClass();
        if (!(overwrite || (boolean)(Object)SelectorUtils.isOutOfDate(source, dest, FileUtils.getFileUtils().getFileTimestampGranularity()))) {
            return;
        }
        final boolean filterSetsAvailable = (filters != null && (boolean)(Object)filters.hasFilters());
        final boolean filterChainsAvailable = (filterChains != null && filterChains.size() > 0);
        if (filterSetsAvailable) {
            BufferedReader in = null;
            BufferedWriter out = null;
            try {
                InputStreamReader isr = null;
                if (inputEncoding == null) {
                    isr = new InputStreamReader((InputStream)(Object)source.getInputStream());
                } else {
                    isr = new InputStreamReader((InputStream)(Object)source.getInputStream(), inputEncoding);
                }
                in = new BufferedReader(isr);
                OutputStream os =(OutputStream)(Object) getOutputStream(dest, append, project);
                OutputStreamWriter osw;
                if (outputEncoding == null) {
                    osw = new OutputStreamWriter(os);
                } else {
                    osw = new OutputStreamWriter(os, outputEncoding);
                }
                out = new BufferedWriter(osw);
                if (filterChainsAvailable) {
                    ChainReaderHelper crh = new ChainReaderHelper();
//                    MyHelperClass FileUtils = new MyHelperClass();
                    crh.setBufferSize(FileUtils.BUF_SIZE);
                    crh.setPrimaryReader(in);
                    crh.setFilterChains(filterChains);
                    crh.setProject(project);
                    Reader rdr =(Reader)(Object) crh.getAssembledReader();
                    in = new BufferedReader(rdr);
                }
                LineTokenizer lineTokenizer = new LineTokenizer();
                lineTokenizer.setIncludeDelims(true);
                String newline = null;
                String line =(String)(Object) lineTokenizer.getToken(in);
                while (line != null) {
                    if (line.length() == 0) {
                        out.newLine();
                    } else {
                        newline =(String)(Object) filters.replaceTokens(line);
                        out.write(newline);
                    }
                    line =(String)(Object) lineTokenizer.getToken(in);
                }
            } finally {
//                MyHelperClass FileUtils = new MyHelperClass();
                FileUtils.close(out);
//                MyHelperClass FileUtils = new MyHelperClass();
                FileUtils.close(in);
            }
        } else if (filterChainsAvailable || (inputEncoding != null && !inputEncoding.equals(outputEncoding)) || (inputEncoding == null && outputEncoding != null)) {
            BufferedReader in = null;
            BufferedWriter out = null;
            try {
                InputStreamReader isr = null;
                if (inputEncoding == null) {
                    isr = new InputStreamReader((InputStream)(Object)source.getInputStream());
                } else {
                    isr = new InputStreamReader((InputStream)(Object)source.getInputStream(), inputEncoding);
                }
                in = new BufferedReader(isr);
                OutputStream os =(OutputStream)(Object) getOutputStream(dest, append, project);
                OutputStreamWriter osw;
                if (outputEncoding == null) {
                    osw = new OutputStreamWriter(os);
                } else {
                    osw = new OutputStreamWriter(os, outputEncoding);
                }
                out = new BufferedWriter(osw);
                if (filterChainsAvailable) {
                    ChainReaderHelper crh = new ChainReaderHelper();
//                    MyHelperClass FileUtils = new MyHelperClass();
                    crh.setBufferSize(FileUtils.BUF_SIZE);
                    crh.setPrimaryReader(in);
                    crh.setFilterChains(filterChains);
                    crh.setProject(project);
                    Reader rdr =(Reader)(Object) crh.getAssembledReader();
                    in = new BufferedReader(rdr);
                }
//                MyHelperClass FileUtils = new MyHelperClass();
                char[] buffer = new char[(int)(Object)FileUtils.BUF_SIZE];
                while (true) {
                    int nRead = in.read(buffer, 0, buffer.length);
                    if (nRead == -1) {
                        break;
                    }
                    out.write(buffer, 0, nRead);
                }
            } finally {
//                MyHelperClass FileUtils = new MyHelperClass();
                FileUtils.close(out);
//                MyHelperClass FileUtils = new MyHelperClass();
                FileUtils.close(in);
            }
        } else if (source.as((FileProvider)(Object)FileProvider.class) != null && dest.as((FileProvider)(Object)FileProvider.class) != null) {
            File sourceFile =(File)(Object) ((FileProvider)(FileProvider)(Object) source.as((FileProvider)(Object)FileProvider.class)).getFile();
            File destFile =(File)(Object) ((FileProvider)(FileProvider)(Object) dest.as((FileProvider)(Object)FileProvider.class)).getFile();
            File parent = destFile.getParentFile();
            if (parent != null && !parent.isDirectory() && !destFile.getParentFile().mkdirs()) {
                throw new IOException("failed to create the parent directory" + " for " + destFile);
            }
            FileInputStream in = null;
            FileOutputStream out = null;
            FileChannel srcChannel = null;
            FileChannel destChannel = null;
            try {
                in = new FileInputStream(sourceFile);
                out = new FileOutputStream(destFile);
                srcChannel =(FileChannel)(Object) in.getChannel();
                destChannel =(FileChannel)(Object) out.getChannel();
                long position = 0;
                long count =(long)(Object) srcChannel.size();
                while (position < count) {
//                    MyHelperClass FileUtils = new MyHelperClass();
                    position += (long)(Object)srcChannel.transferTo(position, FileUtils.BUF_SIZE, destChannel);
                }
            } finally {
//                MyHelperClass FileUtils = new MyHelperClass();
                FileUtils.close(srcChannel);
//                MyHelperClass FileUtils = new MyHelperClass();
                FileUtils.close(destChannel);
//                MyHelperClass FileUtils = new MyHelperClass();
                FileUtils.close(out);
//                MyHelperClass FileUtils = new MyHelperClass();
                FileUtils.close(in);
            }
        } else {
            InputStream in = null;
            OutputStream out = null;
            try {
                in =(InputStream)(Object) source.getInputStream();
                out =(OutputStream)(Object) getOutputStream(dest, append, project);
//                MyHelperClass FileUtils = new MyHelperClass();
                byte[] buffer = new byte[(int)(Object)FileUtils.BUF_SIZE];
                int count = 0;
                do {
                    out.write(buffer, 0, count);
                    count = in.read(buffer, 0, buffer.length);
                } while (count != -1);
            } finally {
//                MyHelperClass FileUtils = new MyHelperClass();
                FileUtils.close(out);
//                MyHelperClass FileUtils = new MyHelperClass();
                FileUtils.close(in);
            }
        }
        if (preserveLastModified) {
            Touchable t = (Touchable)(Touchable)(Object) dest.as((FileProvider)(Object)Touchable.class);
            if (t != null) {
                setLastModified(t, source.getLastModified());
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BUF_SIZE;
public MyHelperClass getFileTimestampGranularity(){ return null; }
	public MyHelperClass close(FileChannel o0){ return null; }
	public MyHelperClass close(OutputStream o0){ return null; }
	public MyHelperClass close(FileInputStream o0){ return null; }
	public MyHelperClass getFileUtils(){ return null; }
	public MyHelperClass close(BufferedReader o0){ return null; }
	public MyHelperClass close(InputStream o0){ return null; }
	public MyHelperClass isOutOfDate(Resource o0, Resource o1, MyHelperClass o2){ return null; }
	public MyHelperClass close(BufferedWriter o0){ return null; }
	public MyHelperClass close(FileOutputStream o0){ return null; }}

class Resource {

public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass as(FileProvider o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass as(Touchable o0){ return null; }}

class FilterSetCollection {

public MyHelperClass hasFilters(){ return null; }
	public MyHelperClass replaceTokens(String o0){ return null; }}

class Project {

}

class ChainReaderHelper {

public MyHelperClass setFilterChains(Vector o0){ return null; }
	public MyHelperClass getAssembledReader(){ return null; }
	public MyHelperClass setBufferSize(MyHelperClass o0){ return null; }
	public MyHelperClass setProject(Project o0){ return null; }
	public MyHelperClass setPrimaryReader(BufferedReader o0){ return null; }}

class LineTokenizer {

public MyHelperClass getToken(BufferedReader o0){ return null; }
	public MyHelperClass setIncludeDelims(boolean o0){ return null; }}

class FileProvider {

public MyHelperClass getFile(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(long o0, MyHelperClass o1, FileChannel o2){ return null; }}

class Touchable {

}
