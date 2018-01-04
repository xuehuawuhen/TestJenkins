package zjTestAppG.zjTestJenkins;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
   @Test
   public void test01() {
	    String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
		System.out.println("method:"+method);
		String x = this.getClass().getName() ;
		String y = this.getClass().getSimpleName();
		String z = this.getClass().getCanonicalName();
		long id = Thread.currentThread().getId();
		System.out.println("getName:"+x);
		System.out.println("getSimpleName:"+y);
		System.out.println("getCanonicalName:"+z);
		System.out.println("id:"+id);
   }
}
