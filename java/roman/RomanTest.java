package roman;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RomanTest {

	@Test
	void testToRoman() {
		assertEquals(new Roman(1).toString(), "I");
		assertEquals(new Roman(2).toString(), "II");
		assertEquals(new Roman(3).toString(), "III");
		assertEquals(new Roman(4).toString(), "IV");
		assertEquals(new Roman(5).toString(), "V");
		assertEquals(new Roman(6).toString(), "VI");
		assertEquals(new Roman(7).toString(), "VII");
		assertEquals(new Roman(8).toString(), "VIII");
		assertEquals(new Roman(9).toString(), "IX");
		assertEquals(new Roman(10).toString(), "X");
		assertEquals(new Roman(11).toString(), "XI");
		assertEquals(new Roman(12).toString(), "XII");
		assertEquals(new Roman(13).toString(), "XIII");
		assertEquals(new Roman(14).toString(), "XIV");
		assertEquals(new Roman(15).toString(), "XV");
		assertEquals(new Roman(16).toString(), "XVI");
		assertEquals(new Roman(17).toString(), "XVII");
		assertEquals(new Roman(18).toString(), "XVIII");
		assertEquals(new Roman(19).toString(), "XIX");
		assertEquals(new Roman(20).toString(), "XX");
		assertEquals(new Roman(25).toString(), "XXV");
		assertEquals(new Roman(30).toString(), "XXX");
		assertEquals(new Roman(40).toString(), "XL");
		assertEquals(new Roman(50).toString(), "L");
		assertEquals(new Roman(60).toString(), "LX");
		assertEquals(new Roman(65).toString(), "LXV");
		assertEquals(new Roman(70).toString(), "LXX");
		assertEquals(new Roman(80).toString(), "LXXX");
		assertEquals(new Roman(90).toString(), "XC");
		assertEquals(new Roman(95).toString(), "XCV");
		assertEquals(new Roman(100).toString(), "C");
		assertEquals(new Roman(400).toString(), "CD");
		assertEquals(new Roman(500).toString(), "D");
		assertEquals(new Roman(900).toString(), "CM");
		assertEquals(new Roman(1000).toString(), "M");
		assertEquals(new Roman(2000).toString(), "MM");
		assertEquals(new Roman(1234).toString(), "MCCXXXIV");
		assertEquals(new Roman(1979).toString(), "MCMLXXIX");
		assertEquals(new Roman(2018).toString(), "MMXVIII");
		assertEquals(new Roman(1466).toString(), "MCDLXVI");
		assertEquals(new Roman(2104).toString(), "MMCIV");
	}

	@Test
	void testFromRoman() {
		assertEquals(new Roman("I").getValue(), 1);
		assertEquals(new Roman("II").getValue(), 2);
		assertEquals(new Roman("III").getValue(), 3);
		assertEquals(new Roman("IV").getValue(), 4);
		assertEquals(new Roman("V").getValue(), 5);
		assertEquals(new Roman("VI").getValue(), 6);
		assertEquals(new Roman("VII").getValue(), 7);
		assertEquals(new Roman("VIII").getValue(), 8);
		assertEquals(new Roman("IX").getValue(), 9);
		assertEquals(new Roman("X").getValue(), 10);
		assertEquals(new Roman("XI").getValue(), 11);
		assertEquals(new Roman("XII").getValue(), 12);
		assertEquals(new Roman("XIII").getValue(), 13);
		assertEquals(new Roman("XIV").getValue(), 14);
		assertEquals(new Roman("XV").getValue(), 15);
		assertEquals(new Roman("XVI").getValue(), 16);
		assertEquals(new Roman("XVII").getValue(), 17);
		assertEquals(new Roman("XVIII").getValue(), 18);
		assertEquals(new Roman("XIX").getValue(), 19);
		assertEquals(new Roman("XX").getValue(), 20);
		assertEquals(new Roman("XXV").getValue(), 25);
		assertEquals(new Roman("XXX").getValue(), 30);
		assertEquals(new Roman("XL").getValue(), 40);
		assertEquals(new Roman("L").getValue(), 50);
		assertEquals(new Roman("LX").getValue(), 60);
		assertEquals(new Roman("LXX").getValue(), 70);
		assertEquals(new Roman("LXXX").getValue(), 80);
		assertEquals(new Roman("XC").getValue(), 90);
		assertEquals(new Roman("C").getValue(), 100);
		assertEquals(new Roman("CC").getValue(), 200);
		assertEquals(new Roman("CD").getValue(), 400);
		assertEquals(new Roman("DC").getValue(), 600);
		assertEquals(new Roman("CM").getValue(), 900);
		assertEquals(new Roman("D").getValue(), 500);
		assertEquals(new Roman("M").getValue(), 1000);
		assertEquals(new Roman("MM").getValue(), 2000);
		assertEquals(new Roman("MCCXXXIV").getValue(), 1234);
		assertEquals(new Roman("MCMLXXIX").getValue(), 1979);
		assertEquals(new Roman("MMXVIII").getValue(), 2018);
	}

}
