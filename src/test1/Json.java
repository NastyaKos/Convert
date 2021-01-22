package test1;

import java.util.HashMap;

public class Json {
    HashMap unit_gm;
    HashMap unit_kg;
    HashMap unit_lb;
    HashMap unit_oz;

    public Json() {
        HashMap<String, Double> gm = new HashMap<String, Double>();
        gm.put("kg",0.001);
        gm.put("lb",0.00220462);
        gm.put("oz",0.035274);
        this.unit_gm = gm;

        HashMap<String, Double> kg = new HashMap<String, Double>();
        kg.put("gm",1000.0);
        kg.put("lb",2.20462);
        kg.put("oz",35.274);
        this.unit_kg = kg;

        HashMap<String, Double> lb = new HashMap<String, Double>();
        lb.put("kg",0.453592);
        lb.put("gm",453.592);
        lb.put("oz",16.0);
        this.unit_lb = lb;

        HashMap<String, Double> oz = new HashMap<String, Double>();
        oz.put("kg",0.0283495);
        oz.put("lb",0.0625);
        oz.put("gm",28.3495);
        this.unit_oz = oz;
    }

    public double convert(double value, String from, String to)
    {
        HashMap s = new HashMap();

        switch(from){
            case "gm":
                s = this.unit_gm;
                break;
            case "kg":
                s = this.unit_kg;
                break;
            case "lb":
                s = this.unit_lb;
                break;
            case "oz":
                s = this.unit_oz;
                break;
        }

        double result = value * (double) s.get(to);

        return result;
    }
}
