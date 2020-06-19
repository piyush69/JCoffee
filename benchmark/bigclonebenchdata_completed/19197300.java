


class c19197300 {

    private void writeStatsToDatabase(long transferJobAIPCount, long reprocessingJobAIPCount, long transferJobAIPVolume, long reprocessingJobAIPVolume, long overallBinaryAIPCount, Map mimeTypeRegister) throws SQLException {
        int nextAIPStatsID;
        long nextMimetypeStatsID;
        MyHelperClass dbConnection = new MyHelperClass();
        Statement select =(Statement)(Object) dbConnection.createStatement();
        String aipStatsQuery = "select max(aip_statistics_id) from aip_statistics";
        ResultSet result =(ResultSet)(Object) select.executeQuery(aipStatsQuery);
        if ((boolean)(Object)result.next()) {
            nextAIPStatsID =(int)(Object) result.getInt(1) + 1;
        } else {
            throw new SQLException("Problem getting maximum AIP Statistics ID");
        }
        String mimetypeStatsQuery = "select max(mimetype_aip_statistics_id) from mimetype_aip_statistics";
        result =(ResultSet)(Object) select.executeQuery(mimetypeStatsQuery);
        if ((boolean)(Object)result.next()) {
            nextMimetypeStatsID =(int)(Object) result.getLong(1) + 1;
        } else {
            throw new SQLException("Problem getting maximum MIME type AIP Statistics ID");
        }
        String insertAIPStatsEntryQuery = "insert into aip_statistics " + "(aip_statistics_id, tj_aip_count, tj_aip_volume, rj_aip_count, rj_aip_volume, " + "collation_date, binary_aip_count) " + "values (?, ?, ?, ?, ?, ?, ?)";
//        MyHelperClass dbConnection = new MyHelperClass();
        PreparedStatement insert =(PreparedStatement)(Object) dbConnection.prepareStatement(insertAIPStatsEntryQuery);
        insert.setInt(1, nextAIPStatsID);
        insert.setLong(2, transferJobAIPCount);
        insert.setLong(3, transferJobAIPVolume);
        insert.setLong(4, reprocessingJobAIPCount);
        insert.setLong(5, reprocessingJobAIPVolume);
        insert.setDate(6,(Date)(Object) new java.sql.Date(System.currentTimeMillis()));
        insert.setLong(7, overallBinaryAIPCount);
        int rowsAdded =(int)(Object) insert.executeUpdate();
        if (rowsAdded != 1) {
//            MyHelperClass dbConnection = new MyHelperClass();
            dbConnection.rollback();
            throw new SQLException("Could not insert row into AIP statistics table");
        }
        String insertMimeTypeStatsQuery = "insert into mimetype_aip_statistics " + "(mimetype_aip_statistics_id, aip_statistics_id, mimetype_aip_count, mimetype_aip_volume, mimetype) " + "values (?, ?, ?, ?, ?)";
//        MyHelperClass dbConnection = new MyHelperClass();
        insert =(PreparedStatement)(Object) dbConnection.prepareStatement(insertMimeTypeStatsQuery);
        insert.setInt(2, nextAIPStatsID);
        for (String mimeType :(String[])(Object) (Object[])(Object)mimeTypeRegister.keySet()) {
            AIPStatistics mimeTypeStats =(AIPStatistics)(Object) mimeTypeRegister.get(mimeType);
            insert.setLong(1, nextMimetypeStatsID);
            insert.setLong(3,(long)(Object) mimeTypeStats.aipCount);
            insert.setLong(4,(long)(Object) mimeTypeStats.aipVolume);
            insert.setString(5, mimeType);
            nextMimetypeStatsID++;
            rowsAdded =(int)(Object) insert.executeUpdate();
            if (rowsAdded != 1) {
//                MyHelperClass dbConnection = new MyHelperClass();
                dbConnection.rollback();
                throw new SQLException("Could not insert row into MIME Type AIP statistics table");
            }
        }
//        MyHelperClass dbConnection = new MyHelperClass();
        dbConnection.commit();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Map {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class AIPStatistics {
public MyHelperClass aipCount;
	public MyHelperClass aipVolume;
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Statement {

public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass getLong(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass setDate(int o0, Date o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class Date {

}
