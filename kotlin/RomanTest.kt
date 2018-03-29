import org.junit.Test
import org.junit.Assert.*

class RomanTest {

	@Test
	fun testToRoman() {
		assertEquals(Roman(1).toString(), "I");
		assertEquals(Roman(2).toString(), "II");
		assertEquals(Roman(3).toString(), "III");
		assertEquals(Roman(4).toString(), "IV");
		assertEquals(Roman(5).toString(), "V");
		assertEquals(Roman(6).toString(), "VI");
		assertEquals(Roman(7).toString(), "VII");
		assertEquals(Roman(8).toString(), "VIII");
		assertEquals(Roman(9).toString(), "IX");
		assertEquals(Roman(10).toString(), "X");
		assertEquals(Roman(11).toString(), "XI");
		assertEquals(Roman(12).toString(), "XII");
		assertEquals(Roman(13).toString(), "XIII");
		assertEquals(Roman(14).toString(), "XIV");
		assertEquals(Roman(15).toString(), "XV");
		assertEquals(Roman(16).toString(), "XVI");
		assertEquals(Roman(17).toString(), "XVII");
		assertEquals(Roman(18).toString(), "XVIII");
		assertEquals(Roman(19).toString(), "XIX");
		assertEquals(Roman(20).toString(), "XX");
		assertEquals(Roman(25).toString(), "XXV");
		assertEquals(Roman(30).toString(), "XXX");
		assertEquals(Roman(40).toString(), "XL");
		assertEquals(Roman(50).toString(), "L");
		assertEquals(Roman(60).toString(), "LX");
		assertEquals(Roman(65).toString(), "LXV");
		assertEquals(Roman(70).toString(), "LXX");
		assertEquals(Roman(80).toString(), "LXXX");
		assertEquals(Roman(90).toString(), "XC");
		assertEquals(Roman(95).toString(), "XCV");
		assertEquals(Roman(100).toString(), "C");
		assertEquals(Roman(400).toString(), "CD");
		assertEquals(Roman(500).toString(), "D");
		assertEquals(Roman(900).toString(), "CM");
		assertEquals(Roman(1000).toString(), "M");
		assertEquals(Roman(2000).toString(), "MM");
		assertEquals(Roman(1234).toString(), "MCCXXXIV");
		assertEquals(Roman(1979).toString(), "MCMLXXIX");
		assertEquals(Roman(2018).toString(), "MMXVIII");
		assertEquals(Roman(1466).toString(), "MCDLXVI");
		assertEquals(Roman(2104).toString(), "MMCIV");
	}

	@Test
	fun testFromRoman() {
		assertEquals(Roman("I").getValue(), 1);
		assertEquals(Roman("II").getValue(), 2);
		assertEquals(Roman("III").getValue(), 3);
		assertEquals(Roman("IV").getValue(), 4);
		assertEquals(Roman("V").getValue(), 5);
		assertEquals(Roman("VI").getValue(), 6);
		assertEquals(Roman("VII").getValue(), 7);
		assertEquals(Roman("VIII").getValue(), 8);
		assertEquals(Roman("IX").getValue(), 9);
		assertEquals(Roman("X").getValue(), 10);
		assertEquals(Roman("XI").getValue(), 11);
		assertEquals(Roman("XII").getValue(), 12);
		assertEquals(Roman("XIII").getValue(), 13);
		assertEquals(Roman("XIV").getValue(), 14);
		assertEquals(Roman("XV").getValue(), 15);
		assertEquals(Roman("XVI").getValue(), 16);
		assertEquals(Roman("XVII").getValue(), 17);
		assertEquals(Roman("XVIII").getValue(), 18);
		assertEquals(Roman("XIX").getValue(), 19);
		assertEquals(Roman("XX").getValue(), 20);
		assertEquals(Roman("XXV").getValue(), 25);
		assertEquals(Roman("XXX").getValue(), 30);
		assertEquals(Roman("XL").getValue(), 40);
		assertEquals(Roman("L").getValue(), 50);
		assertEquals(Roman("LX").getValue(), 60);
		assertEquals(Roman("LXX").getValue(), 70);
		assertEquals(Roman("LXXX").getValue(), 80);
		assertEquals(Roman("XC").getValue(), 90);
		assertEquals(Roman("C").getValue(), 100);
		assertEquals(Roman("CC").getValue(), 200);
		assertEquals(Roman("CD").getValue(), 400);
		assertEquals(Roman("DC").getValue(), 600);
		assertEquals(Roman("CM").getValue(), 900);
		assertEquals(Roman("D").getValue(), 500);
		assertEquals(Roman("M").getValue(), 1000);
		assertEquals(Roman("MM").getValue(), 2000);
		assertEquals(Roman("MCCXXXIV").getValue(), 1234);
		assertEquals(Roman("MCMLXXIX").getValue(), 1979);
		assertEquals(Roman("MMXVIII").getValue(), 2018);
	}
}