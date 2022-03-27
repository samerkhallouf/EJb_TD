package MyBeans;

import javax.ejb.Stateless;

@Stateless(name = "SessionEJB")
public class SessionBean {
    public SessionBean() {
    }
    public String sayHello(){
      return "Hello World!";
    }
}
