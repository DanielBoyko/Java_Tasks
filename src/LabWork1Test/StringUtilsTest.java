package LabWork1Test;

import LabWork1.StringUtils;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void reverse() {
        StringUtils stringUtils = new StringUtils();

        String actual = "ьневарт";
        String expected = stringUtils.Reverse("травень");

        Assert.assertEquals(expected, actual);
    }
}