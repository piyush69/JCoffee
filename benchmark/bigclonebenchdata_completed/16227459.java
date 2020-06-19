


class c16227459 {

    public CmsSetupTestResult execute(CmsSetupBean setupBean) {
        CmsSetupTestResult testResult = new CmsSetupTestResult(this);
        String basePath =(String)(Object) setupBean.getWebAppRfsPath();
        MyHelperClass File = new MyHelperClass();
        if (!basePath.endsWith((String)(Object)File.separator)) {
//            MyHelperClass File = new MyHelperClass();
            basePath += File.separator;
        }
        File file1;
        Random rnd = new Random();
        do {
            file1 = new File(basePath + "test" + rnd.nextInt(1000));
        } while ((boolean)(Object)file1.exists());
        boolean success = false;
        try {
            file1.createNewFile();
            FileWriter fw = new FileWriter(file1);
            fw.write("aA1");
            fw.close();
            success = true;
            FileReader fr = new FileReader(file1);
            success = success && ((char)(Object)fr.read() == 'a');
            success = success && ((char)(Object)fr.read() == 'A');
            success = success && ((char)(Object)fr.read() == '1');
            success = success && ((int)(Object)fr.read() == -1);
            fr.close();
            success =(boolean)(Object) file1.delete();
            success = !(Boolean)(Object)file1.exists();
        } catch (Exception e) {
            success = false;
        }
        if (!success) {
            testResult.setRed();
            testResult.setInfo("OpenCms cannot be installed without read and write privileges for path " + basePath + "! Please check you are running your servlet container with the right user and privileges.");
            testResult.setHelp("Not enough permissions to create/read/write a file");
            MyHelperClass RESULT_FAILED = new MyHelperClass();
            testResult.setResult(RESULT_FAILED);
        } else {
            testResult.setGreen();
            MyHelperClass RESULT_PASSED = new MyHelperClass();
            testResult.setResult(RESULT_PASSED);
        }
        return testResult;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
}

class CmsSetupBean {

public MyHelperClass getWebAppRfsPath(){ return null; }}

class CmsSetupTestResult {

CmsSetupTestResult(){}
	CmsSetupTestResult(c16227459 o0){}
	public MyHelperClass setHelp(String o0){ return null; }
	public MyHelperClass setGreen(){ return null; }
	public MyHelperClass setResult(MyHelperClass o0){ return null; }
	public MyHelperClass setInfo(String o0){ return null; }
	public MyHelperClass setRed(){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass exists(){ return null; }}

class Random {

public MyHelperClass nextInt(int o0){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileReader {

FileReader(File o0){}
	FileReader(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}
