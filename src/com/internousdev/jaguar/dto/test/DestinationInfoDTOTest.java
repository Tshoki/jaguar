package com.internousdev.jaguar.dto.test;

import static org.junit.Assert.*;
import com.internousdev.jaguar.dto.DestinationInfoDTO;
import org.junit.Test;

public class DestinationInfoDTOTest {
	DestinationInfoDTO dto=new DestinationInfoDTO();

	//getId
	@Test
	public void test_getId_max() {

		int expected=1234567891;

		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getId_min() {
		int expected=-1234567891;

		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getId_0() {
		int expected=0;

		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	//setId
	@Test
	public void test_setId_max() {
		int expected=1234567891;

		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}
	@Test
	public void test_setId_min() {
		int expected=-1234567891;

		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}
	@Test
	public void test_setId_0() {
		int expected=0;

		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	//getUserId
	@Test
	public void test_getUserId_null() {
		String expected=null;

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getUserId_emptyCharacter() {
		String expected="";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getUserId_space() {
		String expected=" ";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getUserId_fullSpace() {
		String expected="　";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	public void test_getUserId_alphabetCharacters() {
		String expected="abx";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getUserId_halfWidthDigit() {
		String expected="123";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getUserId_hiragana() {
		String expected="あいう";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getUserId_katakana() {
		String expected="アイウ";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}
	public void test_getUserId_kanji() {
		String expected="佐藤";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getUserId_all() {
		String expected="佐々木 シュウヘイ　しょうき123abh";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	//setUserId
	@Test
	public void test_setUserId_null() {
		String expected=null;

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setUserId_emptyCharacter() {
		String expected="";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setUserId_space() {
		String expected=" ";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setUserId_fullSpace() {
		String expected="　";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	public void test_setUserId_alphabetCharacters() {
		String expected="abx";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setUserId_halfWidthDigit() {
		String expected="123";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setUserId_hiragana() {
		String expected="あいう";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setUserId_katakana() {
		String expected="アイウ";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}
	public void test_setUserId_kanji() {
		String expected="佐藤";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setUserId_all() {
		String expected="佐々木 シュウヘイ　しょうき123abh";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	//getFamilyName
	@Test
	public void test_getFamilyName_null() {
		String expected=null;

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFamilyName_emptyCharacter() {
		String expected="";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFamilyName_space() {
		String expected=" ";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFamilyName_fullSpace() {
		String expected="　";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	public void test_getFamilyName_alphabetCharacters() {
		String expected="abx";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFamilyName_halfWidthDigit() {
		String expected="123";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFamilyName_hiragana() {
		String expected="あいう";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFamilyName_katakana() {
		String expected="アイウ";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFamilyName_kanji() {
		String expected="佐藤";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFamilyName_all() {
		String expected="佐々木 シュウヘイ　しょうき123abh";

		dto.setFamilyName(expected);
		String actual=dto.getFamilyName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	//set FamilyName
	@Test
	public void test_setFamilyName_null() {
		String expected=null;

		dto.setFamilyName(expected);
		String actual=dto.getFirstName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFamilyName_emptyCharacter() {
		String expected="";

		dto.setFamilyName(expected);
		String actual=dto.getFirstName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFamilyName_space() {
		String expected=" ";

		dto.setFamilyName(expected);
		String actual=dto.getFirstName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFamilyName_fullSpace() {
		String expected="　";

		dto.setFamilyName(expected);
		String actual=dto.getFirstName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFamilyName_alphabetCharacters() {
		String expected="abx";

		dto.setFamilyName(expected);
		String actual=dto.getFirstName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFamilyName_halfWidthDigit() {
		String expected="123";

		dto.setFamilyName(expected);
		String actual=dto.getFirstName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFamilyName_hiragana() {
		String expected="あいう";

		dto.setFamilyName(expected);
		String actual=dto.getFirstName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFamilyName_katakana() {
		String expected="アイウ";

		dto.setFamilyName(expected);
		String actual=dto.getFirstName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFamilyName_kanji() {
		String expected="佐藤";

		dto.setFamilyName(expected);
		String actual=dto.getFirstName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFamilyName_all() {
		String expected="佐々木 シュウヘイ　しょうき123abh";

		dto.setFamilyName(expected);
		String actual=dto.getFirstName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	//getFirstName
	@Test
	public void test_getFirstName_null() {
		String expected=null;

		dto.setFirstName(expected);
		String actual=dto.getFirstName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFirstName_emptyCharacter() {
		String expected="";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFirstName_space() {
		String expected=" ";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFirstName_fullSpace() {
		String expected="　";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFirstName_alphabetCharacters() {
		String expected="abx";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFirstName_halfWidthDigit() {
		String expected="123";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFirstName_hiragana() {
		String expected="あいう";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFirstName_katakana() {
		String expected="アイウ";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFirstName_kanji() {
		String expected="佐藤";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFirstName_all() {
		String expected="佐々木 シュウヘイ　しょうき123abh";

		dto.setFirstName(expected);
		String actual=dto.getFirstName();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	//setFamilyNameKana
	@Test
	public void test_setFamilyNameKana_null() {
		String expected=null;

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFamilyNameKana_emptyCharacter() {
		String expected="";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFamilyNameKana_space() {
		String expected=" ";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFamilyNameKana_fullSpace() {
		String expected="　";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFamilyNameKana_alphabetCharacters() {
		String expected="abx";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFamilyNameKana_halfWidthDigit() {
		String expected="123";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFamilyNameKana_hiragana() {
		String expected="あいう";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFamilyNameKana_katakana() {
		String expected="アイウ";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFamilyNameKana_kanji() {
		String expected="佐藤";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFamilyNameKana_all() {
		String expected="佐々木 シュウヘイ　しょうき123abh";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	//getFamilyNameKana
	@Test
	public void test_getFamilyNameKana_null() {
		String expected=null;

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFamilyNameKana_emptyCharacter() {
		String expected="";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFamilyNameKana_space() {
		String expected=" ";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFamilyNameKana_fullSpace() {
		String expected="　";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFamilyNameKana_alphabetCharacters() {
		String expected="abx";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFamilyNameKana_halfWidthDigit() {
		String expected="123";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFamilyNameKana_hiragana() {
		String expected="あいう";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFamilyNameKana_katakana() {
		String expected="アイウ";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFamilyNameKana_kanji() {
		String expected="佐藤";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFamilyNameKana_all() {
		String expected="佐々木 シュウヘイ　しょうき123abh";

		dto.setFamilyNameKana(expected);
		String actual=dto.getFamilyNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	//set FirstNameKana
	@Test
	public void test_setFirstNameKana_null() {
		String expected=null;

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFirstNameKana_emptyCharacter() {
		String expected="";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFirstNameKana_space() {
		String expected=" ";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFirstNameKana_fullSpace() {
		String expected="　";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFirstNameKana_alphabetCharacters() {
		String expected="abx";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFirstNameKana_halfWidthDigit() {
		String expected="123";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFirstNameKana_hiragana() {
		String expected="あいう";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFirstNameKana_katakana() {
		String expected="アイウ";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFirstNameKana_kanji() {
		String expected="佐藤";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setFirstNameKana_all() {
		String expected="佐々木 シュウヘイ　しょうき123abh";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}
	//get FirstName
	@Test
	public void test_getFirstNameKana_null() {
		String expected=null;

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFirstNameKana_emptyCharacter() {
		String expected="";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFirstNameKana_space() {
		String expected=" ";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFirstNameKana_fullSpace() {
		String expected="　";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void FirstNameKana_alphabetCharacters() {
		String expected="abx";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFirstNameKana_halfWidthDigit() {
		String expected="123";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFirstNameKana_hiragana() {
		String expected="あいう";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFirstNameKana_katakana() {
		String expected="アイウ";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFirstNameKana_kanji() {
		String expected="佐藤";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getFirstNameKana_all() {
		String expected="佐々木 シュウヘイ　しょうき123abh";

		dto.setFirstNameKana(expected);
		String actual=dto.getFirstNameKana();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	//set Email
	@Test
	public void test_setEmail_null() {
		String expected=null;

		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setEmail_emptyCharacter() {
		String expected="";

		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setEmail_space() {
		String expected=" ";

		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setEmail_fullSpace() {
		String expected="　";

		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setEmail_alphabetCharacters() {
		String expected="abx";

		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setEmail_halfWidthDigit() {
		String expected="123";

		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setEmail_hiragana() {
		String expected="あいう";

		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setEmail_katakana() {
		String expected="アイウ";

		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}
	public void test_setEmail_kanji() {
		String expected="佐藤";

		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setEmail_all() {
		String expected="佐々木 シュウヘイ　しょうき123abh";

		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}
	//get Email
	@Test
	public void test_getEmail_null() {
		String expected=null;

		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getEmail_emptyCharacter() {
		String expected="";

		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getEmail_space() {
		String expected=" ";

		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getEmail_fullSpace() {
		String expected="　";

		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	public void test_getEmail_alphabetCharacters() {
		String expected="abx";

		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getEmail_halfWidthDigit() {
		String expected="123";

		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getEmail_hiragana() {
		String expected="あいう";

		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getEmail_katakana() {
		String expected="アイウ";

		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}
	public void test_getEmail_kanji() {
		String expected="佐藤";

		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getEmail_all() {
		String expected="佐々木 シュウヘイ　しょうき123abh";

		dto.setEmail(expected);
		String actual=dto.getEmail();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	//get telNum
	@Test
	public void test_getTelNumber_null() {
		String expected=null;

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getTelNumber_emptyCharacter() {
		String expected="";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getTelNumber_space() {
		String expected=" ";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getTelNumber_fullSpace() {
		String expected="　";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	public void test_getTelNumber_alphabetCharacters() {
		String expected="abx";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getTelNumber_halfWidthDigit() {
		String expected="123";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getTelNumber_hiragana() {
		String expected="あいう";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getTelNumber_katakana() {
		String expected="アイウ";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}
	public void test_getTelNumber_kanji() {
		String expected="佐藤";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getTelNumber_all() {
		String expected="佐々木 シュウヘイ　しょうき123abh";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}
	//set telNum
	@Test
	public void test_setTelNumber_null() {
		String expected=null;

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setTelNumber_emptyCharacter() {
		String expected="";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setTelNumber_space() {
		String expected=" ";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setTelNumber_fullSpace() {
		String expected="　";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	public void test_setTelNumber_alphabetCharacters() {
		String expected="abx";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setTelNumber_halfWidthDigit() {
		String expected="123";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setTelNumber_hiragana() {
		String expected="あいう";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setTelNumber_katakana() {
		String expected="アイウ";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}
	public void test_setTelNumber_kanji() {
		String expected="佐藤";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setTelNumber_all() {
		String expected="佐々木 シュウヘイ　しょうき123abh";

		dto.setTelNumber(expected);
		String actual=dto.getTelNumber();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	//get userAddress
	@Test
	public void test_getUserAddress_null() {
		String expected=null;

		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getUserAddress_emptyCharacter() {
		String expected="";

		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getUserAddress_space() {
		String expected=" ";

		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getUserAddress_fullSpace() {
		String expected="　";

		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	public void test_getUserAddress_alphabetCharacters() {
		String expected="abx";

		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getUserAddress_halfWidthDigit() {
		String expected="123";

		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getUserAddress_hiragana() {
		String expected="あいう";

		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getUserAddress_katakana() {
		String expected="アイウ";

		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}
	public void test_getUserAddress_kanji() {
		String expected="佐藤";

		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_getUserAddress_all() {
		String expected="佐々木 シュウヘイ　しょうき123abh";

		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	//set userAddress
	@Test
	public void test_setUserAddress_null() {
		String expected=null;

		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setUserAddress_emptyCharacter() {
		String expected="";

		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setUserAddress_space() {
		String expected=" ";

		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setUserAddress_fullSpace() {
		String expected="　";

		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	public void test_setUserAddress_alphabetCharacters() {
		String expected="abx";

		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setUserAddress_halfWidthDigit() {
		String expected="123";

		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setUserAddress_hiragana() {
		String expected="あいう";

		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setUserAddress_katakana() {
		String expected="アイウ";

		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}
	public void test_setUserAddress_kanji() {
		String expected="佐藤";

		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}

	@Test
	public void test_setUserAddress_all() {
		String expected="佐々木 シュウヘイ　しょうき123abh";

		dto.setUserAddress(expected);
		String actual=dto.getUserAddress();
		assertEquals(expected, actual);
		fail("まだ実装されていません");
	}
}
