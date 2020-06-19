
import java.io.UncheckedIOException;


class c324677 {

    public boolean import_pieces(String filename) {
        int pieceId;
        int i;
        int n;
        int[] color;
        boolean byurl = true;
        e2piece temppiece;
        color = new int[4];
        BufferedReader entree;
        try {
            if (byurl == true) {
                MyHelperClass baseURL = new MyHelperClass();
                URL url = new URL(baseURL, filename);
                InputStream in =(InputStream)(Object) url.openStream();
                entree = new BufferedReader(new InputStreamReader(in));
            } else {
                entree = new BufferedReader(new FileReader(filename));
            }
            pieceId = 0;
            while (true) {
                String lineread =(String)(Object) entree.readLine();
                if (lineread == null) {
                    break;
                }
                StringTokenizer tok = new StringTokenizer(lineread, " ");
                n =(int)(Object) tok.countTokens();
                if (n == 2) {
                } else {
                    for (i = 0; i < 4; i++) {
                        color[i] = Integer.parseInt((String)(Object)tok.nextToken());
                    }
                    pieceId++;
                    System.out.println("Read Piece : " + pieceId + ":" + color[0] + " " + color[1] + " " + color[2] + " " + color[3]);
                    temppiece = new e2piece(pieceId, color[0] + 1, color[1] + 1, color[2] + 1, color[3] + 1);
                    MyHelperClass allpieces = new MyHelperClass();
                    allpieces.add_piece(temppiece);
                    MyHelperClass unplacedpieces = new MyHelperClass();
                    unplacedpieces.add_piece(temppiece);
                }
            }
            return true;
        } catch (UncheckedIOException err) {
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add_piece(e2piece o0){ return null; }}

class e2piece {

e2piece(int o0, int o1, int o2, int o3, int o4){}
	e2piece(){}}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0, String o1){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class FileReader {

FileReader(String o0){}
	FileReader(){}}

class StringTokenizer {

StringTokenizer(String o0, String o1){}
	StringTokenizer(){}
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass countTokens(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
