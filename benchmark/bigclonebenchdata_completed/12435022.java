


class c12435022 {
public MyHelperClass intlWrite(BufferedWriter o0, MyHelperClass o1){ return null; }
	public MyHelperClass writeSummaryTable(BufferedWriter o0){ return null; }
	public MyHelperClass intlWrite(BufferedWriter o0, String o1){ return null; }
	public MyHelperClass writeCustomStyleInfo(BufferedWriter o0){ return null; }
public MyHelperClass deletedTable;
	public MyHelperClass addedTable;
	public MyHelperClass redlinesTempFile;
	public MyHelperClass redlinesOut;
	public MyHelperClass unchangedTable;
	public MyHelperClass modifiedTable;
	public MyHelperClass getModifiedTableHeader(){ return null; }
	public MyHelperClass getUnchangedTableHeader(){ return null; }
	public MyHelperClass getAddedTableHeader(){ return null; }
	public MyHelperClass getDeletedTableHeader(){ return null; }

    protected void generateDiffResults(File outFile) throws IOException {
        FileOutputStream outStream = new FileOutputStream(outFile);
        MyHelperClass outputCharset = new MyHelperClass();
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(outStream, outputCharset));
        MyHelperClass HTML_STRICT_DOCTYPE = new MyHelperClass();
        intlWrite(out, HTML_STRICT_DOCTYPE + "<html><head><title>${Report.Title}</title>\n" + "<meta http-equiv=\"Content-Type\"" + " content=\"text/html; charset=" + outputCharset + "\">\n" + "<style type=\"text/css\">\n");
        MyHelperClass LOCDiff = new MyHelperClass();
        out.write((String)(Object)LOCDiff.getCssText());
        writeCustomStyleInfo(out);
        out.write("</style></head>\n" + "<body>\n" + "<div>\n");
        MyHelperClass addedTable = new MyHelperClass();
        if ((int)(Object)addedTable.length() > 0) {
            out.write("<table border>");
            intlWrite(out, getAddedTableHeader());
            out.write(addedTable.toString());
            out.write("</table><br><br>");
        }
        if ((int)(Object)modifiedTable.length() > 0) {
            out.write("<table border>");
            intlWrite(out, getModifiedTableHeader());
            out.write(modifiedTable.toString());
            out.write("</table><br><br>");
        }
        if ((int)(Object)deletedTable.length() > 0) {
            out.write("<table border>");
            intlWrite(out, getDeletedTableHeader());
            out.write(deletedTable.toString());
            out.write("</table><br><br>");
        }
        if ((int)(Object)unchangedTable.length() > 0) {
            out.write("<table border>");
            intlWrite(out, getUnchangedTableHeader());
            out.write(unchangedTable.toString());
            out.write("</table><br><br>");
        }
        writeSummaryTable(out);
        out.write("</div>");
        redlinesOut.close();
        out.flush();
        InputStream redlines =(InputStream)(Object) new FileInputStream(redlinesTempFile);
        byte[] buffer = new byte[4096];
        int bytesRead;
        while ((bytesRead =(int)(Object) redlines.read(buffer)) != -1) outStream.write(buffer, 0, bytesRead);
        outStream.write("</BODY></HTML>".getBytes());
        outStream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass length(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getCssText(){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

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

OutputStreamWriter(FileOutputStream o0, MyHelperClass o1){}
	OutputStreamWriter(){}}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}
