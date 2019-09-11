

public class CastingPrimitives {



    float bytenumbers(){

      float  bytenumber = 50F;
// System.out.println("checking" + bytenumbers);
int weeks =50;

bytenumber += (float) weeks;/*specifies a data type that is being casted/ changed to..'(datatype)' */
    return bytenumber;
    }

    public static void main(String[] args) {

        CastingPrimitives cas = new CastingPrimitives();
        System.out.println(cas.bytenumbers());
        
    }
    
}