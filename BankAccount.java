import javax.lang.model.util.ElementScanner6;

class BankAccount
{
int accno;
double amount;

void insert(int a, double amt)
{
    accno=a;
    amount=amt;
}
void deposit(double amt)
{
    amount=amount+amt;
    System.out.println(amt+ "Deposited");
}

void withdraw(double amt)
{
    if(amount<amt)
    {
        System.out.println("Insufficient Balance");
    }
        else
        {
            amount=amount-amt;
            System.out.println(amt+ "Amount Withdrawn");
        }
    }
    void checkBalance()
    {
        System.out.println("Balance is " +amount);
    }
    void display()
    {
        System.out.println("Account no is " +accno+ " & Amount is " + amount);
    }
}
    class TestAccount
    {
        public static void main(String[] args)
        {
        BankAccount a1=new BankAccount();
        a1.insert(2401, 5000);
        a1.display();
        a1.checkBalance();
        a1.deposit(7000);
        a1.checkBalance();
        a1.withdraw(3000);
        a1.checkBalance();            
        }
    }

