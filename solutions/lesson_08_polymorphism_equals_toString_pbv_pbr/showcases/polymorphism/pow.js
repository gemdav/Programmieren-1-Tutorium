/**
 * This functions calculates the power
 *
 * @param {Number} base the base of the calculation
 * @param {Number} exponent the exponent of the calculation
 * @returns the result of the calculation
 */
function pow(base, exponent = 2) {
	return base ** exponent;
}

console.log(pow(2)); // expected: 4
console.log(pow(2, 3)); // expected: 8
