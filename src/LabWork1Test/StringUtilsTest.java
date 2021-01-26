package LabWork1Test;

import LabWork1.StringUtils;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void ReverseCharAt() {
        StringUtils stringUtils = new StringUtils();

        String actual = "ьневарт";
        String expected = stringUtils.ReverseCharAt("травень");

        Assert.assertEquals(expected, actual);
    }

    @Test
    void ReverseCharArray() {
        StringUtils stringUtils = new StringUtils();

        String actual = "ьневарт";
        String expected = stringUtils.ReverseCharArray("травень");

        Assert.assertEquals(expected, actual);
    }

    @Test
    void ReverseMethod() {
        StringUtils stringUtils = new StringUtils();

        String actual = "ьневарт";
        String expected = stringUtils.ReverseMethod("травень");

        Assert.assertEquals(expected, actual);
    }
}