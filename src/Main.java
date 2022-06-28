
public class Main {

    public static void main(String[] args) {

        try{
            testMethod();
        }catch (AngryException e){
            e.printStackTrace();
            System.out.println("Перехвачено");
        }
    }

    public static void testMethod() throws AngryException{
        System.out.println("Достаем Эксепшн из тест метода");
    }
}