


class c15580610 {
public MyHelperClass IOUtils;
	public MyHelperClass getCommand(){ return null; }
	public MyHelperClass getModelName(){ return null; }

//    @Override
    public void trainClassifier(File dir, String... args) throws Exception {
        String[] command = new String[args.length + 3];
        command[0] =(String)(Object) this.getCommand();
        System.arraycopy(args, 0, command, 1, args.length);
        command[command.length - 2] =(String)(Object) (new File(dir, "training-data.libsvm").getPath());
        command[command.length - 1] =(String)(Object) (new File(dir, this.getModelName()).getPath());
        Process process = Runtime.getRuntime().exec(command);
        IOUtils.copy((InputStream)(Object)process.getInputStream(),(PrintStream)(Object) System.out);
        IOUtils.copy((InputStream)(Object)process.getErrorStream(),(PrintStream)(Object) System.err);
        process.waitFor();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, PrintStream o1){ return null; }}

class File {

File(File o0, String o1){}
	File(File o0, MyHelperClass o1){}
	File(){}
	public MyHelperClass getPath(){ return null; }}

class InputStream {

}

class PrintStream {

}
