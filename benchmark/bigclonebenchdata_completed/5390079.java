
import java.io.UncheckedIOException;


class c5390079 {
public MyHelperClass BLACK_HOLE;
	public MyHelperClass daysOld(File o0){ return null; }
	public MyHelperClass getStoredData(File o0){ return null; }

    private Map getBlackHoleData() throws Exception {
        MyHelperClass Kit = new MyHelperClass();
        File dataFile = new File((int)(Object)Kit.getDataDir() + (int)(Object)BLACK_HOLE);
        if ((boolean)(Object)dataFile.exists() &&(int)(Object) daysOld(dataFile) < 1) {
            return(Map)(Object) getStoredData(dataFile);
        }
        InputStream stream = null;
        try {
            String bh_url = "http://www.critique.org/users/critters/blackholes/sightdata.html";
            URL url = new URL(bh_url);
            stream =(InputStream)(Object) url.openStream();
        } catch (UncheckedIOException e) {
            return(Map)(Object) getStoredData(dataFile);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(stream));
        StringBuffer data = new StringBuffer();
        String line;
        while ((line =(String)(Object) br.readLine()) != null) {
            data.append(line);
        }
        br.close();
        MyHelperClass regexp = new MyHelperClass();
        Pattern p =(Pattern)(Object) Pattern.compile(regexp);
        Matcher m =(Matcher)(Object) p.matcher(data);
        Map map =(Map)(Object) new THashMap();
        while ((boolean)(Object)m.find()) {
            map.put(m.group(1).trim(), new ReplyTimeDatum(Integer.parseInt((String)(Object)m.group(3)), Integer.parseInt((String)(Object)m.group(4)), 0, Integer.parseInt((String)(Object)m.group(2))));
        }
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dataFile));
        oos.writeObject(map);
        oos.close();
        return map;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getDataDir(){ return null; }
	public MyHelperClass trim(){ return null; }}

class Map {

public MyHelperClass put(MyHelperClass o0, ReplyTimeDatum o1){ return null; }}

class File {

File(int o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class InputStream {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class Pattern {

public static MyHelperClass compile(MyHelperClass o0){ return null; }
	public MyHelperClass matcher(StringBuffer o0){ return null; }}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass find(){ return null; }}

class THashMap {

}

class ReplyTimeDatum {

ReplyTimeDatum(){}
	ReplyTimeDatum(int o0, int o1, int o2, int o3){}}

class ObjectOutputStream {

ObjectOutputStream(FileOutputStream o0){}
	ObjectOutputStream(){}
	public MyHelperClass writeObject(Map o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
