package tests
import static org.junit.Assert.*
import geb.*
import geb.junit4.*

import page.custom.GolfPage

import org.junit.Test


class GolfTest extends BaseTest {
	
	@Test
	void orderGolfLabel() {
		to GolfPage
		at GolfPage
		
		js.exec("alert('flum!');")
	}

}
