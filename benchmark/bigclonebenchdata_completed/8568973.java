


class c8568973 {
public MyHelperClass File;
	public MyHelperClass Policy;
	public MyHelperClass apol;

    public void BasePolicy(String flaskPath) throws Exception {
        SWIGTYPE_p_p_policy p_p_pol =(SWIGTYPE_p_p_policy)(Object) apol.new_policy_t_p_p();
        if (!flaskPath.endsWith("/")) flaskPath += "/";
        File tmpPolConf =(File)(Object) File.createTempFile("tmpBasePolicy", ".conf");
        BufferedWriter tmpPolFile = new BufferedWriter(new FileWriter(tmpPolConf));
        BufferedReader secClassFile = new BufferedReader(new FileReader(flaskPath + "security_classes"));
        int bufSize = 1024;
        char[] buffer = new char[bufSize];
        int read;
        while ((read =(int)(Object) secClassFile.read(buffer)) > 0) {
            tmpPolFile.write(buffer, 0, read);
        }
        secClassFile.close();
        BufferedReader sidsFile = new BufferedReader(new FileReader(flaskPath + "initial_sids"));
        while ((read =(int)(Object) sidsFile.read(buffer)) > 0) {
            tmpPolFile.write(buffer, 0, read);
        }
        sidsFile.close();
        BufferedReader axxVecFile = new BufferedReader(new FileReader(flaskPath + "access_vectors"));
        while ((read =(int)(Object) axxVecFile.read(buffer)) > 0) {
            tmpPolFile.write(buffer, 0, read);
        }
        axxVecFile.close();
        tmpPolFile.write("attribute ricka; \ntype rick_t; \nrole rick_r types rick_t; \nuser rick_u roles rick_r;\nsid kernel      rick_u:rick_r:rick_t\nfs_use_xattr ext3 rick_u:rick_r:rick_t;\ngenfscon proc /  rick_u:rick_r:rick_t\n");
        tmpPolFile.flush();
        tmpPolFile.close();
        if ((int)(Object)apol.open_policy(tmpPolConf.getAbsolutePath(), p_p_pol) == 0) {
            Policy = apol.policy_t_p_p_value(p_p_pol);
            if (Policy == null) {
                throw new Exception("Failed to allocate memory for policy_t struct.");
            }
            tmpPolConf.delete();
        } else {
            throw new IOException("Failed to open/parse base policy file: " + tmpPolConf.getAbsolutePath());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass new_policy_t_p_p(){ return null; }
	public MyHelperClass open_policy(MyHelperClass o0, SWIGTYPE_p_p_policy o1){ return null; }
	public MyHelperClass policy_t_p_p_value(SWIGTYPE_p_p_policy o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class SWIGTYPE_p_p_policy {

}

class File {

public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass delete(){ return null; }}

class BufferedWriter {

BufferedWriter(FileWriter o0){}
	BufferedWriter(){}
	public MyHelperClass write(char[] o0, int o1, int o2){ return null; }
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileWriter {

FileWriter(){}
	FileWriter(File o0){}}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass read(char[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileReader {

FileReader(String o0){}
	FileReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
