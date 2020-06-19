


class c1113240 {

        public RemotePolicyMigrator createRemotePolicyMigrator() {
            return new RemotePolicyMigrator() {

                public String migratePolicy(InputStream stream, String url) throws ResourceMigrationException, IOException {
                    ByteArrayOutputCreator oc = new ByteArrayOutputCreator();
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copyAndClose(stream, oc.getOutputStream());
                    return oc.getOutputStream().toString();
                }
            };
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyAndClose(InputStream o0, MyHelperClass o1){ return null; }}

class RemotePolicyMigrator {

}

class InputStream {

}

class ResourceMigrationException extends Exception{
	public ResourceMigrationException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ByteArrayOutputCreator {

public MyHelperClass getOutputStream(){ return null; }}
