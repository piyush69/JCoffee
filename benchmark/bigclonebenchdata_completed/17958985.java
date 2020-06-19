


class c17958985 {
public MyHelperClass UserDAO;
	public MyHelperClass getFellow(String o0){ return null; }

    public void onCreate() {
        Window window;// = new Window();
        window = ((Window)(Window)(Object) getFellow("win"));
        Textbox userName;// = new Textbox();
        userName = ((Textbox)(Textbox)(Object) getFellow("user"));
        Textbox password;// = new Textbox();
        password = ((Textbox)(Textbox)(Object) getFellow("password"));
        MyHelperClass session = new MyHelperClass();
        session = window.getDesktop().getSession();
        MyHelperClass Executions = new MyHelperClass();
        if (Executions.getCurrent().getParameter("login") != null) {
            MyHelperClass login = new MyHelperClass();
            login = Executions.getCurrent().getParameter("login");
//            MyHelperClass login = new MyHelperClass();
            session.setAttribute("login", login);
        }
//        MyHelperClass Executions = new MyHelperClass();
        if (Executions.getCurrent().getParameter("password") != null) {
            MyHelperClass passwordu = new MyHelperClass();
            passwordu = Executions.getCurrent().getParameter("password");
        }
//        MyHelperClass Executions = new MyHelperClass();
        if (Executions.getCurrent().getParameter("option") != null) {
            MyHelperClass option = new MyHelperClass();
            option = Executions.getCurrent().getParameter("option");
//            MyHelperClass option = new MyHelperClass();
            session.setAttribute("option", option);
        }
//        MyHelperClass Executions = new MyHelperClass();
        if (Executions.getCurrent().getParameter("organization") != null) {
            MyHelperClass organization = new MyHelperClass();
            organization = Executions.getCurrent().getParameter("organization");
//            MyHelperClass organization = new MyHelperClass();
            session.setAttribute("organization", organization);
        }
//        MyHelperClass Executions = new MyHelperClass();
        if (Executions.getCurrent().getParameter("project") != null) {
            MyHelperClass project = new MyHelperClass();
            project = Executions.getCurrent().getParameter("project");
//            MyHelperClass project = new MyHelperClass();
            session.setAttribute("project", project);
        }
        MyHelperClass login = new MyHelperClass();
        if (login != null) {
//            MyHelperClass login = new MyHelperClass();
            User user =(User)(Object) UserDAO.getUserByUserName(login);
            if (user != null) {
                String encodedPassword = null;
                try {
                    MyHelperClass MessageDigest = new MyHelperClass();
                    MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
                    digest.update(user.getPassword().getBytes());
                    BASE64Encoder encoder = new BASE64Encoder();
                    encodedPassword =(String)(Object) encoder.encode(digest.digest());
                } catch (Exception e) {
                }
                MyHelperClass passwordu = new MyHelperClass();
                if ((int)(Object)passwordu.compareTo(encodedPassword) == 0) {
//                    MyHelperClass session = new MyHelperClass();
                    session.setAttribute("user", user);
//                    MyHelperClass session = new MyHelperClass();
                    session.setAttribute("numero", 5);
                    MyHelperClass option = new MyHelperClass();
                    session.setAttribute("option", option);
                    MyHelperClass organization = new MyHelperClass();
                    session.setAttribute("organization", organization);
                    MyHelperClass project = new MyHelperClass();
                    session.setAttribute("project", project);
//                    MyHelperClass Executions = new MyHelperClass();
                    Executions.sendRedirect("menu.zul");
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getSession(){ return null; }
	public MyHelperClass sendRedirect(String o0){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getUserByUserName(MyHelperClass o0){ return null; }
	public MyHelperClass getCurrent(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass compareTo(String o0){ return null; }
	public MyHelperClass setAttribute(String o0, User o1){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass setAttribute(String o0, int o1){ return null; }
	public MyHelperClass setAttribute(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getDesktop(){ return null; }}

class User {

public MyHelperClass getPassword(){ return null; }}

class MessageDigest {

public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(MyHelperClass o0){ return null; }}

class Window {

public MyHelperClass getDesktop(){ return null; }}

class Textbox {

}
