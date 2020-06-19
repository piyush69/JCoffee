


class c19867423 {
public MyHelperClass idGenerator;
	public MyHelperClass modificationTracker;
	public MyHelperClass connection;
	public MyHelperClass getSchemaMapping(){ return null; }

//    @Test
    public void testPersistor() throws Exception {
        PreparedStatement ps;
        MyHelperClass connection = new MyHelperClass();
        ps =(PreparedStatement)(Object) connection.prepareStatement("delete from privatadresse");
        ps.executeUpdate();
        ps.close();
//        MyHelperClass connection = new MyHelperClass();
        ps =(PreparedStatement)(Object) connection.prepareStatement("delete from adresse");
        ps.executeUpdate();
        ps.close();
//        MyHelperClass connection = new MyHelperClass();
        ps =(PreparedStatement)(Object) connection.prepareStatement("delete from person");
        ps.executeUpdate();
        ps.close();
        Persistor p;
        Adresse csd =(Adresse)(Object) new LieferAdresse();
        csd.setStrasse("Amalienstrasse 68");
        MyHelperClass modificationTracker = new MyHelperClass();
        modificationTracker.addNewParticipant(csd);
        Person markus = new Person();
        markus.setName("markus");
//        MyHelperClass modificationTracker = new MyHelperClass();
        modificationTracker.addNewParticipant(markus);
        markus.getPrivatAdressen().add(csd);
        Person martin = new Person();
        martin.setName("martin");
//        MyHelperClass modificationTracker = new MyHelperClass();
        modificationTracker.addNewParticipant(martin);
        p = new Persistor(getSchemaMapping(), idGenerator, modificationTracker);
        p.persist();
        Adresse bia =(Adresse)(Object) new LieferAdresse();
        modificationTracker.addNewParticipant(bia);
        bia.setStrasse("dr. boehringer gasse");
        markus.getAdressen().add(bia);
        bia.setPerson(martin);
        markus.setContactPerson(martin);
        p = new Persistor(getSchemaMapping(), idGenerator, modificationTracker);
        try {
            p.persist();
            connection.commit();
        } catch (Exception e) {
            connection.rollback();
            throw e;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass addNewParticipant(Person o0){ return null; }
	public MyHelperClass add(Adresse o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass addNewParticipant(Adresse o0){ return null; }}

class Test {

}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class Persistor {

Persistor(){}
	Persistor(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){}
	public MyHelperClass persist(){ return null; }}

class Adresse {

public MyHelperClass setStrasse(String o0){ return null; }
	public MyHelperClass setPerson(Person o0){ return null; }}

class LieferAdresse {

}

class Person {

public MyHelperClass setName(String o0){ return null; }
	public MyHelperClass setContactPerson(Person o0){ return null; }
	public MyHelperClass getPrivatAdressen(){ return null; }
	public MyHelperClass getAdressen(){ return null; }}
