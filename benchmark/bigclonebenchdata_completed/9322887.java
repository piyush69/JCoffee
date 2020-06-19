import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9322887 {

    public static void main(String[] argv) throws Throwable, IOException {
        MyHelperClass HibernateUtil = new MyHelperClass();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        ;
        try {
            session.beginTransaction();
            Properties cfg = new Properties();
            MyHelperClass CFG_FILE = new MyHelperClass();
            URL url = SVM.class.getClassLoader().getResource(CFG_FILE);
            cfg.load(url.openStream());
            MyHelperClass KEY_RUN_MODE = new MyHelperClass();
            int runMode = Integer.valueOf(cfg.getProperty(KEY_RUN_MODE));
            switch(runMode) {
                MyHelperClass RUN_OPT = new MyHelperClass();
                case RUN_OPT:
                    new SVM().optimizeParameters(cfg);
                    break;
                MyHelperClass RUN_PREDICT = new MyHelperClass();
                case RUN_PREDICT:
                    new SVM().trainAndPredict(cfg);
                    break;
                MyHelperClass RUN_OPT_AND_PREDICT = new MyHelperClass();
                case RUN_OPT_AND_PREDICT:
                    break;
            }
            session.getTransaction().commit();
        } catch (HibernateException he) {
            session.getTransaction().rollback();
            MyHelperClass logger = new MyHelperClass();
            logger.error("Database error.", he);
            session.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Session {

}

class SVM {

}

class HibernateException extends Exception{
	public HibernateException(String errorMessage) { super(errorMessage); }
}
