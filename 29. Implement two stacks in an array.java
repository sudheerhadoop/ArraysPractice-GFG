/* Structure of the class is
class TwoStack
{

	int size;
	int top1,top2;
	int arr[] = new int[100];

	TwoStack()
	{
		size = 100;
		top1 = -1;
		top2 = size;
	}
}*/

class Stacks
{
    //Function to push an integer into the stack1.
    void push1(int x, TwoStack sq)
    {
        if(sq.top1 != sq.top2)
        {
            sq.top1++;
            sq.arr[sq.top1] = x;
        }
        else
        {
            return;
        }
    }

    //Function to push an integer into the stack2.
    void push2(int x, TwoStack sq)
    {
        if(sq.top1 != sq.top2)
        {
            sq.top2--;
            sq.arr[sq.top2] = x;
        }
        else
        {
            return;
        }
    }

    //Function to remove an element from top of the stack1.
    int pop1(TwoStack sq)
    {
        int temp;
        if(sq.top1 == -1)
        {
            temp = -1;
        }
        else
        {
            temp = sq.arr[sq.top1];
            sq.top1--;
        }
        return temp;
    }

    //Function to remove an element from top of the stack2.
    int pop2(TwoStack sq)
    {
        int temp;
         if(sq.top2 == sq.size)
        {
            temp = -1;
        }
        else
        {
            temp = sq.arr[sq.top2];
            sq.top2++;
        }
        return temp;
    }
}

