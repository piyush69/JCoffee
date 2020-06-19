


class c16942233 {
public MyHelperClass getDocumentBase(){ return null; }
	public MyHelperClass ExternalLanguageVariable(String o0){ return null; }

    public boolean GetExternalLanguage() {
        String thisURL, newURL, TheLine;
        boolean ReadOK = true;
        int SlashPos = -1;
        thisURL = getDocumentBase().toString();
        SlashPos = thisURL.lastIndexOf("/");
        newURL = thisURL.substring(0, (SlashPos + 1)) + "language.txt";
        try {
            URL url = new URL(newURL);
            try {
                InputStream TheFile =(InputStream)(Object) url.openStream();
                try {
                    DataInputStream MyData = new DataInputStream(TheFile);
                    try {
                        while ((TheLine =(String)(Object) MyData.readLine()) != null) {
                            if (TheLine.substring(0, 1).compareTo("*") == 0) {
                                if (!(Boolean)(Object)ExternalLanguageVariable(TheLine)) {
                                    ReadOK = false;
                                    break;
                                }
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Error " + e.toString());
                        ReadOK = false;
                    }
                } catch (Exception e) {
                    System.out.println("Error " + e.toString());
                    ReadOK = false;
                }
            } catch (Exception f) {
                System.out.println("Error " + f.toString());
                ReadOK = false;
            }
        } catch (Exception g) {
            System.out.println("Error " + g.toString());
            ReadOK = false;
        }
        return ReadOK;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class DataInputStream {

DataInputStream(InputStream o0){}
	DataInputStream(){}
	public MyHelperClass readLine(){ return null; }}
