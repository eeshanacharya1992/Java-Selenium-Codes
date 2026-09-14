import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Aseert {
	@Test
	public void test() {
	    SoftAssert sa = new SoftAssert();

	    for (int i = 0; i < 3; i++) {
	        try {
	            Assert.assertTrue(i < 2);
	        } catch (Exception e) {
	            sa.assertTrue(false);
	        }
	        System.out.print(i);
	    }
	    sa.assertAll();
	}
}
