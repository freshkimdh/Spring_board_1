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
		
		//��ü ��� �Ǿ����� Ȯ�� �ϴ� ���
	
		System.out.println(a); // ������ Ȯ�� 

		assertNotNull(a); // ������ Ȯ�� 
		//assertNull(b);
	}
	
	@Test
	public void testList() {
		BDao a = new BDao();
		
		//��ü ��� �Ǿ����� Ȯ�� �ϴ� ���
		
			System.out.println(a.list()); // ������ Ȯ�� 
			
			
			ArrayList<BDto> dtos = a.list();
			
			for(BDto bDto : dtos) {
				System.out.println(bDto.getbId());
			}
			
			assertNotNull(a.list()); // ������ Ȯ��
			//assertNull(b);
		
		
	}

}

