package nsh.codility;

public class TheDoge2021E implements TheDoge2021Interface {
	public boolean solution(int[] P, int[] T, int[] A, int[] B) {
		int[] R = new int[P.length];
		int r = 0;
		int[] Link1 = new int[A.length];
		int[] Link2 = new int[A.length];
		int link = 0;

		for (int i = 0; i < A.length; i++) {
			int a = A[i];
			int b = B[i];

			int ra = R[a];
			int rb = R[b];

			if (ra == 0) {
				if (rb == 0) {
					r++;
					R[a] = r;
					R[b] = r;
				} else {
					R[a] = rb;
				}
			} else {
				if (rb == 0) {
					R[b] = ra;
				} else {
					if (ra != rb) {
						link++;
						Link1[link] = ra;
						Link2[link] = rb;
					}
				}
			}
		}

		int pt[] = new int[r + 1];
		int mm[] = new int[r + 1];

		for (int i = 0; i < P.length; i++) {
			int p = P[i];
			int t = T[i];
			int r1 = R[i];

			if (p == t)
				continue;
			else if (r1 == 0)
				return false; // not belongs to any ground
			else if (p == 1)
				pt[r1]++;
			else
				pt[r1]--;
		}
		for (int i = 1; i <= link; i++) {
			int a = Link1[i];
			int b = Link2[i];
			while (mm[a] != 0)
				a = mm[a];
			while (mm[b] != 0)
				b = mm[b];
			if (a == b)
				continue;
			int xa = a < b ? a : b;
			int xb = a < b ? b : a;

			pt[xa] += pt[xb];
			mm[xb] = xa;
		}
		for (int i = 1; i <= r; i++) {
			if (mm[i] > 0)
				continue;
			if (pt[i] != 0)
				return false;
		}
		return true;
	}
}
