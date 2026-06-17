class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List <Integer> list = new ArrayList<>();
        HashSet <Integer> set = new HashSet<>();

        for(int i:bulbs)
        {
            if(!set.contains(i))
            {
                set.add(i);
            }
            else
            {
                set.remove(i);
            }
        }
        for(int i:set)
        {
            list.add(i);
        }
        Collections.sort(list);
        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna