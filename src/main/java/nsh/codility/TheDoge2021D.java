package nsh.codility;

import java.util.Arrays;

public class TheDoge2021D implements TheDoge2021Interface {
	public boolean solution(int[] P, int[] T, int[] A, int[] B) {
		int[] R = new int[P.length];
		Arrays.fill(R, 0);
		int r = 0;

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
					for (int j = 0; j < P.length; j++) {
						if (j == a)
							continue;
						if (R[j] == rb)
							R[j] = ra;
					}
				}
			}
		}

		boolean[] d = new boolean[P.length];
		int D = 0;
		for (int i = 0; i < P.length; i++) {
			int p = P[i];
			int t = T[i];

			if (p == t) {
				d[i] = true;
				D++;
			} else if (d[i]) {
				continue;
			} else {
				int g = R[i];
				if (g == 0)
					return false;
				boolean f = false;
				for (int j = 0; j < P.length; j++) {
					if (j == i)
						continue;
					int r1 = R[j];
					if (g == r1) {
						if (P[j] == t && T[j] == p && d[j] == false) {
							d[j] = true;
							D++;
							d[i] = true;
							D++;
							f = true;
							break;
						}
					}
				}
				if (!f)
					return false;
			}
		}
		return (D == d.length);
	}
}
