package com.internousdev.jaguar.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.jaguar.dto.ProductInfoDTO;

public class ProductInfoDTOTest {

	@Test
	public void testGetId() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetId() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetProductId() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetProductId() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetProductName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetProductName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetProductNameKana() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetProductNameKana() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetProductDescription() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetProductDescription() {
		fail("まだ実装されていません");
	}

	//test getCategoryId()
	@Test
	public void testGetCategoryId_max() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;
		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId_min() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;
		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId_0() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;
		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	//test setCategotyId()
	@Test
	public void testSetCategoryId_max() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;
		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	public void testSetCategoryId_min() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;
		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}


	public void testSetCategoryId_0() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;
		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}


	//test getPrice()
	@Test
	public void testGetPrice_max() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;
		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice_min() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;
		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice_0() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;
		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	//test setPrice()
	@Test
	public void testSetPrice_max() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;
		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice_min() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;
		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice_0() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;
		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	//test getImageFilePath
	@Test
	public void testGetImageFilePath_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = null;

		  dto.setImageFilePath(expected);
		  String actual = dto.getImageFilePath();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "";

		  dto.setImageFilePath(expected);
		  String actual = dto.getImageFilePath();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = " ";

		  dto.setImageFilePath(expected);
		  String actual = dto.getImageFilePath();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "　";

		  dto.setImageFilePath(expected);
		  String actual = dto.getImageFilePath();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "abc";

		  dto.setImageFilePath(expected);
		  String actual = dto.getImageFilePath();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "123";

		  dto.setImageFilePath(expected);
		  String actual = dto.getImageFilePath();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "てすと";

		  dto.setImageFilePath(expected);
		  String actual = dto.getImageFilePath();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "テスト";

		  dto.setImageFilePath(expected);
		  String actual = dto.getImageFilePath();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "漢字";

		  dto.setImageFilePath(expected);
		  String actual = dto.getImageFilePath();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "漢字 テスト　てすと123abc";

		  dto.setImageFilePath(expected);
		  String actual = dto.getImageFilePath();
		  assertEquals(expected, actual);
	}

	//test setImageFilePath()
	@Test
	public void testSetImageFilePath_null() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = null;

		  dto.setImageFilePath(expected);
		  String actual = dto.getImageFilePath();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath_emptyCharacter() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "";

		  dto.setImageFilePath(expected);
		  String actual = dto.getImageFilePath();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath_space() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = " ";

		  dto.setImageFilePath(expected);
		  String actual = dto.getImageFilePath();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath_fullSpace() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "　";

		  dto.setImageFilePath(expected);
		  String actual = dto.getImageFilePath();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath_alphabeticCharacters() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "abc";

		  dto.setImageFilePath(expected);
		  String actual = dto.getImageFilePath();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath_halfWidthDigit() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "123";

		  dto.setImageFilePath(expected);
		  String actual = dto.getImageFilePath();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath_hiragana() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "てすと";

		  dto.setImageFilePath(expected);
		  String actual = dto.getImageFilePath();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath_katakana() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "テスト";

		  dto.setImageFilePath(expected);
		  String actual = dto.getImageFilePath();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath_kanji() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "漢字";

		  dto.setImageFilePath(expected);
		  String actual = dto.getImageFilePath();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath_all() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "漢字 テスト　てすと123abc";

		  dto.setImageFilePath(expected);
		  String actual = dto.getImageFilePath();
		  assertEquals(expected, actual);
	}

	//test getImageFileName()
	@Test
	public void testGetImageFileName_null() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = null;

		  dto.setImageFileName(expected);
		  String actual = dto.getImageFileName();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName_emptyCharacter() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "";

		  dto.setImageFileName(expected);
		  String actual = dto.getImageFileName();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName_space() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = " ";

		  dto.setImageFileName(expected);
		  String actual = dto.getImageFileName();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName_fullSpace() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "　";

		  dto.setImageFileName(expected);
		  String actual = dto.getImageFileName();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName_alphabeticCharacters() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "abc";

		  dto.setImageFileName(expected);
		  String actual = dto.getImageFileName();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName_halfWidthDigit() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "123";

		  dto.setImageFileName(expected);
		  String actual = dto.getImageFileName();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName_hiragana() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "てすと";

		  dto.setImageFileName(expected);
		  String actual = dto.getImageFileName();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName_katakana() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "テスト";

		  dto.setImageFileName(expected);
		  String actual = dto.getImageFileName();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName_kanji() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "漢字";

		  dto.setImageFileName(expected);
		  String actual = dto.getImageFileName();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName_all() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "漢字 テスト　てすと123abc";

		  dto.setImageFileName(expected);
		  String actual = dto.getImageFileName();
		  assertEquals(expected, actual);
	}

	//test setImagiFileName()
	@Test
	public void testSetImageFileName_null() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = null;

		  dto.setImageFileName(expected);
		  String actual = dto.getImageFileName();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName_emptyCharacter() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "";

		  dto.setImageFileName(expected);
		  String actual = dto.getImageFileName();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName_space() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = " ";

		  dto.setImageFileName(expected);
		  String actual = dto.getImageFileName();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName_fullSpace() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "　";

		  dto.setImageFileName(expected);
		  String actual = dto.getImageFileName();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName_alphabeticCharacters() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "abc";

		  dto.setImageFileName(expected);
		  String actual = dto.getImageFileName();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName_halfWidthDigit() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "123";

		  dto.setImageFileName(expected);
		  String actual = dto.getImageFileName();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName_hiragana() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "てすと";

		  dto.setImageFileName(expected);
		  String actual = dto.getImageFileName();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName_katakana() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "テスト";

		  dto.setImageFileName(expected);
		  String actual = dto.getImageFileName();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName_kanji() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "漢字";

		  dto.setImageFileName(expected);
		  String actual = dto.getImageFileName();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName_all() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "漢字 テスト　てすと123abc";

		  dto.setImageFileName(expected);
		  String actual = dto.getImageFileName();
		  assertEquals(expected, actual);
	}

	//test getReleaseDate
	@Test
	public void testGetReleaseDate() {
		ProductInfoDTO dto = new ProductInfoDTO();
		Date expected = null;

		dto.setReleaseDate(expected);
		Date actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate_date() {
		ProductInfoDTO dto = new ProductInfoDTO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected;
		try {
			expected = sdf.parse("20180420 12:00:00");
			dto.setReleaseDate(expected);
			assertEquals(expected, dto.getReleaseDate());
		}catch(ParseException e){
			fail();
		}
	}

	//test setReleaseDate
	@Test
	public void testSetReleaseDate_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		Date expected = null;

		dto.setReleaseDate(expected);
		Date actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetReleaseDate_date() {
		ProductInfoDTO dto = new ProductInfoDTO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected;
		try {
			expected = sdf.parse("20180420 12:00:00");
			dto.setReleaseDate(expected);
			assertEquals(expected, dto.getReleaseDate());
		}catch(ParseException e){
			fail();
		}
	}

	//test getReleaseCompany
	@Test
	public void testGetReleaseCompany_null() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = null;

		  dto.setReleaseCompany(expected);
		  String actual = dto.getReleaseCompany();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany_emptyCharacter() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "";

		  dto.setReleaseCompany(expected);
		  String actual = dto.getReleaseCompany();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany_space() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = " ";

		  dto.setReleaseCompany(expected);
		  String actual = dto.getReleaseCompany();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany_fullSpace() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "　";

		  dto.setReleaseCompany(expected);
		  String actual = dto.getReleaseCompany();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany_alphabeticCharacters() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "abc";

		  dto.setReleaseCompany(expected);
		  String actual = dto.getReleaseCompany();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany_halfWidthDigit() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "123";

		  dto.setReleaseCompany(expected);
		  String actual = dto.getReleaseCompany();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany_hiragana() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "てすと";

		  dto.setReleaseCompany(expected);
		  String actual = dto.getReleaseCompany();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany_katakana() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "テスト";

		  dto.setReleaseCompany(expected);
		  String actual = dto.getReleaseCompany();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany_kanji() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "漢字";

		  dto.setReleaseCompany(expected);
		  String actual = dto.getReleaseCompany();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany_all() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "漢字 テスト　てすと123abc";

		  dto.setReleaseCompany(expected);
		  String actual = dto.getReleaseCompany();
		  assertEquals(expected, actual);
	}

	//test setReleaseCompany
	@Test
	public void testSetReleaseCompany_null() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = null;

		  dto.setReleaseCompany(expected);
		  String actual = dto.getReleaseCompany();
		  assertEquals(expected, actual);
		}

	@Test
	public void testSetReleaseCompany_emptyCharacter() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "";

		  dto.setReleaseCompany(expected);
		  String actual = dto.getReleaseCompany();
		  assertEquals(expected, actual);
		}

	@Test
	public void testSetReleaseCompany_space() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = " ";

		  dto.setReleaseCompany(expected);
		  String actual = dto.getReleaseCompany();
		  assertEquals(expected, actual);
		}

	@Test
	public void testSetReleaseCompany_fillSpace() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "　";

		  dto.setReleaseCompany(expected);
		  String actual = dto.getReleaseCompany();
		  assertEquals(expected, actual);
		}

	@Test
	public void testSetReleaseCompany_alphabeticCharacters() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "abc";

		  dto.setReleaseCompany(expected);
		  String actual = dto.getReleaseCompany();
		  assertEquals(expected, actual);
		}

	@Test
	public void testSetReleaseCompany_halfWidthDigit() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "123";

		  dto.setReleaseCompany(expected);
		  String actual = dto.getReleaseCompany();
		  assertEquals(expected, actual);
		}

	@Test
	public void testSetReleaseCompany_hiragana() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "てすと";

		  dto.setReleaseCompany(expected);
		  String actual = dto.getReleaseCompany();
		  assertEquals(expected, actual);
		}

	@Test
	public void testSetReleaseCompany_katakana() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "テスト";

		  dto.setReleaseCompany(expected);
		  String actual = dto.getReleaseCompany();
		  assertEquals(expected, actual);
		}

	@Test
	public void testSetReleaseCompany_kanji() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "漢字";

		  dto.setReleaseCompany(expected);
		  String actual = dto.getReleaseCompany();
		  assertEquals(expected, actual);
		}

	@Test
	public void testSetReleaseCompany_all() {
		  ProductInfoDTO dto = new ProductInfoDTO();
		  String expected = "漢字 テスト　てすと123abc";

		  dto.setReleaseCompany(expected);
		  String actual = dto.getReleaseCompany();
		  assertEquals(expected, actual);
		}

}
