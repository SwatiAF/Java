//Program to create a custom Exception Type

//To create a custom Exception subclass, define a subclass of Exception class
class ExceptionClass extends Exception {
  int value;
  
  ExceptionClass(int a) {
    value = a;
  }
  
  /*toString() method returns a String object containing a decription of the exception. This method is called by println() when outputting a Throwable object.*/  
  public String toString() {
    return "ExceptionClass[" + detail + "]";
  }
}

//Main class defines a method named compute() that throws a ExceptionClass object
class Main {
  
  //throws clause lists the types of exceptions that a method might throw.
  static void compute(int a) throws ExceptionClass {
    System.out.println("Called compute(" + a + ")");
    if(a > 10) 
      
      //Creates Java's standard exception objects. 'new' is used to construct an instance of ExceptionClass.
      throw new ExceptionClass(a);
    System.out.println("Normal Exit");
  }
  
  public static void main(String args[]) {
    try {
      compute(3);
      compute(34);
    } catch(ExceptionClass e) {
        System.out.println("Caught: " + e);
    }
  }
}
