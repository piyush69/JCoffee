


class c20412493 {

    void readData(URL url) throws IOException {
        int i = 0, j = 0, k = 0;
        double xvalue, yvalue;
        double xindex, yindex;
        InputStream is =(InputStream)(Object) url.openStream();
        is.mark(0);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        int columnsize = 0;
        double temp_prev = 0;
        double temp_new = 0;
        int first = 0;
        MyHelperClass s = new MyHelperClass();
        s = br.readLine();
//        MyHelperClass s = new MyHelperClass();
        StringTokenizer st = new StringTokenizer(s);
        columnsize = Integer.parseInt((String)(Object)st.nextToken());
        double[][][] data;// = new double[][][]();
        data = new double[columnsize][100][100];
        int isize;// = new int();
        isize = 0;
        int jsize;// = new int();
        jsize = 0;
//        MyHelperClass s = new MyHelperClass();
        while ((s = br.readLine()) != null) {
//            MyHelperClass s = new MyHelperClass();
            st = new StringTokenizer(s);
            for (k = 0; k < columnsize; k++) {
                temp_new = Double.parseDouble((String)(Object)st.nextToken());
                if (first == 0) {
                    temp_prev = temp_new;
                    first = 1;
                }
                if (k == 0) {
                    if (temp_new != temp_prev) {
                        temp_prev = temp_new;
                        i++;
                        j = 0;
                    }
                }
//                MyHelperClass data = new MyHelperClass();
                data[k][i][j] = temp_new;
            }
            j++;
        }
//        MyHelperClass isize = new MyHelperClass();
        isize = i + 1;
//        MyHelperClass jsize = new MyHelperClass();
        jsize = j;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] data;
}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass mark(int o0){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class StringTokenizer {

StringTokenizer(){}
	StringTokenizer(MyHelperClass o0){}
	public MyHelperClass nextToken(){ return null; }}
