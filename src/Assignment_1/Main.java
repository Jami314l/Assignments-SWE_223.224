package Assignment_1;

public class Main {
    public static void main(String[] args){
        
        System.out.println("Way 1:");
        Rectangle rect_1=new Rectangle();
        Area print_area_1=new Area(rect_1);
        
        
        System.out.println("Way 2:");
        Rectangle rect_2=new Rectangle(20, 13, "Red");
        Area print_area_2=new Area(rect_2);

        
        rect_1.length=55;
        rect_1.width=33;
        rect_1.color="Blue";
        
        System.out.println("Way 3:");
        Rectangle rect_3=new Rectangle(rect_1);
        Area print_area_3=new Area(rect_3);
    }
}
