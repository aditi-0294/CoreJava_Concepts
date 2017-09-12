// Interface Application for Calculator :

interface Addition {
	int add(int v1 , int v2);
}

interface Subtraction {
	int subt(int v1 , int v2);
}

interface Multiplication {
	int mult(int v1 , int v2);
}

interface Division {
	int div(int v1 , int v2);
}

public interface Interface_Demo extends Addition , Subtraction , Multiplication , Division {

	void display();
}
