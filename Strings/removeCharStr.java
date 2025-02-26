class removeCharsStr {
	public static String removeChars(String string1,String string2)
	{
      boolean[] charSet = new boolean[26];
      for(char ch : string2.toCharArray()){
        charSet[ch - 'a'] = true;
      }
      StringBuilder res = new StringBuilder();
      for(char ch : string1.toCharArray()){
        if(!charSet[ch - 'a'])
          res.append(ch);
      }
      return res.toString();
    }

	// Driver Code
	public static void main(String[] args)
	{
		String string1, string2;
		string1 = "sudeep";
		string2 = "gowda";
		System.out.println(removeChars(string1, string2));
	}
}
