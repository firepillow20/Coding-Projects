package com.company;

public class DoctorsClinic
{
    public static void timeCount(int n, int m)
    {
        int finalTime = (n - 1) * 10 - (n - 1) * m;
        if(finalTime <= 0)
        {
            System.out.println("The final patient will not have to wait.");
        }
        else System.out.println("The final patient will wait " + finalTime + " minutes.");
    }
    public static void main(String args[])
    {
        int interval = 3;
        int patients = 10;
        timeCount(patients, interval);
    }
}
