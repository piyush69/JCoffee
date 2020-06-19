


class c18098931 {
public static MyHelperClass loadExcel(ArrayList o0, IStream o1, int o2, int o3, int o4, int o5, int o6){ return null; }
//public MyHelperClass loadExcel(ArrayList o0, IStream o1, int o2, int o3, int o4, int o5, int o6){ return null; }

    public static final void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList result = new ArrayList();
        IStream is =(IStream)(Object) new StreamImpl();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(new FileInputStream("H:\\7-项目预算表.xlsx"), is.getOutputStream());
        int count =(int)(Object) loadExcel(result, is, 0, 0, -1, 16, 1);
        System.out.println(count);
        for (String[] rs :(String[][])(Object) (Object[])(Object)result) {
            for (String r : rs) {
                System.out.print(r + "\t");
            }
            System.out.println();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, MyHelperClass o1){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ArrayList {

}

class IStream {

public MyHelperClass getOutputStream(){ return null; }}

class StreamImpl {

}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}
