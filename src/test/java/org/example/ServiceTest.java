package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ServiceTest {


    @Test
    public void getServiceNameNewServiceTest()
    {
        Service service = new Service();
        String actualResult = service.getServiceName(1);
        Assertions.assertEquals("New Service", actualResult);
    }

    @Test
    public void getServiceNameOldServiceTest()
    {
        Service service = new Service();
        String actualResult = service.getServiceName(-1);
        Assertions.assertEquals("Old Service", actualResult);
    }

    @Test
    public void getMaxInArrayTest()
    {
        int arr[] = new int[]{5, 11, 0, 3, 40, 19, 20};
        Service service = new Service();
        int actualResult = service.getMaxInArray(arr);
        int expectedResult = 40;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void matchTwoArraysTest()
    {
        int actual[] = new int[]{20};
        int expected[] = new int[]{5, 11, 0, 3, 40, 19, 20};

        Assertions.assertArrayEquals(expected, actual);
    }


}