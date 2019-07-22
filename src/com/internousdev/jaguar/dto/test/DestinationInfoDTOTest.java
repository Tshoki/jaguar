package com.internousdev.jaguar.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.jaguar.dto.DestinationInfoDTO;

public class DestinationInfoDTOTest {
	DestinationInfoDTO dto = new DestinationInfoDTO();

	// test getId()
	@Test
	public void test_getId_max() {

		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getId_min() {

		int expected = -2147483648;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getId_0() {

		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	// test setId()
	@Test
	public void test_setId_max() {

		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setId_min() {

		int expected = -2147483648;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setId_0() {

		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	// test getUserId()
	@Test
	public void test_getUserId_null() {

		String expected = null;

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserId_emptyCharacter() {

		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserId_space() {

		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserId_fullSpace() {

		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserId_alphabeticCharacters() {

		String expected = "abc";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserId_halfWidthDigit() {

		String expected = "123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserId_hiragana() {

		String expected = "てすと";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserId_katakana() {

		String expected = "テスト";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserId_kanji() {

		String expected = "漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserId_all() {

		String expected = "漢字 テスト　てすと123abc";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	// test setUserId()
	@Test
	public void test_setUserId_null() {

		String expected = null;

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserId_emptyCharacter() {

		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserId_space() {

		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserId_fullSpace() {

		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserId_alphabeticCharacters() {

		String expected = "abc";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserId_halfWidthDigit() {

		String expected = "123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserId_hiragana() {

		String expected = "てすと";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserId_katakana() {

		String expected = "テスト";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserId_kanji() {

		String expected = "漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserId_all() {

		String expected = "漢字 テスト　てすと123abc";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	// test getFamilyName()
	@Test
	public void test_getFamilyName_null() {

		String expected = null;

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyName_emptyCharacter() {

		String expected = "";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyName_space() {

		String expected = " ";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyName_fullSpace() {

		String expected = "　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyName_alphabeticCharacters() {

		String expected = "abc";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyName_halfWidthDigit() {

		String expected = "123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyName_hiragana() {

		String expected = "てすと";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyName_katakana() {

		String expected = "テスト";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyName_kanji() {

		String expected = "漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyName_all() {

		String expected = "漢字 テスト　てすと123abc";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	// test setFamilyName()
	@Test
	public void test_setFamilyName_null() {

		String expected = null;

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyName_emptyCharacter() {

		String expected = "";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyName_space() {

		String expected = " ";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyName_fullSpace() {

		String expected = "　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyName_alphabeticCharacters() {

		String expected = "abc";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyName_halfWidthDigit() {

		String expected = "123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyName_hiragana() {

		String expected = "てすと";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyName_katakana() {

		String expected = "テスト";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyName_kanji() {

		String expected = "漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyName_all() {

		String expected = "漢字 テスト　てすと123abc";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	// test getFirstName()
	@Test
	public void test_getFirstName_null() {

		String expected = null;

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstName_emptyCharacter() {

		String expected = "";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstName_space() {

		String expected = " ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstName_fullSpace() {

		String expected = "　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstName_alphabeticCharacters() {

		String expected = "abc";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstName_halfWidthDigit() {

		String expected = "123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstName_hiragana() {

		String expected = "てすと";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstName_katakana() {

		String expected = "テスト";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstName_kanji() {

		String expected = "漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstName_all() {

		String expected = "漢字 テスト　てすと123abc";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	// test getFamilyNameKana()
	@Test
	public void test_getFamilyNameKana_null() {

		String expected = null;

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyNameKana_emptyCharacter() {

		String expected = "";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyNameKana_space() {

		String expected = " ";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyNameKana_fullSpace() {

		String expected = "　";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyNameKana_alphabeticCharacters() {

		String expected = "abc";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyNameKana_halfWidthDigit() {

		String expected = "123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyNameKana_hiragana() {

		String expected = "てすと";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyNameKana_katakana() {

		String expected = "テスト";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyNameKana_kanji() {

		String expected = "漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyNameKana_all() {

		String expected = "漢字 テスト　てすと123abc";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	// test setFamilyNameKana()
	@Test
	public void test_setFamilyNameKana_null() {

		String expected = null;

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyNameKana_emptyCharacter() {

		String expected = "";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyNameKana_space() {

		String expected = " ";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyNameKana_fullSpace() {

		String expected = "　";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyNameKana_alphabeticCharacters() {

		String expected = "abc";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyNameKana_halfWidthDigit() {

		String expected = "123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyNameKana_hiragana() {

		String expected = "てすと";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyNameKana_katakana() {

		String expected = "テスト";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyNameKana_kanji() {

		String expected = "漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyNameKana_all() {

		String expected = "漢字 テスト　てすと123abc";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	// test setFirstName()
	@Test
	public void test_setFirstName_null() {

		String expected = null;

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstName_emptyCharacter() {

		String expected = "";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstName_space() {

		String expected = " ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstName_fullSpace() {

		String expected = "　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstName_alphabeticCharacters() {

		String expected = "abc";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstName_halfWidthDigit() {

		String expected = "123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstName_hiragana() {

		String expected = "てすと";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstName_katakana() {

		String expected = "テスト";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstName_kanji() {

		String expected = "漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstName_all() {

		String expected = "漢字 テスト　てすと123abc";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	// test getFirstNameKana()
	@Test
	public void test_getFirstNameKana_null() {

		String expected = null;

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstNameKana_emptyCharacter() {

		String expected = "";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstNameKana_space() {

		String expected = " ";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstNameKana_fullSpace() {

		String expected = "　";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstNameKana_alphabeticCharacters() {

		String expected = "abc";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstNameKana_halfWidthDigit() {

		String expected = "123";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstNameKana_hiragana() {

		String expected = "てすと";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstNameKana_katakana() {

		String expected = "テスト";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstNameKana_kanji() {

		String expected = "漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstNameKana_all() {

		String expected = "漢字 テスト　てすと123abc";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	// test setFirstNameKana()
	@Test
	public void test_setFirstNameKana_null() {

		String expected = null;

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstNameKana_emptyCharacter() {

		String expected = "";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstNameKana_space() {

		String expected = " ";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstNameKana_fullSpace() {

		String expected = "　";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstNameKana_alphabeticCharacters() {

		String expected = "abc";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstNameKana_halfWidthDigit() {

		String expected = "123";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstNameKana_hiragana() {

		String expected = "てすと";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstNameKana_katakana() {

		String expected = "テスト";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstNameKana_kanji() {

		String expected = "漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstNameKana_all() {

		String expected = "漢字 テスト　てすと123abc";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	// test getEmail()
	@Test
	public void test_getEmail_null() {

		String expected = null;

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getEmail_emptyCharacter() {

		String expected = "";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getEmail_space() {

		String expected = " ";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getEmail_fullSpace() {

		String expected = "　";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getEmail_alphabeticCharacters() {

		String expected = "abc";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getEmail_halfWidthDigit() {

		String expected = "123";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getEmail_hiragana() {

		String expected = "てすと";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getEmail_katakana() {

		String expected = "テスト";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getEmail_kanji() {

		String expected = "漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getEmail_all() {

		String expected = "漢字 テスト　てすと123abc";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	// test setEmail()
	@Test
	public void test_setEmail_null() {

		String expected = null;

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setEmail_emptyCharacter() {

		String expected = "";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setEmail_space() {

		String expected = " ";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setEmail_fullSpace() {

		String expected = "　";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setEmail_alphabeticCharacters() {

		String expected = "abc";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setEmail_halfWidthDigit() {

		String expected = "123";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setEmail_hiragana() {

		String expected = "てすと";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setEmail_katakana() {

		String expected = "テスト";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setEmail_kanji() {

		String expected = "漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setEmail_all() {

		String expected = "漢字 テスト　てすと123abc";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	// test getTelNumber()
	@Test
	public void test_getTelNumber_null() {

		String expected = null;

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getTelNumber_emptyCharacter() {

		String expected = "";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getTelNumber_space() {

		String expected = " ";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getTelNumber_fullSpace() {

		String expected = "　";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getTelNumber_alphabeticCharacters() {

		String expected = "abc";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getTelNumber_halfWidthDigit() {

		String expected = "123";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getTelNumber_hiragana() {

		String expected = "てすと";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getTelNumber_katakana() {

		String expected = "テスト";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getTelNumber_kanji() {

		String expected = "漢字";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getTelNumber_all() {

		String expected = "漢字 テスト　てすと123abc";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	// test setTelNumber()
	@Test
	public void test_setTelNumber_null() {

		String expected = null;

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setTelNumber_emptyCharacter() {

		String expected = "";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setTelNumber_space() {

		String expected = " ";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setTelNumber_fullSpace() {

		String expected = "　";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setTelNumber_alphabeticCharacters() {

		String expected = "abc";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setTelNumber_halfWidthDigit() {

		String expected = "123";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setTelNumber_hiragana() {

		String expected = "てすと";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setTelNumber_katakana() {

		String expected = "テスト";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setTelNumber_kanji() {

		String expected = "漢字";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setTelNumber_all() {

		String expected = "漢字 テスト　てすと123abc";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

	// test getUserAddress()
	@Test
	public void test_getUserAddress_null() {

		String expected = null;

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserAddress_emptyCharacter() {

		String expected = "";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserAddress_space() {

		String expected = " ";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserAddress_fullSpace() {

		String expected = "　";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserAddress_alphabeticCharacters() {

		String expected = "abc";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserAddress_halfWidthDigit() {

		String expected = "123";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserAddress_hiragana() {

		String expected = "てすと";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserAddress_katakana() {

		String expected = "テスト";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserAddress_kanji() {

		String expected = "漢字";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserAddress_all() {

		String expected = "漢字 テスト　てすと123abc";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	// test setUserAddress()
	@Test
	public void test_setUserAddress_null() {

		String expected = null;

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserAddress_emptyCharacter() {

		String expected = "";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserAddress_space() {

		String expected = " ";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserAddress_fullSpace() {

		String expected = "　";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserAddress_alphabeticCharacters() {

		String expected = "abc";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserAddress_halfWidthDigit() {

		String expected = "123";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserAddress_hiragana() {

		String expected = "てすと";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserAddress_katakana() {

		String expected = "テスト";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserAddress_kanji() {

		String expected = "漢字";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserAddress_all() {

		String expected = "漢字 テスト　てすと123abc";

		dto.setUserAddress(expected);
		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}
}
