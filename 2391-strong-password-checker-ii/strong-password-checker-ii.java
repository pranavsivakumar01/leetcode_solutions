class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int len = password.length();
        String special = "!@#$%^&*()-+";

        
        if (len < 8) {
            return false;
        }

       
        boolean hasLower = false, hasUpper = false, hasDigit = false, hasSpecial = false;

        for (int i = 0; i < len; i++) {
            char ar = password.charAt(i);

          
            if (Character.isLowerCase(ar)) hasLower = true;
            
            if (Character.isUpperCase(ar)) hasUpper = true;
            
            if (Character.isDigit(ar)) hasDigit = true;
          
            if (special.contains(String.valueOf(ar))) hasSpecial = true;

            
            if (i > 0 && password.charAt(i) == password.charAt(i - 1)) {
                return false;
            }
        }

       
        return hasLower && hasUpper && hasDigit && hasSpecial;
    }
}