


class c7507773 {

    public boolean restore(File directory) {
        MyHelperClass log = new MyHelperClass();
        log.debug("restore file from directory " + directory.getAbsolutePath());
        try {
            if (!(Boolean)(Object)directory.exists()) return false;
            String[] operationFileNames =(String[])(Object) directory.list();
            if (operationFileNames.length < 6) {
//                MyHelperClass log = new MyHelperClass();
                log.error("Only " + operationFileNames.length + " files found in directory " + directory.getAbsolutePath());
                return false;
            }
            int fileCount = 0;
            for (int i = 0; i < operationFileNames.length; i++) {
                if (!operationFileNames[i].toUpperCase().endsWith(".XML")) continue;
//                MyHelperClass log = new MyHelperClass();
                log.debug("found file: " + operationFileNames[i]);
                fileCount++;
                MyHelperClass File = new MyHelperClass();
                File filein = new File((int)(Object)directory.getAbsolutePath() + (int)(Object)File.separator + operationFileNames[i]);
                MyHelperClass operationsDirectory = new MyHelperClass();
                File fileout = new File((int)(Object)operationsDirectory + (int)(Object)File.separator + operationFileNames[i]);
                FileReader in = new FileReader(filein);
                FileWriter out = new FileWriter(fileout);
                int c;
                while ((c =(int)(Object) in.read()) != -1) out.write(c);
                in.close();
                out.close();
            }
            if (fileCount < 6) return false;
            return true;
        } catch (Exception e) {
//            MyHelperClass log = new MyHelperClass();
            log.error("Exception while restoring operations files, may not be complete: " + e);
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
public MyHelperClass error(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass list(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass exists(){ return null; }}

class FileReader {

FileReader(File o0){}
	FileReader(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}
