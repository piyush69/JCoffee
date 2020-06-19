import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9891128 {
public static MyHelperClass IOUtils;
	public static MyHelperClass logger;
//public MyHelperClass logger;
//	public MyHelperClass IOUtils;

    private static void readIzvestiyaArticles() throws Throwable, IOException {
        CsvReader reader = new CsvReader(new InputStreamReader(IzvestiyaUtil.class.getClassLoader().getResourceAsStream("mathnet_izvestiya.csv")), ';');
        reader.setTrimWhitespace(true);
        try {
            while ((boolean)(Object)reader.readRecord()) {
                String id =(String)(Object) reader.get(0);
                String filename =(String)(Object) reader.get(1);
                StringTokenizer st = new StringTokenizer(filename, "-.");
                String name = st.nextToken();
                String volume = st.nextToken();
                String year = st.nextToken();
                String extension = st.nextToken();
                String filepath = String.format("%s/%s/%s-%s.%s", year, volume.length() == 1 ? "0" + volume : volume, name, volume, extension);
                MyHelperClass id2filename = new MyHelperClass();
                id2filename.put(id, filepath);
            }
        } finally {
            reader.close();
        }
        MyHelperClass id2filename = new MyHelperClass();
        for (Map.Entry<String, String> entry :(Entry[])(Object)(Object[])(Object)(java.util.Map.Entry)(Object)(Entry[])(Object) (Object[])(Object)id2filename.entrySet()) {
            MyHelperClass INPUT_DIR = new MyHelperClass();
            String filepath = String.format("%s/%s", INPUT_DIR, entry.getValue());
            filepath = new File(filepath).exists() ? filepath : filepath.replace(".tex", ".TEX");
            if (new File(filepath).exists()) {
                InputStream in = new FileInputStream(filepath);
                MyHelperClass OUTPUT_DIR = new MyHelperClass();
                FileOutputStream out = new FileOutputStream(String.format("%s/%s.tex", OUTPUT_DIR, entry.getKey()), false);
                try {
                    IOUtils.copy(in, out);
                } catch (Exception e) {
                    IOUtils.closeQuietly(in);
                    IOUtils.closeQuietly(out);
                }
            } else {
                MyHelperClass Level = new MyHelperClass();
                logger.log(Level.INFO, "File with the path=" + filepath + " doesn't exist");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFO;
public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass entrySet(){ return null; }
	public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }}

class CsvReader {

CsvReader(InputStreamReader o0, char o1){}
	CsvReader(){}
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass setTrimWhitespace(boolean o0){ return null; }
	public MyHelperClass readRecord(){ return null; }
	public MyHelperClass close(){ return null; }}

class IzvestiyaUtil {

}

class Entry {

}
