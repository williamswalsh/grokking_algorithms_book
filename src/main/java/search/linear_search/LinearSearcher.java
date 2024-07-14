package search.linear_search;

import search.Searcher;

public class LinearSearcher implements Searcher {

    @Override
    public int search(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) return i;
        }
        return -1; // In the book null can be returned - could use Integer type to do this
    }

    public Integer searchWithNullReturn(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) return i;
        }
        return null; // In the book null can be returned - could use Integer type to do this
    }
}
