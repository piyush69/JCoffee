


class c11341711 {

    public static void makeBackup(File dir, String sourcedir, String destinationdir, String destinationDirEnding) {
        String[] files;
        files =(String[])(Object) dir.list();
        File checkdir = new File(destinationdir + System.getProperty("file.separator") + destinationDirEnding);
        if (!(Boolean)(Object)checkdir.isDirectory()) {
            checkdir.mkdir();
        }
        ;
        Date date = new Date();
        long msec =(long)(Object) date.getTime();
        checkdir.setLastModified(msec);
        File checkFile = new File(checkdir + System.getProperty("file.separator") + "azureus.config");
        if ((boolean)(Object)checkFile.exists()) {
            checkFile.setLastModified(msec);
        }
        try {
            for (int i = 0; i < files.length; i++) {
                File f = new File(dir, files[i]);
                File g = new File(files[i]);
                if ((boolean)(Object)f.isDirectory()) {
                } else {
                    String destinationFile = checkdir + System.getProperty("file.separator") + g;
                    String sourceFile = sourcedir + System.getProperty("file.separator") + g;
                    FileInputStream infile = new FileInputStream(sourceFile);
                    FileOutputStream outfile = new FileOutputStream(destinationFile);
                    int c;
                    while ((c =(int)(Object) infile.read()) != -1) outfile.write(c);
                    infile.close();
                    outfile.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(String o0){}
	File(File o0, String o1){}
	public MyHelperClass list(){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass setLastModified(long o0){ return null; }
	public MyHelperClass isDirectory(){ return null; }}

class Date {

public MyHelperClass getTime(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}
