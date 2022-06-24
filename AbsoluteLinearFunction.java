public class AbsoluteLinearFunction extends LinearFunction implements Fun{
    public AbsoluteLinearFunction(double a, double b) {
        super(a, b);
    }

    @Override
    public double f(double x) {
        double var1 = getA() * x + getB();
        if(var1 < 0){
            var1 = 0;
        }
        return var1;
    }

}
