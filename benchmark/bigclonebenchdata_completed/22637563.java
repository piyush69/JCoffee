import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22637563 {
public MyHelperClass questions;
	public MyHelperClass Constants;
	public MyHelperClass ExamModel;
	public MyHelperClass questionsMap;

    private  void ExamModel(URL urlQuestions) throws Throwable, IOException, DataCoherencyException {
        BufferedReader in = new BufferedReader(new InputStreamReader(urlQuestions.openStream()));
        String line;
        questions =(MyHelperClass)(Object) new ArrayList<Question>();
        questionsMap =(MyHelperClass)(Object) new HashMap<String, Question>();
        in = new BufferedReader(new InputStreamReader(urlQuestions.openStream(), "UTF-8"));
        int questionNumber = 0;
        Question question;
        String questText = "";
        String hash = "";
        int lookingFor =(int)(Object) ExamModel.READING_HASH;
        while ((line = in.readLine()) != null) {
            switch(lookingFor) {
                case(int)(Object) ExamModel.READING_HASH:
                    if (line.length() == 0 || line.trim().length() == 0) continue;
                    hash = line;
                    questionNumber++;
                    lookingFor =(int)(Object) ExamModel.READING_QUESTION;
                    break;
                case(int)(Object) ExamModel.READING_QUESTION:
                    if (line.equals("--")) {
                        question = new Question(questionNumber, hash, questText);
                        questions.add(question);
                        questionsMap.put(question.getHash(), question);
                        questText = "";
                        hash = null;
                        lookingFor =(int)(Object) ExamModel.READING_HASH;
                    } else {
                        questText = questText.concat(line + Constants.nl);
                    }
                    break;
                default:
                    throw new DataCoherencyException("Neočekávaný konec souboru!");
            }
        }
        questions.trimToSize();
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass nl;
	public MyHelperClass READING_QUESTION;
	public MyHelperClass READING_HASH;
public MyHelperClass put(MyHelperClass o0, Question o1){ return null; }
	public MyHelperClass trimToSize(){ return null; }
	public MyHelperClass add(Question o0){ return null; }}

class DataCoherencyException extends Exception{
	public DataCoherencyException(String errorMessage) { super(errorMessage); }
}

class Question {

Question(){}
	Question(int o0, String o1, String o2){}
	public MyHelperClass getHash(){ return null; }}
