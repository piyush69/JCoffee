


class c2468861 {
public static MyHelperClass StreamTool;
//public MyHelperClass StreamTool;

    private static QDataSet test3_binary() throws IOException, StreamException {
        URL url =(URL)(Object) TestQDataSetStreamHandler.class.getResource("test3.binary.qds");
        QDataSetStreamHandler handler = new QDataSetStreamHandler();
        MyHelperClass Channels = new MyHelperClass();
        StreamTool.readStream(Channels.newChannel(url.openStream()), handler);
        QDataSet qds =(QDataSet)(Object) handler.getDataSet();
        return qds;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass readStream(MyHelperClass o0, QDataSetStreamHandler o1){ return null; }
	public MyHelperClass newChannel(MyHelperClass o0){ return null; }}

class QDataSet {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class StreamException extends Exception{
	public StreamException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class TestQDataSetStreamHandler {

}

class QDataSetStreamHandler {

public MyHelperClass getDataSet(){ return null; }}
