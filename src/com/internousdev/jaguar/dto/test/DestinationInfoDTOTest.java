package com.internousdev.jaguar.dto.test;

import static org.junit.Assert.*;
import com.internousdev.jaguar.dto.DestinationInfoDTO;
import org.junit.Test;

public class DestinationInfoDTOTest {

	@Test
	public void test_GetId_max() {
		DestinationInfoDTO dto=new DestinationInfoDTO();
		int expected=2147483647;
		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetId() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetUserId() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetUserId() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetFamilyName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetFamilyName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetFirstName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetFirstName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetFamilyNameKana() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetFamilyNameKana() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetFirstNameKana() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetFirstNameKana() {
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
	public void testGetTelNumber() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetTelNumber() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetUserAddress() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetUserAddress() {
		fail("まだ実装されていません");
	}

}
