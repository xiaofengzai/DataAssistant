package com.wen.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegUtil {
    public static boolean validate(String reg,String target){
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(target);
        return matcher.matches();
    }
}
