import com.company.point.AreaChecker;
import com.company.point.Point;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class AreaCheckerTest {

    @Before
    public void beforeAll(){
        System.out.println("Start testing!");
    }
    Point zero = new Point(0,0,1);
    Point one = new Point(-1,-1,-1);
    Point two = new Point(1,1,1);
    Point three = new Point(-1,1,1);

    @Test
    public void AreaCheckerShouldWorkFineTest(){
        AreaChecker areaChecker = new AreaChecker();
        assertTrue(areaChecker.checkIfShotHitArea(zero));
        assertFalse(areaChecker.checkIfShotHitArea(one));
        assertFalse(areaChecker.checkIfShotHitArea(two));
        assertFalse(areaChecker.checkIfShotHitArea(three));
    }

    @After
    public void afterAll(){
        System.out.println("Testing done!");
    }
}
