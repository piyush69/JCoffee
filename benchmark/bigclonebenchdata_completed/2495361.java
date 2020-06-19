


class c2495361 {
public static MyHelperClass log;
	public static MyHelperClass hashPkKeyLock;
	public static MyHelperClass getConnection(){ return null; }
//public MyHelperClass hashPkKeyLock;
//	public MyHelperClass log;
//	public MyHelperClass getConnection(){ return null; }

    public static synchronized Integer getNextSequence(String seqNum) throws ApplicationException {
        Connection dbConn = null;
        java.sql.PreparedStatement preStat = null;
        java.sql.ResultSet rs = null;
        boolean noTableMatchFlag = false;
        int currID = 0;
        int nextID = 0;
        try {
            dbConn =(Connection)(Object) getConnection();
        } catch (Exception e) {
            log.error("Error Getting Connection.", e);
            throw new ApplicationException("errors.framework.db_conn", e);
        }
        synchronized (hashPkKeyLock) {
            if (hashPkKeyLock.get(seqNum) == null) {
                hashPkKeyLock.put(seqNum, new Object());
            }
        }
        synchronized (hashPkKeyLock.get(seqNum)) {
            synchronized (dbConn) {
                try {
                    preStat =(java.sql.PreparedStatement)(Object)(PreparedStatement)(Object) dbConn.prepareStatement("SELECT TABLE_KEY_MAX FROM SYS_TABLE_KEY WHERE TABLE_NAME=?");
                    preStat.setString(1, seqNum);
                    rs = preStat.executeQuery();
                    if (rs.next()) {
                        currID = rs.getInt(1);
                    } else {
                        noTableMatchFlag = true;
                    }
                } catch (Exception e) {
                    log.error(e, e);
                    try {
                        dbConn.close();
                    } catch (Exception ignore) {
                    } finally {
                        dbConn = null;
                    }
                    throw new ApplicationException("errors.framework.get_next_seq", e, seqNum);
                } finally {
                    try {
                        rs.close();
                    } catch (Exception ignore) {
                    } finally {
                        rs = null;
                    }
                    try {
                        preStat.close();
                    } catch (Exception ignore) {
                    } finally {
                        preStat = null;
                    }
                }
                if (noTableMatchFlag) {
                    try {
                        currID = 0;
                        preStat =(java.sql.PreparedStatement)(Object)(PreparedStatement)(Object) dbConn.prepareStatement("INSERT INTO SYS_TABLE_KEY(TABLE_NAME, TABLE_KEY_MAX) VALUES(?, ?)", java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE, java.sql.ResultSet.CONCUR_UPDATABLE);
                        preStat.setString(1, seqNum);
                        preStat.setInt(2, currID);
                        preStat.executeUpdate();
                    } catch (Exception e) {
                        log.error(e, e);
                        try {
                            dbConn.close();
                        } catch (Exception ignore) {
                        } finally {
                            dbConn = null;
                        }
                        throw new ApplicationException("errors.framework.get_next_seq", e, seqNum);
                    } finally {
                        try {
                            preStat.close();
                        } catch (Exception ignore) {
                        } finally {
                            preStat = null;
                        }
                    }
                }
                try {
                    int updateCnt = 0;
                    nextID = currID;
                    do {
                        nextID++;
                        preStat =(java.sql.PreparedStatement)(Object)(PreparedStatement)(Object) dbConn.prepareStatement("UPDATE SYS_TABLE_KEY SET TABLE_KEY_MAX=? WHERE TABLE_NAME=? AND TABLE_KEY_MAX=?", java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE, java.sql.ResultSet.CONCUR_UPDATABLE);
                        preStat.setInt(1, nextID);
                        preStat.setString(2, seqNum);
                        preStat.setInt(3, currID);
                        updateCnt = preStat.executeUpdate();
                        currID++;
                        if (updateCnt == 0 && (currID % 2) == 0) {
                            Thread.sleep(50);
                        }
                    } while (updateCnt == 0);
                    dbConn.commit();
                    return (new Integer(nextID));
                } catch (Exception e) {
                    log.error(e, e);
                    try {
                        dbConn.rollback();
                    } catch (Exception ignore) {
                    }
                    throw new ApplicationException("errors.framework.get_next_seq", e, seqNum);
                } finally {
                    try {
                        preStat.close();
                    } catch (Exception ignore) {
                    } finally {
                        preStat = null;
                    }
                    try {
                        dbConn.close();
                    } catch (Exception ignore) {
                    } finally {
                        dbConn = null;
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass error(Exception o0, Exception o1){ return null; }
	public MyHelperClass put(String o0, Object o1){ return null; }}

class ApplicationException extends Exception{
	public ApplicationException(String errorMessage) { super(errorMessage); }
	ApplicationException(String o0, Exception o1){}
	ApplicationException(){}
	ApplicationException(String o0, Exception o1, String o2){}
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class PreparedStatement {

}
