
import org.juint.Test; 
import static org.junit.Assert.fail;

public class hellotest{
	@Test
	public void testNothing(){}
	@Test
	public void testWillAlwaysFail(){
		fail("an error message");
	}
}


