import java.io.*;
import java.lang.*;
import java.util.*;



class c8172052 {
public MyHelperClass fileName;

    public void close() {
        try {
            MyHelperClass writer = new MyHelperClass();
            if (writer != null) {
                BufferedReader reader;
//                MyHelperClass writer = new MyHelperClass();
                writer.close();
//                MyHelperClass writer = new MyHelperClass();
                writer =(MyHelperClass)(Object) new BufferedWriter(new FileWriter((String)(Object)fileName));
                MyHelperClass headers = new MyHelperClass();
                for (int i = 0; i < (int)(Object)headers.size(); i++) writer.write(headers.get(i) + ",");
//                MyHelperClass writer = new MyHelperClass();
                writer.write("\n");
                MyHelperClass file = new MyHelperClass();
                reader = new BufferedReader(new FileReader((String)(Object)file));
//                MyHelperClass writer = new MyHelperClass();
                while (reader.ready()) writer.write(reader.readLine() + "\n");
                reader.close();
//                MyHelperClass writer = new MyHelperClass();
                writer.close();
//                MyHelperClass file = new MyHelperClass();
                file.delete();
            }
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass delete(){ return null; }}
