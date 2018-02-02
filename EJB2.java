public interface BankingService extends EJBObject {
        
    public void deposit(int accountId, float amount) throws RemoteException;
        
    public void withdraw(int accountId, float amount)throws RemoteException;
        
    public float getBalance(int accountId) throws RemoteException;
    public void doServiceLogout() throws RemoteException;
 
}
public interface BankingServiceHome extends EJBHome {
    public BankingService create() throws CreateException, RemoteException;
}
public class BankingServiceEJB implements SessionBean {
    public void deposit(int accountId, float amount) throws RemoteException {
    //Business logic to deposit the specified amount and update the balance
    }
    public void withdraw(int accountId, float amount)throws RemoteException {
    //Business logic to withdraw the desired amount and update the balance
    }
    public float getBalance(int accountId) throws RemoteException {
    //Business logic to get the current balance
    }
    public void doServiceLogout() throws RemoteException {
    //Service completion and logout logic
    }
    public void ejbCreate(){}
    public void ejbActivate(){}
    public void ejbPassivate(){}
    public void ejbRemove(){}
    public void setSessionContext(SessionContext context){}
}
