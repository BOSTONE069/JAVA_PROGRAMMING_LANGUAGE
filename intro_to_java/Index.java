package intro_to_java;
public class Index {
    public static void main(String[] args){
        try {
            int [] myNumbers = {1,2,3,4,5,6,7,8};
            System.out.println(myNumbers[8]);
        } catch (Exception e) {
            System.out.println("Something went wrong in numbers array;" + e);
        }
        System.out.println("That was easy!");

    }
}
