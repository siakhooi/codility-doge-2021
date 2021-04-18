package nsh.codility;

public class TheDoge2021A implements TheDoge2021Interface {
	public boolean solution(int[] P, int[] T, int[] A, int[] B) {
		int[] R = new int[P.length];
		int r = 0;
		int[] Rs = new int[P.length + 1];
		Rs[r] = 0;

		for (int i = 0; i < A.length; i++) {
			int a = A[i];
			int b = B[i];

			int ra = R[a];
			int rb = R[b];

			if (ra == 0) {
				if (rb == 0) {
					r++;
					Rs[r] = 0;
					R[a] = r;
					R[b] = r;
				} else {
					R[a] = rb;
				}
			} else {
				if (rb == 0) {
					R[b] = ra;
				} else {
					// ra, and rb has value
					int rsa = ra;
					if (Rs[ra] != 0)
						rsa = Rs[ra];
					int rsb = rb;
					if (Rs[rb] != 0)
						rsb = Rs[rb];
					for (int j = 1; j <= r; j++) {
						if (Rs[j] == rsb)
							Rs[j] = rsa;
						else if (j == rsb)
							Rs[j] = rsa;
					}
				}
			}
		}

		int pt[] = new int[r + 1];
		int tp[] = new int[r + 1];

		for (int i = 0; i < P.length; i++) {
			int p = P[i];
			int t = T[i];
			int r1 = R[i];
			if (Rs[r1] != 0)
				r1 = Rs[r1];

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
