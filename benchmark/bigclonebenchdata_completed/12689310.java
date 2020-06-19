


class c12689310 {
public MyHelperClass ExceptionHandler;
	public MyHelperClass getTableName(String o0){ return null; }
	public MyHelperClass getRecordNumber(String o0){ return null; }

    public HashMap prepareDataFile(String fileName) {
        File originalDataFile = new File(fileName);
        String tableName = new String();
        String line = new String();
        BufferedReader br;
        BufferedWriter bw;
        long recordsNumber;
        File tempDataFile;
        HashMap tableFileMap = new HashMap();
        String filePath = new String();
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(originalDataFile)));
            if ((boolean)(Object)br.ready()) {
                if ((line =(String)(Object) br.readLine()) != null) {
                    do {
                        tableName = "temp_" + getTableName(line);
                        tempDataFile = new File("./Data/" + tableName + ".txt");
                        tempDataFile.createNewFile();
                        tableFileMap.put(tableName, tempDataFile.getCanonicalPath());
                        recordsNumber =(long)(Object) getRecordNumber(line);
                        bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(tempDataFile)));
                        for (long i = 0; i < recordsNumber; i++) {
                            bw.write(br.readLine() + "\r\n");
                        }
                        bw.close();
                    } while ((line =(String)(Object) br.readLine()) != null);
                }
                br.close();
                return tableFileMap;
            }
        } catch (Exception e) {
            ExceptionHandler.handleExcptin(e);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass handleExcptin(Exception o0){ return null; }}

class HashMap {

public MyHelperClass put(String o0, MyHelperClass o1){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getCanonicalPath(){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass ready(){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(OutputStreamWriter o0){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(FileInputStream o0){}
	InputStreamReader(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class OutputStreamWriter {

OutputStreamWriter(FileOutputStream o0){}
	OutputStreamWriter(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
