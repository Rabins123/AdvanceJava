
// create an interface
interface Language {
    // declare an abstract method
    void getName(String name);
  }
  
  // class implements interface
  class ProgrammingLanguage implements Language {
    // implementation of abstract method
    public void getName(String name) {
      System.out.println("Programming Language: " + name);
    }
  }
  

public class Interface2 {
    public static void main(String[] args) {
        // create an object of ProgrammingLanguage class
        ProgrammingLanguage language = new ProgrammingLanguage();
        // call the method of the interface
        language.getName("Java");
      }
}
