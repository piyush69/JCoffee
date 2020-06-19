


class c5562616 {
public MyHelperClass closeQuietly(BufferedWriter o0){ return null; }
	public MyHelperClass writeConverterInfos(Writer o0){ return null; }
	public MyHelperClass writeTableEnd(BufferedWriter o0){ return null; }
	public MyHelperClass flushAndClose(BufferedWriter o0){ return null; }
	public MyHelperClass writeColsDefinitions(BufferedWriter o0, int[] o1){ return null; }
	public MyHelperClass mergeFiles(Writer o0, BufferedReader o1, BufferedReader o2){ return null; }
	public MyHelperClass writeTableStart(BufferedWriter o0, int[] o1){ return null; }
	public MyHelperClass writeTableRowHeader(BufferedWriter o0, String[] o1){ return null; }
	public MyHelperClass writeTableRow(BufferedWriter o0, String[] o1, int[] o2){ return null; }
public MyHelperClass progress;
	public MyHelperClass ConvertionStepEnum;
	public MyHelperClass createTempFileForCss(){ return null; }
	public MyHelperClass createTempFileForTable(){ return null; }

    public void convert(CSVReader reader, Writer writer, int nbTotalRows) throws IOException, InterruptedException {
        MyHelperClass Validate = new MyHelperClass();
        Validate.notNull(reader, "CSVReader");
//        MyHelperClass Validate = new MyHelperClass();
        Validate.notNull(writer, "Writer");
        Writer bufferedWriter =(Writer)(Object) new BufferedWriter(writer);
        File fileForColsDef =(File)(Object) createTempFileForCss();
        BufferedWriter colsDefWriter = new BufferedWriter((Writer)(Object)new FileWriter(fileForColsDef));
        File fileForTable =(File)(Object) createTempFileForTable();
        BufferedWriter tableWriter = new BufferedWriter((Writer)(Object)new FileWriter(fileForTable));
        try {
            int currentRow = 0;
            String[] nextLine =(String[])(Object) reader.readNext();
            if (nextLine != null) {
                int[] colsCharCount = new int[nextLine.length];
                writeTableRowHeader(tableWriter, nextLine);
                while ((nextLine =(String[])(Object) reader.readNext()) != null) {
                    currentRow++;
                    if (progress != null) {
                        float percent = ((float) currentRow / (float) nbTotalRows) * 100f;
                        progress.updateProgress(ConvertionStepEnum.PROCESSING_ROWS, percent);
                    }
                    writeTableRow(tableWriter, nextLine, colsCharCount);
                }
                writeTableStart(colsDefWriter, colsCharCount);
                writeColsDefinitions(colsDefWriter, colsCharCount);
            }
            writeConverterInfos(bufferedWriter);
            writeTableEnd(tableWriter);
            flushAndClose(tableWriter);
            flushAndClose(colsDefWriter);
            BufferedReader colsDefReader = new BufferedReader(new FileReader(fileForColsDef));
            BufferedReader tableReader = new BufferedReader(new FileReader(fileForTable));
            mergeFiles(bufferedWriter, colsDefReader, tableReader);
        } finally {
            closeQuietly(tableWriter);
            closeQuietly(colsDefWriter);
            fileForTable.delete();
            fileForColsDef.delete();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PROCESSING_ROWS;
public MyHelperClass updateProgress(MyHelperClass o0, float o1){ return null; }
	public MyHelperClass notNull(CSVReader o0, String o1){ return null; }
	public MyHelperClass notNull(Writer o0, String o1){ return null; }}

class CSVReader {

public MyHelperClass readNext(){ return null; }}

class Writer {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedWriter {

BufferedWriter(Writer o0){}
	BufferedWriter(){}}

class File {

public MyHelperClass delete(){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}}

class FileReader {

FileReader(File o0){}
	FileReader(){}}
