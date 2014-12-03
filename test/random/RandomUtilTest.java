package random;

import static org.junit.Assert.*;

import org.junit.Test;

import Tuple.Position;
import random.RandomUtil;

public class RandomUtilTest {

	@Test
	public void testRandomDate() {
		for (int i = 0; i < 100; i++) {
			assertTrue(RandomUtil.randomDate().matches("\\d{2}/\\d{2}/\\d{4}"));
		}
	}

	@Test
	public void testRandomName() {
		for (int i = 0; i < 100; i++) {
			assertTrue(RandomUtil.randomName().matches("[a-zA-z]+"));
		}
	}

	@Test
	public void testRandomPosition() {
		for (int i = 0; i < 100; i++) {
			Tuple.Position p = RandomUtil.randomPosition();
			assertTrue(Position.getDepartments().contains(p.getDepartment()));
			assertTrue(Position.getPositions(p.getDepartment()).contains(p.getPosition()));
		}		
	}
	
	@Test
	public void testRandomSalary() {
		for (int i = 0; i < 100; i++) {
			int salary = RandomUtil.randomSalary();
			assertTrue(salary >= 10000 && salary <= 5000000);
		}
	}

}
