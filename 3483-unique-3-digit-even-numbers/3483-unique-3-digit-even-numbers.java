class Solution {
    public int totalNumbers(int[] digits) {

        int count = 0;

        for (int num = 100; num <= 999; num++) {

           
            if (num % 2 != 0) {
                continue;
            }

            int[] freq = new int[10];
            for (int digit : digits) {
                freq[digit]++;
            }

            int temp = num;
            boolean possible = true;

            for (int i = 0; i < 3; i++) {

                int digit = temp % 10;
                temp = temp / 10;

                if (freq[digit] == 0) {
                    possible = false;
                    break;
                }

                freq[digit]--;
            }

            if (possible) {
                count++;
            }
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna