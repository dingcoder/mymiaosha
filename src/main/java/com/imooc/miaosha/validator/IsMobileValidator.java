package com.imooc.miaosha.validator;

import com.imooc.miaosha.util.ValidatorUtil;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IsMobileValidator implements ConstraintValidator<IsMobile, String> {

    private boolean required = false;

    public void initialize(IsMobile constraintAnnotation) {
        required = constraintAnnotation.required();
    }

    public boolean isValid(String value, ConstraintValidatorContext context) {
        //如果电话号码不为空的话，需要去校验
        if (required) {
            return ValidatorUtil.isMobile(value);
        } else {
            //如果为空的话，直接返回true
            if (StringUtils.isEmpty(value)) {
                return true;
            } else {
                //否则返回false
                return ValidatorUtil.isMobile(value);
            }
        }
    }

}
