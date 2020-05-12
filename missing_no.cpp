// how to you find the missing array in  a given array of 1 to 100.
/*
1---ek array lagega
2---ek var travserse ke liye
3---ek var user number found ke liye
4---if that no is equal to user input then missing no is found
*/
#include<iostream>
using namespace std;
int main()
{
	int size;
	int i,no;

	cout<<"Enter the size of array :";
	cin>>size;
		int a[size];
	cout<<endl;
	cout<<"Enter the number in array :"<<endl;
	for(i=0;i<size;i++)
	{
		cin>>a[i];
	}
	cout<<endl;
	cout<<"The number in array :"<<endl;
	for(i=0;i<size;i++)
	{
		cout<<a[i]<<"\t";
	}
	cout<<endl;
	cout<<"Enter the number of missing array :";
	cin>>no;
	cout<<endl;
	for(i=0;i<size;i++)
	{
		if(no==a[i])
		{
			cout<<no<<" number is found at "<<i+1<<endl;
		}
		else
			cout<<"no not found ";
			break;
	}
	return 0;
}
