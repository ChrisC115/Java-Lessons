// java is a Strongly Types Language: you have to Define/Declare a variable
// you have to declare its data type


class DataTypeExamples {

    int myInt = 42;
    double myDouble = 189.75;
    char myChar = 'Q';
    boolean myBool = false;

}


public class DataTypes{
    public static void main(String[] args){

        DataTypeExamples datatype = new DataTypeExamples();

        System.out.println("myInt:" + datatype.myInt);
        System.out.println("myDouble:" + datatype.myDouble);
        System.out.println("myChar:" + datatype.myChar);
        System.out.println("myBool:" + datatype.myBool);

    }
}