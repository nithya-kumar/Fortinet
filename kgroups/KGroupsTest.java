package kgroups;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class KGroupsTest {

	@Test
	public void test1() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(4);
		int k = 3;
		boolean expected = true;
		assertEquals(expected, KGroups.separate(list, k));
	}
	
	@Test
	public void test2() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(3);
		list.add(8);
		int k = 4;
		boolean expected = true;
		assertEquals(expected, KGroups.separate(list, k));
	}
	
	@Test
	public void test3() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(14);
		list.add(5);
		list.add(6);
		list.add(16);
		list.add(21);
		list.add(3);
		list.add(9);
		int k = 3;
		boolean expected = false;
		assertEquals(expected, KGroups.separate(list, k));
	}

}
