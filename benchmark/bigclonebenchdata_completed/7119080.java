
import java.io.UncheckedIOException;


class c7119080 {
public MyHelperClass assertFalse(MyHelperClass o0){ return null; }
public MyHelperClass assertEquals(MyHelperClass o0, MyHelperClass o1){ return null; }
public MyHelperClass assertNull(String o0, User o1){ return null; }
	public MyHelperClass assertNotNull(User o0){ return null; }
public MyHelperClass userServiceRemote;
	public MyHelperClass logger;
	public MyHelperClass userService;
	public MyHelperClass getJdbcTemplate(){ return null; }
	public MyHelperClass endTransaction(){ return null; }
	public MyHelperClass setComplete(){ return null; }

    public void testRegister() throws IOException {
        User newUser = new User(false, "testregUser", "regUser");
        newUser.setEmail("eagle-r@gmx.de");
        newUser.setUniversity("uni");
        newUser.setFirstName("first");
        newUser.setLastName("last");
        User regUser = null;
        try {
            regUser = (User)(User)(Object) getJdbcTemplate().queryForObject("select id, login, password, email, hash, REGISTRATION_DATE, university, FORUM_ID from USER where login = ?", new Object[] { newUser.getUsername() }, new UserMapper());
        } catch (UncheckedIOException e) {
        }
        assertNull("This test user already exists! Abort test", regUser);
        userServiceRemote.registrate(newUser);
        setComplete();
        endTransaction();
        regUser = (User)(User)(Object) getJdbcTemplate().queryForObject("select id, login, password, email, hash, REGISTRATION_DATE, university, FORUM_ID from USER where login = ?", new Object[] { newUser.getUsername() }, new UserMapper());
        assertNotNull(regUser);
        assertNotNull((User)(Object)regUser.getId());
        assertNotNull((User)(Object)regUser.getHash());
        assertFalse(regUser.getHash().isEmpty());
        assertEquals(regUser.getLogin(), newUser.getLogin());
        assertEquals(regUser.getPassword(), newUser.getPassword());
        assertEquals(regUser.getUniversity(), newUser.getUniversity());
        assertEquals(regUser.getEmail(), newUser.getEmail());
        Integer id =(Integer)(Object) newUser.getId();
        getJdbcTemplate().execute("DELETE FROM USER_AUTHORITIES WHERE USER_ID =" + id);
        getJdbcTemplate().execute("DELETE FROM USER WHERE ID = " + id);
        StringBuilder urlString = new StringBuilder((int)(Object)userService.getForumUrl());
        urlString.append("phpBB.php?action=remove").append("&id=").append(newUser.getForumID()).append("&mode=remove");
        logger.debug("Connecting to URL: " + urlString.toString());
        URL url = new URL(urlString.toString());
        URLConnection con =(URLConnection)(Object) url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        while ((inputLine =(String)(Object) in.readLine()) != null) logger.debug("Response: " + inputLine);
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getForumUrl(){ return null; }
	public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass registrate(User o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass queryForObject(String o0, Object[] o1, UserMapper o2){ return null; }
	public MyHelperClass execute(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class User {

User(boolean o0, String o1, String o2){}
	User(){}
	public MyHelperClass setUniversity(String o0){ return null; }
	public MyHelperClass getPassword(){ return null; }
	public MyHelperClass setLastName(String o0){ return null; }
	public MyHelperClass getForumID(){ return null; }
	public MyHelperClass getUniversity(){ return null; }
	public MyHelperClass setFirstName(String o0){ return null; }
	public MyHelperClass getUsername(){ return null; }
	public MyHelperClass getEmail(){ return null; }
	public MyHelperClass setEmail(String o0){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass getHash(){ return null; }
	public MyHelperClass getLogin(){ return null; }}

class UserMapper {

}

class EmptyResultDataAccessException extends Exception{
	public EmptyResultDataAccessException(String errorMessage) { super(errorMessage); }
}

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
