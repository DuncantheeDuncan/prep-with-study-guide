package codes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CulculateSpaceOfTheRoom {

    public static void main(String[] args) {


        double l =18;
        double h=15;
        double w =20;
        double inc = 0.5 ;
        double rollCover =45.5 +inc/100d;

//        covert from centi to metres
////        /100d;
//        double y = l*h*w;
//        double total = Math.pow((y/rollCover), 4);
//        double rv = new BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
//        System.out.println(rv);

        double u = (2+(l*h*w)/(rollCover))/4;
        double rv = new BigDecimal(u).setScale(2, RoundingMode.HALF_UP).doubleValue();
        int xx = (int)rv;
//        s=((up)/(bottom))/outside
        System.out.println(rv +" "+ xx);

        float cm;
        double meter;
        cm = 1000;
        double  ff = 100;
        meter = cm / ff;
        int x = (int)meter;
//        float j = new BigDecimal(meter).setScale(2,RoundingMode.HALF_EVEN).floatValue();
        System.out.println(meter+ " "+ x);

        double ll =18;
        double hh=15;
        double ww =20;
        double iinc = 0.5 ;
        double rrollCover =45.5 ;

        double ccm = ll*hh*ww;
        double mmetre = ccm/100;
        System.out.println(mmetre/rrollCover);


    }
}
