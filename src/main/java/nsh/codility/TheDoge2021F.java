package nsh.codility;

import java.util.ArrayList;
import java.util.Stack;

public class TheDoge2021F implements TheDoge2021Interface {
	public boolean solution(int[] P, int[] T, int[] A, int[] B) {
		ArrayList<ArrayList<Integer>> connect = new ArrayList<ArrayList<Integer>>(P.length);
		for (int i = 0; i < P.length; i++)
			connect.add(new ArrayList<Integer>());

		for (int i = 0; i < A.length; i++) {
			connect.get(A[i]).add(B[i]);
			connect.get(B[i]).add(A[i]);
		}
		boolean[] visited = new boolean[P.length];

		for (int i = 0; i < P.length; i++) {
			if (visited[i])
				continue;
			visited[i] = true;
			Stack<Integer> q = new Stack<Integer>();
			q.push(i);
			int s = 0;
			while (!q.isEmpty()) {
				int v = q.pop();
				s += P[v] - T[v];
				for (int j : connect.get(v))
					if (!visited[j]) {
						visited[j] = true;
						q.push(j);
					}
			}
			if (s != 0)
				return false;
		}
		return true;
	}
}
