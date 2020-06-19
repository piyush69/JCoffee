


class c1113238 {

        public ResourceMigrator createDefaultResourceMigrator(NotificationReporter reporter, boolean strictMode) throws ResourceMigrationException {
            return new ResourceMigrator() {

                public void migrate(InputMetadata meta, InputStream inputStream, OutputCreator outputCreator) throws IOException, ResourceMigrationException {
                    OutputStream outputStream =(OutputStream)(Object) outputCreator.createOutputStream();
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(inputStream, outputStream);
                }
            };
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class NotificationReporter {

}

class ResourceMigrator {

}

class ResourceMigrationException extends Exception{
	public ResourceMigrationException(String errorMessage) { super(errorMessage); }
}

class InputMetadata {

}

class InputStream {

}

class OutputCreator {

public MyHelperClass createOutputStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

}
