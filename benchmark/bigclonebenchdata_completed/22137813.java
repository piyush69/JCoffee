


class c22137813 {

    public static ObjectID[] sortDecending(ObjectID[] oids) {
        for (int i = 1; i < oids.length; i++) {
            ObjectID iId = oids[i];
            for (int j = 0; j < oids.length - i; j++) {
                if ((int)(Object)oids[j].getTypePrefix() > (int)(Object)oids[j + 1].getTypePrefix()) {
                    ObjectID temp = oids[j];
                    oids[j] = oids[j + 1];
                    oids[j + 1] = temp;
                }
            }
        }
        return oids;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ObjectID {

public MyHelperClass getTypePrefix(){ return null; }}
