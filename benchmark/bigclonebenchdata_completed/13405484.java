


class c13405484 {
public MyHelperClass getStringFromReader(Reader o0){ return null; }
public MyHelperClass letterCountInputElement;
	public MyHelperClass MAX_PAYLOAD;
	public MyHelperClass number1InputElement;
	public MyHelperClass form;
	public MyHelperClass messageInputElement;
	public MyHelperClass number2InputElement;
	public MyHelperClass strip(String o0){ return null; }
	public MyHelperClass init(){ return null; }

    public boolean send(String number, String message) throws IOException {
        init();
        message = message.substring(0, Math.min((int)(Object)MAX_PAYLOAD, message.length()));
        message = message.replace('\r', ' ');
        message = message.replace('\n', ' ');
        ActualFormParameters params = new ActualFormParameters();
        String strippedNumber =(String)(Object) strip(number);
        ActualFormParameter number1Param;
        ActualFormParameter number2Param;
        if (strippedNumber.startsWith("00")) strippedNumber = "+" + strippedNumber.substring(2); else if (strippedNumber.startsWith("0")) strippedNumber = "+49" + strippedNumber.substring(1);
        number1Param = new ActualFormParameter(number1InputElement.getName(), strippedNumber.substring(0, 6));
        number2Param = new ActualFormParameter(number2InputElement.getName(), strippedNumber.substring(6));
        params.add(number1Param);
        params.add(number2Param);
        ActualFormParameter messageParam = new ActualFormParameter(messageInputElement.getName(), message);
        params.add(messageParam);
        ActualFormParameter letterCountParam = new ActualFormParameter(letterCountInputElement.getName(), "" + ((int)(Object)MAX_PAYLOAD - message.length()));
        params.add(letterCountParam);
        form.addDefaultParametersTo(params);
        Reader r =(Reader)(Object) form.submitForm(params, form.getNetscapeRequestProperties());
        String result =(String)(Object) getStringFromReader(r);
        String pattern = "<meta http-equiv = \"refresh\" content=\"1; url=";
        int patternIndex = result.indexOf(pattern);
        if (patternIndex < 0) return false;
        int end = result.lastIndexOf("\">");
        if (end < 0) return false;
        String url = result.substring(patternIndex + pattern.length(), end);
        result =(String)(Object) getStringFromReader((Reader)(Object)new InputStreamReader(new URL(url).openStream()));
        return result.indexOf("wurde erfolgreich verschickt") >= 0;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass submitForm(ActualFormParameters o0, MyHelperClass o1){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getNetscapeRequestProperties(){ return null; }
	public MyHelperClass addDefaultParametersTo(ActualFormParameters o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ActualFormParameters {

public MyHelperClass add(ActualFormParameter o0){ return null; }}

class ActualFormParameter {

ActualFormParameter(){}
	ActualFormParameter(MyHelperClass o0, String o1){}}

class Reader {

}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
