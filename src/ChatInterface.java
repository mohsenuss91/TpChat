import java.rmi.*;

public interface ChatInterface extends Remote {
	
	public void connect(ChatClient client) throws RemoteException;
	
	public void bye(ChatClient nomClient) throws RemoteException;
	
	public void who() throws RemoteException;
	
	public void displayMsgs(int idDernier, String nom) throws RemoteException;
	
	public void send(Message msg, ChatClient cli);
	
	public boolean isConnected(ChatClient cli);

}
