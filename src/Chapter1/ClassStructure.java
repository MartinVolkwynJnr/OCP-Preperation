package Chapter1;

public class ClassStructure {


    // Fields
    private String fieldHelloWorld = "Hello World!!!";

    //getter
    public String getFieldHelloWorld() {
        return fieldHelloWorld;
    }
    //setter
    public void setFieldHelloWorld(String fieldHelloWorld) {
        this.fieldHelloWorld = fieldHelloWorld;
    }

    // Main Method this starts the actual java program!

    /**
     * The main method of a java class is the entry of the program.
     * @param args
     *
     * the java parameters that the program is started with populates the string array args.
     * this can be read as any other array.
     */
    public static void main(String[] args){
        ClassStructure cs = new ClassStructure();
        cs.printHelloWorld();
    }

    //Methods
    public void printHelloWorld(){

        System.out.println(fieldHelloWorld);
    }

    /*
        Three types of COMMENTS
        1. Inline
        2. Multi-line
        3. JavaDoc multiple-line
     */

    // Inline comment

    /**
     * JavaDoc Comment
     */

    /*
        Multi-line comment
     */
}
