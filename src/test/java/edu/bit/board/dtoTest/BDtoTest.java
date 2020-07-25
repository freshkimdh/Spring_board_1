package edu.bit.board.dtoTest;

import static org.junit.Assert.*;

import java.sql.Timestamp;

import org.junit.Test;

import edu.bit.board.dto.BDto;

public class BDtoTest {

	@Test
	public void testBDto() {
		BDto b = new BDto();
		
		//객체 사용 되었는지 확인 하는 방법
		
		System.out.println(b); // 간단한 확인 
		
		assertNotNull(b); // 유식한 확인 
		//assertNull(b);
	}
	
	@Test
	public void testBDtoAllArgs() {
		BDto b = new BDto(1, "11", "11", "11", new Timestamp(99876), 1, 1, 1, 1);
		
		//객체 사용 되었는지 확인 하는 방법
		
		System.out.println(b); // 간단한 확인 
		
		assertNotNull(b); // 유식한 확인
		//assertNull(b);
	}

}

