package com.internousdev.jaguar.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.jaguar.dto.MCategoryDTO;

public class MCategoryDTOTest {

	@Test
	public void test_getId_max() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getId_min() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = -2147483648;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getId_0() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setId_max() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setId_min() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = -2147483648;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setId_0() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getCategoryId_max() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected =214783647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getCategoryId_min() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = -214783647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getCategoryId_0() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_set_CategoryId_max() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_set_CategoryId_min() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = -2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_set_CategoryId_0() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getCategoryName_null() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = null;

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getCategoryName_emptyCharacter() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getCategoryName_space() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = " ";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
		}

	@Test
	public void test_getCategoryName_fullSpace() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "　";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getCategoryName_alphabeticCharacters() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getCategoryName_halfWidthDigit() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "123";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getCategoryName_hiragana() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "てすと";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getCategoryName_katakana() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "テスト";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getCategoryName_kanji() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "漢字";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getCategoryName_all() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "漢字 テスト てすと123abc";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setCategoryName_null() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = null;

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setCategoryName_emptyCharacter() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setCategoryName_space() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = " ";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
		}

	@Test
	public void test_setCategoryName_fullSpace() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "　";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setCategoryName_alphabeticCharacters() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setCategoryName_halfWidthDigit() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "123";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setCategoryName_hiragana() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "てすと";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setCategoryName_katakana() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "テスト";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setCategoryName_kanji() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "漢字";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setCategoryName_all() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "漢字 テスト てすと123abc";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getCategoryDescription_null() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = null;

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getCategoryDescription_emptyCharacter() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getCategoryDescription_space() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = " ";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getCategoryDescription_fullSpace() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "　";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getCategoryDescription_alphabeticCharacters() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getCategoryDescription_halfWidthDigit() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "123";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getCategoryDescription_hiragana() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "てすと";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getCategoryDescription_katakana() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "テスト";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getCategoryDescription_kanji() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "漢字";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getCategoryDescription_all() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "漢字 テスト てすと123abc";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setCategoryDescription_null() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = null;

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setCategoryDescription_emptyCharacter() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setCategoryDescription_space() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = " ";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setCategoryDescription_fullSpace() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "　";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setCategoryDescription_alphabeticCharacters() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setCategoryDescription_halfWidthDigit() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "123";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setCategoryDescription_hiragana() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "てすと";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setCategoryDescription_katakana() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "テスト";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setCategoryDescription_kanji() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "漢字";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}


}
