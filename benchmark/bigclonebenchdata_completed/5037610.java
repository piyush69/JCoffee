


class c5037610 {
public MyHelperClass cancelButton;
	public MyHelperClass JOptionPane;
	public MyHelperClass dispose(){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass submit(String o0, String o1){ return null; }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        MyHelperClass submitButton = new MyHelperClass();
        if (src == submitButton) {
            MyHelperClass destinationCombo = new MyHelperClass();
            SubmissionProfile profile = (SubmissionProfile)(SubmissionProfile)(Object) destinationCombo.getSelectedItem();
            String uri =(String)(Object) profile.endpoint;
            String authPoint =(String)(Object) profile.authenticationPoint;
            MyHelperClass userIDField = new MyHelperClass();
            String user =(String)(Object) userIDField.getText();
            MyHelperClass passwordField = new MyHelperClass();
            String passwd = new String((String)(Object)passwordField.getPassword());
            try {
                URL url = new URL(authPoint + "?username=" + user + "&password=" + passwd);
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                String line = "";
                String text = "";
                while ((line =(String)(Object) reader.readLine()) != null) {
                    text = text + line;
                }
                reader.close();
                submit(uri, user);
                JOptionPane.showMessageDialog(null, "Submission accepted", "Success", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                this.dispose();
            } catch (Exception ex) {
                ex.printStackTrace();
                if (ex instanceof java.io.IOException) {
                    String msg = ex.getMessage();
                    if (msg.indexOf("HTTP response code: 401") != -1) JOptionPane.showMessageDialog(null, "Invalid Username/Password", "Invalid Username/Password", JOptionPane.ERROR_MESSAGE); else if (msg.indexOf("HTTP response code: 404") != -1) {
                        try {
                            submit(uri, user);
                            JOptionPane.showMessageDialog(null, "Submission accepted", "Success", JOptionPane.INFORMATION_MESSAGE);
                        } catch (Exception exc) {
                            exc.printStackTrace();
                        }
                    }
                }
            }
        } else if (src == cancelButton) {
            this.setVisible(false);
            this.dispose();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass INFORMATION_MESSAGE;
public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getSelectedItem(){ return null; }
	public MyHelperClass getText(){ return null; }}

class ActionEvent {

public MyHelperClass getSource(){ return null; }}

class SubmissionProfile {
public MyHelperClass endpoint;
	public MyHelperClass authenticationPoint;
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
