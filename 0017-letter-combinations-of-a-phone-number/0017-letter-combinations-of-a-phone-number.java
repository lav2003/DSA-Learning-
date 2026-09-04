class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        StringBuilder diary = new StringBuilder();

        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        if (digits.length() == 0) {
            return res;
        }
        fun(digits, digits.length(), 0, diary, res, map);
        return res;
    }

    public void fun(String s, int n, int idx,StringBuilder diary,List<String> res,
        HashMap<Character, String> map) {
        if (idx == n) {
            res.add(diary.toString());
            return;
        }
        String choice = map.get(s.charAt(idx));
        for (int j = 0; j < choice.length(); j++) {
            diary.append(choice.charAt(j));
            fun(s, n, idx + 1, diary, res, map);
            diary.deleteCharAt(diary.length() - 1);
        }
    }
}