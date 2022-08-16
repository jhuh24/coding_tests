import java.util.*;
class KthLargest {
    List<Integer> list;
    int index;
    public KthLargest(int k, int[] nums) {
        ArrayList<Integer> transfer = new ArrayList<Integer>();
        for (int i : nums) {
            transfer.add(i);
        }
        Collections.sort(transfer, Collections.reverseOrder());
        if (transfer.size() >= k) {
            this.list = transfer.subList(0, k);
        }
        else {
            this.list = transfer;
        }
        this.index = k;
    }

    public int add(int val) {
        if (this.list.size() >= this.index) {
            if (val > this.list.get(this.index - 1)) {
                this.list.remove(this.index - 1);
                this.list.add(val);
                Collections.sort(this.list, Collections.reverseOrder());
            }
        }
        else {
            this.list.add(val);
            Collections.sort(this.list, Collections.reverseOrder());
        }
        return this.list.get(this.index - 1);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */