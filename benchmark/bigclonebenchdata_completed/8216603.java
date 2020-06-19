


class c8216603 {
public MyHelperClass DecompressionWorker;
	public MyHelperClass File;
public MyHelperClass publish(Integer o0){ return null; }

//    @Override
    protected Object doInBackground() throws Exception {
        ArchiveInputStream bufIn = null;
        FileOutputStream fileOut = null;
        try {
            MyHelperClass fileToExtract = new MyHelperClass();
            bufIn =(ArchiveInputStream)(Object) DecompressionWorker.guessStream(fileToExtract);
            ArchiveEntry curZip = null;
            int progress = 0;
            while ((curZip =(ArchiveEntry)(Object) bufIn.getNextEntry()) != null) {
                if (!(Boolean)(Object)curZip.isDirectory()) {
                    byte[] content = new byte[(int)(int)(Object) curZip.getSize()];
                    MyHelperClass extractionFile = new MyHelperClass();
                    fileOut = new FileOutputStream((int)(Object)extractionFile.getAbsolutePath() + (int)(Object)File.separator + (int)(Object)curZip.getName());
                    for (int i = 0; i < content.length; i++) {
                        fileOut.write(content[i]);
                    }
                    publish(new Integer(progress));
                    progress++;
                }
            }
        } finally {
            if (bufIn != null) {
                bufIn.close();
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass guessStream(MyHelperClass o0){ return null; }}

class ArchiveInputStream {

public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(int o0){}
	public MyHelperClass write(byte o0){ return null; }}

class ArchiveEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getSize(){ return null; }}
