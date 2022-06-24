public interface Fun {
    double f(double x);

    // input  : -4,      0, 0.1
    // output : -4.0, -2.5, 0.0
    static double minimum(Fun func, double a, double b, double alpha){
        double var1 = func.f(a);
        double var2 = func.f(b);
        while(var1 > var2){
            var1 -= alpha;
        }
        return var1;
    }

}
