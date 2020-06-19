


class c23677119 {

	public static void copyFile6(File srcFile, File destFile) throws FileNotFoundException {
		Scanner s = new Scanner(srcFile);
		PrintWriter pw = new PrintWriter(destFile);
		while((boolean)(Object)s.hasNextLine()) {
			pw.println(s.nextLine());
		}
		pw.close();
		s.close();
	}

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class Scanner {

Scanner(){}
	Scanner(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass hasNextLine(){ return null; }
	public MyHelperClass nextLine(){ return null; }}

class PrintWriter {

PrintWriter(File o0){}
	PrintWriter(){}
	public MyHelperClass println(MyHelperClass o0){ return null; }
	public MyHelperClass close(){ return null; }}
