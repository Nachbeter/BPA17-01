import java.io.*;
import java.util.*;
import java.math.*;
public class Solution {

	/*
	* ��� ���� � ���� � ������ �������� �� �����. ���������� ����� ��� ��������� ���� ������. 
	* ���� �� ���������, ���� ������ � ����� ���������, ����� ����������. � ������ ��������������
	* ��������� �� ����, ���� �������� � ���, � ���� ���������� ��-������.
	* ���� ������ ��� ������� - ������� Cat A, ���� ������ ��� - Cat B, ���� ���� ������ - Mouse C.
	* ����: n - ���������� �������� ��������� ������.
	*		x y z - ���������� ������� ����, ������� � ����.
	*		1 <= n <= 100
	* 		1 <= x, y, z <= 100
	* ������:
	* 2
	* 1 2 3
	* 1 3 2
	* 
	* Cat B
	* Mouse C
	*/
	class Animals
    {
        String name;
        int coordinata;

    }
    class Solve(Animals ob, ob1, ob2)
    {
        int x = ob.coordinata;
        int y = ob1.coordinata;
        int z = ob2.coordinata;

            String resh()
            {
                if (Math.Abs(z-x))<(Math.Abs(z-y)) {return("Cat A")};
                if (Math.Abs(z-x))>(Math.Abs(z-y)) {return("Cat B")};
                if (Math.Abs(z-x))=(Math.Abs(z-y)) {return("Mouse C")};

            }


    }

    /*static String func1(int x, int y, int z) {

    if (Math.Abs(z-x))<(Math.Abs(z-y)) return("Cat A");
    if (Math.Abs(z-x))>(Math.Abs(z-y)) return("Cat B");
    if (Math.Abs(z-x))=(Math.Abs(z-y)) return("Mouse C");


	}*/

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

                Animals catA = new Animals();
                //catA.name = "catA";
                Animals catB = new Animals();
                //catB.name = "catB";
                Animals mouseC = new Animals();
               // mouseC.name = "mouseC";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt"));//System.getenv("OUTPUT_PATH")

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            catA.coordinata = Integer.parseInt(xyz[0]);

            catB.coordinata = Integer.parseInt(xyz[1]);

            catC.coordinata = Integer.parseInt(xyz[2]);

            String result = Solve(catA, catB, catC).resh();

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }



        bufferedWriter.close();

        scanner.close();
    }
}
