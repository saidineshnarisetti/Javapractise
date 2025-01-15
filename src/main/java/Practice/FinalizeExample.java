package Practice;

public class FinalizeExample {
	// Some resource that requires cleanup
    private String resource;

    // Constructor
    public FinalizeExample(String resource) {
        this.resource = resource;
    }

    // Custom cleanup operations in finalize method
    @Override
    protected void finalize() throws Throwable {
        try {
            // Cleanup operations (e.g., closing a file, releasing resources)
            System.out.println("Finalizing: " + resource);
        } finally {
            // Always call the superclass finalize method
            super.finalize();
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating objects with resources
        FinalizeExample obj1 = new FinalizeExample("Resource 1");
        FinalizeExample obj2 = new FinalizeExample("Resource 2");

        // Let's make these objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Suggesting garbage collection
        System.gc();

        // Allow some time for the garbage collector to work
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program exiting...");
    }
	
}



