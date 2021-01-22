// Задача: Написать программу для конвертаци между еденицами массы. На входе дан JSON объект и вывод результата должен быть в таком же виде
package test1;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String jsonStr = "{'weight': {'unit': 'kg', 'value': 2}, 'convert_to': 'gm'}";

        JsonObject gson = new Gson().fromJson(jsonStr, JsonObject.class);

        double value = gson.getAsJsonObject("weight").get("value").getAsDouble();
        String unit = gson.getAsJsonObject("weight").get("unit").getAsString();
        String convert_to = gson.get("convert_to").getAsString();

        Json json = new Json();
        double v = json.convert(value, unit, convert_to);

        HashMap output = new HashMap();
        output.put("unit", convert_to);
        output.put("value", v);

        Gson output_json = new Gson();
        System.out.println(output_json.toJson(output));

    }
}
