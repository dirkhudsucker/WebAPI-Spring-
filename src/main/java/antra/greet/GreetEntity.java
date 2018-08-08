package antra.greet;

public class GreetEntity {
int id;
String message;
public GreetEntity(int id,String message){
	this.id=id;
	this.message=message;
}
public int getid() {
	return this.id;
}
public String getmessage() {
	return this.message;
}

}
