package util;

import com.ecom.util.SampleUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class JUnitRetrieve {
    @Test
    public void codeChecking(){
        Assertions.assertEquals(15,SampleUtil.printConversion(25.42));
    }
}
