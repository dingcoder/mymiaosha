package com.imooc.miaosha.util;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorUtil {
	//正则表达式，以1开头的，10个数结尾的正则表达式
	private static final Pattern mobile_pattern = Pattern.compile("1\\d{10}");
	
	public static boolean isMobile(String src) {
		//为空返回null
		if(StringUtils.isEmpty(src)) {
			return false;
		}
		//不为空去匹配返回
		Matcher m = mobile_pattern.matcher(src);
		return m.matches();
	}
	
//	public static void main(String[] args) {
//			System.out.println(isMobile("18912341234"));
//			System.out.println(isMobile("1891234123"));
//	}
}
