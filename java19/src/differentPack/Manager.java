package differentPack;

import org.omg.PortableInterceptor.AdapterManagerIdHelper;

import samePack.Staff;

public class Manager extends Staff{
	public Manager() {
		System.out.println(name); //public
//		System.out.println(age); //package(default)
//		System.out.println(ssn); //private
		System.out.println(salary); //protected
	}
}
