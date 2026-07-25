class Solution {
    public int maxProduct(int n) {

        ArrayList<Integer> digits = new ArrayList<>();
        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
        }

        int maxProduct = 0;
        for (int i = 0; i < digits.size(); i++) {
            for (int j = i + 1; j < digits.size(); j++) {

                int product = digits.get(i) * digits.get(j);

                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
        }

        return maxProduct;
    }
}