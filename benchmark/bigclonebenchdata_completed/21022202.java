


class c21022202 {
public MyHelperClass copyFile(MyHelperClass o0, String o1, boolean o2){ return null; }
public MyHelperClass logger;
	public MyHelperClass startTime;
	public MyHelperClass getRunId(){ return null; }

    public void end() throws Exception {
        MyHelperClass handle = new MyHelperClass();
        handle.waitFor();
        MyHelperClass Calendar = new MyHelperClass();
        Calendar endTime =(Calendar)(Object) Calendar.getInstance();
        MyHelperClass runDir = new MyHelperClass();
        File resultsDir = new File(runDir, "results");
        if (!(Boolean)(Object)resultsDir.isDirectory()) throw new Exception("The results directory not found!");
        String resHtml = null;
        String resTxt = null;
        String[] resultFiles =(String[])(Object) resultsDir.list();
        for (String resultFile : resultFiles) {
            if (resultFile.indexOf("html") >= 0) resHtml = resultFile; else if (resultFile.indexOf("txt") >= 0) resTxt = resultFile;
        }
        if (resHtml == null) throw new IOException("SPECweb2005 output (html) file not found");
        if (resTxt == null) throw new IOException("SPECweb2005 output (txt) file not found");
        File resultHtml = new File(resultsDir, resHtml);
//        MyHelperClass runDir = new MyHelperClass();
        copyFile(resultHtml.getAbsolutePath(), runDir + "SPECWeb-result.html", false);
        BufferedReader reader = new BufferedReader(new FileReader(new File(resultsDir, resTxt)));
        MyHelperClass logger = new MyHelperClass();
        logger.fine("Text file: " + resultsDir + resTxt);
//        MyHelperClass runDir = new MyHelperClass();
        Writer writer =(Writer)(Object) new FileWriter(runDir + "summary.xml");
        SummaryParser parser = new SummaryParser(getRunId(), startTime, endTime, logger);
        parser.convert(reader, writer);
        writer.close();
        reader.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fine(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass waitFor(){ return null; }}

class Calendar {

}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	File(File o0, String o1){}
	public MyHelperClass list(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass close(){ return null; }}

class FileReader {

FileReader(File o0){}
	FileReader(){}}

class Writer {

public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}}

class SummaryParser {

SummaryParser(){}
	SummaryParser(MyHelperClass o0, MyHelperClass o1, Calendar o2, MyHelperClass o3){}
	public MyHelperClass convert(BufferedReader o0, Writer o1){ return null; }}
