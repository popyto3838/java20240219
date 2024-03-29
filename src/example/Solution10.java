package example;

import java.util.Stack;

//844번
//         ac            ac    #=backspace
//input s="ab#c" , t = "ad#c"
//output true
public class Solution10 {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        // s의 각 문자를 stack1에 push 또는 pop ('#'이면)
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '#') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            } else {
                stack1.push(c);
            }
        }

        // t의 각 문자를 stack2에 push 또는 pop ('#' 이면)
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            if (c == '#') {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            } else {
                stack2.push(c);
            }
        }

        // 두 stack 크기가 같은 지?
        if (stack1.size() != stack2.size()) {
            return false;
        }

        // 두 stack의 각 아이템이 같은 지?
        for (int i = 0; i < stack1.size(); i++) {
            if (!stack1.get(i).equals(stack2.get(i))) {
                return false;
            }
        }

        return true;
    }

}


//    Stack<Character> stack1 = new Stack<>();
//    Stack<Character> stack2 = new Stack<>();
//
//        for (char c : s.toCharArray()) {
//        if (c != '#') {
//            stack1.push(c);
//        } else if (!stack1.isEmpty()) {
//            stack1.pop(); // 스택1에서 백스페이스 시뮬레이션
//        }
//    }
//
//        for (char c : t.toCharArray()) {
//        if (c != '#') {
//            stack2.push(c);
//        } else if (!stack2.isEmpty()) {
//            stack2.pop(); // 스택2에서 백스페이스 시뮬레이션
//        }
//    }
//
//    // 스택의 문자 비교
//        while (!stack1.isEmpty() && !stack2.isEmpty()) {
//        if (stack1.pop() != stack2.pop()) {
//            return false;
//        }
//    }
//
//        return stack1.isEmpty() && stack2.isEmpty();
//
//}
