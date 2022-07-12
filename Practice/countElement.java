import java.util.HashMap;
class countElement {
	public static void fun(int[] a, int x, int N)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] avg = new int[N];
		int val, av;
		for (int i = 0; i < N; i++) {
			if (!map.containsKey(a[i])) {
				map.put(a[i], 1);
			}else {
				val = map.get(a[i]);
				val++;
				map.remove(a[i]);
				map.put(a[i], val);
			}
		}
		for (int i = 0; i < N; i++) {
			av = (a[i] + x) / 2;
			if (map.containsKey(av)) {
				val = map.get(av);
				avg[i] = val;
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.print(avg[i] + " ");
		}
	}
	public static void main(String args[])
	{
		int[] a = { 2, 0, 4, 6, 2 };
		int x = 2;
		int N = a.length;
		fun(a, x, N);
	}
}
