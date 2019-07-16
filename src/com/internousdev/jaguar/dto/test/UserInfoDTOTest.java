package com.internousdev.jaguar.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.jaguar.dto.UserInfoDTO;

public class UserInfoDTOTest {
//test getId()
	@Test
	public void test_getId_max() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 2147483647;
		
		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getId_min() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = -2147483648;
		
		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getId_0() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 0;
		
		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	
//	test setId()

	@Test
	public void test_setId_max() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 2147483647;
		
		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setId_min() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = -2147483648;
		
		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setId_0() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 0;
		
		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

//	test getUserId
	@Test
	public void test_getUserId_null() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getUserId_emptyCharacter() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getUserId_space() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getUserId_fullSpace() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getUserId_alphabeticCharacters() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getUserId_halfWidthDigit() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "123";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getUserId_hiragana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "てすと";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getUserId_katakana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "テスト";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getUserId_kanji() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getUserId_all() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字 テスト　てすと123abc";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
//	test setUserId()
	@Test
	public void test_setUserId_null() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setUserId_emptyCharacter() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setUserId_space() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setUserId_fullspace() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setUserId_alphabeticCharacters() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setUserId_halfWidthDigit() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "123";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setUserId_hiragana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "てすと";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setUserId_katakana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "テスト";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setUserId_kanji() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setUserId_all() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字 テスト　てすと123abc";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
//test getPassword
	@Test
	public void test_getPassword_null() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;
		
		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPassword_emptyCharacter() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPassword_space() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPassword_fullspace() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPassword_alphabeticCharacters() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPassword_halfWidthDigit() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "123";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPassword_hiragana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "てすと";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPassword_katakana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "テスト";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPassword_kanji() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPassword_all() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字 テスト　てすと123abc";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
//test setPassword
	@Test
	public void test_setPassword_null() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;
		
		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPassword_emptyCharacter() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPassword_space() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPassword_fullspace() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPassword_alphabeticCharacters() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPassword_halfWidthDigit() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "123";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPassword_hiragana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "てすと";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPassword_katakana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "テスト";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPassword_kanji() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPassword_all() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字 テスト　てすと123abc";
		
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	
//	test getFamilyName
	@Test
	public void test_getFamilyName_null() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;
		
		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFamilyName_emptyCharacter() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";
		
		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFamily_space() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";
		
		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFamilyName_fullSpace() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFamilyName_alphabeticCharacters() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFamilyName_halfWidthDigit() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFamilyName_hiragana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "てすと";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFamilyName_katakana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "テスト";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFamilyName_kanji() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFamilyName_all() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

//	test setFamilyName
	@Test
	public void test_setFamilyName_null() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;
		
		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFamilyName_emptyCharacter() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";
		
		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFamilyName_space() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFamilyName_fullSpace() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFamilyName_alphabeticCharacters() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFamilyName_halfWidthDigit() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFamilyName_hiragana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "てすと";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFamilyName_katakana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "テスト";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFamilyName_kanji() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFamilyName_all() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	
//	test getFirstName
	@Test
	public void test_getFirstName_null() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFirstName_emptyCharacter() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFirstName_space() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFirstName_fullSpace() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFirstName_alphabeticCharacters() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFirstName_halfWidthDigit() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFirstName_hiragana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "てすと";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFirstName_katakana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "テスト";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFirstName_kanji() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFirstName_all() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
//	test setFirstName
	@Test
	public void test_setFirstName_null() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFirstName_emptyCharacter() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFirstName_space() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFirstName_fullSpace() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFirstName_alphabeticCharacters() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFirstName_halfWidthDigit() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFirstName_hiragana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "てすと";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFirstName_katakana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "テスト";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFirstName_kanji() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFirstName_all() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	
//	test getFamilyNameKana
	@Test
	public void test_getFamilyNameKana_null() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFamilyNameKana_emptyCharacter() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFamilyNameKana_space() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFamilyNameKana_fullSpace() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getFamilyNameKana_alphabeticCharacters() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFamilyNameKana_halfWidthDigit() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFamilyNameKana_hiragana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "てすと";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFamilyNameKana_katakana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "テスト";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFamilyNameKana_kanji() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFamilyNameKana_all() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
//	test setFamilyNameKana
	@Test
	public void test_setFamilyNameKana_null() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFamilyNameKana_emptyCharacter() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFamilyNameKana_space() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFamilyNameKana_fullSpace() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFamilyNameKana_alphabeticCharacters() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFamilyNameKana_halfWidthDigit() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFamilyNameKana_hiragana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "てすと";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFamilyNameKana_katakana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "テスト";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFamilyNameKana_kanji() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFamilyNameKana_all() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

//test getFirstNameKana
	@Test
	public void test_getFirstNameKana_null() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFirstNameKana_emptyCharacter() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFirstNameKana_space() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFirstNameKana_fullSpace() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFirstNameKana_alphabeticCharacters() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFirstNameKana_halfWidthDigit() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "123";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFirstNameKana_hiragana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "てすと";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFirstNameKana_katakana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "テスト";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFirstNameKana_kanji() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getFirstNameKana_all() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
//test setFirstNameKana
	@Test
	public void test_setFirstNameKana_null() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = null;

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFirstNameKana_emptyCharacter() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFirstNameKana_space() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFirstNameKana_fullSpace() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFirstNameKana_alphabeticCharacters() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFirstNameKana_halfWidthDigit() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "123";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFirstNameKana_hiragana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "てすと";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFirstNameKana_katakana() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "テスト";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFirstNameKana_kanji() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setFirstNameKana_all() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

//test getSex
	@Test
	public void test_getSex_max() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 2147483647;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getSex_min() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = -2147483648;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getSex_0() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 0;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected,actual);
	}

//test setSex
	@Test
	public void testSetSex() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetEmail() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetEmail() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetLogined() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetLogined() {
		fail("まだ実装されていません");
	}

}
