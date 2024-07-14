package binary_summation;

public class BinaryAdder {

    public boolean[] add(boolean[] a, boolean[] b) {
        if (a.length != b.length) throw new IllegalArgumentException("Arrays must be if same length");

        boolean[] out = new boolean[a.length+1];
        boolean carry = false;

        // Iterates the smaller input arrays
        for (int i = a.length-1; i > 0; i--) {
            if (a[i] && b[i] && carry) {
                carry = true;
                out[i + 1] = true;
            } else if ((a[i] && b[i]) || (a[i] && carry) || (b[i] && carry)) {
                carry = true;
            } else if (a[i] || b[i] || carry) {
                carry = false;
                out[i + 1] = true;
            }
        }
        // Carry the last value to the bigger array
        out[0] = carry;
        return out;
    }
}
