
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19203251 {

    private void readArchives(final VideoArchiveSet vas) throws IOException {
        MyHelperClass url = new MyHelperClass();
        final BufferedReader in = new BufferedReader((FileReader)(Object)new InputStreamReader(url.openStream()));
        String line = null;
        try {
            while ((line =(String)(Object) in.readLine()) != null) {
                if (line.startsWith("ARCHIVE")) {
                    final StringTokenizer s = new StringTokenizer(line);
                    s.nextToken();
                    final Integer tapeNumber = Integer.valueOf((String)(Object)s.nextToken());
                    final Timecode timeCode = new Timecode(s.nextToken());
                    final VideoArchive va = new VideoArchive();
                    va.setTimeCode(timeCode);
                    va.setTapeNumber(tapeNumber);
                    vas.addVideoArchive(va);
                    MyHelperClass archives = new MyHelperClass();
                    archives.put(tapeNumber, va);
                }
            }
        } catch (UncheckedIOException e) {
            throw e;
        } finally {
            in.close();
        }
        MyHelperClass archives = new MyHelperClass();
        if ((int)(Object)archives.size() == 0) {
            MyHelperClass log = new MyHelperClass();
            log.warn("No lines with ARCHIVE were found in the current vif file, will try to look at another vif with same yearday, " + "ship and platform and try to get archives from there:");
//            MyHelperClass url = new MyHelperClass();
            String urlBase = url.getPath().toString().substring(0, url.getPath().toString().lastIndexOf("/"));
            File vifDir = new File(urlBase);
            File[] allYeardayFiles =(File[])(Object) vifDir.listFiles();
            for (int i = 0; i < allYeardayFiles.length; i++) {
                if (allYeardayFiles[i].toString().endsWith(".vif")) {
                    String filename = allYeardayFiles[i].toString().substring(allYeardayFiles[i].toString().lastIndexOf("/"));
                    String fileLC = filename.toLowerCase();
                    MyHelperClass vifMetadata = new MyHelperClass();
                    String toLookFor = new String(new Character((char)(Object)vifMetadata.shipCode).toString() + new Character((char)(Object)vifMetadata.platformCode).toString());
                    String toLookForLC = toLookFor.toLowerCase();
                    if (fileLC.indexOf(toLookForLC) >= 0) {
//                        MyHelperClass log = new MyHelperClass();
                        log.warn("Will try to read archives from file " + allYeardayFiles[i]);
                        final BufferedReader tempIn = new BufferedReader(new FileReader(allYeardayFiles[i]));
                        String tempLine = null;
                        try {
                            while ((tempLine =(String)(Object) tempIn.readLine()) != null) {
                                if (tempLine.startsWith("ARCHIVE")) {
                                    final StringTokenizer s = new StringTokenizer(tempLine);
                                    s.nextToken();
                                    final Integer tapeNumber = Integer.valueOf((String)(Object)s.nextToken());
                                    final Timecode timeCode = new Timecode(s.nextToken());
                                    final VideoArchive va = new VideoArchive();
                                    va.setTimeCode(timeCode);
                                    va.setTapeNumber(tapeNumber);
                                    vas.addVideoArchive(va);
//                                    MyHelperClass archives = new MyHelperClass();
                                    archives.put(tapeNumber, va);
                                }
                            }
                        } catch (UncheckedIOException e) {
                            throw e;
                        } finally {
                            tempIn.close();
                        }
                    }
                }
//                MyHelperClass archives = new MyHelperClass();
                if ((int)(Object)archives.size() > 0) {
//                    MyHelperClass archives = new MyHelperClass();
                    log.warn("Found " + archives.size() + " archives in that vif so will use that");
                    break;
                }
            }
//            MyHelperClass archives = new MyHelperClass();
            if ((int)(Object)archives.size() == 0) {
//                MyHelperClass log = new MyHelperClass();
                log.warn("Still no archives were found in the file. Unable to process it.");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass platformCode;
	public MyHelperClass shipCode;
public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass put(Integer o0, VideoArchive o1){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class VideoArchiveSet {

public MyHelperClass addVideoArchive(VideoArchive o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class StringTokenizer {

StringTokenizer(String o0){}
	StringTokenizer(){}
	public MyHelperClass nextToken(){ return null; }}

class Timecode {

Timecode(MyHelperClass o0){}
	Timecode(){}}

class VideoArchive {

public MyHelperClass setTimeCode(Timecode o0){ return null; }
	public MyHelperClass setTapeNumber(Integer o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass listFiles(){ return null; }}

class FileReader {

FileReader(File o0){}
	FileReader(){}}
