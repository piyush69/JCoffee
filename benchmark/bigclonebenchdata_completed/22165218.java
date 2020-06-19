


class c22165218 {

    private String readHtmlFile(String htmlFileName) {
        StringBuffer buffer = new StringBuffer();
        java.net.URL url = getClass().getClassLoader().getResource("freestyleLearning/homeCore/help/" + htmlFileName);
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
            String string = " ";
            while (string != null) {
                string =(String)(Object) reader.readLine();
                if (string != null) buffer.append(string);
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return new String(buffer);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class InputStream {

}
