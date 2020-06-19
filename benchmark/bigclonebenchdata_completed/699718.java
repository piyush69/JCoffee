import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c699718 {
public MyHelperClass[] btnNumber;
public MyHelperClass theConn;
	public MyHelperClass labelKey;
	public MyHelperClass key;
	public MyHelperClass passwordField;
	public MyHelperClass buttonPanel;
	public MyHelperClass DatabaseConnection;
//	public MyHelperClass btnNumber;
	public MyHelperClass JOptionPane;
	public MyHelperClass login;
	public MyHelperClass btnClear;
	public MyHelperClass btnOK;
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass setSize(int o0, int o1){ return null; }
	public MyHelperClass getContentPane(){ return null; }

     c699718(String login) {
        super(login + ", tecle a senha de uso �nico");
        this.login =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) login;
        Error.log(4001, "Autentica��o etapa 3 iniciada.");
        Container container =(Container)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) getContentPane();
        container.setLayout(new FlowLayout());
        btnNumber =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new JButton[10];
        btnOK =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new JButton("OK");
        btnClear =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new JButton("Limpar");
        buttonPanel =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 10));
        ResultSet rs;
        Statement stmt;
        String sql;
        Vector<Integer> result = new Vector<Integer>();
        sql = "select key from Senhas_De_Unica_Vez where login='" + login + "'";
        try {
            theConn = DatabaseConnection.getConnection();
            stmt =(Statement)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) theConn.createStatement();
            rs =(ResultSet)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) stmt.executeQuery(sql);
            while ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)rs.next()) {
                result.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Integer)(Object)rs.getInt("key"));
            }
            rs.close();
            stmt.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (theConn != null) theConn.close();
            } catch (Exception exception) {
            }
        }
        Random rn = new Random();
        int r = rn.nextInt();
        if (result.size() == 0) {
            rn = new Random();
            Vector<Integer> passwordVector = new Vector<Integer>();
            Vector<String> hashVector = new Vector<String>();
            for (int i = 0; i < 10; i++) {
                r = rn.nextInt() % 10000;
                if (r < 0) r = r * (-1);
                passwordVector.add(r);
            }
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter(login + ".txt", false));
                for (int i = 0; i < 10; i++) {
                    out.append("" + i + " " + passwordVector.get(i) + "\n");
                }
                out.close();
                try {
                    for (int i = 0; i < 10; i++) {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                        messageDigest.update(passwordVector.get(i).toString().getBytes());
                        BigInteger bigInt = new BigInteger(1, messageDigest.digest());
                        String digest = bigInt.toString(16);
                        sql = "insert into Senhas_De_Unica_Vez (login,key,password) values " + "('" + login + "'," + i + ",'" + digest + "')";
                        try {
                            theConn = DatabaseConnection.getConnection();
                            stmt =(Statement)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) theConn.createStatement();
                            stmt.executeUpdate(sql);
                            stmt.close();
                        } catch (Exception exception) {
                            exception.printStackTrace();
                        } finally {
                            try {
                                if (theConn != null) theConn.close();
                            } catch (Exception exception) {
                            }
                        }
                    }
                } catch (NoSuchAlgorithmException exception) {
                    exception.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "nova tabela de senhas criada para o usu�rio " + login + ".");
            Error.log(1002, "Sistema encerrado");
            System.exit(0);
        }
        if (r < 0) r = r * (-1);
        int index = r % result.size();
        if (index > result.size()) index = 0;
        key =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) result.get(index);
        labelKey =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new JLabel("Chave n�mero " + key + " ");
        passwordField =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new JPasswordField(12);
        ButtonHandler handler = new ButtonHandler();
        for (int i = 0; i < 10; i++) {
            btnNumber[i] =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new JButton("" + i);
            buttonPanel.add(btnNumber[i]);
            btnNumber[i].addActionListener(handler);
        }
        btnOK.addActionListener(handler);
        btnClear.addActionListener(handler);
        container.add(buttonPanel);
        container.add(passwordField);
        container.add(labelKey);
        container.add(btnOK);
        container.add(btnClear);
        setSize(325, 200);
        setVisible(true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass addActionListener(ButtonHandler o0){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setLayout(GridLayout o0){ return null; }}

class Error {

public static MyHelperClass log(int o0, String o1){ return null; }}

class Container {

public MyHelperClass setLayout(FlowLayout o0){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }}

class FlowLayout {

}

class JButton {

JButton(String o0){}
	JButton(){}}

class JPanel {

}

class GridLayout {

GridLayout(int o0, int o1){}
	GridLayout(){}}

class ResultSet {

public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class JLabel {

JLabel(String o0){}
	JLabel(){}}

class JPasswordField {

JPasswordField(int o0){}
	JPasswordField(){}}

class ButtonHandler {

}

class Object {

Object(String o0){}
	Object(){}}
