import java.io.*;
import java.lang.*;
import java.util.*;



class c5271797 {
public MyHelperClass NULL;
public MyHelperClass JOptionPane;
	public MyHelperClass VietPad;
	public MyHelperClass supportDir;

    private void loadMap() {
        final String wordList = "vietwordlist.txt";
        try {
            MyHelperClass supportDir = new MyHelperClass();
            File dataFile = new File((String)(Object)supportDir, wordList);
            if (!dataFile.exists()) {
                MyHelperClass Channels = new MyHelperClass();
                final ReadableByteChannel input =(ReadableByteChannel)(Object) Channels.newChannel(ClassLoader.getSystemResourceAsStream("dict/" + dataFile.getName()));
                final FileChannel output =(FileChannel)(Object) (new FileOutputStream(dataFile).getChannel());
                output.transferFrom(input, 0, 1000000L);
                input.close();
                output.close();
            }
            long fileLastModified = dataFile.lastModified();
            MyHelperClass map = new MyHelperClass();
            if (map == null) {
//                MyHelperClass map = new MyHelperClass();
                map =(MyHelperClass)(Object) new HashMap();
            } else {
                MyHelperClass mapLastModified = new MyHelperClass();
                if (fileLastModified <= (long)(Object)mapLastModified) {
                    return;
                }
//                MyHelperClass map = new MyHelperClass();
                map.clear();
            }
            long mapLastModified =(long)(Object) NULL; //new long();
            mapLastModified = fileLastModified;
            BufferedReader bs = new BufferedReader(new InputStreamReader(new FileInputStream(dataFile), "UTF-8"));
            String accented;
            while ((accented = bs.readLine()) != null) {
                MyHelperClass VietUtilities = new MyHelperClass();
                String plain =(String)(Object) VietUtilities.stripDiacritics(accented);
//                MyHelperClass map = new MyHelperClass();
                map.put(plain.toLowerCase(), accented);
            }
            bs.close();
        } catch (IOException e) {
            MyHelperClass map = new MyHelperClass();
            map = null;
            e.printStackTrace();
            MyHelperClass myResources = new MyHelperClass();
            JOptionPane.showMessageDialog(this, myResources.getString("Cannot_find_\"") + wordList + myResources.getString("\"_in\n") + supportDir.toString(), VietPad.APP_NAME, JOptionPane.ERROR_MESSAGE);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass APP_NAME;
public MyHelperClass showMessageDialog(c5271797 o0, String o1, MyHelperClass o2, MyHelperClass o3){ return null; }
	public MyHelperClass clear(){ return null; }
	public MyHelperClass stripDiacritics(String o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass newChannel(InputStream o0){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }}

class ReadableByteChannel {

public MyHelperClass close(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass transferFrom(ReadableByteChannel o0, int o1, long o2){ return null; }}
