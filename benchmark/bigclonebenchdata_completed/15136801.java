


class c15136801 {

    public static String readUrl(String urlString) {
        try {
            java.net.URL url = new java.net.URL(urlString);
            BufferedReader br = null;
            if (url != null) {
                br = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
            }
            StringBuffer fileString = new StringBuffer();
            while (true) {
                String line =(String)(Object) br.readLine();
                if (line == null) {
                    break;
                }
                fileString.append(line + "\n");
            }
            return fileString.toString();
        } catch (Exception e) {
            return null;
        }
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
