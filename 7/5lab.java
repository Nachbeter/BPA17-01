package lab4;
import java.io.IOException;
import java.util.Scanner;

public class Cat_class {
     private static final Scanner scanner = new Scanner(System.in);
      public static void main(String[] args) throws IOException {
          
          try{
                String[] xyz = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            if (xyz.length()<1){
                System.err.println("Ошибка, значений должно быть 3");
                return;
               
                    
            
            Animals coord = new Animals(Integer.parseInt(xyz[0]),Integer.parseInt(xyz[1]),Integer.parseInt(xyz[2]));
            Solve runner=new Solve();
            runner.running(coord);
            
            new Thread(runner::run).start();

            scanner.close();
        }
        catch(Exception ex){
            System.err.println("Ошибка ввода");
            return;
        }

        }

}
class Solve
{
    private int x1;
    private int y1;
    private int z1;
    
        
        public void run(){
    
            if (Math.abs(z1-x1)<Math.abs(z1-y1)) {System.out.println("Cat A");};
            if (Math.abs(z1-x1)>Math.abs(z1-y1)) {System.out.println("Cat B");};
            if (Math.abs(z1-x1)==Math.abs(z1-y1)) {System.out.println("Mouse C");};
        }

        public void running(Animals x){
    this.x1=x.getX();
    this.y1=x.getY();
    this.z1=x.getZ();
    
            }
        }


class Animals
{
    private int x;
    private int y;
    private int z;

Animals(int xx, int vv, int zz){
        x=xx;
        y=vv;
        z=zz;
    }


    //setters
public void setX(int newX){
    this.x=newX;
}
public void setY(int newY){
    this.y=newY;
}

public void setZ(int newZ){
    this.z=newZ;
}
//getters
public int getX(){
    return x;
}

public int getY(){
    return y;
}
public int getZ(){
    return z;
}

}

