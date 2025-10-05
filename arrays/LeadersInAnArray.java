public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        int n = arr.length, max = Integer.MIN_VALUE;
        List<Integer> leaders = new ArrayList<>();
        
        for (int i=n-1; i>=0; i--) {
            max = Math.max(max, arr[i]);
            if (leaders.size() > 0) {
                if (leaders.get(leaders.size() - 1) != max) {
                    leaders.add(max);
                }
            } else {
                leaders.add(max);
            }
        }
        
        Collections.reverse(leaders);
        System.out.print(leaders);
    }
}