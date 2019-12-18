import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.math.*;


public class Cat_class{

  private static final Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) throws IOException {
      
      String[] xyz = scanner.nextLine().split(" ");

      		Animals coord = new Animals(Integer.parseInt(xyz[0]),Integer.parseInt(xyz[1]),Integer.parseInt(xyz[2]));

            	//String result = Solve(catA, catB, catC).resh();
        Solve runner=new Solve();
        runner.running(coord);
        
        new Thread(runner::run).start();

        scanner.close();

    }
}

class Solve
    {
	    private int x1;
	    private int y1;
	    private int z1;
	    
            
            public void run(){
        
       			if (Math.Abs(z-x))<(Math.Abs(z-y)) {System.out.println("Cat A");};
                if (Math.Abs(z-x))>(Math.Abs(z-y)) {System.out.println("Cat B");};
                if (Math.Abs(z-x))=(Math.Abs(z-y)) {System.out.println("Mouse C");};
    		}

    public void running(Animals x, Animals y, Animals z){
        this.x1=x.getX();
        this.y1=y.getY();
        this.z1=z.getZ();
        
    }
  


    }


    class Animals
    {
    	private int x;
    	private int y;
    	private int z;

	Animals(int xx, int vv, int zz){
	        x=xx;
	        v=vv;
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


