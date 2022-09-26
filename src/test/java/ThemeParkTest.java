import attractions.*;
import behaviours.IVisited;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;

    Visitor visitor;

    @Before
    public void before(){
        themePark = new ThemePark();
        dodgems = new Dodgems("Bang Cars", 5);
        park = new Park("Green Stuff", 5);
        playground = new Playground("Fun", 5);
        rollerCoaster = new RollerCoaster("Down with the Sickness", 5);
        visitor = new Visitor(20, 178, 23);

    }



//    @Test
//    public void canVisitAttractions(){
//        themePark.visit();
//        assertEquals(5, visitor.getVisitAttraction().size());
//        assertEquals(5, dodgems.getVisitCount());
//    }
}
