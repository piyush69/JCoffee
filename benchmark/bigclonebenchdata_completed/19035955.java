


class c19035955 {

    public static void main(String[] args) throws Exception {
        TripleDES tdes = new TripleDES();
        StreamBlockReader reader = new StreamBlockReader(new FileInputStream("D:\\testTDESENC.txt"));
        StreamBlockWriter writer = new StreamBlockWriter(new FileOutputStream("D:\\testTDESDEC.txt"));
        SingleKey key = new SingleKey(new Block(128), "");
        key = new SingleKey(new Block("01011101110000101001100111001011101000001110111101001001101101101101100000011101100100110000101100001110000001111101001101001101"), "");
        Mode mode =(Mode)(Object) new ECBTripleDESMode(tdes);
        tdes.decrypt(reader, writer, key, mode);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class TripleDES {

public MyHelperClass decrypt(StreamBlockReader o0, StreamBlockWriter o1, SingleKey o2, Mode o3){ return null; }}

class StreamBlockReader {

StreamBlockReader(FileInputStream o0){}
	StreamBlockReader(){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class StreamBlockWriter {

StreamBlockWriter(FileOutputStream o0){}
	StreamBlockWriter(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class SingleKey {

SingleKey(Block o0, String o1){}
	SingleKey(){}}

class Block {

Block(int o0){}
	Block(String o0){}
	Block(){}}

class Mode {

}

class ECBTripleDESMode {

ECBTripleDESMode(TripleDES o0){}
	ECBTripleDESMode(){}}
