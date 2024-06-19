package org.example;

public class CheckParenthesis {
    boolean isBalanced(String exp) {
        String openbraces = "[{(";
        String closebraces = "]})";
        Stack stk = new Stack(exp.length());
        for (int i = 0; i < exp.length(); i++) {
            char bracket = exp.charAt(i);
            if (bracket=='[' || bracket=='{' || bracket=='(') {
                stk.push(bracket);
            }
            else{
                int indx = closebraces.indexOf(bracket);
                int crossopenbracket= openbraces.charAt(indx);
                if (stk.isEmpty()){
                    return false;
                }
                if (crossopenbracket!= stk.pop()){
                    return false;
                }
            }
        }
        if (!stk.isEmpty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckParenthesis check = new CheckParenthesis();
        System.out.println(check.isBalanced("{()"));
    }
}
