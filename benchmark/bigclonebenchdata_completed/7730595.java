


class c7730595 {
public MyHelperClass getGmaneURL(String o0, int o1, int o2){ return null; }

    public void appendFetch(IProgress progress, PrintWriter pw, String list, int from, int to) throws IOException {
        progress.start();
        try {
            MyHelperClass cacheDirectory = new MyHelperClass();
            File storage = new File((File)(Object)cacheDirectory.getValue(), "mboxes");
            storage.mkdirs();
            File mbox = new File(storage, list + "-" + from + "-" + to + ".mbox");
            if ((boolean)(Object)mbox.exists()) {
                BufferedReader in = new BufferedReader(new InputStreamReader(new ProgressInputStream(new FileInputStream(mbox), progress, 10000)));
                String line;
                while ((line =(String)(Object) in.readLine()) != null) {
                    pw.write(line);
                    pw.write('\n');
                }
                in.close();
                return;
            }
            progress.setScale(100);
            IProgress subProgress1 =(IProgress)(Object) progress.getSub(75);
            URL url =(URL)(Object) getGmaneURL(list, from, to);
            BufferedReader in = new BufferedReader(new InputStreamReader(new ProgressInputStream(url.openStream(), subProgress1, 10000)));
            PrintWriter writeToMbox = new PrintWriter(mbox);
            int lines = 0;
            String line;
            while ((line =(String)(Object) in.readLine()) != null) {
                lines++;
                if (line.matches("^From .*$") && !line.matches("^From .*? .*[0-9][0-9]:[0-9][0-9]:[0-9][0-9].*$")) {
                    line = ">" + line;
                }
                writeToMbox.write(line);
                writeToMbox.write('\n');
            }
            in.close();
            writeToMbox.close();
            appendFetch((IProgress)(Object)progress.getSub(25), pw, list, from, to);
        } finally {
            progress.done();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getValue(){ return null; }}

class IProgress {

public MyHelperClass setScale(int o0){ return null; }
	public MyHelperClass getSub(int o0){ return null; }
	public MyHelperClass done(){ return null; }
	public MyHelperClass start(){ return null; }}

class PrintWriter {

PrintWriter(){}
	PrintWriter(File o0){}
	public MyHelperClass write(char o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(File o0, String o1){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(ProgressInputStream o0){}}

class ProgressInputStream {

ProgressInputStream(FileInputStream o0, IProgress o1, int o2){}
	ProgressInputStream(){}
	ProgressInputStream(MyHelperClass o0, IProgress o1, int o2){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class URL {

public MyHelperClass openStream(){ return null; }}
