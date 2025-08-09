import java.util.Scanner;
class AtmInterface_demo{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
double balance=1000.0;
while(true){
System.out.println("******** ATM Menu ********");
System.out.println("1.Check Balance");
System.out.println("2.Deposit");
System.out.println("3.Withdraw");
System.out.println("4.Exit");
System.out.print("Choose option:");
int choice=sc.nextInt();
switch(choice){
	case 1:
	System.out.println("Total Balance :"+balance);
	break;
	case 2:
	System.out.print("Enter amount to deposit:");
	double deposit=sc.nextDouble();
	balance+=deposit;
	System.out.println("Deposited amount:"+deposit);
	break;
	case 3:
	System.out.print("Enter amount to withdraw:");
	int withdraw=sc.nextInt();
	if(withdraw<=balance){
		balance-=withdraw;
		System.out.println("Withraw amount:"+withdraw);
	}
	else{
		System.out.println("Insufficient Balance !");
	}
	break;
	case 4:
	System.out.println("Thank you for using ATM .");
	System.exit(0);
	break;
	default:
	System.out.println("Invalid option !");
}
}
}
}