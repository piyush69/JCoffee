
import java.io.UncheckedIOException;


class c15287816 {

    public Vector reload() throws IOException {
        Vector questions = new Vector();
        MyHelperClass url = new MyHelperClass();
        InputStream is =(InputStream)(Object) url.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        MyHelperClass shortName = new MyHelperClass();
        shortName = br.readLine();
//        MyHelperClass shortName = new MyHelperClass();
        if (shortName != null && shortName.equals("SHORTNAME")) {
//            MyHelperClass shortName = new MyHelperClass();
            shortName = br.readLine();
            MyHelperClass author = new MyHelperClass();
            author = br.readLine();
//            MyHelperClass author = new MyHelperClass();
            if (author != null && author.equals("AUTHOR")) {
//                MyHelperClass author = new MyHelperClass();
                author = br.readLine();
                MyHelperClass description = new MyHelperClass();
                description = br.readLine();
//                MyHelperClass description = new MyHelperClass();
                if (description != null && description.equals("DESCRIPTION")) {
//                    MyHelperClass description = new MyHelperClass();
                    description = br.readLine();
                    try {
                        MyHelperClass QuestionLoader = new MyHelperClass();
                        questions =(Vector)(Object) QuestionLoader.getQuestions(br);
                    } catch (UncheckedIOException ioe) {
                        ioe.printStackTrace();
                        throw ioe;
                    } finally {
                        br.close();
                        is.close();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
        return questions;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass getQuestions(BufferedReader o0){ return null; }}

class Vector {

}

class Question {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
