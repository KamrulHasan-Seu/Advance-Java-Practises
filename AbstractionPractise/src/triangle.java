public class triangle extends  circle {

    void para3(double h,double b){
        this.height = h;
        this.base = b;
    }
    @Override

    void area(){
        double h= 0.5*height*base;
        System.out.println(h);
    }
}
