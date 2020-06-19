


class c12927596 {

    public static void get_PK_data() {
        try {
            FileWriter file_writer = new FileWriter("xml_data/PK_data_dump.xml");
            BufferedWriter file_buffered_writer = new BufferedWriter(file_writer);
            URL fdt = new URL("http://opendata.5t.torino.it/get_pk");
            URLConnection url_connection =(URLConnection)(Object) fdt.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(url_connection.getInputStream()));
            String input_line;
            int num_lines = 0;
            while ((input_line =(String)(Object) in.readLine()) != null) {
                file_buffered_writer.write(input_line + "\n");
                num_lines++;
            }
            System.out.println("Parking :: Writed " + num_lines + " lines.");
            in.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}
	public MyHelperClass write(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
