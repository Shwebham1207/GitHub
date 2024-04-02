import java.util.*;
class Bank
{
	static String name;
	static String address;
	static long addharNo;
	static long phoneNo;
	static double bal;
	static int upiPin;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		outerloop:
		for( ; ; ) {
			System.out.println("**** WELCOME ****");
			System.out.println();
			System.out.println("1. Create Account");
			System.out.println("2. Existing Account Holder");
			System.out.print("Enter an option : ");
			int option = sc.nextInt();
			System.out.println();
			switch(option)
			{
			case 1:{
				System.out.println("*** Create Account Module ***");
				sc.nextLine();
				System.out.print("Enter your Name : ");
				name = sc.nextLine();
				System.out.print("Enter your Address : ");
				address = sc.nextLine();
				System.out.print("Phone Number : ");
				phoneNo = sc.nextLong();
				System.out.print("Addhar Number : ");
				addharNo = sc.nextLong();
				System.out.print("Deposit Amount : ");
				bal =  sc.nextDouble();
				System.out.print("Enter a upi pin : ");
				upiPin = sc.nextInt();
				System.out.println("Account Created Successfully");
				System.out.println();
				break;
			}
		case 2:{

			for (; ; ) {
				System.out.println();
				System.out.println("** Features **");
				System.out.println("1. Check Balance  2. Deposit  3. Withdraw  4. Info  5. Logout");
				System.out.println();
				System.out.print("Enter an option : ");
				int opt = sc.nextInt();
				switch(opt)
				{
				case 1:{
					System.out.println("*** Check Balance ***");
					System.out.print("Enter your upi pin : ");
					int userPin = sc.nextInt();
					if(userPin==upiPin){
						System.out.println("Your account balance is - "+bal+" rs");
					}else{
						System.out.println("Wrong Upi Pin");
					}
					break outerloop;
				}
			case 2:{
				System.out.println("*** Deposit Amount ***");
				System.out.println();
				System.out.print("Enter an Amount : ");
				double depAmount = sc.nextDouble();
				bal += depAmount;
				System.out.println("Amount Deposited Successfully");
				break;
				}
			case 3:{
				System.out.println("*** Withdraw Amount ***");
				System.out.println();
				System.out.print("Enter an Amount : ");
				double withdrawAmount = sc.nextDouble();
				if(withdrawAmount<=bal){
					System.out.println("Amount Withdrawn Successfully");
					bal = bal - withdrawAmount;
				}else{
					System.out.println("Insufficient Funds");
				}
				break;
			}
		case 4:{
			System.out.println("*** Amount Info ***");
			System.out.println();
			System.out.println("Account Holder Name : "+name);
			System.out.println("Address : "+address);
			System.out.println("Phone Number : "+phoneNo);
			System.out.println("Addhar Number : "+addharNo);
			break;
		}
	case 5:{
		System.exit(0);
	}
default :System.out.println("Invalid option");break;
			}	
			}
			}
		default :System.out.println("Invalid option");break;
		}
		}
	}
}