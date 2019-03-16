public class mainClass {
    public static void main(String[] args) {

        teacherclass tc = new teacherclass(){

            @Override
            void display(){
                System.out.println("test class");
            }
        };
        tc.display();
}



}
