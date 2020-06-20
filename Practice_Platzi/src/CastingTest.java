public class CastingTest {
    public static void main(String[] args) {

        var c = 'z';
        var cI = (int) c;
        System.out.println(cI);

        var i = 250;
        var iL = (long) i;
        var iLs = (short) iL;
        System.out.println(iL);
        System.out.println(iLs);

        var d = 301.067;
        var dL = (long) d;
        System.out.println(dL);

        var o = 100;
        var o_ = o + 5000.66;
        var oF = (float) o_;
        System.out.println(o_);
        System.out.println(oF);

        var p = 737;
        var p_ = p*100;
        var pB = (byte) p_;
        System.out.println(p_);
        System.out.println(pB);

        var f = 298.638;
        var f_ = f/25;
        var fL = (long) f_;
        System.out.println(f_);
        System.out.println(fL);

    }
}
