package InterviewQ.ArrayDemo.test;

public class ArraysExamples {

    int age = 11;
    private int dob = 1981;

    private void traverseArray(){

        String[] nationalParty = {"Congress", "BJP", "ABC", "XYZ"};
        System.out.println("Names of parties: ");
        for(String parties: nationalParty){
            System.out.println(": "+parties);
        }
    }

    public void publicExamples(){
        System.out.println("This is public method: ");

    }
    public static void main(String[] args){

        ArraysExamples obj = new ArraysExamples();
        obj.traverseArray();
        System.out.println("Object variables: Age = "+obj.age + " DoB = "+ obj.dob);

        //traverseArray(); Error: non-static method

    }


}
