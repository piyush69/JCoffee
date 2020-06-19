


class c16809623 {

    public boolean parseResults(URL url, String analysis_type, CurationI curation, Date analysis_date, String regexp) throws OutputMalFormatException {
        boolean parsed = false;
        try {
            InputStream data_stream =(InputStream)(Object) url.openStream();
            parsed = parseResults((URL)(Object)data_stream, analysis_type, curation, analysis_date, regexp);
        } catch (OutputMalFormatException ex) {
            throw new OutputMalFormatException(ex.getMessage(), ex);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return parsed;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class CurationI {

}

class Date {

}

class OutputMalFormatException extends Exception{
	public OutputMalFormatException(String errorMessage) { super(errorMessage); }
	OutputMalFormatException(String o0, OutputMalFormatException o1){}
	OutputMalFormatException(){}
}

class InputStream {

}
