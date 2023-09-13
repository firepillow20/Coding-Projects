package com.company;

import java.sql.SQLException;

public class ExceptionHandlerExercise
{
    public static void main (String[] args)
        {
            int arr[] = {21,35,14,0};
            try
            {
                for (int i = 0;i < arr.length;i++)
                {
                    if (arr[i] < 18)
                    {
                        throw new SQLException("Access denied - You must be at least 18 years old.");
                    }
                    else
                        System.out.println("Access granted.");
                }
                System.out.println(arr[2]/arr[2]);
                System.out.println(arr[10]);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Did you skip kindergarten or something?");
            }
            catch (SQLException e)
            {
                System.out.println(e.getMessage());
            }
            catch (Exception e)
            {
                System.out.println("Such element does not exist.");
            }
        }
}
