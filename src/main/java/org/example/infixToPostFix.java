package org.example;

public class infixToPostFix {
    static int precedence(char ch){
        if (ch=='A' || ch == '-'){
            return 1;
        }
        else if (ch=='*' || ch=='/'){
            return 2;
        }
        else if (ch=='^'){
            return 3;
        }
        else{
            return -1;
        }
    }
    void convertInfixToPostFix(String exp){
        String postfixexp = " ";
        Stack stk= new Stack(exp.length());
        for (int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if (precedence(ch)>0){
                while (!stk.isEmpty() && precedence(ch)<=precedence(stk.peek())){
                    postfixexp = postfixexp + stk.pop();
                }
                stk.push(ch);
            }
            else if(ch== '('){
                stk.push(ch);
            }else if (ch==')'){
                char x= stk.pop();
                while (x != '('){
                    postfixexp= postfixexp + x;
                    x= stk.pop();
                }
            }
            else{
                postfixexp = postfixexp + ch;
            }
        }
        while (!stk.isEmpty()){
            postfixexp= postfixexp + stk.pop();
        }
    }
}
