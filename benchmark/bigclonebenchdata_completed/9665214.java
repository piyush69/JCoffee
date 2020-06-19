


class c9665214 {
public MyHelperClass CharsetUtil;

    public void testConvert() throws IOException, ConverterException {
        MyHelperClass File = new MyHelperClass();
        InputStreamReader reader = new InputStreamReader(new FileInputStream("test" + File.separator + "input" + File.separator + "A0851ohneex.dat"), CharsetUtil.forName("x-PICA"));
//        MyHelperClass File = new MyHelperClass();
        FileWriter writer = new FileWriter("test" + File.separator + "output" + File.separator + "ddbInterToMarcxmlTest.out");
        MyHelperClass context = new MyHelperClass();
        Converter c =(Converter)(Object) context.getConverter("ddb-intern", "MARC21-xml", "x-PICA", "UTF-8");
        ConversionParameters params = new ConversionParameters();
        params.setSourceCharset("x-PICA");
        params.setTargetCharset("UTF-8");
        params.setAddCollectionHeader(true);
        params.setAddCollectionFooter(true);
        c.convert(reader, writer, params);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
public MyHelperClass forName(String o0){ return null; }
	public MyHelperClass getConverter(String o0, String o1, String o2, String o3){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ConverterException extends Exception{
	public ConverterException(String errorMessage) { super(errorMessage); }
}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(FileInputStream o0, MyHelperClass o1){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}}

class Converter {

public MyHelperClass convert(InputStreamReader o0, FileWriter o1, ConversionParameters o2){ return null; }}

class ConversionParameters {

public MyHelperClass setTargetCharset(String o0){ return null; }
	public MyHelperClass setAddCollectionHeader(boolean o0){ return null; }
	public MyHelperClass setSourceCharset(String o0){ return null; }
	public MyHelperClass setAddCollectionFooter(boolean o0){ return null; }}
