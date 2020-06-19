


class c6190163 {

    public void xtest7() throws Exception {
        System.out.println("Lowagie");
        FileInputStream inputStream = new FileInputStream("C:/Temp/arquivo.pdf");
        PDFBoxManager manager = new PDFBoxManager();
        InputStream[] images =(InputStream[])(Object) manager.toImage(inputStream, "jpeg");
        int count = 0;
        for (InputStream image : images) {
            FileOutputStream outputStream = new FileOutputStream("C:/Temp/arquivo_" + count + ".jpg");
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(image, outputStream);
            count++;
            outputStream.close();
        }
        inputStream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class PDFBoxManager {

public MyHelperClass toImage(FileInputStream o0, String o1){ return null; }}

class InputStream {

}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}
