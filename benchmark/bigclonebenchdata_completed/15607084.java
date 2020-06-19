


class c15607084 {
public MyHelperClass IOUtils;
	public MyHelperClass logger;
	public MyHelperClass getTemplateDir(){ return null; }

    protected void copyFile(String inputFilePath, String outputFilePath) throws GenerationException {
        String from = getTemplateDir() + inputFilePath;
        try {
            logger.debug("Copying from " + from + " to " + outputFilePath);
            InputStream inputStream =(InputStream)(Object) Thread.currentThread().getContextClassLoader().getResourceAsStream(from);
            if (inputStream == null) {
                throw new GenerationException("Source file not found: " + from);
            }
            FileOutputStream outputStream = new FileOutputStream(new File(outputFilePath));
            IOUtils.copy(inputStream, outputStream);
            inputStream.close();
            outputStream.close();
        } catch (Exception e) {
            throw new GenerationException("Error while copying file: " + from, e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class GenerationException extends Exception{
	public GenerationException(String errorMessage) { super(errorMessage); }
	GenerationException(String o0, Exception o1){}
	GenerationException(){}
}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class File {

File(String o0){}
	File(){}}
