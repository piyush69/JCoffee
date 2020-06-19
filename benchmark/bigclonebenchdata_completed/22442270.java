
import java.io.UncheckedIOException;


class c22442270 {
public MyHelperClass Logger;
	public MyHelperClass JOptionPane;

//            @Override
            public void handledRun() throws Throwable {
                try {
                    MyHelperClass ONLINE_CLIENT_DATA = new MyHelperClass();
                    URL url = new URL(ONLINE_CLIENT_DATA + "gamedata.xml");
                    BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                    int lastversion = 0;
                    String readHeader1 =(String)(Object) br.readLine();
                    String readHeader2 =(String)(Object) br.readLine();
                    String[] parts = readHeader2.split(" ");
                    lastversion = new Integer(parts[1]);
                    MyHelperClass GameDatabase = new MyHelperClass();
                    GameDatabase.loadVersion();
//                    MyHelperClass GameDatabase = new MyHelperClass();
                    if ((int)(Object)GameDatabase.version < lastversion) {
                        MyHelperClass LogTypes = new MyHelperClass();
                        Logger.log(LogTypes.LOG, "Downloading new gamedata");
                        BufferedOutputStream bo = null;
//                        MyHelperClass GameDatabase = new MyHelperClass();
                        File destfile = new File(GameDatabase.dataFilePath);
                        if (!(Boolean)(Object)destfile.createNewFile()) {
                            destfile.delete();
                            destfile.createNewFile();
                        }
                        bo = new BufferedOutputStream(new FileOutputStream(destfile));
                        bo.write((readHeader1 + "\n").getBytes());
                        bo.write((readHeader2 + "\n").getBytes());
                        int readedbyte;
                        while ((readedbyte =(int)(Object) br.read()) != -1) {
                            bo.write(readedbyte);
                        }
                        bo.flush();
                        try {
                            br.close();
                            bo.close();
                        } catch (Exception ex) {
                            MyHelperClass Logger = new MyHelperClass();
                            Logger.log(ex);
                        }
                    }
//                 } catch (java.net.UncheckedIOException unknownHost) {
                    MyHelperClass Logger = new MyHelperClass();
                    Logger.log("Sourceforge is down, cannot update gamedata");
                } catch (Exception e) {
                    MyHelperClass FrameOrganizer = new MyHelperClass();
                    JOptionPane.showMessageDialog(FrameOrganizer.getClientFrame(), "The gamedata is outdated, but Coopnet couldn't update it!", "Gamedata outdated", JOptionPane.INFORMATION_MESSAGE);
                    throw e;
                } finally {
                    MyHelperClass GameDatabase = new MyHelperClass();
                    GameDatabase.loadVersion();
//                    MyHelperClass GameDatabase = new MyHelperClass();
                    GameDatabase.load("", GameDatabase.dataFilePath);
//                    MyHelperClass GameDatabase = new MyHelperClass();
                    GameDatabase.detectGames();
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass version;
	public MyHelperClass LOG;
	public MyHelperClass INFORMATION_MESSAGE;
	public MyHelperClass dataFilePath;
public MyHelperClass log(String o0){ return null; }
	public MyHelperClass log(Exception o0){ return null; }
	public MyHelperClass load(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass showMessageDialog(MyHelperClass o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass getClientFrame(){ return null; }
	public MyHelperClass loadVersion(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass detectGames(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(FileOutputStream o0){}
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass delete(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}
