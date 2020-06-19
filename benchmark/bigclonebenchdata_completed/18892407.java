


class c18892407 {

    private void copyTemplateFile(String sourceRoot, String targetRoot, String extension) throws Exception {
        String inputFileName = sourceRoot + extension;
        String outputFileName = targetRoot + extension;
        System.out.println("Copying resource file: " + outputFileName);
        File inputFile = new File(inputFileName);
        if (!(Boolean)(Object)inputFile.exists() || !(Boolean)(Object)inputFile.canRead()) {
            throw new Exception("Could not read from the file " + inputFileName);
        }
        File outputFile = new File(outputFileName);
        if (!(Boolean)(Object)outputFile.exists()) {
            if (!(Boolean)(Object)outputFile.createNewFile() || !(Boolean)(Object)outputFile.canWrite()) throw new Exception("Could not write to the file " + outputFileName);
        }
        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        try {
            char[] buffer = new char[1024];
            int nread = 0;
            while ((nread =(int)(Object) in.read(buffer)) != -1) {
                out.write(buffer, 0, nread);
            }
        } finally {
            in.close();
            out.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(String o0){}
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass canWrite(){ return null; }}

class FileReader {

FileReader(File o0){}
	FileReader(){}
	public MyHelperClass read(char[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(char[] o0, int o1, int o2){ return null; }}
