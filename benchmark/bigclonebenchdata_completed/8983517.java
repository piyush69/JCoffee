


class c8983517 {

    public User getUser(String userlogin) {
        UserDAO userDAO = new UserDAO();
        User user = null;
        try {
            user =(User)(Object) userDAO.load(userlogin);
            if (user == null) {
                URL url =(URL)(Object) Thread.currentThread().getContextClassLoader().getResource("users.cfg");
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                String linea =(String)(Object) br.readLine();
                while (linea != null) {
                    StringTokenizer st = new StringTokenizer(linea, ":");
                    if ((int)(Object)st.countTokens() == 3) {
                        String login =(String)(Object) st.nextToken();
                        String password =(String)(Object) st.nextToken();
                        String profile =(String)(Object) st.nextToken();
                        if (login.equals(userlogin)) {
                            user = new User(login, password, profile);
                            userDAO.save(user);
                        }
                    } else {
                    }
                    linea =(String)(Object) br.readLine();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class User {

User(String o0, String o1, String o2){}
	User(){}}

class UserDAO {

public MyHelperClass save(User o0){ return null; }
	public MyHelperClass load(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class StringTokenizer {

StringTokenizer(String o0, String o1){}
	StringTokenizer(){}
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass countTokens(){ return null; }}
