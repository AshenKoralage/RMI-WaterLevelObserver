/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import observer.WaterLevelObserver;


/**
 *
 * @author Ashen Koralage
 */
public interface WaterLevelController extends Remote{
    public void addObserver(WaterLevelObserver observer)throws RemoteException;
    public void removeOBserver(WaterLevelObserver observer)throws RemoteException;
    public void setWaterLevel(int waterLevel)throws RemoteException;

  
}
