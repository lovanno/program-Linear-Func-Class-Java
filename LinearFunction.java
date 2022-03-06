public class LinearFunction implements LinearFunctionMethods{
    public double Slope;
    public double YIntc;
   
    LinearFunction(double Slope, double YIntc){
        this.Slope=Slope; //This allows the above properties to be accessed. Without it, Slope will always equal 0 unless the above properties are like "Slope=2;"
        this.YIntc=YIntc;
    }
   
    public double getSlope() {
        return Slope;
    }
    public double getYIntercept()
    {
        return YIntc;
    }
    public double getRoot()
    {
        if(YIntc/Slope<0){
           return YIntc/Slope*-1;
        }
        else
        {
           return YIntc/Slope;
        }
    }
    
    public double getYvalue(double x)
    {
        return (x*Slope)+YIntc;
    }
    public double getXvalue(double y)
    {
        return (y-YIntc)/Slope;
    }
}

