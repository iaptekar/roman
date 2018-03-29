package roman;

public class Roman {

	enum Numeral {
		I, V, X, L, C, D, M
	}

	private final int decimal;
	private final String roman;

	public Roman(int decimal) {
		this.decimal = decimal;
		this.roman = toRoman(decimal);
	}

	public Roman(String roman) {
		this.roman = roman.toUpperCase();
		this.decimal = fromRoman(roman.toUpperCase());
	}

	@Override
	public String toString() {
		return roman;
	}

	public int getValue() {
		return decimal;
	}

	private String toRoman(int value) {
		StringBuilder roman = new StringBuilder();
		int thousands = value / 1000;
		if (thousands > 0) {
			roman.append(new String(new char[thousands]).replace("\0", "M"));
		}
		append(roman, (value % 1000) / 100, Numeral.C, Numeral.D, Numeral.M);
		append(roman, ((value % 1000) % 100) / 10, Numeral.X, Numeral.L, Numeral.C);
		append(roman, ((value % 1000) % 100) % 10, Numeral.I, Numeral.V, Numeral.X);
		return roman.toString();
	}

	private int fromRoman(String value) {
		String roman = value.replace("IV", "IIII").replace("IX", "VIIII").replace("XL", "XXXX").replace("XC", "LXXXX")
				.replace("CD", "CCCC").replace("CM", "DCCCC");
		long decimal = roman.chars().filter(c -> c == 'I').count() + 5 * roman.chars().filter(c -> c == 'V').count()
				+ 10 * roman.chars().filter(c -> c == 'X').count() + 50 * roman.chars().filter(c -> c == 'L').count()
				+ 100 * roman.chars().filter(c -> c == 'C').count() + 500 * roman.chars().filter(c -> c == 'D').count()
				+ 1000 * roman.chars().filter(c -> c == 'M').count();
		return (int) decimal;

	}

	private void append(StringBuilder value, int position, Numeral unit, Numeral five, Numeral ten) {
		switch (position) {
		case 9:
			value.append(unit.name() + ten.name());
			break;
		case 6:
		case 7:
		case 8:
			value.append(five.name());
			value.append(new String(new char[position - 5]).replace("\0", unit.name()));
			break;
		case 5:
			value.append(five.name());
			break;
		case 4:
			value.append(unit.name() + five.name());
			break;
		case 1:
		case 2:
		case 3:
			value.append(new String(new char[position]).replace("\0", unit.name()));
		}

	}
}
