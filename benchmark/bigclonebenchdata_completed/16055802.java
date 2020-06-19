


class c16055802 {

    public static void main(String[] args) throws Exception {
        DES des = new DES();
        StreamBlockReader reader = new StreamBlockReader(new FileInputStream("D:\\test1.txt"));
        StreamBlockWriter writer = new StreamBlockWriter(new FileOutputStream("D:\\test2.txt"));
        SingleKey key = new SingleKey(new Block(64), "");
        key = new SingleKey(new Block("1111111100000000111111110000000011111111000000001111111100000000"), "");
        Mode mode =(Mode)(Object) new ECBDESMode(des);
        des.decrypt(reader, writer, key, mode);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class DES {

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

class ECBDESMode {

ECBDESMode(){}
	ECBDESMode(DES o0){}}
