class Solution {
    public String intToRoman(int num) {
        String result = "";
        int remain = num;
        
        while (remain >= 1000){
            result = result.concat("M");
            remain -= 1000;
        }
        
        while (remain >= 900){
            result = result.concat("CM");
            remain -= 900;
        }
        
        while (remain >= 500){
            result = result.concat("D");
            remain -= 500;
        }
        
        while (remain >= 400){
            result = result.concat("CD");
            remain -= 400;
        }
        
        while (remain >= 100){
            result = result.concat("C");
            remain -= 100;
        }
        
        while (remain >= 90){
            result = result.concat("XC");
            remain -= 90;
        }
        
        while (remain >= 50){
            result = result.concat("L");
            remain -= 50;
        }
        
        while (remain >= 40){
            result = result.concat("XL");
            remain -= 40;
        }
        
        while (remain >= 10){
            result = result.concat("X");
            remain -= 10;
        }
        
        while (remain >= 9){
            result = result.concat("IX");
            remain -= 9;
        }
        
        while (remain >= 5){
            result = result.concat("V");
            remain -= 5;
        }
        
        while (remain >= 4){
            result = result.concat("IV");
            remain -= 4;
        }
        
        while (remain >= 1){
            result = result.concat("I");
            remain -= 1;
        }
        
        return result;
    }
}