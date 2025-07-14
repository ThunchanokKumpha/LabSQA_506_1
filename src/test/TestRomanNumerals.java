package test;


import static org.junit.jupiter.api.Assertions.*; 
import main.RomanNumerals; 
import org.junit.jupiter.api.Test;



class TestRomanNumerals {
	
	//ธัญชนก กุมภะ 663380506-1
	
	RomanNumerals roman = new RomanNumerals();
	
// TS001: Single digit
    // TC01: RomanNumber = "I", expected result = 1
    @Test
    void TestOneDigitI() {
        
        int result = roman.convertRomanNumToInt("I");
        assertEquals(1, result);
    }

    // TC02: RomanNumber = "V", expected result = 5
    @Test
    void TestOneDigitV() {
        int result = roman.convertRomanNumToInt("V");
        assertEquals(5, result);
    }

    // TC03: RomanNumber = "X", expected result = 10
    @Test
    void TestOneDigitX() {
        int result = roman.convertRomanNumToInt("X");
        assertEquals(10, result);
    }

    // TC04: RomanNumber = "L", expected result = 50
    @Test
    void TestOneDigitL() {
        int result = roman.convertRomanNumToInt("L");
        assertEquals(50, result);
    }

    // TC05: RomanNumber = "C", expected result = 100
    @Test
    void TestOneDigitC() {
        int result = roman.convertRomanNumToInt("C");
        assertEquals(100, result);
    }

    // TC06: RomanNumber = "D", expected result = 500
    @Test
    void TestOneDigitD() {
        int result = roman.convertRomanNumToInt("D");
        assertEquals(500, result);
    }

    // TC07: RomanNumber = "M", expected result = 1000
    @Test
    void TestOneDigitM() {
        int result = roman.convertRomanNumToInt("M");
        assertEquals(1000, result);
    }
    
    

// TS002: Two digits
    // TC08: RomanNumber = "IV", expected result = 4
    @Test
    void TestTwoDigit_IV() {
        int result = roman.convertRomanNumToInt("IV");
        assertEquals(4, result);
    }


    // TC9: RomanNumber = "XL", expected result = 40
    @Test
    void TestTwoDigit_XL() {
        int result = roman.convertRomanNumToInt("XL");
        assertEquals(40, result);
    }

    // TC10: RomanNumber = "CD", expected result = 400
    @Test
    void TestTwoDigit_CD() {
        int result = roman.convertRomanNumToInt("CD");
        assertEquals(400, result);
    }

    
 // TS003: Two digits – the first digit is larger than the second digit
    // TC11: RomanNumber = "VI", expected result = 6
    @Test
    void TestTwoDigit_VI() {
        int result = roman.convertRomanNumToInt("VI");
        assertEquals(6, result);
    }

    // TC12: RomanNumber = "CI", expected result = 101
    @Test
    void TestTwoDigit_CI() {
        int result = roman.convertRomanNumToInt("CI");
        assertEquals(101, result);
    }

// TS004: Two digits – same number
    // TC13: RomanNumber = "II", expected result = 2
    @Test
    void TestTwoDigit_II() {
        int result = roman.convertRomanNumToInt("II");
        assertEquals(2, result);
    }

    // TC14: RomanNumber = "XX", expected result = 20
    @Test
    void TestTwoDigit_XX() {
        int result = roman.convertRomanNumToInt("XX");
        assertEquals(20, result);
    }

// TS005: Multiple digits – same number
    // TC15: RomanNumber = "III", expected result = 3
    @Test
    void TestMultiDigit_III() {
        int result = roman.convertRomanNumToInt("III");
        assertEquals(3, result);
    }

    // TC16: RomanNumber = "XXX", expected result = 30
    @Test
    void TestMultiDigit_XXX() {
        int result = roman.convertRomanNumToInt("XXX");
        assertEquals(30, result);
    }

// TS006: Multiple digits – first digit is larger than the rest
    // TC17: RomanNumber = "XXVI", expected result = 26
    @Test
    void TestMultiDigit_XXVI() {
        int result = roman.convertRomanNumToInt("XXVI");
        assertEquals(26, result);
    }

