


class c22542859 {

    public static void retriveRemote(ISource source, Node[] nodes, String outDirName, boolean isBinary) throws Exception {
        FTPClient client = new FTPClient();
        client.connect(source.getSourceDetail().getHost());
        client.login(source.getSourceDetail().getUser(), source.getSourceDetail().getPassword());
        MyHelperClass FTPClient = new MyHelperClass();
        if (isBinary) client.setFileType(FTPClient.BINARY_FILE_TYPE);
        FileOutputStream out = null;
        for (Node node : nodes) {
            if (!(Boolean)(Object)node.isLeaf()) {
                Node[] childern =(Node[])(Object) source.getChildern(node);
                MyHelperClass File = new MyHelperClass();
                File dir = new File(outDirName + File.separator + node.getAlias());
                dir.mkdir();
//                MyHelperClass File = new MyHelperClass();
                retriveRemote(source, childern, outDirName + File.separator + node.getAlias(), isBinary);
            } else {
                MyHelperClass File = new MyHelperClass();
                out = new FileOutputStream(outDirName + File.separator + node.getAlias());
                client.retrieveFile(node.getAbsolutePath(), out);
                out.flush();
                out.close();
            }
        }
        client.disconnect();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
	public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass getHost(){ return null; }
	public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getUser(){ return null; }}

class ISource {

public MyHelperClass getSourceDetail(){ return null; }
	public MyHelperClass getChildern(Node o0){ return null; }}

class Node {

public MyHelperClass isLeaf(){ return null; }
	public MyHelperClass getAlias(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class FTPClient {

public MyHelperClass retrieveFile(MyHelperClass o0, FileOutputStream o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass mkdir(){ return null; }}
