package com.sidhu.emicalculator;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.Math;

public class EMIService extends Service {
    public EMIService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return mBinder;
    }

    EMIInterface.Stub mBinder = new EMIInterface.Stub() {
        @Override
        public double CalculateEMI(double principalAmount, double rate, int tenure) throws RemoteException {
            return principalAmount*(rate*(Math.pow(1+rate,tenure))/(rate*((Math.pow(1+rate,tenure))-1)));
        }
    };
}