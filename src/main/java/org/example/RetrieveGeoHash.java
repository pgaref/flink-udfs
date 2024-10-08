package org.example;

import org.apache.flink.table.functions.ScalarFunction;
import org.locationtech.spatial4j.io.GeohashUtils;


public class RetrieveGeoHash extends ScalarFunction {

    public String eval(String Lat , String Lon, int Pre) {
        Double lat = Double.parseDouble(Lat);
        Double lon = Double.parseDouble(Lon);
        if (lat > -91 && lat < 91 && lon > -181 && lon < 181 && Pre>0 && Pre<12)
        return  GeohashUtils.encodeLatLon(lat,lon,Pre);
        else
            return "invalid input!!";
    }

    public String eval(double Lat , double Lon , int Pre) {
        if (Lat > -91 && Lat < 91 && Lon > -181 && Lon < 181)
            return  GeohashUtils.encodeLatLon(Lat,Lon,Pre);
        else
            return "invalid input!!";
    }

}


