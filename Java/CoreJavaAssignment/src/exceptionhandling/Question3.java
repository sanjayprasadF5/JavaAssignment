package exceptionhandling;

import java.util.*;
class InsufficientBalanceException extends Exception
{
    InsufficientBalanceException(String s)
    {
        System.out.println("Insufficient Balance");
    }
}

class IllegalBankTransactionException extends Exception
{
    IllegalBankTransactionException(String s)
    {
        System.out.println("IllegalBankTransaction");
    }
}
class savings
{
    public long id;
    public double balance;
    public void withdraw(double amount)
    {
        try 
        {
            if(amount>balance || balance==0)
            {
                throw new InsufficientBalanceException("Insufficient balance");
            }
            if(amount<0)
            {
                throw new IllegalBankTransactionException("IllegalBankTransaction");
            }
            else
            {
                balance=balance-amount;
                System.out.println(balance);
            }
        } 
        catch(InsufficientBalanceException e) 
        {
            System.out.println(e);
        }
        catch(IllegalBankTransactionException e) 
        {
            System.out.println(e);
        }
        
    }
    public void deposit(double amount)
    {
        balance=balance+amount;
         System.out.println(balance);
    }
}
public class Question3
{
	public static void main(String[] args) 
	{
	    savings s=new savings();
	    s.deposit(10000);
	    s.withdraw(1000);
		s.withdraw(110000);
		s.withdraw(-110000);
	}
}