package edu.bit.board.dtoTest;

import static org.junit.Assert.*;

import java.sql.Timestamp;

import org.junit.Test;

import edu.bit.board.dto.BDto;

public class BDtoTest {

	@Test
	public void testBDto() {
		BDto b = new BDto();
		
		//��ü ��� �Ǿ����� Ȯ�� �ϴ� ���
		
		System.out.println(b); // ������ Ȯ�� 
		
		assertNotNull(b); // ������ Ȯ�� 
		//assertNull(b);
	}
	
	@Test
	public void testBDtoAllArgs() {
		BDto b = new BDto(1, "11", "11", "11", new Timestamp(99876), 1, 1, 1, 1);
		
		//��ü ��� �Ǿ����� Ȯ�� �ϴ� ���
		
		System.out.println(b); // ������ Ȯ�� 
		
		assertNotNull(b); // ������ Ȯ��
		//assertNull(b);
	}

}

