class Roman {

	val roman: String
	val decimal: Int

	constructor(value: String) {
		roman = value.toUpperCase()
		decimal = fromRoman(value.toUpperCase())
	}

	constructor(value: Int) {
		roman = toRoman(value)
		decimal = value
	}

	@Override
	override fun toString(): String {
		return roman
	}

	fun getValue(): Int {
		return decimal
	}

	fun toRoman(value: Int): String {
		val roman = StringBuilder()
		val thousands = value / 1000
		if (thousands > 0) {
			roman.append("M".repeat(thousands))
		}
		append(roman, (value % 1000) / 100, Numeral.C, Numeral.D, Numeral.M)
		append(roman, ((value % 1000) % 100) / 10, Numeral.X, Numeral.L, Numeral.C)
		append(roman, ((value % 1000) % 100) % 10, Numeral.I, Numeral.V, Numeral.X)
		return roman.toString()
	}

	fun fromRoman(value: String): Int {
		val roman = value.replace("IV", "IIII").replace("IX", "VIIII").replace("XL", "XXXX").replace("XC", "LXXXX").replace("CD", "CCCC").replace("CM", "DCCCC");
		return roman.count { c -> c == 'I' } + 5 * roman.count { c -> c == 'V' } + 10 * roman.count { c -> c == 'X' } + 50 * roman.count { c -> c == 'L' } + 100 * roman.count { c -> c == 'C' } + 500 * roman.count { c -> c == 'D' } + 1000 * roman.count { c -> c == 'M' }
	}

	fun append(value: StringBuilder, position: Int, unit: Numeral, five: Numeral, ten: Numeral) {
		when (position) {
			9 -> value.append(unit.name + ten.name)
			6, 7, 8 -> {
				value.append(five.name)
				value.append(unit.name.repeat(position - 5))
			}
			5 -> value.append(five.name)
			4 -> value.append(unit.name + five.name)
			1, 2, 3 -> value.append(unit.name.repeat(position))
		}

	}
}