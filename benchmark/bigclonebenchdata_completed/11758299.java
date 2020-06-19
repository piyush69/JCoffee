import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11758299 {

    void readData() {
        String[] nextLine;
        int line;
        double value;
        URL url = null;
        String FileToRead;
        try {
            MyHelperClass names = new MyHelperClass();
            for (int i = 0; i < names.length; i++) {
                MyHelperClass names = new MyHelperClass();
                FileToRead = "data/" + names[i] + ".csv";
                MyHelperClass ja = new MyHelperClass();
                url = new URL(ja.getCodeBase(), FileToRead);
                System.out.println(url.toString());
                InputStream in = url.openStream();
                CSVReader reader = new CSVReader(new InputStreamReader(in));
                line = 0;
                while ((nextLine = reader.readNext()) != null) {
                    MyHelperClass allset = new MyHelperClass();
                    allset.months[line] = Integer.parseInt(nextLine[0].substring(0, 2));
                    MyHelperClass allset = new MyHelperClass();
                    allset.years[line] = Integer.parseInt(nextLine[0].substring(6, 10));
                    value = Double.parseDouble(nextLine[1]);
                    values.getDataRef()[line][i] = value;
                    line++;
                }
            }
        } catch (IOException e) {
            System.err.println("File Read Exception");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class CSVReader {

}
