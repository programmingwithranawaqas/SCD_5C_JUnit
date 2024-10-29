package org.example;

public class Service {

    public String getServiceName(int flag)
    {
        if (flag<0)
            return "Old Service";
        else
            return "New Service";
    }

    public int getMaxInArray(int[] arr) {
           int max = arr[0];
           for (int i=1; i<arr.length; i++)
               if(max<arr[i])
                   max = arr[i];

           return max;
    }
}
