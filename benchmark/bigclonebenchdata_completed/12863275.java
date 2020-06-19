import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12863275 {
public MyHelperClass matrix;
	public MyHelperClass combinationMap;
	public MyHelperClass combinationMapReverse;

//    @Override
    protected Integer doInBackground() throws Throwable, Exception {
        int numOfRows = 0;
        HashMap<AnsweredQuestion,Integer> combinationMap = NULL; //new HashMap<AnsweredQuestion,Integer>();
        combinationMap = new HashMap<AnsweredQuestion, Integer>();
        HashMap<Integer,AnsweredQuestion> combinationMapReverse = NULL; //new HashMap<Integer,AnsweredQuestion>();
        combinationMapReverse = new HashMap<Integer, AnsweredQuestion>();
        LinkedHashSet<AnsweredQuestion> answeredQuestionSet = new LinkedHashSet<AnsweredQuestion>();
        LinkedHashSet<Integer> studentSet = new LinkedHashSet<Integer>();
        final String delimiter = ";";
        final String typeToProcess = "F";
        String line;
        String[] chunks = new String[9];
        try {
            MyHelperClass url = new MyHelperClass();
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), "ISO-8859-2"));
            in.readLine();
            while ((line = in.readLine()) != null) {
                chunks = line.split(delimiter);
                numOfRows++;
                if (chunks[2].equals(typeToProcess)) {
                    answeredQuestionSet.add(new AnsweredQuestion(chunks[4], chunks[5]));
                    studentSet.add(new Integer(chunks[0]));
                }
            }
            in.close();
            int i = 0;
            Integer I;
            for (AnsweredQuestion pair : answeredQuestionSet) {
                I = new Integer(i++);
//                MyHelperClass combinationMap = new MyHelperClass();
                combinationMap.put(pair, I);
//                MyHelperClass combinationMapReverse = new MyHelperClass();
                combinationMapReverse.put(I, pair);
            }
            MyHelperClass matrix = new MyHelperClass();
            matrix = new SparseObjectMatrix2D(answeredQuestionSet.size(), studentSet.size());
            int lastStudentNumber = -1;
            AnsweredQuestion pair;
//            MyHelperClass url = new MyHelperClass();
            in = new BufferedReader(new InputStreamReader(url.openStream(), "ISO-8859-2"));
            in.readLine();
            while ((line = in.readLine()) != null) {
                chunks = line.split(delimiter);
                pair = null;
                if (chunks[2].equals(typeToProcess)) {
                    if (Integer.parseInt(chunks[0]) != lastStudentNumber) {
                        lastStudentNumber++;
                    }
                    pair = new AnsweredQuestion(chunks[4], chunks[5]);
//                    MyHelperClass combinationMap = new MyHelperClass();
                    if (combinationMap.containsKey(pair)) {
//                        MyHelperClass combinationMap = new MyHelperClass();
                        matrix.setQuick(combinationMap.get(pair), lastStudentNumber, Boolean.TRUE);
                    }
                }
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int[] supportVector = NULL; //new int[]();
        supportVector = new int[combinationMap.size()];
        ObjectMatrix1D row = null;
//        MyHelperClass combinationMap = new MyHelperClass();
        for (int i = 0; i < combinationMap.size(); i++) {
            MyHelperClass matrix = new MyHelperClass();
            row = matrix.viewRow(i);
            int sum = 0;
            for (int k = 0; k < row.size(); k++) {
                if (row.getQuick(k) != null && row.getQuick(k).equals(Boolean.TRUE)) {
                    sum++;
                }
            }
//            MyHelperClass supportVector = new MyHelperClass();
            supportVector[i] = sum;
        }
        MyHelperClass applet = new MyHelperClass();
        applet.combinationMap = this.combinationMap;
//        MyHelperClass applet = new MyHelperClass();
        applet.combinationMapReverse = this.combinationMapReverse;
//        MyHelperClass applet = new MyHelperClass();
        applet.matrix = this.matrix;
//        MyHelperClass applet = new MyHelperClass();
        applet.supportVector = supportVector;
        System.out.println("data loaded.");
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass combinationMap;
	public MyHelperClass matrix;
	public MyHelperClass[] supportVector;
	public MyHelperClass supportVector;
	public MyHelperClass combinationMapReverse;
public MyHelperClass size(){ return null; }
	public MyHelperClass put(AnsweredQuestion o0, Integer o1){ return null; }
	public MyHelperClass viewRow(int o0){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass put(Integer o0, AnsweredQuestion o1){ return null; }
	public MyHelperClass get(AnsweredQuestion o0){ return null; }
	public MyHelperClass containsKey(AnsweredQuestion o0){ return null; }}

class AnsweredQuestion {

AnsweredQuestion(String o0, String o1){}
	AnsweredQuestion(){}}

class ObjectMatrix1D {

public MyHelperClass size(){ return null; }
	public MyHelperClass getQuick(int o0){ return null; }}

class SparseObjectMatrix2D {

}
