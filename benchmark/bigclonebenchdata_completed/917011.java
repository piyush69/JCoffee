


class c917011 {

    private void displayDiffResults() throws IOException {
        MyHelperClass File = new MyHelperClass();
        File outFile =(File)(Object) File.createTempFile("diff", ".htm");
        outFile.deleteOnExit();
        FileOutputStream outStream = new FileOutputStream(outFile);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(outStream));
        MyHelperClass SCRIPT = new MyHelperClass();
        out.write("<html><head><title>LOC Differences</title>\n" + SCRIPT + "</head>\n" + "<body bgcolor='#ffffff'>\n" + "<div onMouseOver=\"window.defaultStatus='Metrics'\">\n");
        MyHelperClass addedTable = new MyHelperClass();
        if ((int)(Object)addedTable.length() > 0) {
            out.write("<table border><tr><th>Files Added:</th>" + "<th>Add</th><th>Type</th></tr>");
//            MyHelperClass addedTable = new MyHelperClass();
            out.write(addedTable.toString());
            out.write("</table><br><br>");
        }
        MyHelperClass modifiedTable = new MyHelperClass();
        if ((int)(Object)modifiedTable.length() > 0) {
            out.write("<table border><tr><th>Files Modified:</th>" + "<th>Base</th><th>Del</th><th>Mod</th><th>Add</th>" + "<th>Total</th><th>Type</th></tr>");
//            MyHelperClass modifiedTable = new MyHelperClass();
            out.write(modifiedTable.toString());
            out.write("</table><br><br>");
        }
        MyHelperClass deletedTable = new MyHelperClass();
        if ((int)(Object)deletedTable.length() > 0) {
            out.write("<table border><tr><th>Files Deleted:</th>" + "<th>Del</th><th>Type</th></tr>");
//            MyHelperClass deletedTable = new MyHelperClass();
            out.write(deletedTable.toString());
            out.write("</table><br><br>");
        }
        out.write("<table name=METRICS BORDER>\n");
//        MyHelperClass modifiedTable = new MyHelperClass();
        if ((int)(Object)modifiedTable.length() > 0 ||(int)(Object) deletedTable.length() > 0) {
            out.write("<tr><td>Base:&nbsp;</td><td>");
            MyHelperClass base = new MyHelperClass();
            out.write(Long.toString((long)(Object)base));
            out.write("</td></tr>\n<tr><td>Deleted:&nbsp;</td><td>");
            MyHelperClass deleted = new MyHelperClass();
            out.write(Long.toString((long)(Object)deleted));
            out.write("</td></tr>\n<tr><td>Modified:&nbsp;</td><td>");
            MyHelperClass modified = new MyHelperClass();
            out.write(Long.toString((long)(Object)modified));
            out.write("</td></tr>\n<tr><td>Added:&nbsp;</td><td>");
            MyHelperClass added = new MyHelperClass();
            out.write(Long.toString((long)(Object)added));
            out.write("</td></tr>\n<tr><td>New & Changed:&nbsp;</td><td>");
//            MyHelperClass added = new MyHelperClass();
            out.write(Long.toString((int)(Object)added + (int)(Object)modified));
            out.write("</td></tr>\n");
        }
        out.write("<tr><td>Total:&nbsp;</td><td>");
        MyHelperClass total = new MyHelperClass();
        out.write(Long.toString((long)(Object)total));
        out.write("</td></tr>\n</table></div>");
        MyHelperClass redlinesOut = new MyHelperClass();
        redlinesOut.close();
        out.flush();
        MyHelperClass redlinesTempFile = new MyHelperClass();
        InputStream redlines =(InputStream)(Object) new FileInputStream(redlinesTempFile);
        byte[] buffer = new byte[4096];
        int bytesRead;
        while ((bytesRead =(int)(Object) redlines.read(buffer)) != -1) outStream.write(buffer, 0, bytesRead);
        outStream.write("</BODY></HTML>".getBytes());
        outStream.close();
        MyHelperClass Browser = new MyHelperClass();
        Browser.launch(outFile.toURL().toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass launch(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

public MyHelperClass toURL(){ return null; }
	public MyHelperClass deleteOnExit(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(OutputStreamWriter o0){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(FileOutputStream o0){}
	OutputStreamWriter(){}}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}