    // TC18: RomanNumber = "XXVII", expected result = 27
    @Test
    void TestMultiDigit_XXVII() {
        int result = roman.convertRomanNumToInt("XXVII");
        assertEquals(27, result);
    }

    // TC19: RomanNumber = "LXVII", expected result = 67
    @Test
    void TestMultiDigit_LXVII() {
        int result = roman.convertRomanNumToInt("LXVII");
        assertEquals(67, result);
    }

// TS007: Multiple digits – first digit is largest number and the rest is the combination of (2), (3), (4)
    // TC20: RomanNumber = "LXXIV", expected result = 74
    @Test
    void TestComplex_LXXIV() {
        int result = roman.convertRomanNumToInt("LXXIV");
        assertEquals(74, result);
    }

    // TC21: RomanNumber = "LXXVIII", expected result = 78
    @Test
    void TestComplex_LXXVIII() {
        int result = roman.convertRomanNumToInt("LXXVIII");
        assertEquals(78, result);
    }

    // TC22: RomanNumber = "LXXXIV", expected result = 84
    @Test
    void TestComplex_LXXXIV() {
        int result = roman.convertRomanNumToInt("LXXXIV");
        assertEquals(84, result);
    }

// TS008: Not a roman numeral number
    //TC23: RomanNumber = "G", expected result = "กรุณาป้อนค่าเลขโรมันที่ถูกต้อง"
    @Test
    void TestInvalidCharacter_G() {
        assertThrows(IllegalArgumentException.class, () -> roman.convertRomanNumToInt("G"));
    }

   

// TS009: Wrong repeating digits
    //TC24: RomanNumber = "VV", expected result = "กรุณาป้อนค่าเลขโรมันที่ถูกต้อง"
    @Test
    void TestInvalidRepeat_VV() {
        assertThrows(IllegalArgumentException.class, () -> roman.convertRomanNumToInt("VV"));
    }

    //TC25: RomanNumber = "LL", expected result = "กรุณาป้อนค่าเลขโรมันที่ถูกต้อง"
    @Test
    void TestInvalidRepeat_LL() {
        assertThrows(IllegalArgumentException.class, () -> roman.convertRomanNumToInt("LL"));
    }
    
    //TC26: RomanNumber = "DD", expected result = "กรุณาป้อนค่าเลขโรมันที่ถูกต้อง"
    @Test
    void TestInvalidRepeat_DD() {
        assertThrows(IllegalArgumentException.class, () -> roman.convertRomanNumToInt("DD"));
    }
    

// TS010: Using more than three repeating roman numerals
    //TC27: RomanNumber = "IIII", expected result = "กรุณาป้อนค่าเลขโรมันที่ถูกต้อง"
    @Test
    void TestInvalidRepeat_IIII() {
        assertThrows(IllegalArgumentException.class, () -> roman.convertRomanNumToInt("IIII"));
    }
    
    @Test
    //TC28: RomanNumber = "XXXX", expected result = "กรุณาป้อนค่าเลขโรมันที่ถูกต้อง"
    void TestInvalidRepeat_XXXX() {
        assertThrows(IllegalArgumentException.class, () -> roman.convertRomanNumToInt("XXXX"));
    }
    
    @Test
    //TC29: RomanNumber = "CCCC", expected result = "กรุณาป้อนค่าเลขโรมันที่ถูกต้อง"
      void TestInvalidRepeat_CCCC() {
          assertThrows(IllegalArgumentException.class, () -> roman.convertRomanNumToInt("CCCC"));
      }
    
    @Test
    //TC30: RomanNumber = "MMMM", expected result = "กรุณาป้อนค่าเลขโรมันที่ถูกต้อง"
      void TestInvalidRepeat_MMMM() {
          assertThrows(IllegalArgumentException.class, () -> roman.convertRomanNumToInt("MMMM"));
      }
    
    
	
	

}
