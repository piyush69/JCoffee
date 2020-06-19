


class c17202157 {

    static Matrix readMatrix(String filename, int nrow, int ncol) {
        Matrix cij = new Matrix(nrow, ncol);
        try {
            URL url =(URL)(Object) filename.getClass().getResource(filename);
            LineNumberReader lnr = new LineNumberReader(new InputStreamReader(url.openStream()));
            for (int i = 0; i < nrow; i++) for (int j = 0; j < ncol; j++) cij.set(i, j, Double.parseDouble((String)(Object)lnr.readLine()));
        } catch (Exception xc) {
            xc.printStackTrace();
        }
        return cij;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Matrix {

Matrix(){}
	Matrix(int o0, int o1){}
	public MyHelperClass set(int o0, int o1, double o2){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class LineNumberReader {

LineNumberReader(){}
	LineNumberReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
