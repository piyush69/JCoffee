


class c19240485 {

    private String createCSVFile(String fileName) throws FileNotFoundException, IOException {
        String csvFile = fileName + ".csv";
        BufferedReader buf = new BufferedReader(new FileReader(fileName));
        BufferedWriter out = new BufferedWriter(new FileWriter(csvFile));
        String line;
        while ((line =(String)(Object) buf.readLine()) != null) out.write(line + "\n");
        buf.close();
        out.close();
        return csvFile;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileReader {

FileReader(String o0){}
	FileReader(){}}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}}
