package nsh.codility;

import java.util.Arrays;

public class TheDoge2021C implements TheDoge2021Interface {
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

		int[] pt = new int[r + 1];
		int[] tp = new int[r + 1];
		Arrays.fill(pt, 0);
		Arrays.fill(tp, 0);

		for (int i = 0; i < P.length; i++) {
			int p = P[i];
			int t = T[i];
			int r1 = R[i];

			if (p == t)
				continue;
			else if (r1 == 0)
				return false;
			else if (p == 1)
				pt[r1]++;
			else
				tp[r1]++;
		}
		for (int i = 1; i <= r; i++) {
			if (pt[i] != tp[i])
				return false;
		}
		return true;

	}
}
