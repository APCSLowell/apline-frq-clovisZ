public class APLine
{
  private int a, b, c;
  public APLine(int aInt, int bInt, int cInt) {
    a = aInt;
    b = bInt;
    c = cInt;
  }
  public double getSlope() 
    return (double) -a/b;

  public int isOnLine(int xValue, int yValue) {
    if (a*x + b*y + c == 0) return true;
    return false;
  }
}
