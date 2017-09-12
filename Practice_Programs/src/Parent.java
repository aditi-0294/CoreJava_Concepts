
interface Parent1
{
   void fun();
}

interface Parent2
{
   void fun();
}

interface Parent extends Parent1 , Parent2 {
	void display() ; // inherits fun() method but hides during execution . Thus , fun() method shud b called in main program ...
}

