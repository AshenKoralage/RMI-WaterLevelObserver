/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controllerImpl.WaterLevelControllerImpl;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ashen Koralage
 */
public class WaterLevelServer {
    public static void main(String[] args) {
        try {
            System.out.println("Server Start");
            Registry createRegistry = LocateRegistry.createRegistry(5050);
            createRegistry.rebind("WaterLevel", new WaterLevelControllerImpl());
        } catch (RemoteException ex) {
            Logger.getLogger(WaterLevelServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
