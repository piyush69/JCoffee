


class c16586894 {

    public void test3() throws FileNotFoundException, IOException {
        Decoder decoder1 =(Decoder)(Object) new MP3Decoder(new FileInputStream("/home/marc/tmp/test1.mp3"));
        Decoder decoder2 =(Decoder)(Object) new OggDecoder(new FileInputStream("/home/marc/tmp/test1.ogg"));
        FileOutputStream out = new FileOutputStream("/home/marc/tmp/test.pipe");
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(decoder1, out);
//        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(decoder2, out);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(Decoder o0, FileOutputStream o1){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Decoder {

}

class MP3Decoder {

MP3Decoder(FileInputStream o0){}
	MP3Decoder(){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class OggDecoder {

OggDecoder(FileInputStream o0){}
	OggDecoder(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
