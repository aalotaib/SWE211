package junit;

public class Triangle {

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle() {
     
    }

    public int triangleType(int a, int b, int c) {
    	 sideA = a;
         sideB = b;
         sideC = c;
        if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideC + sideB > sideA)) {
            if ((sideA == sideB) && (sideB == sideC))
                return 3; // equilateral
            else if ((sideA == sideB) || (sideA == sideC) || (sideB == sideC))
                return 2; // isosceles
            else
                return 1; // scalene
        } else {
            return 4; // error
        }
    }


}