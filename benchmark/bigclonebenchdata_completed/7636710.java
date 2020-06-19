


class c7636710 {
public MyHelperClass log;
	public MyHelperClass dbConn;
	public MyHelperClass Utility;
	public MyHelperClass setPrepareStatement(PreparedStatement o0, int o1, Integer o2){ return null; }

    public String getNextSequence(Integer id) throws ApplicationException {
        java.sql.PreparedStatement preStat = null;
        java.sql.ResultSet rs = null;
        boolean noRecordMatch = false;
        String prefix = "";
        String suffix = "";
        Long startID = null;
        Integer length = null;
        Long currID = null;
        Integer increment = null;
        int nextID;
        String formReferenceID = null;
        MyHelperClass lock = new MyHelperClass();
        synchronized (lock) {
            MyHelperClass dbConn = new MyHelperClass();
            synchronized (dbConn) {
                try {
//                    MyHelperClass dbConn = new MyHelperClass();
                    preStat =(java.sql.PreparedStatement)(Object)(PreparedStatement)(Object) dbConn.prepareStatement("SELECT PREFIX,SUFFIX,START_NO,LENGTH,CURRENT_NO,INCREMENT FROM FORM_RECORD WHERE ID=?");
                    setPrepareStatement((PreparedStatement)(Object)preStat, 1, id);
                    rs = preStat.executeQuery();
                    if (rs.next()) {
                        prefix = rs.getString(1);
                        suffix = rs.getString(2);
                        startID = new Long(rs.getLong(3));
                        length = new Integer(rs.getInt(4));
                        currID = new Long(rs.getLong(5));
                        increment = new Integer(rs.getInt(6));
                        if ((Boolean)(Object)Utility.isEmpty(startID) || (Boolean)(Object)Utility.isEmpty(length) || (boolean)(Object)Utility.isEmpty(currID) || (boolean)(Object)Utility.isEmpty(increment) || startID.intValue() < 0 || length.intValue() < startID.toString().length() || currID.intValue() < startID.intValue() || increment.intValue() < 1 || new Integer(increment.intValue() + currID.intValue()).toString().length() > length.intValue()) {
                            noRecordMatch = true;
                        } else {
                            if (!(Boolean)(Object)Utility.isEmpty(prefix)) {
                                formReferenceID = prefix;
                            }
                            String strCurrID = currID.toString();
                            for (int i = 0; i < length.intValue() - strCurrID.length(); i++) {
                                formReferenceID += "0";
                            }
                            formReferenceID += strCurrID;
                            if (!(Boolean)(Object)Utility.isEmpty(suffix)) {
                                formReferenceID += suffix;
                            }
                        }
                    } else {
                        noRecordMatch = true;
                    }
                } catch (Exception e) {
                    log.error(e, e);
                    try {
                        dbConn.close();
                    } catch (Exception ignore) {
                    } finally {
                        dbConn = null;
                    }
                    throw new ApplicationException("errors.framework.get_next_seq", e);
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
                if (!noRecordMatch && formReferenceID != null) {
                    try {
                        int updateCnt = 0;
                        nextID = currID.intValue() + increment.intValue();
                        do {
                            preStat =(java.sql.PreparedStatement)(Object)(PreparedStatement)(Object) dbConn.prepareStatement("UPDATE FORM_RECORD SET CURRENT_NO=? WHERE ID=?");
                            setPrepareStatement((PreparedStatement)(Object)preStat, 1, new Integer(nextID));
                            setPrepareStatement((PreparedStatement)(Object)preStat, 2, id);
                            updateCnt = preStat.executeUpdate();
                            if (updateCnt == 0) {
                                Thread.sleep(50);
                            }
                        } while (updateCnt == 0);
                        dbConn.commit();
                    } catch (Exception e) {
                        log.error(e, e);
                        try {
                            dbConn.rollback();
                        } catch (Exception ignore) {
                        }
                        throw new ApplicationException("errors.framework.get_next_seq", e);
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
                return formReferenceID;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass isEmpty(Integer o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass isEmpty(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass error(Exception o0, Exception o1){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass isEmpty(Long o0){ return null; }}

class ApplicationException extends Exception{
	public ApplicationException(String errorMessage) { super(errorMessage); }
	ApplicationException(){}
	ApplicationException(String o0, Exception o1){}
}

class PreparedStatement {

}
