


class c17721652 {
public MyHelperClass email;
	public MyHelperClass URLEncoder;
	public MyHelperClass name;
	public MyHelperClass message;
	public MyHelperClass MainWindow;
	public MyHelperClass subject;
	public MyHelperClass JOptionPane;
	public MyHelperClass Utils;
	public MyHelperClass category;
	public MyHelperClass setVisible(boolean o0){ return null; }

    public void actionPerformed(ActionEvent e) {
        MyHelperClass cancel = new MyHelperClass();
        if (e.getSource() == cancel) {
            MyHelperClass email = new MyHelperClass();
            email.setText("");
            MyHelperClass name = new MyHelperClass();
            name.setText("");
            MyHelperClass category = new MyHelperClass();
            category.setSelectedIndex(0);
            MyHelperClass subject = new MyHelperClass();
            subject.setText("");
            MyHelperClass message = new MyHelperClass();
            message.setText("");
            setVisible(false);
        } else {
            StringBuffer errors = new StringBuffer();
            if (email.getText().trim().equals("")) errors.append("El campo 'Email' es obligatorio<br/>");
            if (name.getText().trim().equals("")) errors.append("El campo 'Nombre' es obligatorio<br/>");
            if (subject.getText().trim().equals("")) errors.append("El campo 'T�tulo' es obligatorio<br/>");
            if (message.getText().trim().equals("")) errors.append("No hay conrtenido en el mensaje<br/>");
            if (errors.length() > 0) {
                JOptionPane.showMessageDialog(this, "<html><b>Error</b><br/>" + errors.toString() + "</html>", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    StringBuffer params = new StringBuffer();
                    params.append("name=").append(URLEncoder.encode((String)(Object)name.getText(), "UTF-8")).append("&category=").append(URLEncoder.encode((String)(String)(Object) category.getSelectedItem(), "UTF-8")).append("&title=").append(URLEncoder.encode((String)(Object)subject.getText(), "UTF-8")).append("&email=").append(URLEncoder.encode((String)(Object)email.getText(), "UTF-8")).append("&id=").append(URLEncoder.encode(MainWindow.getUserPreferences().getUniqueId() + "", "UTF-8")).append("&body=").append(URLEncoder.encode((String)(Object)message.getText(), "UTF-8"));
                    URL url = new URL("http://www.cronopista.com/diccionario2/sendMessage.php");
                    URLConnection connection =(URLConnection)(Object) url.openConnection();
                    Utils.setupProxy(connection);
                    connection.setDoOutput(true);
                    OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
                    out.write(params.toString());
                    out.close();
                    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    String decodedString;
                    while ((decodedString =(String)(Object) in.readLine()) != null) {
                        System.out.println(decodedString);
                    }
                    in.close();
                    email.setText("");
                    name.setText("");
                    category.setSelectedIndex(0);
                    subject.setText("");
                    message.setText("");
                    setVisible(false);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "<html><b>Error</b><br/>Ha ocurrido un error enviando tu mensaje.<br/>" + "Por favor, int�ntalo m�s tarde o ponte en contacto conmigo a trav�s de www.cronopista.com</html>", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
public MyHelperClass setSelectedIndex(int o0){ return null; }
	public MyHelperClass getUserPreferences(){ return null; }
	public MyHelperClass setupProxy(URLConnection o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass getUniqueId(){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }
	public MyHelperClass getSelectedItem(){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass showMessageDialog(c17721652 o0, String o1, String o2, MyHelperClass o3){ return null; }}

class ActionEvent {

public MyHelperClass getSource(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(MyHelperClass o0){}
	OutputStreamWriter(){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
