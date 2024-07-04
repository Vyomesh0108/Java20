class Vehicle
{
	int Wheels, cap;
	Vehicle(int w, int c)
	{
		wheels = w;
		cap = c;
	}

	void show()
	{
		System.out.println("\n WHEELS : "+wheels);
		System.out.println("\n CAPACITY: "+cap);
	}
}

interface Speed
{
	int sp = 500;
	void spe();
}

interface Fly extends Speed
{
	int height = 5000;
	void flew();
}

class Car extends Vehicle
{
	int horns;
	Car(int a, int b, int c)
	{
		super(a, b);
		horns = c;
	}
	
	void disp()
	{
		show();
		System.out.println("HORNS:"+horns);
	}
}

interface Loading
{
	int weight = 20;
	void we();
}

class Plane extends Vehicle implements Fly, Loading
{
	int ahost;
	Plane(int a, int b, int d)
	{
		super()
	}
}

