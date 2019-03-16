public class rectangle extends shape {

    rectangle(double h,double b){
        super(h,b);
    }


    @Override

    void area(){
         double h= height*base;
        System.out.println("Rectangle:"+h);
    }
}
