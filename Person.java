
class GetSet {

	private String name;
    private String address;
    private int age;

    public String getAddress(){return address;}

    public void setAddress(String Ad){
        this.address = Ad;
    }

    public Integer getAge(){return age;}

    public void setAge(int A){
        this.age = A;
    }

	public String getName() { return name; }

	public void setName(String N){

		this.name = N;
	}
}


class Person {

	public static void main(String[] args)
	{
		GetSet obj = new GetSet();

		obj.setName("Ram");
        obj.setAddress("Bhopal");
        obj.setAge(23);
		System.out.println(obj.getName());
        System.out.println(obj.getAddress());
        System.out.println(obj.getAge());
	}
}
