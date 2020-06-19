


class c2511579 {

    private void extractZipFile(String filename, JTextPane progressText) throws IOException {
        String destinationname = "";
        byte[] buf = new byte[1024];
        ZipInputStream zipinputstream = null;
        ZipEntry zipentry;
        zipinputstream = new ZipInputStream(new FileInputStream(filename));
        while ((zipentry =(ZipEntry)(Object) zipinputstream.getNextEntry()) != null) {
            String entryName =(String)(Object) zipentry.getName();
            if (progressText != null) {
                progressText.setText("extracting " + entryName);
            }
            int n;
            FileOutputStream fileoutputstream;
            if ((boolean)(Object)zipentry.isDirectory()) {
                (new File(destinationname + entryName)).mkdir();
                continue;
            }
            fileoutputstream = new FileOutputStream(destinationname + entryName);
            while ((n =(int)(Object) zipinputstream.read(buf, 0, 1024)) > -1) fileoutputstream.write(buf, 0, n);
            fileoutputstream.close();
            zipinputstream.closeEntry();
        }
        if (progressText != null) {
            progressText.setText("Files extracted");
        }
        zipinputstream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class JTextPane {

public MyHelperClass setText(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(FileInputStream o0){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass mkdir(){ return null; }}
