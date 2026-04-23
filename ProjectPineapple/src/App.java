public class App {
    public static void main(String[] args) throws Exception {
        
        // int myInt = 7;
        // double myDouble = 3.14;
        // char myChar = 'A';

        // String myString = "Hello, World!";

        // System.out.println(myString.toUpperCase());

        String myString = printName("Luigi");
        System.out.println(myString);

        Cat myCat = new Cat();
        myCat.name = "Zouzou";
        myCat.age = 2;
        myCat.miaou();
    }

    private static String printName(String name) {
        if(name.equals("Luigi")) {
            return "Hello, World!";
        }

        return "Hello, " + name + "!";
    }
}
