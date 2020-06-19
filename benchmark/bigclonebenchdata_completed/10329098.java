
import java.io.UncheckedIOException;


class c10329098 {

    public void setPilot(PilotData pilotData) throws UsernameNotValidException {
        try {
            if (pilotData.username.trim().equals("") || pilotData.password.trim().equals("")) throw new UsernameNotValidException(1, "Username or password missing");
            PreparedStatement psta;
            if ((int)(Object)pilotData.id == 0) {
                MyHelperClass jdbc = new MyHelperClass();
                psta =(PreparedStatement)(Object) jdbc.prepareStatement("INSERT INTO pilot " + "(name, address1, address2, zip, city, state, country, birthdate, " + "pft_theory, pft, medical, passenger, instructor, loc_language, " + "loc_country, loc_variant, username, password, id) " + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,nextval('pilot_id_seq'))");
            } else {
                MyHelperClass jdbc = new MyHelperClass();
                psta =(PreparedStatement)(Object) jdbc.prepareStatement("UPDATE pilot SET " + "name = ?, address1 = ?, address2 = ?, " + "zip = ?, city = ?, state = ?, country = ?, birthdate = ?, pft_theory = ?," + "pft = ?, medical = ?, passenger = ?, instructor = ?, loc_language = ?, " + "loc_country = ?, loc_variant = ?, username = ?, password = ? " + "WHERE id = ?");
            }
            psta.setString(1,(String)(Object) pilotData.name);
            psta.setString(2,(String)(Object) pilotData.address1);
            psta.setString(3,(String)(Object) pilotData.address2);
            psta.setString(4,(String)(Object) pilotData.zip);
            psta.setString(5,(String)(Object) pilotData.city);
            psta.setString(6,(String)(Object) pilotData.state);
            psta.setString(7,(String)(Object) pilotData.country);
            if (pilotData.birthdate != null) psta.setLong(8, pilotData.birthdate.getTime()); else psta.setNull(8, java.sql.Types.INTEGER);
            if (pilotData.pft_theory != null) psta.setLong(9, pilotData.pft_theory.getTime()); else psta.setNull(9, java.sql.Types.INTEGER);
            if (pilotData.pft != null) psta.setLong(10, pilotData.pft.getTime()); else psta.setNull(10, java.sql.Types.INTEGER);
            if (pilotData.medical != null) psta.setLong(11, pilotData.medical.getTime()); else psta.setNull(11, java.sql.Types.INTEGER);
            if ((boolean)(Object)pilotData.passenger) psta.setString(12, "Y"); else psta.setString(12, "N");
            if ((boolean)(Object)pilotData.instructor) psta.setString(13, "Y"); else psta.setString(13, "N");
            psta.setString(14,(String)(Object) pilotData.loc_language);
            psta.setString(15,(String)(Object) pilotData.loc_country);
            psta.setString(16,(String)(Object) pilotData.loc_variant);
            psta.setString(17,(String)(Object) pilotData.username);
            psta.setString(18,(String)(Object) pilotData.password);
            if ((int)(Object)pilotData.id != 0) {
                psta.setInt(19, pilotData.id);
            }
            psta.executeUpdate();
            MyHelperClass jdbc = new MyHelperClass();
            jdbc.commit();
        } catch (UncheckedIOException sql) {
            MyHelperClass jdbc = new MyHelperClass();
            jdbc.rollback();
            sql.printStackTrace();
            throw new UsernameNotValidException(2, "Username allready exist");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getTime(){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class PilotData {
public MyHelperClass state;
	public MyHelperClass pft;
	public MyHelperClass passenger;
	public MyHelperClass pft_theory;
	public MyHelperClass country;
	public MyHelperClass medical;
	public MyHelperClass city;
	public MyHelperClass username;
	public MyHelperClass name;
	public MyHelperClass zip;
	public MyHelperClass loc_country;
	public MyHelperClass address2;
	public MyHelperClass instructor;
	public MyHelperClass id;
	public MyHelperClass loc_variant;
	public MyHelperClass loc_language;
	public MyHelperClass password;
	public MyHelperClass address1;
	public MyHelperClass birthdate;
}

class UsernameNotValidException extends Exception{
	public UsernameNotValidException(String errorMessage) { super(errorMessage); }
	UsernameNotValidException(int o0, String o1){}
	UsernameNotValidException(){}
}

class PreparedStatement {

public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setLong(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setNull(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
