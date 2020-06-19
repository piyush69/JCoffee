


class c2518655 {

    public static void main(String[] args) throws FileNotFoundException {
        if (args.length < 2) throw new IllegalArgumentException();
        String fnOut = args[args.length - 1];
        PrintWriter writer = new PrintWriter(fnOut);
        for (int i = 0; i < args.length - 1; i++) {
            File fInput = new File(args[i]);
            Scanner in = new Scanner(fInput);
            while ((boolean)(Object)in.hasNext()) {
                writer.println(in.nextLine());
            }
        }
        writer.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class PrintWriter {

PrintWriter(String o0){}
	PrintWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass println(MyHelperClass o0){ return null; }}

class File {

File(String o0){}
	File(){}}

class Scanner {

Scanner(File o0){}
	Scanner(){}
	public MyHelperClass hasNext(){ return null; }
	public MyHelperClass nextLine(){ return null; }}
