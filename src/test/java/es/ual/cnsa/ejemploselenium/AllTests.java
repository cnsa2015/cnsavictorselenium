package es.ual.cnsa.ejemploselenium;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Errorusuario.class, Login.class, LogOut.class, Registro.class,
		User1.class })
public class AllTests {

}
