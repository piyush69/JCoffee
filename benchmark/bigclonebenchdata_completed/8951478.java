


class c8951478 {
public MyHelperClass setDefaultCloseOperation(MyHelperClass o0){ return null; }
public MyHelperClass jScrollPane1;
	public MyHelperClass jTextPane1;
	public MyHelperClass JFrame;
	public MyHelperClass setTitle(String o0){ return null; }
	public MyHelperClass setSize(int o0, int o1){ return null; }
	public MyHelperClass getContentPane(){ return null; }

    private void jbInit() throws Exception {
        MyHelperClass borderLayout1 = new MyHelperClass();
        getContentPane().setLayout(borderLayout1);
        this.setTitle("�ϥλ���");
        jTextPane1.setEditable(false);
        this.getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
        jScrollPane1.getViewport().add(jTextPane1);
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        URL url =(URL)(Object) ReadmeFrame.class.getResource("readme.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuilder strBuilder = new StringBuilder();
        while ((boolean)(Object)reader.ready()) {
            strBuilder.append(reader.readLine());
            strBuilder.append('\n');
        }
        reader.close();
        jTextPane1.setText(strBuilder.toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DISPOSE_ON_CLOSE;
public MyHelperClass setLayout(MyHelperClass o0){ return null; }
	public MyHelperClass add(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass getViewport(){ return null; }
	public MyHelperClass setEditable(boolean o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class ReadmeFrame {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass ready(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
