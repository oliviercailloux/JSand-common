package io.github.oliviercailloux.jsand.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ReadyService extends Remote {
  public void ready() throws RemoteException;
}
