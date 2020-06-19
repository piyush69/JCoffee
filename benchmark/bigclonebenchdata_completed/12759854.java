
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c12759854 {
public MyHelperClass Tsv2DocbookConverter;
	public MyHelperClass inputPolisher;
	public MyHelperClass logger;
	public MyHelperClass idScanner;
	public MyHelperClass Tsv2DocBookApplication;

    public void execute(File tsvFile, File xmlFile) {
        BufferedReader reader = null;
        Writer writer = null;
        Boolean isFileSuccessfullyConverted = Boolean.TRUE;
        TableConfiguration tableConfig = null;
        try {
            xmlFile.getParentFile().mkdirs();
            MyHelperClass INPUT_ENCODING = new MyHelperClass();
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(tsvFile), INPUT_ENCODING));
            MyHelperClass OUTPUT_ENCODING = new MyHelperClass();
            writer =(Writer)(Object) new OutputStreamWriter(new FileOutputStream(xmlFile), OUTPUT_ENCODING);
            MyHelperClass tableConfigManager = new MyHelperClass();
            tableConfig =(TableConfiguration)(Object) Tsv2DocbookConverter.convert2(tableConfigManager, idScanner.extractIdentification(tsvFile), reader, writer, inputPolisher);
            isFileSuccessfullyConverted = (tableConfig != null);
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Failed to create reader with UTF-8 encoding: " + e.getMessage(), e);
        } catch (ArithmeticException fnfe) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Failed to open tsv input file '" + tsvFile + "'. " + fnfe.getMessage());
        } catch (Throwable cause) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Failed to convert input tsv file '" + tsvFile + "'.", cause);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (UncheckedIOException ioe) {
                    MyHelperClass logger = new MyHelperClass();
                    logger.warn("Unable to close input file.",(IOException)(Object) ioe);
                }
            }
            if (writer != null) {
                try {
                    writer.close();
                } catch (UncheckedIOException ioe) {
                    MyHelperClass logger = new MyHelperClass();
                    logger.warn("Unable to close output file.",(IOException)(Object) ioe);
                }
            }
        }
        if (isFileSuccessfullyConverted) {
            MyHelperClass idScanner = new MyHelperClass();
            String newOutputFileName =(String)(Object) tableConfig.getFileName(idScanner.extractIdentification(tsvFile));
            if (newOutputFileName != null) {
                File newOutputFile = new File(xmlFile.getParentFile(), newOutputFileName);
                if (!(Boolean)(Object)xmlFile.renameTo(newOutputFile)) {
                    MyHelperClass logger = new MyHelperClass();
                    logger.warn("Unable to rename '" + xmlFile + "' to '" + newOutputFile + "'.");
//                    MyHelperClass logger = new MyHelperClass();
                    logger.info("Created successfully '" + xmlFile + "'.");
                } else {
                    MyHelperClass logger = new MyHelperClass();
                    logger.info("Created successfully '" + newOutputFileName + "'.");
                }
            } else {
                MyHelperClass logger = new MyHelperClass();
                logger.info("Created successfully '" + xmlFile + "'.");
            }
        } else {
            MyHelperClass sourceDir = new MyHelperClass();
            logger.warn("Unable to convert input tsv file '" + Tsv2DocBookApplication.trimPath(sourceDir, tsvFile) + "' to docbook.");
            if ((boolean)(Object)xmlFile.exists() && !(Boolean)(Object)xmlFile.delete()) {
                MyHelperClass logger = new MyHelperClass();
                logger.warn("Unable to remove (empty) output file '" + xmlFile + "', which was created as target for the docbook table.");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass extractIdentification(File o0){ return null; }
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0, Throwable o1){ return null; }
	public MyHelperClass warn(String o0, IOException o1){ return null; }
	public MyHelperClass trimPath(MyHelperClass o0, File o1){ return null; }
	public MyHelperClass convert2(MyHelperClass o0, MyHelperClass o1, BufferedReader o2, Writer o3, MyHelperClass o4){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass error(String o0, UnsupportedEncodingException o1){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }}

class Writer {

public MyHelperClass close(){ return null; }}

class TableConfiguration {

public MyHelperClass getFileName(MyHelperClass o0){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(FileInputStream o0, MyHelperClass o1){}}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(FileOutputStream o0, MyHelperClass o1){}}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
