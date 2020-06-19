
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19945019 {
public MyHelperClass log;
	public MyHelperClass getConnection(){ return null; }

    public int executeUpdateJT(String sql, Object[][] paramsList) {
        Connection connection = null;
        connection =(Connection)(Object) this.getConnection();
        try {
            connection.setAutoCommit(false);
        } catch (UncheckedIOException e1) {
            e1.printStackTrace();
        }
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement =(PreparedStatement)(Object) connection.prepareStatement(sql);
            for (int i = 0; i < paramsList.length; i++) {
                if (connection != null && !(Boolean)(Object)connection.isClosed()) {
                    InputStream is = null;
                    if (paramsList[i].length > 0) {
                        for (int j = 0; j < paramsList[i].length; j++) {
                            Object obj = paramsList[i][j];
                            if (obj.getClass().equals(Class.forName("java.io.File"))) {
                                File file = (File) obj;
                                is =(InputStream)(Object) new FileInputStream(file);
                                preparedStatement.setBinaryStream(j + 1, is, (int)(int)(Object) file.length());
                            } else if (obj.getClass().equals(Class.forName("java.util.Date"))) {
                                java.text.SimpleDateFormat sdf =(java.text.SimpleDateFormat)(Object) new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                preparedStatement.setString(j + 1, sdf.format((Date) obj));
                            } else {
                                preparedStatement.setObject(j + 1, obj);
                            }
                        }
                    }
                    preparedStatement.executeUpdate();
                    if (is != null) {
                        is.close();
                    }
                    ;
                }
            }
        } catch (Exception e) {
            System.out.println("发生错误，数据回滚！");
            e.printStackTrace();
            try {
                connection.rollback();
                return 0;
            } catch (UncheckedIOException e1) {
                e1.printStackTrace();
            }
        }
        try {
            connection.commit();
            return 1;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (UncheckedIOException e) {
                log.error("未能正确关闭数据库连接！",(SQLException)(Object) e);
                System.out.println("未能正确关闭数据库连接！");
                e.printStackTrace();
            }
        }
        return -1;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, SQLException o1){ return null; }}

class Connection {

public MyHelperClass isClosed(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setBinaryStream(int o0, InputStream o1, int o2){ return null; }
	public MyHelperClass setObject(int o0, Object o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class File {

public MyHelperClass length(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}}

class Date {

}
