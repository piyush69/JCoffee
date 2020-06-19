


class c3297646 {
public MyHelperClass assertTrue(String o0, boolean o1){ return null; }
public MyHelperClass assertEquals(String o0, int o1, int o2){ return null; }

    private void validate(String id, WriteToWebServerFile writeFile, char[][] charData) throws Exception {
        for (int i = 0; i < charData.length; i++) {
            assertTrue("There is a URL for input " + i,(boolean)(Object) writeFile.hasNextURL());
            URL url =(URL)(Object) writeFile.nextURL();
            String path =(String)(Object) url.getPath();
            assertTrue("URL " + url + " contains request resource ID", path.indexOf(id) != -1);
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            Reader reader =(Reader)(Object) new BufferedReader(new InputStreamReader(connection.getInputStream()));
            int value;
            int index = 0;
            while (((value =(int)(Object) reader.read()) != -1) && (index < charData[i].length)) {
                assertEquals("Character data " + i + " : " + index, (int) charData[i][index], value);
                index++;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class WriteToWebServerFile {

public MyHelperClass nextURL(){ return null; }
	public MyHelperClass hasNextURL(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class Reader {

public MyHelperClass read(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
