


class c14244843 {

    private void encryptChkFile(ProjectMember member, File chkFile) throws Exception {
        final java.io.FileReader reader = new java.io.FileReader((String)(Object)chkFile);
        MyHelperClass outputPath = new MyHelperClass();
        final File encryptedChkFile = new File(member.createOutputFileName(outputPath, "chk"));
        FileOutputStream outfile = null;
        ObjectOutputStream outstream = null;
        MyHelperClass Utilities = new MyHelperClass();
        Utilities.discardBooleanResult(encryptedChkFile.getParentFile().mkdirs());
        outfile = new FileOutputStream(encryptedChkFile);
        outstream = new ObjectOutputStream(outfile);
        outstream.writeObject(new Format().parse((FileReader)(Object)reader));
        reader.close();
        outfile.close();
        outstream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass discardBooleanResult(MyHelperClass o0){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class ProjectMember {

public MyHelperClass createOutputFileName(MyHelperClass o0, String o1){ return null; }}

class File {

File(MyHelperClass o0){}
	File(){}
	public MyHelperClass getParentFile(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class ObjectOutputStream {

ObjectOutputStream(FileOutputStream o0){}
	ObjectOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass writeObject(MyHelperClass o0){ return null; }}

class Format {

public MyHelperClass parse(FileReader o0){ return null; }}

class FileReader {

}
