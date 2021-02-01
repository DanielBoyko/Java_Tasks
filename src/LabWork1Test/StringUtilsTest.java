package LabWork1Test;

import LabWork1.StringUtils;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void ReverseCharAt() {
        StringUtils stringUtils = new StringUtils();

        String actual = "ьневарт";
        String expected = stringUtils.ReverseUsingCharAt("травень");

        Assert.assertEquals(expected, actual);
    }

    @Test
    void ReverseCharArray() {
        StringUtils stringUtils = new StringUtils();

        String actual = "ьневарт";
        String expected = stringUtils.ReverseUsingCharArray("травень");

        Assert.assertEquals(expected, actual);
    }

    @Test
    void ReverseMethod() {
        StringUtils stringUtils = new StringUtils();

        String actual = "ьневарт";
        String expected = stringUtils.ReverseUsingMethod("травень");

        Assert.assertEquals(expected, actual);
    }
}