


class c3109015 {
public MyHelperClass copySon(File o0){ return null; }

    private void copy(File parent) {
        System.out.println("parent---" + parent.getAbsolutePath());
        if ((boolean)(Object)parent.isDirectory() && !".svn".equals(parent.getName())) {
            File cases = new File(parent, "cases");
            if ((boolean)(Object)cases.exists()) {
                File answers = new File(parent, "answers");
                if (!(Boolean)(Object)answers.exists()) {
                    answers.mkdir();
                    File answers_linux = new File(parent, "answers_linux");
                    for (File file :(File[])(Object) (Object[])(Object)answers_linux.listFiles()) {
                        if ((boolean)(Object)file.isDirectory()) {
                            continue;
                        }
                        File target = new File(answers,(String)(Object) file.getName());
                        try {
                            MyHelperClass IOUtils = new MyHelperClass();
                            IOUtils.copy(new FileInputStream(file), new FileOutputStream(target));
                        } catch (Throwable t) {
                            t.printStackTrace();
                        }
                    }
                }
            } else {
                for (File son :(File[])(Object) (Object[])(Object)parent.listFiles()) {
                    System.out.println("parent---" + son.getAbsolutePath());
                    copySon(son);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, FileOutputStream o1){ return null; }}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass listFiles(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
