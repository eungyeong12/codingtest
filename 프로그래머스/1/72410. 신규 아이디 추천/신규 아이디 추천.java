import java.util.*;

class Solution {
    public String solution(String new_id) {
        // 1단계
        new_id = new_id.toLowerCase(); 
        StringBuilder newId = new StringBuilder(new_id);
        System.out.println(newId.toString());

        // 2단계 
        for (int i=0; i<newId.length(); i++) { 
            char c = newId.charAt(i);
            if (c >= 'a' && c <= 'z') { // 소문자             
                continue;
            } else if (c - '0' >= 0 && c - '0' < 10) { // 숫자
                continue;
            } else if (c == '-' || c == '_' || c == '.') {             
                continue;
            } else {
                newId.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(newId.toString());
        
        // 3단계
        int index = -1;
        int count = 0;
        for (int i=0; i<newId.length(); i++) {
            char c = newId.charAt(i);
            if (c == '.') {
                if (index == -1) {
                    index = i;
                    count++;
                } else {
                    count++;
                }
            } else {
                if (index != -1 && count != 0) {
                    newId.delete(index, index+count);
                    newId.insert(index, ".");
                    i -= count;
                    index = -1;
                    count = 0;
                }
            }
        }
        if (index != -1 && count != 0) {
            newId.delete(index, index+count);
            newId.insert(index, ".");
        }
        System.out.println(newId.toString());
        
        // 4단계
        if (newId.length() > 0 && newId.charAt(0) == '.') {
                newId.deleteCharAt(0);
        } 
        if (newId.length() > 0 && newId.charAt(newId.length() - 1) == '.') {
            newId.deleteCharAt(newId.length() - 1);
        }
        System.out.println(newId.toString());
        
        // 5단계
        if (newId.length() == 0) {
            newId.append("a");
        }
        System.out.println(newId.toString());
        
        // 6단계
        if (newId.length() >= 16) {
            newId.delete(15, newId.length());
            if (newId.charAt(newId.length()-1) == '.') {
                newId.deleteCharAt(newId.length()-1);
            }
        }
        System.out.println(newId.toString());
        
        // 7단계
        if (newId.length() <= 2) {
            while (newId.length() < 3) {
                newId.append(newId.charAt(newId.length()-1));
            }
        }
        System.out.println(newId.toString());
        return newId.toString();
    }
}