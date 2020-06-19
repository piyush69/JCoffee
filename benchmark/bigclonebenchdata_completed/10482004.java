
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10482004 {

    public static void main(String[] args) throws IOException {
        System.out.println("Start filtering zgps...");
        MyHelperClass ConfigUtils = new MyHelperClass();
        final Config config =(Config)(Object) ConfigUtils.loadConfig(args[0]);
        final String CONFIG_MODULE = "GPSFilterZGPS";
        File sourceFileSelectedStages = new File(config.findParam(CONFIG_MODULE, "sourceFileSelectedStages"));
        File sourceFileZGPS = new File(config.findParam(CONFIG_MODULE, "sourceFileZGPS"));
        File targetFile = new File(config.findParam(CONFIG_MODULE, "targetFile"));
        System.out.println("Start reading selected stages...");
        FilterZGPSSelectedStages selectedStages = new FilterZGPSSelectedStages();
        selectedStages.createSelectedStages(sourceFileSelectedStages);
        System.out.println("Done. " + selectedStages.getSelectedStages().size() + " stages were stored");
        System.out.println("Start reading and writing zgps...");
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(sourceFileZGPS)));
            BufferedWriter out = new BufferedWriter(new FileWriter(targetFile));
            out.write((String)(Object)in.readLine());
            out.newLine();
            String lineFromInputFile;
            while ((lineFromInputFile =(String)(Object) in.readLine()) != null) {
                String[] entries = lineFromInputFile.split("\t");
                if ((boolean)(Object)selectedStages.containsStage(Integer.parseInt(entries[0]), Integer.parseInt(entries[1]), Integer.parseInt(entries[2]))) {
                    out.write(lineFromInputFile);
                    out.newLine();
                    out.flush();
                }
            }
            in.close();
            out.close();
        } catch (UncheckedIOException e) {
            System.out.println("Could not find source file for selected stages.");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("IO Exception while reading or writing zgps.");
            e.printStackTrace();
        }
        System.out.println("Done.");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass loadConfig(String o0){ return null; }
	public MyHelperClass size(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Config {

public MyHelperClass findParam(String o0, String o1){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}}

class FilterZGPSSelectedStages {

public MyHelperClass getSelectedStages(){ return null; }
	public MyHelperClass createSelectedStages(File o0){ return null; }
	public MyHelperClass containsStage(int o0, int o1, int o2){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(FileInputStream o0){}}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

class BufferedWriter {

BufferedWriter(FileWriter o0){}
	BufferedWriter(){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass newLine(){ return null; }}

class FileWriter {

FileWriter(){}
	FileWriter(File o0){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
