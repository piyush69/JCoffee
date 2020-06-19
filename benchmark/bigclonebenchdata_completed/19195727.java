


class c19195727 {
public MyHelperClass getQueryField(){ return null; }
	public MyHelperClass getResponseField(){ return null; }

        public void actionPerformed(ActionEvent event) {
            System.out.println("STARTING on" + getQueryField().getText());
            try {
                URL url = new URL(getQueryField().getText());
                getResponseField().setText("opening URL");
                DataInputStream inputStream = new DataInputStream(url.openStream());
                getResponseField().setText("collating response");
                String line =(String)(Object) inputStream.readLine();
                String totalString = "";
                while (line != null) {
                    totalString += line + "\n";
                    line =(String)(Object) inputStream.readLine();
                }
                System.out.println("FINISHING");
                getResponseField().setText(totalString);
                System.out.println("FINISHED");
            } catch (Exception exception) {
                getResponseField().setText(exception.getMessage() + "\n");
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getText(){ return null; }
	public MyHelperClass setText(String o0){ return null; }}

class ActionEvent {

}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class DataInputStream {

DataInputStream(MyHelperClass o0){}
	DataInputStream(){}
	public MyHelperClass readLine(){ return null; }}
