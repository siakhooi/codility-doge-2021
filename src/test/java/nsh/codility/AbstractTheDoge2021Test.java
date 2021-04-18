package nsh.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public abstract class AbstractTheDoge2021Test {
	abstract TheDoge2021Interface getObject();

	@Test
	void test1() {
		int[] P = new int[] { 1, 1, 2 };
		int[] T = new int[] { 2, 1, 1 };
		int[] A = new int[] { 0, 2 };
		int[] B = new int[] { 1, 1 };

		boolean a = true;

		assertEquals(a, getObject().solution(P, T, A, B));

	}

	@Test
	void test2() {
		int[] P = new int[] { 2, 2, 1, 1, 1 };
		int[] T = new int[] { 1, 1, 1, 2, 2 };
		int[] A = new int[] { 0, 1, 2, 3 };
		int[] B = new int[] { 1, 2, 0, 4 };

		boolean a = false;

		assertEquals(a, getObject().solution(P, T, A, B));

	}

	@Test
	void test3() {
		int[] P = new int[] { 1, 1, 2, 2, 1, 1, 2, 2 };
		int[] T = new int[] { 1, 1, 1, 1, 2, 2, 2, 2 };
		int[] A = new int[] { 0, 2, 4, 6 };
		int[] B = new int[] { 1, 3, 5, 7 };

		boolean a = false;

		assertEquals(a, getObject().solution(P, T, A, B));

	}

	@Test
	void test4() {
		int[] P = new int[] { 2, 2, 2, 2, 1, 1, 1, 1 };
		int[] T = new int[] { 1, 1, 1, 1, 2, 2, 2, 2 };
		int[] A = new int[] { 0, 1, 2, 3, 4, 5, 6 };
		int[] B = new int[] { 1, 2, 3, 4, 5, 6, 7 };

		boolean a = true;

		assertEquals(a, getObject().solution(P, T, A, B));

	}

	@Test
	void myTest1() {
		int[] P = new int[] { 2, 2, 2, 2, 1, 1, 1, 1 };
		int[] T = new int[] { 1, 1, 1, 1, 2, 2, 2, 2 };
		int[] A = new int[] { 0, 2, 4, 6, 1, 4, 2 };
		int[] B = new int[] { 1, 3, 5, 7, 2, 6, 6 };

		boolean a = true;

		assertEquals(a, getObject().solution(P, T, A, B));

	}

	@Test
	void myTest2() {
		int[] P = new int[] { 2, 2, 2, 2, 1, 1, 1, 1 };
		int[] T = new int[] { 1, 1, 1, 1, 2, 2, 2, 2 };
		int[] A = new int[] { 0, 2, 4, 6, 1, 4, 2 };
		int[] B = new int[] { 1, 3, 5, 7, 2, 6, 7 };

		boolean a = true;

		assertEquals(a, getObject().solution(P, T, A, B));

	}

	@Test
	void myTest3() {
		int[] P = new int[] { 2, 2, 2, 2, 1, 1, 1, 1 };
		int[] T = new int[] { 1, 1, 1, 1, 2, 2, 2, 2 };
		int[] A = new int[] { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4,
				4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7 };
		int[] B = new int[] { 1, 2, 3, 4, 5, 6, 7, 0, 2, 3, 4, 5, 6, 7, 1, 0, 3, 4, 5, 6, 7, 1, 2, 0, 4, 5, 6, 7, 1, 2,
				3, 0, 5, 6, 7, 1, 2, 3, 4, 0, 6, 7, 1, 2, 3, 4, 5, 0, 7, 1, 2, 3, 4, 5, 6, 0 };

		boolean a = true;

		assertEquals(a, getObject().solution(P, T, A, B));

	}

}
