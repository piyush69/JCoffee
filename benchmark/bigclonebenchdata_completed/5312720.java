


class c5312720 {
public MyHelperClass getLocalID(Media o0, MyHelperClass o1){ return null; }
	public MyHelperClass getAuthorID(Media o0, MyHelperClass o1){ return null; }
	public MyHelperClass getArtistAliasID(Media o0, MyHelperClass o1){ return null; }
	public MyHelperClass getArtistID(Media o0, MyHelperClass o1){ return null; }
	public MyHelperClass updateLocation(Media o0, MyHelperClass o1){ return null; }

    public void putMedia(Media m) {
        if (m == null) {
            return;
        }
        MyHelperClass _conn = new MyHelperClass();
        if (_conn == null) {
            MyHelperClass log = new MyHelperClass();
            log.error("DatabaseDatastore not connected!");
            return;
        }
        MyHelperClass log = new MyHelperClass();
        if ((boolean)(Object)log.isTraceEnabled()) {
//            MyHelperClass log = new MyHelperClass();
            log.trace("Writing Media " + m.toString() + " to database");
        }
        try {
            try {
//                MyHelperClass _conn = new MyHelperClass();
                long trackid =(long)(Object) getLocalID(m, _conn);
                if ((boolean)(Object)m.isBaseDirty()) {
//                    MyHelperClass log = new MyHelperClass();
                    if ((boolean)(Object)log.isTraceEnabled()) {
//                        MyHelperClass log = new MyHelperClass();
                        log.trace("Need to update base " + m.getID() + " to database");
                    }
//                    MyHelperClass _conn = new MyHelperClass();
                    Integer artist =(Integer)(Object) getArtistID(m, _conn);
//                    MyHelperClass _conn = new MyHelperClass();
                    Integer author =(Integer)(Object) getAuthorID(m, _conn);
//                    MyHelperClass _conn = new MyHelperClass();
                    Integer artistAlias =(Integer)(Object) getArtistAliasID(m, _conn);
//                    MyHelperClass _conn = new MyHelperClass();
                    PreparedStatement s =(PreparedStatement)(Object) _conn.prepareStatement("update media_track set track_name=?,track_artist_id=?,track_author_id=?,track_artist_alias_id=?,track_audit_timestamp=CURRENT_TIMESTAMP where track_id = ?");
                    s.setString(1, m.getName());
                    if (artist != null) {
                        s.setLong(2, artist);
                    } else {
                        MyHelperClass Types = new MyHelperClass();
                        s.setNull(2, Types.BIGINT);
                    }
                    if (author != null) {
                        s.setLong(3, author);
                    } else {
                        MyHelperClass Types = new MyHelperClass();
                        s.setNull(3, Types.BIGINT);
                    }
                    if (artistAlias != null) {
                        s.setLong(4, artistAlias);
                    } else {
                        MyHelperClass Types = new MyHelperClass();
                        s.setNull(4, Types.BIGINT);
                    }
                    s.setLong(5, trackid);
                    s.executeUpdate();
                    s.close();
                }
                if ((boolean)(Object)m.isUserDirty()) {
//                    MyHelperClass log = new MyHelperClass();
                    if ((boolean)(Object)log.isTraceEnabled()) {
//                        MyHelperClass log = new MyHelperClass();
                        log.trace("Need to update user " + m.getID() + " to database");
                    }
//                    MyHelperClass _conn = new MyHelperClass();
                    PreparedStatement s =(PreparedStatement)(Object) _conn.prepareStatement("update media_track_rating set rating=?, play_count=? where track_id=? and user_id=?");
                    s.setFloat(1, m.getRating());
                    s.setLong(2, m.getPlayCount());
                    s.setLong(3, trackid);
                    MyHelperClass userid = new MyHelperClass();
                    s.setLong(4, userid);
                    if ((int)(Object)s.executeUpdate() != 1) {
                        s.close();
                    }
                    s.close();
                }
                if ((boolean)(Object)m.isContentDirty()) {
//                    MyHelperClass _conn = new MyHelperClass();
                    updateLocation(m, _conn);
                }
//                MyHelperClass _conn = new MyHelperClass();
                _conn.commit();
                m.resetDirty();
//                MyHelperClass log = new MyHelperClass();
                if ((boolean)(Object)log.isTraceEnabled()) {
//                    MyHelperClass log = new MyHelperClass();
                    log.trace("Committed " + m.getID() + " to database");
                }
            } catch (Exception e) {
//                MyHelperClass log = new MyHelperClass();
                log.error(e.toString(), e);
//                MyHelperClass _conn = new MyHelperClass();
                _conn.rollback();
            }
        } catch (Exception e) {
//            MyHelperClass log = new MyHelperClass();
            log.error(e.toString(), e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BIGINT;
public MyHelperClass trace(String o0){ return null; }
	public MyHelperClass isTraceEnabled(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class Media {

public MyHelperClass isUserDirty(){ return null; }
	public MyHelperClass isBaseDirty(){ return null; }
	public MyHelperClass isContentDirty(){ return null; }
	public MyHelperClass getID(){ return null; }
	public MyHelperClass resetDirty(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getRating(){ return null; }
	public MyHelperClass getPlayCount(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setLong(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setLong(int o0, Integer o1){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setFloat(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setNull(int o0, MyHelperClass o1){ return null; }}
