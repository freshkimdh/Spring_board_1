package edu.bit.board.daoTest;



import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;

import edu.bit.board.dao.BDao;
import edu.bit.board.dto.BDto;

public class BDaoTest {

	@Test
	public void testBDao() {
		BDao a = new BDao();
		
		//객체 사용 되었는지 확인 하는 방법
	
		System.out.println(a); // 간단한 확인 

		assertNotNull(a); // 유식한 확인 
		//assertNull(b);
	}
	
	@Test
	public void testList() {
		BDao a = new BDao();
		
		//객체 사용 되었는지 확인 하는 방법
		
			System.out.println(a.list()); // 간단한 확인 
			
			
			ArrayList<BDto> dtos = a.list();
			
			for(BDto bDto : dtos) {
				System.out.println(bDto.getbId());
			}
			
			assertNotNull(a.list()); // 유식한 확인
			//assertNull(b);
		
		
	}

}

