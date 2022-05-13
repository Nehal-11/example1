package factoryPattern;

public class FactoryCodeRunner {
	
Os getInstance(String OsName) {
	
	if(OsName.equals("Andriod")) 
		
	return new Andriod();
			
			
	else if(OsName.equals("Ios"))
		return new Ios();
	else 
		return new MicroSoft();
	
}

}
