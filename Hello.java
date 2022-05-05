class Hello{

	/* class - is a key word in java
		Hello  - is the name of the class must match with the name of the .java file while saviing
		**/

	public //access specifier - visible to all
	 static // this method can be invoked without creating object ,saves memory
	  void // return type - no value is returned
	   main(String args[])/*main is program entry point
	   						String args[] - command line argument**/ 
	   {
		for(int i =0; i<=10;i++){
		System.out.println("Hello World!");
		// System is a class , out is an object of the PrintStream class, println() is method of that class
		}
	}
}