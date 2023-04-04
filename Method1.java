class Method1 
{
	public static void main(String[] args) 
	{
		//EvenNumber(12);
		//ExtractNo(12345);
		//ReverseNo(9876);
		//PalindromeNo(121);
		//LeapYear(2004);
		//CountDigit(7489);
		//Power(2,2);
		//Factorial(5);
		//SumofDigit(777);
		//PrimeNumber(7);
		//Factors(10);
		//SquarePattern(10);
		//SumofFactOfdigit(143);
		//Lcm(10,20);
		//BuzzNo(1007);
		//NeonNumber(9);
		SpyNumber(1423);
	}



	public static void EvenNumber(int num)
	{
		while(num <= 100)
		{
			if(num % 2 == 0)
			{
				System.out.print(num + " ");
			}
			num++;
		}
	}
	


	public static void ExtractNo(int num)
	{
		while(num > 0)
		{
			int rem = num % 10;
			System.out.print(rem + " ");
			num = num/10;
		}
	}


	
	public static void ReverseNo(int num)
	{
		int rev = 0;
		while(num > 0)
		{
			int rem = num % 10;
				rev = rev*10 + rem;
				num = num / 10;
		}
		System.out.println("Reverse of given number : " + rev);
	}



	public static void PalindromeNo(int num)
	{
		int rev = 0;
		int org = num;

		while(num > 0)
		{
			int rem = num % 10;
				rev = rev*10 + rem;
				num	= num/10;
		}

		if(rev == org)
		{
			System.out.println("It's Palindrome Number");
		}
		else
		{
			System.out.println("It's Not a Palindrome Number");
		}
	}


	public static void LeapYear(int year)
	{
		if(year%4 == 0 && year%100 != 0)
		{
			System.out.println("It's Leap Year");
		}
		else
		{
			System.out.println("It's not a leap year");
		}
	}


	public static void CountDigit(int num)
	{
		int count = 0;

		while(num > 0)
		{
			int rem = num % 10;
			count ++;
			num /= 10;
		}

		System.out.println("Total no. of digits in given number : " + count);
	}



	public static void Power(int base, int raise)
	{
		int power = 1 ;
		
		while(raise>0)
		{
			power = power * base;
			raise --;
		}
		System.out.println(power);
	}


	
	public static void Factorial(int num)
	{
		int fact = 1;
		for(int i = 1; i<=num; i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of given number is " + fact );
	}



	public static void SumofDigit(int num)
	{
		int sum = 0;
		
		while(num > 0)
		{
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println("Sum of digits in given number : " + sum);
	}


	public static void PrimeNumber(int num)
	{
		int deno = 2;

		while(deno<num)
		{
			if(num%deno==0)
			{
				break;
			}
			deno++;
		}

		if(num==deno)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not prime number");
		}
	}


	public static void Factors(int num)
	{
		int fact = 1;
		System.out.print("Factors of given number : ");
		while(fact<=num)
		{
			if(num%fact==0)
			{
				System.out.print(fact+" ");
			}
			fact++;
		}
	}


	public static void SquarePattern(int num)
	{
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}


	public static void SumofFactOfdigit(int num)
	{
		int sum = 0;

		while(num>0)
		{
			int rem = num % 10;
			int fact = 1;

			for(int i=1;i<=rem; i++)
			{
				fact = fact * i;
			}
			sum = sum + fact;
			num = num/10;
		}
		System.out.println("Sum of factorial of each digit : " + sum);
	}


	public static void Lcm(int num1, int num2)
	{
		int lcm = num1>num2 ? num1 : num2;
		while(true)
		{
			if(lcm % num1 == 0 && lcm % num2 == 0)
			{
				System.out.println("LCM of given numbers : "+lcm);
				break;
			}
			lcm++;
		}
	}


	public static void BuzzNo(int num)
	{
		if(num % 7 ==0 || num % 10 == 7 )
		{
			System.out.println("It's Buzz Number");
		}
		else
		{
			System.out.println("It's not a buzz number");
		}
	}


	public static void NeonNumber(int num)
	{
		int sum = 0;
		int sq = num * num;

		while(sq > 0)
		{
			int rem = sq % 10;
			sum = sum + rem;
			sq = sq/10;
		}

		if(num==sum)
		{
			System.out.println("It's Neon Number");
		}
		else
		{
			System.out.println("It's not a neon number");
		}
	}


	public static void SpyNumber(int num)
	{
		int sum = 0;
		int prod = 1;
		int rem = 0;

		while(num>0)
		{
			rem = num % 10;
			sum = sum + rem;
			prod = prod * rem;
			num = num/10;
		}
		if(sum==prod)
		{
			System.out.println("It's Spy Number");
		}
		else
		{
			System.out.println("It's not a Spy Number");
		}
	}
}
